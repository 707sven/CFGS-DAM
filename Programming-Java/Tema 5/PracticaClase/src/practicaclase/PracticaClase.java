/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaclase;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class PracticaClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        
        Persona persona1 = new Persona();
        persona1.nombre = "Pepe";
        persona1.apellidos = "paquito";
        persona1.nif = new int [10];
        persona1.edad = 18;
        
        Persona persona2 = new Persona("Antonio", "Ortiz");
        Persona persona3 = new Persona ("pepe", "ortiz");
        System.out.println(persona3.nombre + " " + persona2.apellidos);
        
    }

}
