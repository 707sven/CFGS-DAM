/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentacorriente;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class CuentaCorriente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Creación de la Cuenta Corriente.");
        System.out.print("Introduzca su nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Introduzca su dni: ");
        String dni = leer.nextLine();
        
        ClaseCuentaCorriente cuenta1 = new ClaseCuentaCorriente(nombre, dni, 5000);
        
        System.out.println("");
        System.out.println("=== Menú de opciones ===");
        System.out.println(">> 1. Retirar dinero.");
        System.out.println(">> 2. Ingresar dinero.");
        System.out.println(">> 3. Ver la información de la cuenta.");
        System.out.println("---------------------------------------------");
        System.out.print("¿Qué operación desea realizar? ");
        int numero = leer.nextInt();
        System.out.println("----------------------------------------------");
        
        switch(numero) {
            case 1:
                cuenta1.s();
                break;
            case 2:
                cuenta1.i();
                break;
            case 3:
                cuenta1.info();
                break;
        }
        
    }
    
}
