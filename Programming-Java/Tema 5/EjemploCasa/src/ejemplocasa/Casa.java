/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplocasa;

/**
 *
 * @author usuario
 */
public class Casa {
    String direccion;
    int habitaciones;
    int plantas;
    boolean piscina;
    boolean garaje;
    
    public Casa (){
    }
    public Casa (String direccion){
        this.direccion = direccion;
    }
    public Casa (String direccion, int habitaciones, int plantas, boolean piscina, boolean garaje){
        this.direccion = direccion;
        this.habitaciones = habitaciones;
        this.plantas = plantas;
        this.piscina = piscina;
        this.garaje = garaje;
    }
    public void mostrarClase() {
        System.out.println("Direccion: " + this.direccion + ", número de habitaciones: " + this.habitaciones + ", número de plantas: " + this.plantas +  ", piscina: " + this.piscina + ", garaje: " + this.garaje);
    }
}
