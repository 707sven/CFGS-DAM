/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author usuario
 */
public class Moto extends Bicicleta {
    //Atributos
    protected int velocidad;
    protected int cilindrada;
    
    //Constructores
    public Moto() {
    }

    public Moto(int velocidad, int cilindrada, String tipo, String color, int ruedas) {
        super(tipo, color, ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }
    
    //Metodos
    @Override
    public String toString() {
        return super.toString() + ", velocidad= " + velocidad + "km/h, " + "cilindrada= " + cilindrada + "cc";
    }
    
}
