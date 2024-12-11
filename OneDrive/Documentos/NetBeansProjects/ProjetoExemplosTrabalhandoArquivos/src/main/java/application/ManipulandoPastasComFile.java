/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ManipulandoPastasComFile {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a folder a path:");
        String strPath = scan.nextLine();
        
        File path = new File(strPath);
        
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder : folders){
            System.out.println(folder);
        }
        
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for(File file : files){
            System.out.println(file);
    }
        
        boolean sucess = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created sucessfull: " + sucess);
        
        scan.close();
    }
}
