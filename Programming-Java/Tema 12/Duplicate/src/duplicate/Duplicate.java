/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duplicate;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Duplicate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Crear un programa que duplique el contenido de un fichero realizar 2 versiones:
                1.- Duplicaremos el fichero final ("original.txt)  en uno que se llame "copia.txt"
                2.- Pedir el nombre del fichero fuente y duplicarlo en un fichero con el mismo nombre con el prefijo "copiade-original-.txt"
        */
        
        
        //Apartado 1
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduce la direccion del fichero.");
        String path = leer.nextLine();
        
        FileReader original;
        File origen = new File (path);
        BufferedReader bufferedReader;
        String frase1="";
        String frase2="";
        
        try {
            original = new FileReader (origen);
            bufferedReader = new BufferedReader (original);
            frase1 = bufferedReader.readLine();
            while (frase1!= null) {
                frase2 = frase2 + frase1 + "\n";
                frase1= bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch(IOException e1) {
            System.out.println(e1.getMessage());
        }
        
        System.out.println("Introduce la direccion del fichero.");
        String copia = leer.nextLine();
         
        File copia1 = new File (copia);
        
        try {
            BufferedWriter out = new BufferedWriter (new FileWriter (copia1, true));
            out.write(frase1);
            out.newLine();
            out.close();
        } catch(IOException e2) {
            System.out.println(e2.getMessage());
        }
        
        //Apartado 2
        
                
        
    }
    
}
