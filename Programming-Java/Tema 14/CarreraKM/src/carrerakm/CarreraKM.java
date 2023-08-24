/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carrerakm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class CarreraKM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=========>> 1000 KM <<==========");
        // Creamos las posibles cartas
        String[] distancia = {"25 KM", "50 KM", "75 KM", "150 KM", "200 KM"};
        String[] distancia100 = {"100 KM"};
        String[] defensa = {"SEMÁFORO VERDE", "GASOLINA"};
        String[] ataque = {"SEMÁFORO ROJO", "SIN GASOLINA"};

        // Creación del mazo de juego
        ArrayList<Carta> baraja = new ArrayList();

        // Agregamos todas las posibles cartas en la baraja de juego
        for (int i = 0; i < distancia.length; i++) {
            // Cartas de distancia, 2 de cada
            Carta carta = new Carta(distancia[i], 1, false);
            carta.introducirValores();
            for (int j = 0; j < 2; j++) {
                baraja.add(carta);
            }
        }
        for (int i = 0; i < distancia100.length; i++) {
            // Cartas de distancia de 100km, 6 de cada
            Carta carta = new Carta(distancia100[i], 1, false);
            carta.introducirValores();
            for (int j = 0; j < 6; j++) {
                baraja.add(carta);
            }
        }
        for (int i = 0; i < defensa.length; i++) {
            // Cartas de defensa, 8 de cada
            Carta carta = new Carta(defensa[i], 2, true);
            carta.introducirValores();
            for (int j = 0; j < 8; j++) {
                baraja.add(carta);
            }
        }
        for (int i = 0; i < ataque.length; i++) {
            // Cartas de ataque, 8 de cada
            Carta carta = new Carta(ataque[i], 3, true);
            carta.introducirValores();
            for (int j = 0; j < 8; j++) {
                baraja.add(carta);
            }
        }
        // Mezclamos el mazo de juego
        Collections.shuffle(baraja);

        // Separamos las cartas para la primera ronda de cada jugador
        ArrayList<Carta> mazo1 = new ArrayList();
        ArrayList<Carta> mazo2 = new ArrayList();

        for (int i = 0; i < 6; i++) {
            mazo1.add(baraja.get(i));
            baraja.remove(baraja.get(i));
        }
        for (int i = 0; i < 6; i++) {
            mazo2.add(baraja.get(i));
            baraja.remove(baraja.get(i));
        }

        // Creamos los jugadores
        Jugador jugador1 = new Jugador("Jugador 1", true, 0);
        Jugador jugador2 = new Jugador("Jugador 2", false, 0);

        // Creamos la mesa de juego para cada jugador
        Mesa mesa1 = new Mesa(mazo1, baraja, jugador1.getNombre(), jugador1.isTurno(), jugador1.getTotalKM());
        Mesa mesa2 = new Mesa(mazo2, baraja, jugador2.getNombre(), jugador2.isTurno(), jugador2.getTotalKM());

        // Comenzamos a jugar
        boolean fin = false;
        Scanner leer = new Scanner(System.in);

        do {
            // Comenzamos la partida
            boolean semaforo = true;
            boolean gasolina = true;
            if (jugador1.isTurno()) {
                // Partida jugador 1
                System.out.println("\n>> Turno de " + jugador1.getNombre());
                System.out.println(mesa1.toString());
                //Roba carta en el primer turno
                robarCarta(baraja, mesa1);
                mostrarMazo(mazo1);

                // Escogemos el final de turno
                System.out.println("\n¿Quieres jugar una carta o descartar una carta?");
                String jugar = leer.next();
                //Jugar una carta
                if (jugar.equalsIgnoreCase("jugar")) {
                    jugarCarta(mazo1, jugador1, semaforo, gasolina);
                    mostrarMazo(mazo1);
                    System.out.println("\n>> Fin del turno de " + jugador1.getNombre());
                    jugador1.setTurno(false);
                    jugador2.setTurno(true);
                }
                //Descartar una carta
                if (jugar.equalsIgnoreCase("descartar")) {
                    descartarCarta(mesa1);
                    mostrarMazo(mazo1);
                    System.out.println("\n>> Fin del turno de " + jugador1.getNombre());
                    jugador1.setTurno(false);
                    jugador2.setTurno(true);
                }

            } else {
                if (jugador2.isTurno()) {
                    // Partida jugador 1
                    System.out.println("\n>> Turno de " + jugador2.getNombre());
                    System.out.println(mesa2.toString());
                    //Roba carta en el primer turno
                    robarCarta(baraja, mesa2);
                    mostrarMazo(mazo2);

                    // Escogemos el final de turno
                    System.out.println("\n¿Quieres jugar una carta o descartar una carta?");
                    String jugar = leer.next();
                    //Jugar una carta
                    if (jugar.equalsIgnoreCase("jugar")) {
                        jugarCarta(mazo2, jugador2,semaforo, gasolina);
                        mostrarMazo(mazo2);
                        System.out.println("\n>> Fin del turno de " + jugador2.getNombre());
                        jugador2.setTurno(false);
                        jugador1.setTurno(true);
                    }
                    //Descartar una carta
                    if (jugar.equalsIgnoreCase("descartar")) {
                        descartarCarta(mesa2);
                        mostrarMazo(mazo2);
                        System.out.println("\n>> Fin del turno de " + jugador2.getNombre());
                        jugador2.setTurno(false);
                        jugador1.setTurno(true);
                    }
                }
            }

            // Fin del juego por 1000 km
            if ((jugador1.getTotalKM() == 1000) || (jugador2.getTotalKM() == 1000)) {
                if (jugador1.getTotalKM() == 1000) {
                    System.out.println(jugador1.getNombre() + " ha conseguido 1000KM. Ha ganado el juego!");
                } else {
                    System.out.println(jugador2.getNombre() + " ha conseguido 1000KM. Ha ganado el juego!");
                }
                fin = true;
            }
        } while (!fin);

    }

    public static ArrayList jugarCarta(ArrayList<Carta> mazo, Jugador jugador, boolean gasolina, boolean semaforo) {
        Scanner leer = new Scanner(System.in);
        System.out.println("\nʚ Jugar carta ɞ");
        // Seleccionamos la carta que queremos jugar
        System.out.println("Seleccione el numero de la carta que quieres jugar: ");
        int jugar = leer.nextInt();
        mazo.remove(jugar);
        // Comprobamos si es una carta de km y añadimos los kilometros
        if (!gasolina && !semaforo) {
            System.out.println("No puedes continuar, tienes que utilizar una carta de defensa");
        } else if ((mazo.get(jugar).getValor()) == 25) {
            jugador.setTotalKM(jugador.getTotalKM() + 25);
            System.out.println("Has avanzado en total " + jugador.getTotalKM());
        } else if ((mazo.get(jugar).getValor()) == 50) {
            jugador.setTotalKM(jugador.getTotalKM() + 50);
            System.out.println("Has avanzado " + jugador.getTotalKM());
        } else if ((mazo.get(jugar).getValor()) == 75) {
            jugador.setTotalKM(jugador.getTotalKM() + 75);
            System.out.println("Has avanzado " + jugador.getTotalKM());
        } else if ((mazo.get(jugar).getValor()) == 100) {
            jugador.setTotalKM(jugador.getTotalKM() + 100);
            System.out.println("Has avanzado " + jugador.getTotalKM());
        } else if ((mazo.get(jugar).getValor()) == 150) {
            jugador.setTotalKM(jugador.getTotalKM() + 150);
            System.out.println("Has avanzado " + jugador.getTotalKM());
        } else if ((mazo.get(jugar).getValor()) == 200) {
            jugador.setTotalKM(jugador.getTotalKM() + 200);
            System.out.println("Has avanzado " + jugador.getTotalKM());
        }

        //Comprobamos si es una carta de ataque ROJO
        if ((mazo.get(jugar).getValor()) == 1) {
            System.out.println("SEMAFORO EN ROJO");
            System.out.println("Para seguir jugando, el jugador deberá de usar un semaforo verde para continuar.");
            semaforo = false;

        }
        //Comprobamos si es una carta de ataque SIN GASOLINA
        if ((mazo.get(jugar).getValor()) == 2) {
            System.out.println("SIN GASOLINA");
            System.out.println("Para seguir jugando, el jugador deberá de usar una carta de gasolina para continuar.");
            gasolina = false;
        }
        //Comprobamos si es una carta de defensa VERDE
        if ((mazo.get(jugar).getValor()) == 3) {
            System.out.println("SEMAFORO EN VERDE");
            System.out.println("El jugador puede continuar.");
            semaforo = true;
        }
        //Comprobamos si es una carta de defensa GASOLINA
        if ((mazo.get(jugar).getValor()) == 4) {
            System.out.println("CON GASPOLINA");
            System.out.println("El jugador puede continuar.");
            gasolina = true;
        }
        return null;
    }

    public static ArrayList mostrarMazo(ArrayList<Carta> mazo) {
        System.out.println("\nMazo actual del jugador: ");
        System.out.println(mazo);
        return null;
    }

    public static ArrayList robarCarta(ArrayList<Carta> baraja, Mesa mesa) {
        System.out.println("\nʚ Robar carta ɞ");
        System.out.println("Robas una carta de la baraja");
        System.out.println("Has robado la carta: " + baraja.get(baraja.size() - 1));
        // Cogemos la ultima carta y la eliminamos del mazo
        mesa.getMazo().add(baraja.get(baraja.size() - 1));
        baraja.remove(baraja.size() - 1);
        return null;
    }

    public static ArrayList descartarCarta(Mesa mesa) {
        Scanner leer = new Scanner(System.in);
        System.out.println("\nʚ Descartar carta ɞ");
        // Seleccionamos la carta que queremos descartar
        System.out.println("Seleccione el numero de la carta que quieres descartar: ");
        int descarte = leer.nextInt();
        // La borramos del mazo
        mesa.getMazo().remove(descarte);
        return null;
    }

}
