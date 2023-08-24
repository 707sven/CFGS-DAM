/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contar_espacios;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class Contar_espacios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Crear una aplicación que indique al usuario introducir una frase por teclado y cuente los espacios en blanco.
        
        System.out.println("Introduce una frase: ");
        String frase = leer.next();
        int contadorEspacios = 0;
        
        for ( int i = 0; i < frase.length(); i ++) {
            if ((frase.charAt(i)).Equals(" ")){
                contadorEspacios = contadorEspacios + 1;
            }
        } System.out.println("Hay " + contadorEspacios + " espacios en la frase.");
        
        
        
    }
    
}
