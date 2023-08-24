/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forrestdam;

import java.util.Scanner;

/**
 *
 * @author marta
 */
public class GoldenAxe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Creación de personajes
        System.out.print("Indica el número de jugadores del 1 al 5: ");
        int NumJugadores = leer.nextInt();
        Jugador [] Jugadores = new Jugador [(NumJugadores)];
        
        //Asignación de los personajes
        String TipoJugador;
        for (int a = 0; a < Jugadores.length; a++) {
            System.out.println("Selecciona el jugador: ENANO, GUERRERO O AMAZONA");
            TipoJugador = leer.next();
            
            if (TipoJugador.equalsIgnoreCase("enano")) {
                Enano enano = new Enano();
                Jugadores [a] = enano;
            } else if (TipoJugador.equalsIgnoreCase("guerrero")) {
                Guerrero guerrero = new Guerrero();
                Jugadores [a] = guerrero;
            } else if (TipoJugador.equalsIgnoreCase("amazona")) {
                Amazona amazona = new Amazona();
                Jugadores [a] = amazona;
            } else {
                System.out.println("ERROR. Porfavor, selecciona un jugador que esté en la lista.");
                a --;
            }
        }
        
        //Creación de cthulhu
        Cthulhu cthulhu = new Cthulhu();
        int vidaC = 20 + (NumJugadores * 2);
        cthulhu.setVida(vidaC);
        
        //Turnos
        int contador = 0;
        while (contador != (8 - NumJugadores)){
            System.out.println("\n===== TURNO " + contador + " =====");

            int eleccion;
            for (int a = 0; a < Jugadores.length; a++) {
                System.out.println("Jugador " + Jugadores[a].getNombre() + ", elige que quieres hacer en tu turno:\n" + ">> 1: Luchar con Cthulhu | 2: Coger una carta | 3: Descansar <<");
                System.out.print("> ");
                eleccion = leer.nextInt();

                switch (eleccion) {
                    case 1:
                        lucharCthulu(Jugadores[a], cthulhu);
                        System.out.println("");
                        break;
                    case 2:
                        cogerCarta(Jugadores[a]);
                        System.out.println("");
                        break;
                    case 3:
                        reponerVida(Jugadores[a]);
                        System.out.println("");
                        break;
                }
                contador ++;
            }
        }
        
    }
    
    public static void lucharCthulu(Jugador jugador, Cthulhu cthulhu) {
        System.out.println("La batalla contra Cthulu da comienzo.");
        
        //Tira de dados
        int resultado;
        int suma = 0;
        for (int a = 1; a <= jugador.getFuerza(); a++) {
            resultado = (int) (Math.random() * 6 + 1);
            System.out.println("Tirada del dado " + a + ": " + resultado);
            suma = suma + resultado;
        }
        //Daño inflingido
        System.out.println("Daño inflingido: " + suma);
        System.out.println("La vida de Cthulhu es: " + cthulhu.getVida());
        cthulhu.setVida(cthulhu.getVida()-suma);
        System.out.println("\nEl ataque ha sido exitoso!\nLa vida de Cthulhu se ha reducido a " + cthulhu.getVida());
        
        //Daño recibido
        jugador.setVida(jugador.getVida()-1);
        System.out.println("\nEl jugador ha recibido daño.\nLa vida del jugador ahora es " + jugador.getVida());
    }
    
    public static void cogerCarta(Jugador jugador){
        int numCarta=(int) (Math.random()*4);
        
        //No consigo recordar como sacar las frases de las cartas, pero las acciones están en el orden de la lista de cartas de la clase Jugador
        if (numCarta== 0){
            System.out.println(jugador.getCarta());
            jugador.setVida(jugador.getVida()+1);
            System.out.println("Tu vida actual es " + jugador.getVida());
       }  if (numCarta==1){
           System.out.println(jugador.getCarta());
            jugador.setVida(jugador.getVida()-1);
            System.out.println("Tu vida actual es " + jugador.getVida());
       } if (numCarta== 2){
           System.out.println(jugador.getCarta());
            jugador.setFuerza(jugador.getFuerza()+1);
            System.out.println("Tu fuerza actual es " + jugador.getFuerza());
       } if (numCarta== 3){
           System.out.println(jugador.getCarta());
            jugador.setFuerza(jugador.getFuerza()-1);
            System.out.println("Tu fuerza actual es " + jugador.getFuerza());
       } if (numCarta== 4){
           System.out.println(jugador.getCarta());
            jugador.setVida(jugador.getVida()+2);
            System.out.println("Tu vida actual es " + jugador.getVida());
       }
    }
    
    public static void reponerVida(Jugador jugador) {
        System.out.println("Te llenas de determinación...");
        jugador.setVida(jugador.getVida()+1);
        System.out.println("Descansas en la hoguera y regeneras 1 de vida.");
        System.out.println("Tu vida actual es " + jugador.getVida());
    }

}
