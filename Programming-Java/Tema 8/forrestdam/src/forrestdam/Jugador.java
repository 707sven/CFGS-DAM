/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forrestdam;

/**
 *
 * @author marta
 */
public abstract class Jugador {
    //Atributos
    protected int vida;
    protected int fuerza;
    protected boolean estaVivo;
    protected String nombre;
    protected Carta [] carta;

    public Jugador() {
        this.carta = new Carta [5];
        this.carta [0] = new Carta ("Obtienes un punto de vida", 1, 0);
        this.carta [1] = new Carta ("Te quitan un punto de vida", -1, 0);
        this.carta [2] = new Carta ("Obtienes un punto de fuerza", 0, 1);
        this.carta [3] = new Carta ("Te quitan un punto de fuerza", 0, -1);
        this.carta [4] = new Carta ("Obtienes dos puntos de vida", 2, 0);
    }
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carta [] getCarta() {
        return carta;
    }

    public void setCarta(Carta[] carta) {
        this.carta = carta;
    }
    
}
