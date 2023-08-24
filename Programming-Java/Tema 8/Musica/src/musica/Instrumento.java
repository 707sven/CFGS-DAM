/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musica;


/**
 *
 * @author usuario
 */
public class Instrumento {
    //Atributos
    protected String [] musica = new String [100];
    protected int posicion = 0;
    
    //Constructor
    public Instrumento() {
    }
    
    //Metodos
    public void add(String nota) {
        if (posicion < 100) {
            musica [posicion] = nota;
            posicion ++;
        } else {
            System.out.println("Ya no puedes agregar más notas a la partitura.");
        }
    }
    
    public void interpretar () {
        for (int i = 1; i < posicion; i ++){
            System.out.print(musica[i] + " ");
        } System.out.println( " ");
     }
}
