/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerospositivos;

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
public class NumerosPositivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedir números enteros positivos por consola y guardarlos en un archivo binario hasta que introduzcamos un número negativo
        // Leer por pantalla el fichero binario con todos los enteros y mostrarlo por pantalla

        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce números positivos.");
        int contador = 0;
        int numero = 0;

        while (numero >= 0) {
            try {   //Guardamos los numeros en el archivo
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("numeros.txt"));
                numero = leer.nextInt();
                out.writeInt(numero);
                out.close();
                contador++;

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }
        //Leemos el fichero de los números
        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new FileInputStream("numeros.txt"));
            while (contador != 0) {
                numero = in.readInt();
                System.out.println(numero);
                contador--;
            }
            in.close();

        } catch (IOException e1) {
            System.out.println(e1.getMessage());
        }
    }

}
