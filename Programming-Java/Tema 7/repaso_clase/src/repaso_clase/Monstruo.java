/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso_clase;

/**
 *
 * @author usuario
 */
public class Monstruo {
    private int posfila;
    private int poscol;
    private int vida = 10;

    public Monstruo(int posfila, int poscol) {
        this.posfila = posfila;
        this.poscol = poscol;
    }

    public int getPosfila() {
        return posfila;
    }

    public void setPosfila(int posfila) {
        this.posfila = posfila;
    }

    public int getPoscol() {
        return poscol;
    }

    public void setPoscol(int poscol) {
        this.poscol = poscol;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    //Metodo
    
    public int pelear () {
        int daño = 0;
        int dado1 = (int) (Math.random()*7);
        int dado2 = (int) (Math.random()*7);
        if (dado1 > dado2) {
            System.out.println("Le has quitado vida.");
            daño = this.vida - dado1;
            daño = 0;
        } else {
            daño = dado2;
        }
        return daño;
    }
    
    public void mover () {
        int fila =(int) (Math.random() * 5);
        int col =(int) (Math.random() * 5);
        fila = this.posfila;
        col = this.poscol;
    }
    
}
