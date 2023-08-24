/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_contraseña;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class Ejercicio_contraseña {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos una contraseña, el jugador deberá introducir palabras hasta encontrarla
        //Pista 1 = da la primera palabra
        //Pista 2 = da la primera y la ultima palabra
        //Ultima opcion = te rellena la palabra entera y pierdes
        Scanner leer = new Scanner(System.in);
        
        String password = "pito";
        String respuesta = " ";
        int contador = 0;
        int LetraFinal = password.length();
        
        while (!respuesta.equalsIgnoreCase(password)){
            System.out.print("Introduce una contraseña: ");
            respuesta = leer.nextLine();
            contador ++;
            
            if (contador == 3) {
                System.out.println("Pista 1: ");
                System.out.print(password.charAt(0));
                    for (int i = 0; i < password.length() - 1; i++) {
                        System.out.print("_ ");
                    } System.out.println("");
            }
            if (contador == 6) {
                System.out.println("Pista 1: ");
                System.out.print(password.charAt(0));
                    for (int i = 0; i < password.length() - 2 ; i++) {
                        System.out.print("_ ");
                    } System.out.println("");
                    
                    System.out.print(password.charAt(4));
           contador = 0; }
         }
        System.out.println("Felicidades, has adivinado la contraseña.");
        System.out.println("La contraseña era: " + password);
    }
}
