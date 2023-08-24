/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofichero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author marta
 */
public class ProyectoFichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        /*
        
        // Lectura de ficheros de texto
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce la ruta del fichero que quiere mostrar.");
        String fichero = leer.next();
        
        File file = null;
        FileReader filereader;
        String texto ="";
        try {
            file = new File (fichero);
            filereader = new FileReader(fichero);
            
            //Comprobación de que el archivo se puede leer
            if (file.canRead()) {
            System.out.println("El archivo se puede leer.");
            } else{
                System.out.println("El archivo no se puede leer.");
                }
            
            //Una vez comprobado que se puede leer, vamos a leer el archivo
            int c = filereader.read();
            while (c!=-1) {
                texto = texto + (char)c;
                c =filereader.read();
            }
            filereader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e1) {
            System.out.println(e1.getMessage());
        }
        System.out.println(texto);
        */
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce la ruta del fichero que quiere mostrar.");
        String fichero = leer.nextLine();
        
        FileReader fileReader;
        BufferedReader bufferedReader;
        FileWriter archivo;
        String frase= "esto es una prueba";
        BufferedWriter out;
        String frase2= "prueba 2";
        File file=null;
        
        try {
            file = new File(fichero);
            archivo = new FileWriter (file, true);
            out= new BufferedWriter (archivo);
            out.newLine();
            out.write(frase);
            out.newLine();
            out.write(frase2);
            out.newLine();
            archivo.close();
            out.close();
        } catch  (IOException e1){
            System.out.println(e1.getMessage());
        }
       
        try {
            // File file;
            file = new File(fichero);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
             
            if(file.canRead()){
            frase = bufferedReader.readLine();
               } while(frase!=null){
                    frase2 = frase2 + frase + "\n";
                    frase = bufferedReader.readLine();
                } bufferedReader.close();
         } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());} 
            catch (IOException e1) {
                System.out.println(e1.getMessage());
        } System.out.println(frase2);
        
    } 
}

