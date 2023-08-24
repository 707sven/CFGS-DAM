/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructorcopia;

/**
 *
 * @author usuario
 */
public class ConstructorCopia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona("Pepe", 15);
        Persona persona2 = new Persona(persona1);
    }
    
}
