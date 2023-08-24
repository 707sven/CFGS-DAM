/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso_clase;
import hotelpractica3.ClasePersona;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class monstruo_juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ClasePersona persona = new ClasePersona ("Fabian", 23, "99772233B");
        //Tenemos un tablero con "x" de 5x5.
        //Un jugador con una posicion inicial
        //En alguna parte del tablero(no se le muestra la jugador) hay un monstruo (m)
        //El jugador se mueve a la posicion que quiera
                //Cuando el jugador se mueva que se borre el camino (que no deje rastro)
        //Crear una clase monstruo (posicion fila, posicion col, vida) + (metodo "pelear" --> Si se encuentra con J el jugador tira 1 dados y el mosntruo otros 1, quien gane po gana)
             //Monstruo cambia de posicion cuando terminen los daodos (al mejor de 3)
             
        //Creacion de tablero     
        char [] [] tablero = new char [5] [5];
        RellenarTableroX(tablero);
        
        //Colocacion del jugador
        int filaJ = 1;
        int colJ = 1;
        tablero [filaJ] [colJ] = 'j';
        
        //Clonacion de tablero
        char [] [] juego = new char [5] [5];
        ClonarTablero (tablero, juego);
        
        //Creacion del monstruo
        int fila =(int) (Math.random() * 5);
        int col =(int) (Math.random() * 5);
        Monstruo monstruo = new Monstruo(fila, col);
        
        //Colocacion del monstruo en el tablero
        tablero [monstruo.getPosfila()] [monstruo.getPoscol()] = 'M';
        MostrarTablero(tablero);
        
        int vidaJ = 15;
        
        //Jugar
        tablero [filaJ] [colJ] = 'x';
        System.out.print("Introduce un número de fila: ");
        filaJ = leer.nextInt();
        System.out.print("Introduce un número de columna: ");
        colJ = leer.nextInt();
        
        tablero [filaJ] [colJ] = 'j';
        MostrarTablero(tablero);
        
        if (tablero [filaJ] [colJ] == 'M') {
            int daño = monstruo.pelear();
            vidaJ = vidaJ - daño;
            monstruo.mover();
        }
        
    }
    
    
    public static void MostrarTablero(char array [] []) {
        for (int fila = 0; fila < array.length; fila ++) {
            for (int col = 0; col < array[fila].length; col ++) {
                System.out.print(array[fila] [col]);
                System.out.print(" ");
            } System.out.println("");
        }
    }
    
    public static void RellenarTableroX(char array [] []) {
            for (int fila = 0; fila < array.length; fila++) {
                for (int col = 0; col < array[fila].length; col++) {
                    array[fila][col] = 'x';
                }
            }
        }
    
    public static void ClonarTablero (char array [] [], char copy [] []) {
            //Recorrer el primer array
            for (int fila = 0; fila < array.length; fila ++) {
                for (int col = 0; col < array[fila].length; col ++) {
                    //Clonar el contenido de cada posición del array original
                    copy [fila] [col] = array [fila] [col];
                }
            }
     }
    
    
}
