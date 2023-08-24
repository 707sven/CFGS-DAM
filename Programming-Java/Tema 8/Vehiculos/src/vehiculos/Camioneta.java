/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author usuario
 */
public class Camioneta extends Coche {
    //Atributos
    protected int carga;
    
    //Constructores
    public Camioneta() {
    }

    public Camioneta(int carga, int velocidad, int cilindrada, String color, int ruedas) {
        super(velocidad, cilindrada, color, ruedas);
        this.carga = carga;
    }
    
    //Metodos
    @Override
    public String toString() {
        return super.toString() + ", carga= " + carga + "kg";
    }
    
}
