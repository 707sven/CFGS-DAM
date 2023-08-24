/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoexcepciones;

/**
 *
 * @author usuario
 */
public class ProyectoExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        int a = 5;
        int b = 0;
        
        int array [] = new int [5];
        
        try {
            System.out.println("La división es: " + a/b);
            System.out.println("Acceder a la posion 5: " + array[5]);
        } catch(ArithmeticException|IndexOutOfBoundsException e) {
            System.out.println("Error del programa.");
        }
        finally {
            System.out.println("'Finally' sirve para que entre si o si por aquí");
        }
        
            try {
                System.out.println(array[5]);
            } catch (Exception IndexoutofBound) {
                System.out.println("Array fuera de rango");
            }
        */
        
        int edad = 17;
        try {
            metodo1(edad);
        } catch (DNIException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    public static void metodo1(int edad) throws DNIException {
        /* if (edad < 18) {
            throw new ArithmeticException("Acceso denegado. Debes ser mayor de edad");
        } else {
            System.out.println("Acceso permitido. Es mayor de edad");
        } */
        
        if (edad < 18) {
            throw new DNIException();
        } else {
            System.out.println("Acceso permitido. Es mayor de edad");
        }
    }
}
