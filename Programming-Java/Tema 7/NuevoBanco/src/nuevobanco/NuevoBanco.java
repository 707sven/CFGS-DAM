/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nuevobanco;
import cuentacorriente.ClaseCuentaCorriente;
/**
 *
 * @author usuario
 */
public class NuevoBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Diseñar clase banco, de la que interesa guardar su nombre, capital y la direccion central
         //Los bancos tienen las siguientes restricciones: 
                //a: Siempre tiene que tener un nombre que no puede ser modificado
                //b: Si no se especifica, todos los bancos tienen un capital por defecto de 5.2 millones de € al crearse
                //c: El capital y la direccion de un banco son modificables
          //Modificar la clase cuentaCorriente para que cada una esté vinculada a un objeto de tipo banco
          //Escribir los metodos ecesarios en la cuenta corriente para gestionar el banco al que pertenece. Existe la posibilidad que una cuenta corriente no este vinculada a ningun banco
           
         ClaseCuentaCorriente cuenta1 = new ClaseCuentaCorriente("paquito", "2233453S");
         Banco banco1 = new Banco ("ING", 2.3, "calle pocho", cuenta1);
         System.out.println(banco1.toString());
         
         
          
    }
    
}
