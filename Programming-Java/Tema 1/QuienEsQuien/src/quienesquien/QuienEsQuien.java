/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quienesquien;

import java.util.Scanner;
        
/**
 *
 * @author usuario
 */
public class QuienEsQuien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Vamos a hacer un programa que adivine quien es de quien estamos hablando:
                - Antonio: Tiene sombrero, bigote y gafas
                - Rafa: No tiene sombrero, no tiene bigote pero si tiene gafas
                - Marcos: Tiene sombrero, no tiene bigote ni gafas
                - Daniel: No tiene sombrero, tiene bigote pero no tiene gafas
        */
        
        Scanner entrada = new Scanner(System.in);
               
        System.out.println("Bienvenido a  ' Adivina el personaje', te haremos una serie de preguntas a las cuales responderás con 'true' y 'false'.");
        System.out.println("Dicho esto, comenzemos :)");
        System.out.println(" ");
                
        //Sombrero
        System.out.println("¿Tu personaje tiene sombrero?");
        boolean sombrero = entrada.nextBoolean();
                
        //Bigote
        System.out.println("¿Tu personaje tiene bigote?");
        boolean bigote = entrada.nextBoolean();
        
        //Gafas
        System.out.println("¿Tu personaje tiene gafas?");
        boolean gafas = entrada.nextBoolean();
        
        //Adivinar el personaje.        
        //Antonio
        if ((sombrero == true) && (bigote == true) && (gafas == true)) {
            System.out.println("Tu personaje es Antonio");
        }
        
        //Rafa
        else if ((sombrero == false) && (bigote == false) && (gafas == true)) {
            System.out.println("Tu personaje es Rafa.");
        }
        
        //Marcos
        else if ((sombrero == true) && (bigote == false) && (gafas == false)) {
            System.out.println("Tu personaje es Marcos.");
        }
        
        //Daniel
        else if ((sombrero == false) && (bigote == true) && (gafas == false)) {
            System.out.println("Tu personaje es Daniel.");
        }
        
        else {
            System.out.println("No hay ningún personaje así.");
        }
        
    }
    
}

