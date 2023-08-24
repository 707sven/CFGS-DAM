/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diccionarioingles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class DiccionarioIngles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* proyecto DICCIONARIO:crear un minidiccionario español-ingles que contenga al menos 20 palabras con su correspondiente traduccion.
        Utiliza un objeto de la clase hashMap para almacenar las parejas de palabras, el programa pedira una palabra en español y dara la traducción la traduccion al ingles.
        Escribir una palabra en español y que te de 5 palabras en ingles, elegir la valida :D
         */
        Scanner leer = new Scanner(System.in);

        HashMap<String, String> diccionario = new HashMap<>();

        diccionario.put("hola", "hello");
        diccionario.put("adios", "bye");
        diccionario.put("amarillo", "yellow");
        diccionario.put("rojo", "red");
        diccionario.put("azul", "blue");
        diccionario.put("verde", "green");
        diccionario.put("rosa", "pink");
        diccionario.put("naranja", "orange");
        diccionario.put("blanco", "white");
        diccionario.put("negro", "black");
        diccionario.put("morado", "purple");
        diccionario.put("hierro", "iron");
        diccionario.put("oro", "gold");
        diccionario.put("esmeralda", "emerald");
        diccionario.put("diamante", "diamond");
        diccionario.put("copper", "cobre");
        diccionario.put("puerta", "door");
        diccionario.put("madera", "wood");
        diccionario.put("piedra", "stone");
        diccionario.put("lana", "wool");

        System.out.print("Palabra en español: ");
        String palabra = leer.next();
        System.out.println("Traducción en inglés: " + diccionario.get(palabra.toLowerCase()));

        String ing = null;
        int contador = 1;
        
        LinkedList<String> lista = new LinkedList<>(diccionario.values());
        LinkedList<String> lista2 = new LinkedList<>();
        
        System.out.println("\n──── ʚ Escoge la opción válida ɞ ────");
        System.out.print("ʚ Español: ");
        String esp = leer.next();
        String palabraTraducida = diccionario.get(esp);
        lista.remove(palabraTraducida);
        Collections.shuffle(lista); //Desordenada
        for(int i = 0; i < 4; i++) {
            lista2.add(lista.get(i));
        }
        lista2.add(diccionario.get(esp));
       
        Collections.shuffle(lista2);
        
        while (contador != 6) {
            System.out.println(contador + ".- " + lista2.get((contador) - 1));
            contador++;
        }

        System.out.print("ʚ Traducción: ");
        String eleccion = leer.next();

        if (diccionario.containsKey(esp)) {
            if (diccionario.get(esp).equals(eleccion)) {
                System.out.println("── ✓ Traducción correcta ✓ ──");
            } else {
                System.out.println("── x Traducción erronea x ──");
            }
        }

    }

}
