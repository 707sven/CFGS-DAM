/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author usuario
 */
public class Empleado extends Persona {
    protected double salario;

    public Empleado(double salario, String nombre, String dni, int edad) {
        super(nombre, dni, edad);
        this.salario = salario;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println(salario + " €");
    }
    
}
