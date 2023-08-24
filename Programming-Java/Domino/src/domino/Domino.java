/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package domino;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class Domino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Ficha> fichas = new LinkedList<>();
        LinkedList<Ficha> jugador1 = new LinkedList<>();
        LinkedList<Ficha> jugador2 = new LinkedList<>();
        LinkedList<Ficha> mesa = new LinkedList<>();

        repartirFichas(fichas, jugador1, jugador2);

        /*System.out.println(jugador1);
        System.out.println(jugador2);
        System.out.println(fichas);*/
        //Ordeno las fichas de las jugadores sabiendo así que la más alta se encuentra al final de la lista
        Collections.sort(jugador1);
        Collections.sort(jugador2);

        jugar(fichas, jugador1, jugador2, mesa);

        if (jugador1.isEmpty()) {
            System.out.println("El jugador 1 ha ganado.");
        } else if (jugador2.isEmpty()) {
            System.out.println("El jugador 2 ha ganado.");
        } else {
            System.out.println("No hay ganador");
        }

    }

    public static void repartirFichas(LinkedList<Ficha> fichas, LinkedList<Ficha> jugador1, LinkedList<Ficha> jugador2) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0 + i; j < 7; j++) {
                fichas.add(new Ficha(i, j));
            }
        }

        //System.out.println(fichas);
        Collections.shuffle(fichas);

        //System.out.println(fichas);
        for (int i = 0; i < 7; i++) {
            jugador1.add(fichas.pollFirst());
            jugador2.add(fichas.pollFirst());
        }
    }

    public static void jugar(LinkedList<Ficha> fichas, LinkedList<Ficha> jugador1, LinkedList<Ficha> jugador2, LinkedList<Ficha> mesa) {
        boolean turno1; //True=jugador1 juega : False=jugador2 juega
        Scanner entrada = new Scanner(System.in);
        if (jugador1.get(6).getPeso() > jugador2.get(6).getPeso()) {
            mesa.add(jugador1.pollLast());                                          //Añado la última ficha de la lista a la mesa y la elimino de la mano del jugador
            turno1 = false;
        } else {
            mesa.add(jugador2.pollLast());
            turno1 = true;
        }

        System.out.println(mesa);

        do {
            if (turno1) {
                turno1 = false;
                System.out.println("Turno del jugador 1");
                System.out.println(jugador1);
                menu(jugador1, mesa, fichas, entrada);
            } else {
                turno1 = true;
                System.out.println("Turno del jugador 2");
                System.out.println(jugador2);
                menu(jugador2, mesa, fichas, entrada);
            }
            System.out.println(mesa);
        } while (!jugador1.isEmpty() || !jugador2.isEmpty());

        System.out.println(mesa);
    }

    public static void colocarFicha(LinkedList<Ficha> jugador, LinkedList<Ficha> mesa, Scanner entrada) {
        int pos, cont = 0, colocar;
        boolean valid = false;
        while (!valid) {
            System.out.println(jugador);
            System.out.println("¿Qué ficha quieres colocar?");
            pos = entrada.nextInt();

            do {
                System.out.println("¿Dónde la quieres colocar?\n1. Delante\n2. Detrás");
                colocar = entrada.nextInt();
            } while (colocar <= 0 || colocar >= 3);

            switch (colocar) {
                case 1:
                    if (jugador.get(pos).getA() == mesa.get(0).getA()) {
                        int aux = jugador.get(pos).getA();
                        jugador.get(pos).setA(jugador.get(pos).getB());
                        jugador.get(pos).setB(aux);
                        mesa.addFirst(jugador.get(pos));
                        jugador.remove(pos);
                        valid = true;
                        cont++;
                    } else if (jugador.get(pos).getB() == mesa.get(0).getA()) {
                        mesa.addFirst(jugador.get(pos));
                        jugador.remove(pos);
                        valid = true;
                        cont++;
                    } else {
                        System.out.println("La ficha no se puede colocar delante");
                    }
                    System.out.println(mesa);
                    break;
                case 2:
                    if (jugador.get(pos).getA() == mesa.get(cont).getB()) {
                        mesa.addLast(jugador.get(pos));
                        jugador.remove(pos);
                        valid = true;
                        cont++;
                    } else if (jugador.get(pos).getB() == mesa.get(cont).getB()) {
                        int aux = jugador.get(pos).getB();
                        jugador.get(pos).setB(jugador.get(pos).getA());
                        jugador.get(pos).setA(aux);
                        mesa.addLast(jugador.get(pos));
                        jugador.remove(pos);
                        valid = true;
                        cont++;
                    } else {
                        System.out.println("La ficha no se puede colocar detrás");
                    }
                    System.out.println(mesa);
                    break;
            }
        }
    }

    public static void robarFicha(LinkedList<Ficha> fichas, LinkedList<Ficha> jugador, LinkedList<Ficha> mesa, Scanner entrada) {
        boolean valid = false;
        while (!valid) {
            jugador.addLast(fichas.pollFirst());
            System.out.println(jugador);
            if (jugador.getLast().getA() == mesa.getFirst().getA() || jugador.getLast().getB() == mesa.getFirst().getA() || jugador.getLast().getA() == mesa.getLast().getB() || jugador.getLast().getB() == mesa.getLast().getB()) {
                valid = true;
                System.out.println("Ya tienes una ficha para jugar.");
                colocarFicha(jugador, mesa, entrada);
            }
        }
    }

    public static void menu(LinkedList<Ficha> jugador, LinkedList<Ficha> mesa, LinkedList<Ficha> fichas, Scanner entrada) {
        System.out.println("¿Qué quieres hacer? \n1. Colocar Ficha \n2. Robar\n3. Pasar");
        int accion = entrada.nextInt();
        switch (accion) {
            case 1:
                colocarFicha(jugador, mesa, entrada);
                break;
            case 2:
                robarFicha(fichas, jugador, mesa, entrada);
                break;
            case 3:
                if (fichas.isEmpty()) {
                    System.out.println("El jugador ha pasado");
                    break;
                } else {
                    System.out.println("No se puede pasar, aún quedan fichas por robar");
                    System.out.println("El jugador roba ficha");
                    robarFicha(fichas, jugador, mesa, entrada);
                    break;
                }
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

}
