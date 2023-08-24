/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba2;

/**
 *
 * @author usuario
 */
public class Prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Expresiones y operadores aritmeticos
        
        //Variables
        
        int a = 3;
        int b = 5;
        int c = a + b;
        System.out.println(c);
        
        // Boolaean
        boolean valor1 = true;
        boolean valor2 = false;
        System.out.println(valor1 && valor2);
        System.out.println(valor1 || valor2);
        System.out.println(!valor1);
        
        //Ejercicio: Tenemos una temperatura inicial (temo1 = 30º) y una temperatura sin definir (temp2) en farengeit
        
        double temp1 = 30;
        double temp2 = temp1 * 9/5 + 32;
        System.out.println(temp2);
        
        // Otro ejemplo de int y double
        
        double numero_real = 8.3;
        int numero_entero = (int)numero_real;
        
        System.out.println(numero_entero);
        
        /* comentario
        de varias lineas
        lol */
        
        // Esto es un comentario de una sola línea
        
        
        boolean resultado = true;
        
        if (resultado == true) {
            System.out.println("es verdadero.");
        }
        else {
            System.out.println("es falso.");
        }
        
    }
    
}

