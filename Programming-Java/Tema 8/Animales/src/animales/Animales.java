/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animales;

/**
 *
 * @author usuario
 */
public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro1 = new Perro ("Pipo", 12);
        Gato gato1 = new Gato ("Kuro", 6);
        
        perro1.cumplirEdad();
        System.out.println("Es el cumpleaños de " + perro1.nombre + "!\n" + perro1.nombre + " cumple " + perro1.edad + " años.");
        perro1.comer();
        
        gato1.cumplirEdad();
        System.out.println("\nEs el cumpleaños de " + gato1.nombre + "!\n" + gato1.nombre + " cumple " + gato1.edad + " años.");
        gato1.comer();
        
    }
    
}
