/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Tratamiento de exceciones para leer dos numeros de tipo int, un string y dos numeros de tipo double y mostrar los valores leidos por pantalla
        // Usas un scanner para leer un int y otro un double
        // En estos metodos se realizara el control de excepciones en la lectura por teclado (try, catch y finally)
        
        leerEntero();
        
    }
    
    public static int leerEntero() {
        Scanner leer = new Scanner(System.in);
        boolean repetir = true;
        int n = 0;
        
        do {
            try {
                 repetir = true;
                System.out.print("Introduce un número entero: ");
                n = leer.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido");
                repetir = false;
            }
        } while (repetir);
        return n;
    }
    
}
