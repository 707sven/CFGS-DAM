/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros_enteros;

import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Numeros_enteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Dos numeros enteros, función que haga el máximo de 2 números y luego se presenta por pantalla.
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int a = leer.nextInt();
        
        System.out.print("Introduce otro número: ");
        int b = leer.nextInt();
        
        int resultado;
        resultado = mayor(a, b);
                
        System.out.println("El mayor de los dos números es " + resultado);
                
        //Mayor de 3 números
        System.out.print("Introduce un 3º número: ");
        int c = leer.nextInt();
        
        int resultado2;
        resultado2 = mayor(resultado, c);
        
        System.out.println("El mayor de los tres números es " + resultado2);
        
    }
    
    public static int mayor(int a, int b) {
        int result;
        
            if (a > b) {
                result = a;
            }

            else {
               result = b;
            }
            return result;
    }
}