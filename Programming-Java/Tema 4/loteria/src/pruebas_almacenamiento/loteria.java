/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas_almacenamiento;
 import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class loteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int [] loteria2021 = new int [5];
       
       //------otra forma de hacer arrays (conciendo los valores)------
       
        int [] loteria2020 = {4, 3, 2, 5, 7};
        
        System.out.println(loteria2021);
        
        //Muestra por pantalla todos los numeros del  array
        
        for (int i = 0; i <loteria2020.length; i ++ ){
        System.out.println(loteria2020[i]);
        } System.out.println("---------- Prueba del proceso ----------");
        
        //prueba public void con array
        
        int [] loteria1 = {5, 3, 2, 4, 5};
        int [] loteria2 = {3, 1, 2, 0, 5, 4, 9};
        
        System.out.println("==> loteria1 <==");
        mostrarArray (loteria1);
        System.out.println("==> loteria2 <==");
        mostrarArray (loteria2);
        
        System.out.println("---------- Array que suma +1 a sus valores -----------");
        //Mostrar un array por pantalla que le sume 1 a los valores
        
        int [] cadena= {1, 5, 3, 8, 10};
        
       for (int i = 0; i < cadena.length; i ++){
           cadena[i]++;
       }
        mostrarArray(cadena);
        
        System.out.println("----------- Agregar array por teclado ------------");
        //Agregar valores al array por teclado.
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el largo de la cadena: ");
        int n = entrada.nextInt();
        
         int [] array = new int [n];
        
        for (int i = 0; i < array.length; i ++){
            //Agregar valores a la cadena
            System.out.print("Introduce un valor a la cadena: ");
            array[i] = entrada.nextInt();
        }
        mostrarArray(array);
        
        System.out.println("-------- Saber si hay un 5 dentro del array ----------");
        //Encontrar valores en la cadena creando un array por teclado
        
        //Introducir el largo de la cadena
        System.out.print("Introduce el largo de la cadena: ");
        int b = entrada.nextInt();
        int [] cadenita = new int [b];
        
         //Agregar valores a la cadena por teclado
         for (int i = 0; i < cadenita.length; i++) {
            System.out.print("Introduce un valor a la cadena: ");
            cadenita[i] = entrada.nextInt();
           }
         //Comprobar si hay un 5 en la cadena
         for (int i = 0; i < cadenita.length; i++) {
                if (cadenita[i] == 5) {
                  System.out.println("Hay un 5.");
                  }
           } mostrarArray(cadenita);
    }
        
    public static void mostrarArray (int [] a){
        for (int i = 0; i < a.length; i ++){
            System.out.print(a[i] + " ");
        } System.out.println( " ");
    }
}