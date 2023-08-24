/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploanimales;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class EjemploAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro = new Animal(4, "carne", true, "negro");
        perro.mostrarClase();
        System.out.println(" ");
        System.out.println(perro.patas);
        System.out.println(perro.dieta);
        System.out.println(perro.pelo);
        System.out.println(perro.color);
        
        Animal gato = new Animal(4, "pescado", true, "blanco");
        gato.mostrarClase();
        Animal cerdo = new Animal(4, "muertos", true, "rosa");
        cerdo.mostrarClase();
    }
}
