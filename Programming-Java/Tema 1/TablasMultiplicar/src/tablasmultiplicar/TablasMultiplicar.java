/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablasmultiplicar;

import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class TablasMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Creación de tablas de multiplicar del 1-10
                              Tabla 1
        1 x 1   1 x 2   1 x 3...
                              Tabla 2
        2 x 1 2 x 2.... */
        
        for (int tabla = 1; tabla <= 10; tabla ++){
            System.out.println("=====>> Tabla " + tabla + " <<======");
            for (int contador = 1; contador <= 10; contador ++){
                int resultado = tabla * contador;
                System.out.println("| " + tabla + " x " + contador + " = " + resultado);
            }
        }
        
        // Sacar por pantalla **** en torre
        Scanner leer = new Scanner(System.in);
        
        //Introducción del máximo número de estrellas
        System.out.print("Introduce un número: ");
        int maximo = leer.nextInt();
        
        for (int a = maximo; a >= 0 ; a -- ) {
            for (int b = 0; b < a ; b ++){
                System.out.print("*");
                }
             System.out.println(" ");
            }
    }
    
}
