/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author crist
 */
public class TryWithResources {

    public static void main(String[] args) {

        String path = "C:\\Users\\crist\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoExemplosTrabalhandoArquivos\\documentos\\textoleitura.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        }
    }
}
