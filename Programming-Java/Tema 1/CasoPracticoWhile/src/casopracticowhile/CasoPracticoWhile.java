/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casopracticowhile;

import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class CasoPracticoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Introducimos un número por teclado donde:
                 - Me diga si el número es positivo o negativo
                 - Me de el cuadrado del número
                 - Me diga si es par o impar
            ===================
            Si introducimos un 0, salga del programa */
        
        Scanner entrada = new Scanner(System.in);
              
         //Introducción del número
         System.out.print("Introduce un número: ");
         double numero = entrada.nextDouble();
        
        while (numero != 0) {
            //Averiguar si el número es positivo o negativo.
            if (numero >= 0) {
                System.out.println(numero + " es positivo.");
            }
            else {
                System.out.println(numero + " es negativo.");
            }
            
            //Cuadrado del número
            System.out.println( "El cuadrado de " + numero + " es: " + (numero * numero));
                        
            //Par o impar
            if (numero % 2 == 0) {
                System.out.println("El número es par.");
            }
            else {
                System.out.println("El número es impar.");
            }
            
            //Separador
            System.out.println(" ");
            
            //Repetición de la petición de introducción de la variable de numero.
            System.out.print("Introduce un número || Si quieres salir del bucle introduce 0 ||: ");
            numero = entrada.nextDouble();
            
        }
            

    }
    
}
