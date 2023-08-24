/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author marta
 */
public class Lista {

    protected Producto[] producto = new Producto[20];
    int contador = 0;

    public Lista() {
    }

    //Metodos
    public void nuevoProducto(Producto a) throws ListaException {
        String nombre = a.getNombre();
        String cantidad = a.getCantidad();

        if (producto[contador] == null && contador < 20) {
            producto[contador] = new Producto(nombre, cantidad);
            contador++;
        } else {
             throw new ListaException();
        }
    }

    public void verLista() {
        for (int i = 0; i < contador; i++) {
            System.out.println(producto[i]);
        }
    }

    public void buscarProducto() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Buscador: ");
        String inicio = leer.nextLine();

        for (int i = 0; i < contador; i++) {
            if (producto[i].getNombre().startsWith(inicio)) {
                System.out.println(producto[i].toString());
            }
        }
    }

    public void guardarSalir() {
        try {
            File file = new File("compra.txt");
            BufferedWriter out = new BufferedWriter(new FileWriter(file, true));

            for (int i = 0; i < contador; i++) {
                out.newLine();
                out.write(producto[i].getNombre());
                out.write(": ");
                out.write(producto[i].getCantidad());
                out.newLine();
            }
            out.close();

        } catch (FileNotFoundException e1) {
            System.out.println(e1.getMessage());
        } catch (IOException e2) {
            System.out.println(e2.getMessage());
        }
    }
    
    public void borrarProducto(Lista a) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Palabra a borrar: ");
        String palabra = leer.nextLine();

        for (int i = 0; i < contador; i++) {
            if  (producto[i].getNombre().equalsIgnoreCase(palabra)) {
                
            }
        }
    }

    public void modificarUnidad(Lista a) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Buscador: ");
        String palabra = leer.nextLine();

        for (int i = 0; i < contador; i++) {
            if  (producto[i].getNombre().equalsIgnoreCase(palabra)) {
                System.out.println("Introduce la nueva cantidad: ");
                String cantidadNueva = leer.nextLine();
                
                producto[i].setCantidad(cantidadNueva);
            }
        }
        
    }
    
    public void borrarLista(Lista a) {
        
    }
    
    public void copiaLista() {
        
    }
}
