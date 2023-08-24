/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author usuario
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Colecciones >> Arrays List <<
        //!! Array de int !! 
        ArrayList<Integer> arrayLi = new ArrayList<>(); //Se puede poner "new ArrayList<Integer>();" o sin el "<Integer>"

        for (int i = 1; i <= 5; i++) { //!! array.length se sustituye por >> array.size() <<
            arrayLi.add(i); //para meter datos usaremos >> array.add() <<
        }
        System.out.println(arrayLi);
        System.out.println(arrayLi.size());  //Nos dirá cuanto mide el ArrayList

        //Para borrar un elemento del ArrayList usaremos >> array.remove(index) <<
        arrayLi.remove(2);
        System.out.println(arrayLi);
        System.out.println(arrayLi.size());

        //!! Array de String !! 
        ArrayList<String> arraySt = new ArrayList<>();
        arraySt.add("Pepe");
        arraySt.add("Antonio");
        arraySt.add("Juan");

        System.out.println(arraySt);
        System.out.println(arraySt.size());

        arraySt.remove(2);
        System.out.println(arraySt);
        System.out.println(arraySt.size());

        //!! Array de clases (Persona) !! 
        ArrayList<Persona> personas = new ArrayList<>();

        //Crear una persona y añadirla
        Persona persona1 = new Persona("Pepe", "555", 18);
        personas.add(persona1);

        //Añadir una persona a la vez que la creo
        personas.add(new Persona("Samuel", "777", 20));
        personas.add(new Persona("Juancito", "444", 14));

        System.out.println(personas);
        System.out.println(personas.size());

        //Preguntamos a personas tiene dentro contenida persona1(si sale "true" está en la lista)
        System.out.println(personas.contains(persona1));

        //Recorrer la lista e imprimirlas uno a uno hacia abajo con la posición
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(i + " " + personas.get(i).toString()); //El get devuelve el contenido de la posición de la lista
        }

        //el "for i" es un for mejorado que ya sobreentiende que tiene que recorrer toda la lista
        // primero se pone el tipo de variable que queremos recorrer (tipo Persona)
        // luego la variable (i)
        // la lista que queremos que recorra (personas)
        for (Persona i : personas) {
            System.out.println(i); // la i es la variable que cambia, por lo que para mostrar el contenido de cada posición, hay que poner "i"
        }

        // Establecer el iterador con todas las personas (otra manera de recorrer listas)
        Iterator it = personas.iterator();
        while (it.hasNext()) { // si hay un elemento
            System.out.println(it.next()); // imprimelo
        }

        personas.add(new Persona("Tigreton", "222", 24));

        for (int i = 0; i < personas.size(); i++) {
            if (i == 2) {
                personas.remove(2);
            }
            System.out.println(personas.get(i).toString());
        }

        //Iterator existe porque es una manera estable de recorrer la colección (y la va actualizando)
        for (String nombre : arraySt) {
            if (nombre.equals("Pepe")) {
                arraySt.remove("Pepe");
            }
            System.out.println(arraySt);
        }

        // Linked List funciona igual que ArrayList porque ambos descienden de List
        LinkedList<String> frutas = new LinkedList();
        frutas.add("manzana");
        frutas.add("platano");
        frutas.add("pera");

        Iterator<String> it2 = frutas.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        // un arraylist de int y un linkedlist de string
        ArrayList<Integer> numeros1 = new ArrayList<>();
        numeros1.add(7);
        numeros1.add(5);
        numeros1.add(9);
        numeros1.add(4);
        numeros1.add(3);
        //Para eliminar un item de en medio usando Iterator
        Iterator<Integer> it4 = numeros1.iterator();
        while (it4.hasNext()) {
            Integer a = it4.next();
            if (a.equals(9)) {
                it4.remove();
            }
        }
        System.out.println(numeros1);

        LinkedList<Integer> numeros2 = new LinkedList();
        numeros2.add(7);
        numeros2.add(5);
        numeros2.add(9);
        numeros2.add(4);
        numeros2.add(3);

        //Para eliminar el contenido de una posición usando Iterator
        Iterator<Integer> it3 = numeros2.iterator();
        while (it3.hasNext()) {
            Integer a = it3.next();
            if (a.equals(9)) {
                it3.remove();
            }
        }
        Collections.sort(numeros2); //Para ordenar los numeros sin usar un for (de menor a mayor)
        // Funciona con cualquier tipo de dato menos con objetos que hayamos creado nosotros (ej, clase Persona), a menos que lo implementemos 
        // Para ello, iremos a la clase persona y pondremos implements Comparable, seguido de como ordenarlo (una clase abstracta)
        System.out.println(numeros2);

        Collections.sort(personas);
        System.out.println(personas);

    }

}
