/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author marta
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ListaException {
        Scanner leer = new Scanner(System.in);
        Lista lista1 = new Lista();
        int eleccion = 0;

        System.out.println("¿Quieres cargar una lista anterior? (si o no) ");
        String cargar = leer.nextLine();

        switch (cargar.toLowerCase()) {
            case "si":
                cargarDatos(lista1);
                break;
            case "no":
                break;
            default:
                break;
        }

        do {
            System.out.println("""
                               =======>> LISTA <<========
                               1.- Añadir producto.
                               2.- Ver la lista.
                               3.- Borrar un producto
                               4.- Modificar las unidades.
                               5.- Buscar un producto.
                               6.- Borrar toda la lista
                               7.- Hacer una copia de la lista.
                               8.- Guardar y Salir.
                               ===========================""");
            System.out.println("¿Qué quieres hacer? Elige una opción. ");
            eleccion = leer.nextInt();

            //Menu
            switch (eleccion) {
                case 1:
                    nuevoProducto(lista1);
                    break;
                case 2:
                    lista1.verLista();
                    break;
                case 3:

                    break;
                case 4:
                    lista1.modificarUnidad(lista1);
                    break;
                case 5:
                    lista1.buscarProducto();
                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:
                    lista1.guardarSalir();
                    break;
                default:
                    System.out.println("Error. Prueba con otro número.");
                    break;
            }
        } while (eleccion != 8);

    }

    public static void cargarDatos(Lista a) throws ListaException {
        String nombrefichero = "compra.txt";
        File file = null;
        file = new File(nombrefichero);

        try {
            FileReader fileReader;
            BufferedReader bufferedReader = null;
            String frase = bufferedReader.readLine();
            String[] arrayFrase = new String[1];

            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            if (file.canRead()) {
                while (frase != null) {
                    arrayFrase = frase.split(": ");
                    Producto producto = new Producto(arrayFrase[0], arrayFrase[1]);
                    a.nuevoProducto(producto);
                    bufferedReader.readLine();
                }
            } else {
                System.out.println("El archivo no se puede leer.");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void copiarLista() throws FileNotFoundException {
        File file = new File("compra.txt");
        File copia = new File ("copiacompra.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        
        
    }

    public static void nuevoProducto(Lista a) throws ListaException {
        Scanner leer = new Scanner(System.in);

        System.out.print("Producto: ");
        String nombre = leer.nextLine();
        System.out.print("Cantidad: ");
        String cantidad = leer.nextLine();

        Producto producto = new Producto(nombre, cantidad);
        a.nuevoProducto(producto);

    }

}
