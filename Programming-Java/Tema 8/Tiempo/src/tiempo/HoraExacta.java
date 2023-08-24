/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiempo;

/**
 *
 * @author usuario
 */
public class HoraExacta extends Hora{
    protected int segundos;

    public HoraExacta(int segundos, int horas, int minutos) {
        super(horas, minutos);
        this.segundos = segundos;
    }
    public void setSegundos(int segundos) {
        if(segundos<=59||segundos>=0){
        this.segundos = segundos;
        }
      }

    @Override
    public void inc() {
        segundos ++;
        if (segundos > 59) {
            segundos = 0;
            super.inc();
        }
    }

    @Override
    public String toString() {
        return super.toString() + ":" + segundos;
    }

    
}
