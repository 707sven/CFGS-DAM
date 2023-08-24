/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author usuario
 */
public class Bicicleta extends Vehiculo {
    //Atributos
    protected String tipo;
    
    //Constructores
    public Bicicleta() {
    }

    public Bicicleta(String tipo, String color, int ruedas) {
        super(color, ruedas);
        this.tipo = tipo;
    }
    
    //Metodos
    @Override
    public String toString() {
        return super.toString() + ", tipo= " + tipo;
    }
    
}
