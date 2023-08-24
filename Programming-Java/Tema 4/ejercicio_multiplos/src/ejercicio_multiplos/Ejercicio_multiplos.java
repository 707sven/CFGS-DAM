/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_multiplos;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class Ejercicio_multiplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Multiplos entre n y m*n (Pedir 2 números, y hacer los múltiplos entre esos números
        Scanner leer = new Scanner(System.in);
        
        //Introducción de valores
        System.out.print("Introduce un número: ");
        int n = leer.nextInt();
        System.out.print("Introduce otro número: ");
        int m = leer.nextInt();
        
        System.out.println("======= Múltiplos de " + n + " ========");
        for (int i = 2; i <= m; i ++) {
            int resultado = n * i;
            System.out.println(n +" x "+ i + " = " + resultado);
            
        }
                
    }
    
}
