/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrerakm;

/**
 *
 * @author usuario
 */
public class Carta implements Comparable {

    private String nombre;
    private Integer valor;
    private boolean ataqueDefensa;

    public Carta(String nombre, int valor, boolean ataqueDefensa) {
        this.nombre = nombre;
        this.valor = valor;
        this.ataqueDefensa = ataqueDefensa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public boolean isAtaqueDefensa() {
        return ataqueDefensa;
    }

    public void setAtaqueDefensa(boolean ataqueDefensa) {
        this.ataqueDefensa = ataqueDefensa;
    }

    public void introducirValores() {
        if (nombre.equalsIgnoreCase("25 KM")) {
            valor = 25;
        }
        if (nombre.equalsIgnoreCase("50 KM")) {
            valor = 50;
        }
        if (nombre.equalsIgnoreCase("75 KM")) {
            valor = 75;
        }
        if (nombre.equalsIgnoreCase("100 KM")) {
            valor = 100;
        }
        if (nombre.equalsIgnoreCase("150 KM")) {
            valor = 150;
        }
        if (nombre.equalsIgnoreCase("200 KM")) {
            valor = 200;
        }
        if (nombre.equalsIgnoreCase("SEMAFORO ROJO")) {
            valor = 1;
        }
        if (nombre.equalsIgnoreCase("SIN GASOLINA")) {
            valor = 2;
        }
        if (nombre.equalsIgnoreCase("SEMAFORO VERDE")) {
            valor = 3;
        }
        if (nombre.equalsIgnoreCase("GASOLINA")) {
            valor = 4;
        }
    }

    @Override
    public String toString() {
        return "\nCarta " + nombre;
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
