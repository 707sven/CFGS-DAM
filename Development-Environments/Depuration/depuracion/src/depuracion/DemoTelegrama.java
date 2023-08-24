/* MODIFICA EL PACKAGE SEGUN DONDE HAS CREADO LA CLASE*/
package depuracion;

/**
 *
 * @author Usuario
 */
public class DemoTelegrama {
     public static void main(String[] args) {  
     Telegrama telegrama1 = new Telegrama("Ordinario", 8);   
     telegrama1.calculaCosto();  
     System.out.println(telegrama1);  
     telegrama1.setNumPalabras(12);  
     telegrama1.calculaCosto();  
     System.out.println(telegrama1);  
     Telegrama telegrama2 = new Telegrama("Urgente", 8);   
     telegrama2.calculaCosto();  
     System.out.println(telegrama2);  
     telegrama2.setNumPalabras(12);  
     telegrama2.calculaCosto();  
     System.out.println(telegrama2);  
 }  
}

