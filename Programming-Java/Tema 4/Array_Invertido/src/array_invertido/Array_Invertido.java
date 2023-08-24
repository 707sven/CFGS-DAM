/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array_invertido;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class Array_Invertido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] array1 = {1, 2, 3, 4, 5};
        mostrarArray(array1);
        
        int [] array2 = {1, 2, 3, 4, 5};
        
        for(int i = array1.length - 1; i >= 0; i -- ) {
            System.out.print(array1[i] + " ");
        }
        
        System.out.println(Arrays.toString(array1));
        
        System.out.println(Arrays.equals(array1, array2));
                
        Arrays.fill(array1, 1);
        System.out.println(Arrays.toString(array1));
        
    }
    
    public static void mostrarArray (int [] a){
        for (int i = 0; i < a.length; i ++){
            System.out.print(a[i] + " ");
        } System.out.println( " ");
    }    
}
