/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Desarrollar un programa que solicite los valores min y max de un ragngo
                // Pedir numero que esté dentro del rango hasta encontrar número
        Scanner leer = new Scanner(System.in);
                
        System.out.print("Introduce el valor mínimo: ");
        int minimo = leer.nextInt();
        
        System.out.print("Introduce el valor máximo: ");
        int maximo = leer.nextInt();
        
        int numero;
        do {
            System.out.print("Dime un número: ");
            numero = leer.nextInt();
        } while (numero > maximo || numero < minimo);
        
        System.out.println("El número está dentro del rango");
    }
    
}
