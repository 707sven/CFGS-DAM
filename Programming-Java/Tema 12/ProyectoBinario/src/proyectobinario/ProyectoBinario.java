/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectobinario;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ProyectoBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escritura de fichero binario
        Scanner leer = new Scanner(System.in);

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datos.dat"));
            System.out.println("Introducir número real: ");
            double x = leer.nextDouble();
            out.writeDouble(x);
            out.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //Lectura de fichero binario
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("datos.dat"));
            double x = in.readDouble();
            System.out.println(x);
            in.close();

        } catch (IOException e1) {
            System.out.println(e1.getMessage());
        }

        //Escritura con clase Persona
        Persona persona = new Persona();
        persona.setNombre("Pipo");
        persona.setEdad(77);
        persona.setDni("7711882D");

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datos.dat"));
            out.writeObject(persona);
            out.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            FileInputStream fis = new FileInputStream("datos.dat"); //Como no sabe que datos tiene el fichero, los lee en bytes, y para ello, se usa FileInputStream.
            ObjectInputStream lectura; //Creamos un objeto porque vamos a usar el objeto persona el cual luego queremos leer, para que el programa sepa que usamos un objeto
            while (fis.available() > 0) { //Si los bytes del archivo son 0, significa que no queda ningún dato dentro
                lectura = new ObjectInputStream(fis); //Le decimos que tipo de objeto es el que hemos creado
                Persona personaleida = (Persona) lectura.readObject(); //Leemos el objeto Persona
                System.out.println(personaleida.toString()); //Imprimimos por pantalla lo que se escribe en el fichero
            }
            fis.close();
        } catch (IOException | ClassNotFoundException e2) {
            System.out.println(e2.getMessage());
        }

    }

}
