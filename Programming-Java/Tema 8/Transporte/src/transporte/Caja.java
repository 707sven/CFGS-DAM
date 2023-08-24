/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporte;

/**
 *
 * @author usuario
 */
public class Caja {
    //Atributos
    protected double ancho;
    protected double alto;
    protected double fondo;
    protected enum unidad{cm, m};
    protected double volumen = (ancho * alto * fondo);
    protected Etiqueta etiqueta;
    
    //Constructor
    public Caja() {
    }
    
    //Metodos

    public Caja(double ancho, double alto, double fondo, Etiqueta etiqueta) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.etiqueta = etiqueta;
    }
    
    
}
