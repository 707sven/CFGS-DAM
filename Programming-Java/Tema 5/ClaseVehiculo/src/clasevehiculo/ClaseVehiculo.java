/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasevehiculo;

/**
 *
 * @author usuario
 */
public class ClaseVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.setRuedas(4);
        vehiculo1.setColor("rojo");
        vehiculo1.setTipo_vehiculo("coche");
        
        System.out.println(vehiculo1.toString());
        
        Vehiculo vehiculo2 = new Vehiculo (2, "negro", "moto");
        System.out.println(vehiculo2.toString());
    }
    
}
