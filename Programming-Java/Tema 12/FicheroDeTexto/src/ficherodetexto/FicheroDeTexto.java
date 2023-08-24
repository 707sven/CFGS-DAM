/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficherodetexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class FicheroDeTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /* Un encriptador es una aplicacion que transforma un texto para aquellos que no conocen el codigo  
         >> diseñar un programa que lea un fichero de texto, lo codifique y cree un nuevo archivo con el menmsaje cifrado. <<
         existe un codec.txt que contiene la codificacion*/
         
         Scanner leer = new Scanner(System.in);
        System.out.println("Introduce la direccion del codex.");
        String archivo = leer.nextLine();
        
        char [] [] codex = new char [2] [26];
        File file = null;
        FileReader filereader = null;
        BufferedReader bufferedreader = null;
        
        try {
            file = new File (archivo);
            filereader = new FileReader (file);
            bufferedreader = new BufferedReader (filereader);
            
            String cadena = bufferedreader.readLine();
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            }
        
        }
        
 } 

