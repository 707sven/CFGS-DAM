/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebafor;

import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class PruebaFOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejemplo bucle FOR positivo (cuenta hacia arriba)
        for (int a = 0; a <= 5; a++) {
            System.out.println("El bucle a es " + a);
        }
        
        System.out.println("================");
        
        //Ejemplo bucle FOR negativo (cuenta hacia abajo)
        for (int b = 5; b >= 0; b--) {
            System.out.println("El bucle b es " + b);
        }
        
        /* Pido un número entero por teclado
            - Vamos a hacer el número factorial ( 7! = 7 x 6 x 5 x 4 x 3 x 2 x 1) del número introducido
            - Usamos la condicional FOR  */
        
        Scanner leer = new Scanner(System.in);
        
         //Introducción del número
         System.out.print("Introduce un número: ");
         
         //Creamos la variable de almacenaje de numero
         int b;
         b = leer.nextInt();
         
         //Creamos la variable donde guardaremos la respuesta
         int resultado;
         resultado = b;
         
         //Hacemos el bucle para el número factorial
         for (int contador = 1; contador < b; contador ++) {
             resultado = resultado * contador;
         }
        System.out.println("El numero factorial es: " + resultado);
        
    }
    
}
