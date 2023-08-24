/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintonizar;

/**
 *
 * @author usuario
 */
public class sintonizador {
    //Atributos
    private double frecuencia;
    
    //Constructores
    public sintonizador(double frecuencia) {
        this.frecuencia = frecuencia;
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }
    
    //Metodos
    public double up() {
        frecuencia = frecuencia + 0.5;
        return frecuencia;
    }
        public double down() {
        frecuencia = frecuencia - 0.5;
        return frecuencia;
    }
    
}
