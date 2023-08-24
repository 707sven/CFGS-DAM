/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays2;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class Arrays2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Ordenar un array
        int [] array1 = {5, 3, 2, 1, 4};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        
        //Buscar la posición de un número en el array (se supone que hay que ordenarlo antes porque si no no es fiable)
        int [] array2 = {2, 3, 4, 1, 7, 8, 9, 8, 5};
        System.out.println(Arrays.binarySearch(array2, 8));
        
        //Array con una cadena
        char [] cadena = {'H', 'O', 'L', 'A'};
        System.out.println(Arrays.toString(cadena));
        
        //Variable string
        String palabra = "hola";
        System.out.println(palabra.length()); 
        
        //Index of -> posicion de un caracter de la cadena
        System.out.println(palabra.indexOf('h'));
        
        //last index of -> caracter de la cadena en la posición establecida
        System.out.println(palabra.charAt(0));
        
        //Sacar un trozo de la cadena
        String palabra2 = "cadenavacia";
        System.out.println(palabra2.substring(1, 4));
        
        //Poner en mayúsuculas
        System.out.println(palabra.toUpperCase());
        
        //Poner en minusculas
        System.out.println(palabra.toLowerCase());
        
        //Comparar dos cadenas de palabras + comparar 2 cadenas ignorando las mayúsculas/minúsculas
        String palabra3 = "HOLA";
        System.out.println(palabra.equals(palabra3));
        System.out.println(palabra.equalsIgnoreCase(palabra3));
        
        //Convertir un int en un string
        int telefono = 352426597;
        String tel;
        tel = String.valueOf(telefono);
        System.out.println(tel);
        
        //ejercicio - Comparar 2 palabras y decir cual es la más larga.
        System.out.print("palabra 1: ");
        String p1 = leer.nextLine();
         System.out.print("palabra 2: ");
        String p2 = leer.nextLine();
        
        if (p1.length() > p2.length()){
            System.out.println("La palabra mayor es: " + p1);
        } else {
            System.out.println("La palabra mayor es: " + p2);
        }
        
    }
    
}
