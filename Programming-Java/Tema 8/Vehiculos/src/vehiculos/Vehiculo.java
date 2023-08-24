/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author usuario
 */
public abstract class Vehiculo {
    //Atributos
    protected String color;
    protected int ruedas;
    
    //Constructor
    public Vehiculo() {
    }
    
    public Vehiculo(String color, int ruedas) {
        this.color = color;
        this.ruedas = ruedas;
    }
    
    //Metodos
    @Override
    public String toString() {
        return "color= " + color + ", ruedas= " + ruedas;
    }
    
}
