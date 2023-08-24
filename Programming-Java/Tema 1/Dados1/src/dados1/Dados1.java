/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dados1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Dados1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Tenemos 3 dados de 6 caras;
            3 dados son 6 = "Excelente resultado"
            2 dados son 6 = "Buen resultado"
            1 dado es 6 y otros no = "Regular"
            Ninguno de 6 = "Pésimo"
        
            Si se puede, intentar introducirlo por teclado, si no, se pone manualmente por código
        */
        
        Scanner entrada = new Scanner (System.in);
        
        
        //Introducción de las variables por pantalla
        
        System.out.print("Introduce un número del 1 al 6: ");
        int dado1 = entrada.nextInt();
        
        System.out.print("Introduce otro número del 1 al 6: ");
        int dado2 = entrada.nextInt();
        
        System.out.print("Introduce un número del 1 al 6: ");
        int dado3 = entrada.nextInt();
        
        
        // Si 3 dados son 6.
        if ((dado1 == 6) && (dado2 == 6) && (dado3 == 6)) {
            System.out.println("Excelente resultado");
        }
        
        // Si 2 dados son 6.
        else if (((dado1 == 6) && (dado2 ==6)) || ((dado1 == 6) && (dado3 ==6)) || ((dado2 == 6) && (dado3 ==6))) {
            System.out.println("Buen resultado.");
        }
        
        // Si 1 dado es 6.
        else if (((dado1 != 6) && (dado2 !=6)) || ((dado1 != 6) && (dado3 !=6)) || ((dado2 != 6) && (dado3 !=6))) {
            System.out.println("Regular.");
        }
        
        // Si ningún dado es 6.
        else {
            System.out.println ("Pésimo.");
        }
    }
    
}
