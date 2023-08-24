/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaclase;

/**
 *
 * @author usuario
 */
public class Persona {
    String nombre;
    String apellidos;
    int [] nif;
    int edad;
    
    void cumplirEdad(){
        edad ++;
    }
    public Persona (String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    public Persona() {
    }
    public Persona(String nombre, String apellidos, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
}
