/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelpractica3;
import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class ClaseHotel {
    //Atributos
    private String Nombre;
    private String Direccion;
    private int NumeroPlantas;
    private ClaseFactura [] Factura;
    
    //Constructores
    public ClaseHotel() {
    }
    
    public ClaseHotel(String Nombre, String Direccion, int NumeroPlantas) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.NumeroPlantas = NumeroPlantas;
    }

    public ClaseFactura[] getFactura() {
        return Factura;
    }

    public void setFactura(ClaseFactura[] Factura) {
        this.Factura = Factura;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getNumeroPlantas() {
        return NumeroPlantas;
    }

    public void setNumeroPlantas(int NumeroPlantas) {
        this.NumeroPlantas = NumeroPlantas;
    }

    //Metodos
    @Override
    public String toString() {
        return "Nombre hotel: " + this.Nombre + "\n" + "Dirección del hotel: " + this.Direccion + "\n" + "Número de plantas: " + this.NumeroPlantas + " plantas" + "\n" + Arrays.toString(this.Factura);
    }
}
