/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraybidimensional;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class ArrayBidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int [] [] arrayBid = new int [10] [10];
        int [] [] arrayBid2 ={{3, 2, 1} , {1, 2, 3}};
        int [] [] arrayBid1 = new int [2] [2];
                
        MostrarArrayBid (arrayBid1);
        
        int [] [] array1 = new int [2] [2];
        
        ArrayBidTeclado(array1);
        MostrarArrayBid (array1);
        
    }
    
    public static void MostrarArrayBid(int array [] []) {
        for (int fila = 0; fila < array.length; fila ++) {
            for (int col = 0; col < array[fila].length; col ++) {
                System.out.print(array[fila] [col]);
                System.out.print(" ");
            } System.out.println("");
        }
    }
   
    public static void ArrayBidTeclado(int array [] []){
        Scanner leer = new Scanner(System.in);
        
         for (int fila = 0; fila < array.length; fila++){
            for (int col = 0; col < array.length; col ++){
                System.out.print("Introduce un número: ");
                array[fila][col] = leer.nextInt();
            }
        }
    }
}
