/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayormenor;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class MayorMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ================= >> Ordenar de mayor a menor << ==========================
        
        /* Introduce por pantalla 3 numeros y ordenarlos de mayor a menor. */
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        double n1 = entrada.nextDouble();
        
        System.out.print("Introduce otro número: ");
        double n2 = entrada.nextDouble();
        
        System.out.print("Introduce un último número: ");
        double n3 = entrada.nextDouble();
        
        //El número mayor es n3
        if ((n1 <= n2) && (n2 <= n3) && (n1 < n3)) {
            System.out.println(n3);
            System.out.println(n2);
            System.out.println(n1);
        }   
        
        //El número mayor es n3 (n1 en 2º posicion)
        else if ((n1 >= n2) && (n2 <= n3) && (n1 < n3)) {
            System.out.println(n3);
            System.out.println(n1);
            System.out.println(n2);
        }
            
        //El número mayor es n1
        else if ((n1 >= n2) && (n2 <= n3) && (n1 > n3)) {
            System.out.println(n1);
            System.out.println(n3);
            System.out.println(n2);  
        }
        
        //El número mayor es n1 (n2 en 2º posicion)
        else if ((n1 >= n2) && (n2 >= n3) && (n1 > n3)) {
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);  
        }
        
        //El número mayor es n2
        else if ((n1 <= n2) && (n3 <= n2) && (n3 >= n1)) {
            System.out.println(n2);
            System.out.println(n3);
            System.out.println(n1);  
        }
        
        //El número mayor es n2 (n1 en 2º posicion)
        else if ((n1 <= n2) && (n3 <= n2) && (n3 <= n1)) {
            System.out.println(n2);
            System.out.println(n1);
            System.out.println(n3);  
        }
        
        //Los 3 números son iguales
        else {
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);
        }
    }
    
}