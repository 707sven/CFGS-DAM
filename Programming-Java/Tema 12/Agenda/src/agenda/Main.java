/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agenda;

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
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        /* Diseñar una agenda con un menú (guardar el nombre y el teléfono con 20 contactos simples. ):
            1.- Nuevo contacto --> introducir un nuevo contacot siempre y cuando la agenda no esté llena, comprobando que el nombre no se encuentre insertado ya
            2.- Buscar por nombre --> muestra todos los teléfonos que coinciden con la cadena a buscar (ej. pe -- mostrará pedro, petunia, etc)
            3.- Mostrar todos -->mostrará un liostado con toda la información
            4.- Salir  --> guarda todos los datos de la agenda en el archivo "agenda.txt" 
        La proxima vez que se ejecute la agenda se deberá comprobar si hay datos guardados y cargarlos. */
        Scanner leer = new Scanner(System.in);
        Agenda agenda = new Agenda();
        cargarDatos(agenda);

        //Menu
        int eleccion;

        do {
            System.out.println("""
                               =======>> AGENDA <<========
                               1.- Nuevo contacto.
                               2.- Buscar por nombre.
                               3.- Mostrar todos.
                               4.- Salir.
                               ===========================""");
            System.out.println("¿Qué quieres hacer? Elige una opción del 1 al 4. ");
            eleccion = leer.nextInt();

            switch (eleccion) {
                case 1:
                    crearContacto(agenda);
                    break;
                case 2:
                    buscarNombre(agenda);
                    break;
                case 3:
                    System.out.println("Mis contactos: ");
                    agenda.mostrarAgenda();
                    break;
                case 4:
                    salir(agenda);
                    break;
                default:
                    System.out.println("Número no válido. \nInserte un número del 1 al 4.\n");
                    break;
            }

        } while (eleccion != 4);

    }

    public static void cargarDatos(Agenda a) throws IOException {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce la direccion del fichero.");
        String nombrefichero = leer.nextLine();
        File file = null;
        file = new File(nombrefichero);

        FileReader fileReader; //Para cargar y leer el archivo
        BufferedReader bufferedReader = null; //Para escribir y editar el fichero; cuando termina con la ultima línea, si está vacía pone "null"
        String frase = bufferedReader.readLine(); //Lee la primera linea
        String[] arrayFrase = new String[1]; //Creamos el array de string para poder guardarlos por bloques (ya que usaremos el .split para divir el nombre del número)

        fileReader = new FileReader(file);
        bufferedReader = new BufferedReader(fileReader);
        if (file.canRead()) {
            while (frase != null) {
                arrayFrase = frase.split(";"); //El split te lo divide ya en un array, así que con ponerlo así, funciona y nos da las dos posiciones del array
                Contacto contacto = new Contacto(arrayFrase[0], arrayFrase[1]); //Creamos un contacto aparte para insertar los contactos guardados
                a.agregarContacto(contacto); //Introducimos el contacto en la agenda
                bufferedReader.readLine(); //Leemos la siguiente línea para comprobar si la siguiente línea está vacía, si es así saldrá "null" y saldrá del bucle
            }
        } else {
            System.out.println("El archivo no se puede leer.");
        }

    }

    public static void crearContacto(Agenda a) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Teléfono: ");
        String telefono = leer.nextLine();

        Contacto contacto = new Contacto(nombre, telefono);
        a.agregarContacto(contacto);

    }

    public static void buscarNombre(Agenda a) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Buscador: ");
        String buscador = leer.nextLine();

        a.buscarContacto(buscador);

    }

    public static void salir(Agenda a) {

    }
}
