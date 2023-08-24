/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coleccionesset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author usuario
 */
public class ColeccionesSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Pepe");
        set1.add("Pepe"); // Si añadimos algo que ya está dentro, no lo muestra en el final
        set1.add("Antonia");
        set1.add("Juan");
        set1.add("Maria");
        System.out.println(set1); // Lo muestra de forma aleatoria, pero siempre de la misma manera

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(100);
        set2.add(200);
        set2.add(300);
        set2.add(400);
        set2.add(500);
        System.out.println(set2);

        TreeSet<String> set3 = new TreeSet<>(); // Se ordena por orden alfabetico
        set3.add("Pepe");
        set3.add("Antonia");
        set3.add("Juan");
        set3.add("María");
        System.out.println(set3);

        TreeSet<Integer> set4 = new TreeSet<>(); // Lo ordena por su valor
        set4.add(100);
        set4.add(200);
        set4.add(300);
        set4.add(400);
        set4.add(500);
        System.out.println(set4);

        Persona persona1 = new Persona("Paco", "7717", 12);
        Persona persona2 = new Persona("Awa", "9417", 14);

        HashSet<Persona> setPersona = new HashSet<>();
        setPersona.add(persona1);
        System.out.println(setPersona.toString());

        TreeSet<Persona> setPersona2 = new TreeSet<>();
        setPersona2.add(persona1);
        setPersona2.add(persona2);
        System.out.println(setPersona2.toString());

        Iterator it = set2.iterator();//Creamos un iterator
        while (it.hasNext()) { //Recorrer el iterator
            System.out.println(it.next());
        }
    }

}
