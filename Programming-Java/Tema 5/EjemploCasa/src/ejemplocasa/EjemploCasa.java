/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplocasa;

/**
 *
 * @author usuario
 */
public class EjemploCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Casa casa1 = new Casa ("flores", 6, 2, true, false);
       Casa casa2 = new Casa ("plantitas, 6", 3, 1, false, false);
       Casa casa3 = new Casa ("calle valle, 8, 1-A");
       
       casa1.mostrarClase();
       casa2.mostrarClase();
       
    }
    
}
