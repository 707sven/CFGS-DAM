/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array_pizarra;

/**
 *
 * @author usuario
 */
public class Array_pizarra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [] array1 = {1, 2, 5, 3};
       int [] array2;
       array2 = array1;
       array2[2]=0;
       mostrarArray(array1);
    }
    public static void mostrarArray (int [] a){
        for (int i = 0; i < a.length; i ++){
            System.out.print(a[i] + " ");
        } System.out.println( " ");
    }    
}
