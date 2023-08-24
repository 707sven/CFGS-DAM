/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*El código va a tener siempre 5 posiciones
        Los numeros que puedas poder por teclado solo puede ser del 0-5
        Se puede hacer una combinación con un random "Math.random()" y luego multiplicarlo por 5 para que sea del 0-5, ya que math.random da numeros aleatorios entre 0-1
        */
        
        Scanner leer = new Scanner(System.in);
        
        //Selector de dificultad
        System.out.println("=======>> NIVELES DE DIFICULTAD <<=======");
        System.out.println("1- Nivel FACIL: Combinación de 3 números.");
        System.out.println("2- Nivel NORMAL: Combinación de 5 números.");
        System.out.println("3- Nivel DIFICIL: Combinación de 7 números.");
        System.out.println("4- Salir del programa.");
        System.out.println(" ");
        System.out.print("Selecciona un nivel de dificultad: ");
        int dificultad = leer.nextInt();
        
        switch(dificultad){
            case 1:
                System.out.println("==========>> Dificultad FACIL<<==========");
                //Creacion de la combinacion secreta
                int [] combinacion1 = new int [3];

               crearCombinacion(combinacion1);

               //Juego
               //Introduccion de la combinacion por teclado
               int [] respuesta1 = new int [3];
               int contador1 = 0;

               System.out.println("Introduce una combinación de 3 números del 0-5 para descubrir el código secreto.");
               for (int i = 0; i < 3; i ++){
                   System.out.print("Introduce un dígito: ");
                   respuesta1[i] = leer.nextInt();

                   //Comprobacion de los números introducidos.
                   if (respuesta1 [i] == combinacion1[i]){
                       System.out.println("Correcto, sigue adelante.");
                       mostrarArray(respuesta1);
                       contador1 = 0;
                   } else {
                       System.out.println("Error. Inténtalo de nuevo.");
                        i --;
                        //PIsta de la combinacion
                        contador1 = contador1 + 1;
                        if (contador1 > 2){
                            System.out.println("¿Quieres una pista? 1 = si, 0 = no.");
                            int pista1 = leer.nextInt();
                                if (pista1 == 1) {
                                    mostrarPista(combinacion1);
                                   } contador1 = 0;
                        }
                    } 
               } System.out.print("Felicidades, has completado el juego. La combinación secreta era ");
               mostrarArray(respuesta1);
               break;
               
            case 2:
                System.out.println("==========>> Dificultad MEDIO<<==========");
                //Creacion de la combinacion secreta
                int [] combinacion2 = new int [5];

               crearCombinacion(combinacion2);

               //Juego
               //Introduccion de la combinacion por teclado
               int [] respuesta2 = new int [5];
               int contador2 = 0;

               System.out.println("Introduce una combinación de 5 números del 0-5 para descubrir el código secreto.");
               for (int i = 0; i < 5; i ++){
                   System.out.print("Introduce un dígito: ");
                   respuesta2[i] = leer.nextInt();

                   //Comprobacion de los números introducidos.
                   if (respuesta2 [i] == combinacion2[i]){
                       System.out.println("Correcto, sigue adelante.");
                       mostrarArray(respuesta2);
                       contador2 = 0;
                   } else {
                       System.out.println("Error. Inténtalo de nuevo.");
                        i --;
                        //PIsta de la combinacion
                        contador2 = contador2 + 1;
                        if (contador2 > 2){
                            System.out.println("¿Quieres una pista? 1 = si, 0 = no.");
                            int pista2 = leer.nextInt();
                                if (pista2 == 1) {
                                    mostrarPista(combinacion2);
                                    } contador2 = 0;
                        }
                    } 
               } System.out.print("Felicidades, has completado el juego. La combinación secreta era ");
               mostrarArray(respuesta2);
               break;
                              
            case 3:
                System.out.println("==========>> Dificultad DIFICIL<<==========");
                //Creacion de la combinacion secreta
                int [] combinacion3 = new int [7];

               crearCombinacion(combinacion3);

               //Juego
               //Introduccion de la combinacion por teclado
               int [] respuesta3 = new int [7];
               int contador3 = 0;

               System.out.println("Introduce una combinación de 7 números del 0-5 para descubrir el código secreto.");
               for (int i = 0; i < 7; i ++){
                   System.out.print("Introduce un dígito: ");
                   respuesta3[i] = leer.nextInt();

                   //Comprobacion de los números introducidos.
                   if (respuesta3 [i] == combinacion3[i]){
                       System.out.println("Correcto, sigue adelante.");
                       mostrarArray(respuesta3);
                       contador3 = 0;
                   } else {
                       System.out.println("Error. Inténtalo de nuevo.");
                        i --;
                        //PIsta de la combinacion
                        contador3 = contador3 + 1;
                        if (contador3 > 2){
                            System.out.println("¿Quieres una pista? 1 = si, 0 = no.");
                            int pista3 = leer.nextInt();
                                if (pista3 == 1) {
                                    mostrarPista(combinacion3);
                                    } contador3 = 0;
                        }
                    } 
               } System.out.print("Felicidades, has completado el juego. La combinación secreta era ");
               mostrarArray(respuesta3);
               break;
                              
            case 4:
                break;
        }
    }
    
    public static void crearCombinacion(int a[]) {
        for (int i = 0; i < a.length; i++) {
            a [i] = (int) (Math.random() * 6);
           }
    }
    
    public static void mostrarPista(int a[]){
        int b = (int) (Math.random() * (a.length + 1));
        System.out.println("Pista: el número "+ a[b] + " está en la posición " + (b + 1));
    }
    
    public static void mostrarArray (int [] a){
        for (int i = 0; i < a.length; i ++){
            System.out.print(a[i] + " ");
        } System.out.println( " ");
    }
}