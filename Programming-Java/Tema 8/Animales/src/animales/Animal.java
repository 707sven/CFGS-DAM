/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author usuario
 */
public abstract class Animal {
    //Atributos
    protected String nombre;
    protected int edad;
    
    //Constructores
    public Animal() {
    }

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Metodos
    public void cumplirEdad() {
        edad ++;
    }
    public abstract void comer();
    
}
