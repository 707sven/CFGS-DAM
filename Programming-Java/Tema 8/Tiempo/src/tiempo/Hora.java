/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiempo;

/**
 *
 * @author usuario
 */
public class Hora {
    //Atributos
    protected int horas;
    protected int minutos;
    
    //Constructor
    public Hora() {
    }
    
    public Hora(int horas, int minutos) {
        this.horas = horas;
        this.minutos = minutos;
    }
    
    //Metodos
    @Override
    public String toString() {
        return horas + ":" + minutos;
    }
    
    public void inc() {
        minutos ++;
        if (minutos > 59) {
            minutos = 00;
            horas ++;
        } if (horas > 23) {
            horas = 00;
        }
    }
    public void setHora(int horas) {
         if (horas < 59 || horas > 0){
        this.horas = horas;
        }
    }

    public void setMin(int minutos) {
        if (minutos < 59 || minutos > 0){
        this.minutos = minutos;
        }
    }
}
