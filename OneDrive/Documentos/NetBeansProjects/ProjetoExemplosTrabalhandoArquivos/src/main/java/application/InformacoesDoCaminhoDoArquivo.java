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
public class InformacoesDoCaminhoDoArquivo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a file path: ");
        String strPath = scan.nextLine();
        
        File path = new File(strPath);
        System.out.print("\ngetName: " + path.getName());
        System.out.print("\ngetParent: " + path.getParent());
        System.out.print("\ngetPath: " + path.getPath());
        
        scan.close();
    }

}
