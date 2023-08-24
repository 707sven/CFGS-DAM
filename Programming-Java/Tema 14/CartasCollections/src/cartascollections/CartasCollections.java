/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cartascollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class CartasCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realiza un programa que escoja al azar 10 cartas de la baraja española
        (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para almacenarlas y asegúrate de que no se repite ninguna.
        Modifica el programa anterior de tal forma que las cartas se muestren ordenadas. Primero se ordenarán por palo: bastos, copas, espadas, oros. 
        Cuando coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey*/

        Scanner leer = new Scanner(System.in);

        String[] palos = {"Bastos", "Copas", "Espadas", "Oros"};
        String[] numeros = {"as", "1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};
        ArrayList<Carta> baraja = new ArrayList();

        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                Carta carta = new Carta(palos[i], numeros[j]);
                baraja.add(carta);
            }
        }
        System.out.println(baraja.toString());
        Collections.shuffle(baraja);

        ArrayList<Carta> mazo = new ArrayList();

        for (int i = 0; i < 10; i++) {
            mazo.add(baraja.get(i));
        }
        
        System.out.println(mazo);
    }

}
