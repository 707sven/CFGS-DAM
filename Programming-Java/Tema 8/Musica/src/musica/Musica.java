/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package musica;

import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Musica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         /*
         Crear clase instrumento:
            - Almacena máx 100 notas musicales
            - Mientras haya sitio es posible añadir nuevas notas al final con el metodo "add"
            - La clase dispone de un metodo llamado "interpretar" que mostrará por consola las notas musicales segun las interprete
            - Notas Do, Re, Mi, Fa, Sol, La, Si
            - Añadir constructores
        Heredar -> clase piano y guitarra
            - A la clase piano y guitarra añadiremos las notas en el main
            - Al final mostraremos las listas con lo añadido en las dos clases (se unen)
         */
         Guitarra guitarra1 = new Guitarra();
         Piano piano1 = new Piano();
         
         String notas = null;
         do {
             guitarra1.add(notas);
             piano1.add(notas);
             System.out.print("Introduce una nota: ");
             notas = leer.nextLine();
         } while (!notas.equalsIgnoreCase("f"));
         
         guitarra1.interpretar();
         piano1.interpretar();
    }
    
}
