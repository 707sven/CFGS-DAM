/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasevehiculo;

/**
 *
 * @author usuario
 */
public class Vehiculo {
    //Atributos
    private int ruedas;
    private String color;
    private String tipo_vehiculo;
    
    //Constructores
    public Vehiculo() {}
    public Vehiculo(int r, String color, String tipo){
        ruedas = r;
        this.color = color;
        tipo_vehiculo = tipo;
    }
    
    //Metodos
    public String mostrar_vehiculo(int ruedas){
        String var = "";
        if (ruedas == 4) {
            var.equals("coche");
        }
        return var;
    }
    
    public void mostrarClase() {
        System.out.println("Ruedas: " + ruedas + ", color: " + color + ", tipo: " + tipo_vehiculo);
    }
    
    public int getRuedas() {
        return ruedas;
    }
    
    public void setRuedas (int ruedas){
        this.ruedas = ruedas;
    }
    
    public Vehiculo(String color, String tipo_vehiculo) {
        this.color = color;
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public String getColor() {
        return color;
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "ruedas=" + ruedas + ", color=" + color + ", tipo_vehiculo=" + tipo_vehiculo + '}';
    }
}
