/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package memoria;

/**
 *
 * @author usuario
 */
public class MeMoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //MeMoria --> Juego de memoria
        String tablero [] [] = new String [3] [3];
        String vacio [] [] = {{" ", " ", " ",}, {" ", " ", " ",}, {" ", " ", " ",}};
        
        tablero [0] [0] = "Gato";
        tablero [0] [1] = "Perro";
        tablero [0] [2] = "León";
        tablero [1] [0] = "Serpiente";
        tablero [1] [1] = "Cerdo";
        tablero [1] [2] = "Pato";
        tablero [2] [0] = "Cocodrilo";
        tablero [2] [1] = "Elefante";
        tablero [2] [2] = "Gallina";
        
        MostrarArray(tablero);
        MostrarArray(vacio);
    }
    public static void MostrarArray (String array [] []) {
         for (int fila = 0; fila < array.length; fila ++) {
            for (int col = 0; col < array[fila].length; col ++) {
                System.out.print(array[fila] [col]);
                System.out.print(" ");
            } System.out.println("");
        }
    }
    
    public static void PalabraLarga (String array [] []) {
        for (int fila = 0; fila < array.length; fila ++) {
            for (int col = 0; col < array[fila].length; col ++) {
                
            }
        }
    }
}
