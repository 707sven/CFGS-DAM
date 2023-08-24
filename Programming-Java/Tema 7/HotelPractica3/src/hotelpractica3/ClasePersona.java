/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelpractica3;

/**
 *
 * @author usuario
 */
public class ClasePersona {
    //Atributos
    private String Nombre;
    private int Edad;
    private String DNI;
    
    //Constructores
    public ClasePersona() {
    }
    
    public ClasePersona(String Nombre, int Edad, String DNI) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.DNI = DNI;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    //Metodos

    @Override
    public String toString() {
        return this.Nombre + ", " + this.DNI + ", " + this.Edad;
    }
    
}
