/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sintonizar;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Sintonizar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Volumen: ");
        double volumen = leer.nextDouble();
        sintonizador sintonizador1 = new sintonizador(volumen);
        
        System.out.println("Volumen al " + volumen);
        System.out.print("Quieres subir o bajar el volumen? (1 = up), (0, = down) ");
        int accion = leer.nextInt();
        
        if (accion == 1){
            System.out.println(sintonizador1.up());          
        } else if (accion == 0){
            System.out.println(sintonizador1.down());
        }

    }
    
}
