/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistmenu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ArrayListMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* ArrayList de numeros reales
        menu:   1. Agregar numero
                     2. Buscar numero (ej. 7 existe en la lista y tiene la posicion 0)
                     3. Modificar numero
                     4. Eliminar un numero
                     5. Insertar un número en una posicion dada
                     6. Ordenar y mostrar
         */
        Scanner leer = new Scanner(System.in);
        ArrayList<Double> lista = new ArrayList<>();
        boolean salir = true;

        do {
            System.out.println("""
                               ──── ʚ ♡ ɞ ────
                                1. Agregar numero
                                2. Buscar numero
                                3. Modificar numero
                                4. Eliminar un numero
                                5. Insertar un número en una posicion dadas
                                6. Ordenar y mostrar
                                7. Salir
                               ──── ʚ ♡ ɞ ────
                               Elige una opción: """);
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el número real para añadirlo a la lista.");
                    double i = leer.nextDouble();
                    lista.add(i);
                    System.out.println(lista);
                    break;
                case 2:
                    System.out.println("Introduce el número real que quieras buscar.");
                    double a = leer.nextDouble();
                    if (lista.contains(a)) {
                        System.out.println("El número " + a + " existe en la lista y está en la posición " + lista.indexOf(a));
                        System.out.println(lista);
                    } else {
                        System.out.println("El número no existe en la lista.");
                    }
                    break;
                case 3:
                    System.out.println("Introduce el número real que quieras modificar.");
                    double mod = leer.nextDouble();
                    if (lista.contains(mod)) {
                        System.out.println("Introduce el nuevo número.");
                        double nuevo = leer.nextDouble();
                        lista.set(lista.indexOf(mod), nuevo);
                        System.out.println(lista);
                    } else {
                        System.out.println("El número no existe en la lista.");
                    }
                    break;
                case 4:
                    System.out.println("Introduce el número que quieras eliminar de la lista.");
                    double eliminar = leer.nextDouble();
                    lista.remove(lista.indexOf(eliminar));
                    System.out.println(lista);
                    break;
                case 5:
                    System.out.println("Introduce la posición en la lista que quieras modificar.");
                    int posicion = leer.nextInt();
                    System.out.println("Escribe el número real que quieras introducir.");
                    double num = leer.nextDouble();
                    lista.add(posicion, num);
                    System.out.println(lista);
                    break;
                case 6:
                    Collections.sort(lista);
                    System.out.println(lista);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    salir = false;
                    break;
            }
        } while (salir);

    }

}
