/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package application;

import entities.Product;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ExercicioTrabalhandoComArquivos {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Please provide the file path to import data:");
        String sourceFileStr = "C:\\Users\\crist\\OneDrive\\Documentos\\NetBeansProjects\\ExercicioTrabalhandoComArquivos\\arquivos\\ArquivoIn.csv";

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();
        
        boolean success = new File(sourceFolderStr + "\\out").mkdir();
        String targetFileStr = sourceFolderStr + "\\out\\summart.csv";
        
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
            String itemCSV = br.readLine();
            while (itemCSV != null) {
                String[] fields  = itemCSV.split(";");
                String name = fields[0];
                Double price = Double.parseDouble(fields[1]);
                Integer quantity = Integer.parseInt(fields[2]);
                list.add(new Product(name, price, quantity));
                
                itemCSV = br.readLine();
       
            }
            
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
            for(Product item : list){
                bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                bw.newLine();
            }
            
            System.out.println(targetFileStr + "Created!");
        }catch(IOException e){
            System.out.println("Error writing file: " + e.getMessage());
        }

        } catch (IOException e) {
            System.out.print("Error: " + e.getMessage());
        }

    }
}
