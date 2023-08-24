/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author usuario
 */
public class Perro extends Animal {
    
    //Constructor
    public Perro() {
    }
    
    public Perro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
     
    //Metodos
    @Override
    public void cumplirEdad() {
        super.cumplirEdad();
    }
    
    @Override
    public void comer() {
        System.out.println("El perro come pienso");
    }
}
