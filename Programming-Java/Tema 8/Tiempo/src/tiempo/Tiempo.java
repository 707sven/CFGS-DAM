/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiempo;

/**
 *
 * @author usuario
 */
public class Tiempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Diseñar la clase hora que se compone por horas (0-23) y minutos (0-59)
                //Metodos:
                    //Hora (hora, minuto)
                    //inc () <-- incrementa la hora en un minuto
                    //setMinutos (valor)
                    //setHora(valor)
                    //toString
                    
         HoraExacta hora1 = new HoraExacta (50, 13, 33);
         hora1.inc();
         System.out.println(hora1);
    }
    
}
