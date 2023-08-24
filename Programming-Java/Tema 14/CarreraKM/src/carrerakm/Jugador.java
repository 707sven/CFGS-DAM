/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrerakm;

/**
 *
 * @author usuario
 */
public class Jugador {

    private String nombre;
    private boolean turno;
    private int totalKM;

    public Jugador(String nombre, boolean turno, int totalKM) {
        this.nombre = nombre;
        this.turno = turno;
        this.totalKM = totalKM;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public int getTotalKM() {
        return totalKM;
    }

    public void setTotalKM(int totalKM) {
        this.totalKM = totalKM;
    }

    @Override
    public String toString() {
        return nombre + "\nTotal KM: " + totalKM;
    }
}
