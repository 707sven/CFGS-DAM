/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructorcopia;

/**
 *
 * @author usuario
 */
public class Persona {
    String nombre;
    int edad;
    
    public Persona() {
        
    }
    public Persona (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public Persona (Persona persona){
        this.nombre = persona.nombre;
        this.edad = persona.edad;
    }
}
