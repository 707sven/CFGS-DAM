/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_ecuacion;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class Ejercicio_ecuacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar la solución positiva de una ecuación de segundo grado
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Introduce el primer valor de la ecuación: ");
        double a = leer.nextDouble();
        
        System.out.print("Introduce el segundo valor de la ecuación: ");
        double b = leer.nextDouble();
        
        System.out.print("Introduce el tercer valor de la ecuación: ");
        double c = leer.nextDouble();
        
        ecuacionSG(a, b, c);
                
    }
    public static void ecuacionSG (double a, double b, double c) {
        if (a == 0) {
            System.out.println("ERROR. No se puede resolver si el primer valor es 0");
        } else if ((b*b - 4* a* c) < 0){
            System.out.println("ERROR. No se puede hacer");
            } else {
                double raiz = Math.sqrt((b*b)-(4*a*c));
                if (raiz > 0) {
                    double x = (-b - raiz)/(2*a);
                    System.out.println(x);
                } else {
                     double x = (-b + raiz)/(2*a);
                    System.out.println(x);
                }
           
        }
    }
}
