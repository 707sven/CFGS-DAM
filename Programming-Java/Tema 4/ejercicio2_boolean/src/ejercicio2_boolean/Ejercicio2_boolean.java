/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2_boolean;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class Ejercicio2_boolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear una funcion que mediante un booleano indique si el carácter que se pase como parámetro de entrada diga si es una vocal
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Introduce una letra: ");
        char letra = leer.next().charAt(0);
       
        boolean vocal;
        
        //Comprobacion de la vocal
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
            vocal = true;
        } else {
             vocal = false;
        }
        
        //Imprimación por pantalla 
        if (vocal == true) {
            System.out.println("La letra | " + letra + " | es una vocal.");
        } else {
            System.out.println("La letra | " + letra + " | es una consonante");
        }
    }
    
}
