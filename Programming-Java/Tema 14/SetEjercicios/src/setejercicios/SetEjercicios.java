/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package setejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author usuario
 */
public class SetEjercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        // crear una coleccion de 20 numeros enteros aleatorios menores que 100 y guardarlos en el orden en que se vayan generando
        //mostrar por pantalla dicha lista creada
        //ordenarla por sentido creciente y volverla a mostrar en pantalla

        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            int random = (int) (Math.random() * 100);
            num.add(random);
        }

        System.out.println(num);
        Collections.sort(num);
        System.out.println(num);

        Collections.reverse(num);
        System.out.println(num);

        TreeSet<Integer> num1 = new TreeSet<>();
        while (20 > num1.size()) {
            num1.add((int) (Math.random() * 100));
        }
        System.out.println(num1);

        // Introducir por teclado hasta que se introduzca "fin" una serie de nombres que se insertarán por orden alfabetico en una coleccion que no permita repeticiones
        // Mostrar la lista de nombre por pantalla 
        // Usaremos el conjunto set (para ordenado seria TreeSet)
        Scanner leer = new Scanner(System.in);
        TreeSet<String> nombres = new TreeSet<>();

        String fin = null;
        while (!"fin".equalsIgnoreCase(fin)) {
            System.out.println("Introduce un nombre: ");
            fin = leer.next();
            if (!"fin".equalsIgnoreCase(fin)) {
                nombres.add(fin);
            }
        }
        System.out.println(nombres);
         */
        // Funcion que se le pase lista de nombres y devuelva una copia sin elemento repetidos
        Scanner leer = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        String terminar = "";
        while (!terminar.equalsIgnoreCase("fin")) {
            System.out.println("Nombre: ");
            terminar = leer.next();
            if (!terminar.equalsIgnoreCase("fin")) {
                lista.add(terminar);
            }
        }
        System.out.println(lista);
        ArrayList<String> lista2 = new ArrayList<>();
        lista2 = eliminarRepetidos(lista);
        System.out.println(lista2);

        // Introducir por consola una frase que conste exclusivamente de palabras separadas por espacios
        // Almacenar en una lista las palabras de las frases, una en cada nodo
        // Mostrar por pantalla las palabras que estén repetidas, y luego mostrar las que no están
        ArrayList<String> fraseEspacios = new ArrayList<>();
        System.out.print("Frase: ");
        String frase = leer.next();

        String[] palabras = frase.split(" ");
        ArrayList<String> lista1 = new ArrayList(Arrays.asList(palabras));
        LinkedHashSet<String> palabrasRepe = new LinkedHashSet();
        ArrayList<String> aux = new ArrayList(lista1);
        while (aux.size() > 0) {
            String temp = aux.remove(0);
            if (aux.contains(temp)) {
                palabrasRepe.add(temp);
            }
        }
        System.out.println(palabrasRepe);
        aux.removeAll(palabrasRepe);
        System.out.println(aux);

    }

    public static ArrayList eliminarRepetidos(ArrayList c) {
        LinkedHashSet temp = new LinkedHashSet(c);
        ArrayList lista3 = new ArrayList(temp);

        return new ArrayList(lista3);
    }
}
