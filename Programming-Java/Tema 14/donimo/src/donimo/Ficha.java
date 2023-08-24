/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package donimo;

/**
 *
 * @author usuario
 */
public class Ficha implements Comparable {

    protected int a;
    protected int b;
    protected Integer peso;

    public Ficha(int a, int b) {
        this.a = a;
        this.b = b;
        if (this.isDoble()) {
            this.peso = a * 100 + 1000;
        } else {
            this.peso = a * 10 + b;
        }
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return a + ":" + b;
    }

    public boolean isDoble() {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Object o) {
        return peso.compareTo(((Ficha)o).peso);
    }

}
