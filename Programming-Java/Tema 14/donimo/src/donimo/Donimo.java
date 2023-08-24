/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donimo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Donimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // 1.- creamos las 28 fichas (0:0 -> 6:6)
        // 2.- Creamos las listas de las fichas
        // 3.- Repartir a los jugadores las fichas (7 para cada jugador)
        // 4.- Jugar

        LinkedList<Ficha> ficha = new LinkedList();

        // Creacion de fichas
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j <= i; j++) {
                ficha.add(new Ficha(i, j));
            }
        }
        System.out.println(ficha.toString());

        //Desordenar las fichas
        Collections.shuffle(ficha);
        System.out.println(ficha.toString());

        //Creamos los jugadores
        LinkedList<Ficha> jugador1 = new LinkedList();
        LinkedList<Ficha> jugador2 = new LinkedList();

        // Le repartimos las fichas barajadas a los jugadores
        for (int a = 0; a < 7; a++) {
            jugador1.add(ficha.pollFirst()); // Utiliza un elemento al azar del array y lo elimina de la lista principal
            jugador2.add(ficha.pollFirst());
        }
        Collections.sort(jugador1);
        Collections.sort(jugador2);
        System.out.println(jugador1.toString());
        System.out.println(jugador2.toString());
        System.out.println(ficha.toString());

        // Creacion de la partida (comienza el jugador que tenga un doble o que tenga las fichas que sumen un número mayor)
        LinkedList<Ficha> mesa = new LinkedList();

        //Comprobacion del primer turno        
        Ficha ficha1 = Collections.max(jugador1);
        Ficha ficha2 = Collections.max(jugador2);

        boolean start1 = false;

        if (ficha1.getPeso() > ficha2.getPeso()) {
            System.out.println("Comienza el Jugador 1.");
            start1 = true;
        } else {
            System.out.println("Comienza el Jugador 2.");
        }

        if (start1) {
            System.out.println("Jugador 1, elige la ficha para comenzar. ");
            colocarFicha(jugador1, mesa);

        } else {
            System.out.println("Jugador 2, elige la ficha para comenzar. ");
            colocarFicha(jugador2, mesa);
        }

    }

    public static void colocarFicha(LinkedList<Ficha> jugador, LinkedList<Ficha> mesa) {
        Scanner leer = new Scanner(System.in);

        System.out.println(jugador.toString());
        int jugada = leer.nextInt();
        mesa.add(jugador.get((jugada - 1)));
        jugador.remove((jugada - 1));
        System.out.println(mesa.toString());
    }
    
    
}
