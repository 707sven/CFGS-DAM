/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package media;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Media de dos números:
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double a = leer.nextDouble();
        
        System.out.print("Introduce otro número: ");
        double b = leer.nextDouble();
        
        double resultado;
        resultado = media (a, b);
        
        double resultado2;
        resultado2 = media(3, 5);
        
        System.out.println("La media de " + a + " y " + b + " es: " + resultado);
        System.out.println("La media de 3 y 5 es: " + resultado2);
    }
    
        public static double media(double a, double b) {
        double result = 0.0;
        result = (a + b)/2;
        return result;
    }
}

