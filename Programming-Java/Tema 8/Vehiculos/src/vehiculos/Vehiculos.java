/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
       /*solo necesario el constructor y el metodo tostring indicando en cada
        caso el tipo y los atributos, todos los atributos protegidos
                
        MAIN: crear un par de objetos y añadir a la lista de vehiculos recorrer 
        y mostrar informacion de cada objeto almacenado  preguntar al usuario por un
        numero e indicar en la posicion del array el numero de ruedas del vehiculo */
       Coche coche1 = new Coche(120, 600,"rojo", 4);
       Camioneta camioneta1 = new Camioneta (1000,80, 500, "blanca", 4);
       Bicicleta bicicleta1 = new Bicicleta ("urbana", "azul", 2);
       Vehiculo moto1 = new Moto (180, 500, "deportiva", "verde", 2);
        //Se puede usar la clase padre al inicio para luego ponerle la hijo (Vehiculo - Moto)
       
       Vehiculo [] lista = new Vehiculo [] {coche1, camioneta1, bicicleta1, moto1};
       
       System.out.print("Introduce un índice para ver los atributos de los objetos: ");
       int indice = leer.nextInt();
       
       switch (indice) {
           case 0:
               System.out.println("Caracteristicas de coche: " + lista[0].toString());
               break;
           case 1:
               System.out.println("Caracteristicas de la camioneta: " + lista[1].toString());
               break;
           case 2:
               System.out.println("Caracteristicas de la bicicleta: " + lista[2].toString());
               break;
           case 3:
               System.out.println("Caracteristicas de la moto: " + lista[3].toString());
               break;
           default:
               System.out.println("No hay ningun objeto con ese índice.");
      }
       
    }
    
}
