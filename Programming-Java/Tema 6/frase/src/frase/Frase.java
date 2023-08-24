/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frase;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class Frase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Introducir por teclado una frase palabra a palabra separada por espacios, y cuando se ponga fin, imprimir la frase entera por pantalla.
        
         String  palabra = " ";
         String frase = " ";
        
         while (!palabra.equalsIgnoreCase("fin")) {
             frase = frase  + palabra + " ";
             
            System.out.print("Introduce una palabra (fin - parar el bucle): ");
            palabra = leer.next();
            
        } System.out.println(frase);
    }
    
}
