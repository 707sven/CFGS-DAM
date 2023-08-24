/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuevobanco;
import cuentacorriente.ClaseCuentaCorriente;

/**
 *
 * @author usuario
 */
public class Banco {
    //Atributos
    private ClaseCuentaCorriente cuenta;
    final String nombre;
    private double capital;
    private String direccionCentral;
    
    //Constructores
    public Banco(String nombre, double capital, String direccionCentral, ClaseCuentaCorriente cuenta) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.capital = capital;
        this.direccionCentral = direccionCentral;
    }
    
    public Banco(String nombre) {
        this.nombre = nombre;
        this.capital = 5.2;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public String getDireccionCentral() {
        return direccionCentral;
    }

    public void setDireccionCentral(String direccionCentral) {
        this.direccionCentral = direccionCentral;
    }

    public ClaseCuentaCorriente getCuenta() {
        return cuenta;
    }

    public void setCuenta(ClaseCuentaCorriente cuenta) {
        this.cuenta = cuenta;
    }
    
    
    //Métodos

    @Override
    public String toString() {
        return "Banco{" + cuenta.toString() + ", nombre=" + nombre + ", capital=" + capital + "M €, direccionCentral=" + direccionCentral + '}';
    }
    

    
    
}
