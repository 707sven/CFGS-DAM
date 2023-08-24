/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1_marta;

import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Practica1_Marta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*   1. introducir por teclado la figura que quieras que se ejecute
            Figura 1: Triángulo de 4 x * de menor a mayor
            Figura 2: Triángulo de 4 x * de mayor a menor
            Figura 3: Cuadrado completo de 4 x *
            ** Hay que usar el switch con los casos
            Figura 4 (opcional): Hacer una pirámide pidiendo los lados por teclado.
        */
        
        //Para pedir por pantalla el número de la figura
        Scanner leer = new Scanner (System.in);
        
        System.out.print("Introduce el número de la figura por pantalla: ");
        int figura = leer.nextInt();
        
        switch(figura) {
            //Tiángulo menor a mayor
            case 1:
                for (int a = 1; a <= 4 ; a ++ ) {
                    for (int b = 0; b < a ; b ++) {
                        //Filas
                        System.out.print("*");
                    //Columnas
                    } System.out.println(" ");
                }
                break;
                
            //Triángulo mayor a menor
            case 2:
                for (int a = 0; a <=4; a ++) {
                    for (int b= 4; b > a; b --) {
                        //Filas
                        System.out.print("*");
                    //Columnas
                    } System.out.println(" ");
                }
                break;
                
            //Cuadrado completo
            case 3:
                for (int a = 1; a < 4; a ++) {
                    for (int b = 1; b < 4; b ++) {
                        //Filas
                        System.out.print("*");
                   //Columnas
                    } System.out.println("*");
                }
                break;
                
            //Pirámide
            case 4:
                //Pide el número de estrellas que queramos que tenga el lado
                System.out.print("Introduce el lado de la primámide: ");
                int numero = leer.nextInt();
                
                for (int lado = 0; lado < numero; lado ++) {
                    //Espacios para crear la pirámide
                    for (int espacio = numero; espacio > lado; espacio --) {
                         System.out.print(" ");
                         
                         //Creación de la pirámide
                        } for (int a = lado * 2; a >= lado; a --) {
                                System.out.print("*");
                                System.out.print(" ");
                                
                        //Separación entre columnas
                        } System.out.println(" ");
                    }
                break;
            }
    }
                
}