/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobinario;

import java.io.Serializable;

/**
 *
 * @author usuario
 */
public class Persona implements Serializable {

    //Atributos
    private String nombre;
    private String dni;
    private int edad;

    //Constructor
    public Persona() {
    }

    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "======>> Persona <<======" + "\nNombre: " + nombre + "\nDNI: " + dni + "\nEdad: " + edad;
    }

}
