/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author crist
 */
public class FileWriterBufferedWriter {
    
    public static void main(String[] args){
        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
        String path = "C:\\Users\\crist\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoExemplosTrabalhandoArquivos\\documentos\\out.txt";
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
