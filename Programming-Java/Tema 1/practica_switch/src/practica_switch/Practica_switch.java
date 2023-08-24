/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_switch;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Practica_switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Condicional SWITCH.
        
        int numero = 1;
        
        switch(numero) {
            case 1:
                System.out.println("Hola");
                break;
            case 2:
                System.out.println("Clase de programación");
            case 3:
                System.out.println("1ºB");
                break;
            default:
                System.out.println("Adios");
        }
        
        // Bucle WHILE
        
        int contador = 1;
        
        while (contador <= 4) {
            System.out.println("WHILE | El número es: " + contador);
            contador ++;
        }
        
        //Bucle DO-WHILE
        
        int contador2 = 1;
        
        do {
            System.out.println("DO-WHILE | El número es: " + contador);
            contador2 ++;
        } while (contador2 <= 4);
    }
    
}