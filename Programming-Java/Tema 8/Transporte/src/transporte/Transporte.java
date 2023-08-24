/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transporte;

/**
 *
 * @author usuario
 */
public class Transporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Una caja se crea con un ancho, alto y fondo(Una vez creada se mantiene inmutable)
                //Atributos caja: ancho, alto, fondo, unidad [enum {cm, m}], volumen (m3) String -> etiqueta 
                //Cada caja tiene una etiqueta (nombre destinatario, direccion)
                //Se pide implementar la clase caja con los metodos
                Etiqueta etiqueta1 = new Etiqueta ("Pepe", "Calle 1");
                Caja caja1 = new Caja(24, 15, 34, etiqueta1);
    }
    
}
