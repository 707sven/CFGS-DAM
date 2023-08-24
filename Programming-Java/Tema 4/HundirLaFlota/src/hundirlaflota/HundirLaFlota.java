/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hundirlaflota;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class HundirLaFlota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Crear el tablero de juego
        int [] [] tablero = new int[10] [10];
        
        int contador = 0;
        //Rellenar la matriz con random
        do{
            int fila = (int) (Math.random()*10);
            int col = (int) (Math.random()*10);
            int orientacion = (int) (Math.random()*2);
        
            //Crear los barcos
            //Barco 1 (tamaño 5)
            if (orientacion == 0) {
                if (col + 4 < 10){
                    for (int i = 0; i < 5; i ++){
                        tablero [fila] [col + i] = 1;
                        contador ++;
                    }
                }
            } else{
                if (fila + 4 < 10){
                    for (int i = 0; i < 5; i ++){
                        tablero [fila + i] [col] = 1;
                        contador ++;
                    } 
                }
            }
            fila = (int) (Math.random()*10);
            col = (int) (Math.random()*10);
            orientacion = (int) (Math.random()*2);
            
            //Barco 2 (tamaño 3)
            if (orientacion == 0) {
                if (col + 2 < 10){
                    for (int i = 0; i < 3; i ++){
                        tablero [fila] [col + i] = 1;
                        contador ++;
                    }
                } 
            } else{
                if (fila + 2 < 10){
                    for (int i = 0; i < 3; i ++){
                        tablero [fila + i] [col] = 1;
                        contador ++;
                    } 
                }
            }
            //Barco 3 (tamaño 1)
            fila = (int) (Math.random()*10);
            col = (int) (Math.random()*10);
            if (orientacion == 0) {
                if (col < 10){
                    for (int i = 0; i < 1; i ++){
                        tablero [fila] [col + i] = 1;
                        contador ++;
                    }
                } 
            } else{
                if (fila < 10){
                    for (int i = 0; i < 1; i ++){
                        tablero [fila + i] [col] = 1;
                        contador ++;
                    } 
                }
            } 
        } while (contador != 9);
       MostrarArrayBid(tablero);
        
        //Jugar insertando valores
        
        //Clonar la matriz
        //Cada vez que toque un barco, poner un 1 (el resto de valores que sean algun simbolo)
        
        /* Contar el número de intentos (10 aprox), cuando pierdas y si quiere seguir jugando reiniciar la partida con la misma matriz.
        Si no quiere jugar, al volver a iniciar el juego que se resetee la matriz */
        
        
    } 
        
    public static void MostrarArrayBid(int array [] []) {
        for (int fila = 0; fila < array.length; fila ++) {
            for (int col = 0; col < array[fila].length; col ++) {
                System.out.print(array[fila] [col]);
                System.out.print(" ");
            } System.out.println("");
        }
    }
}
