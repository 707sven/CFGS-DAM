/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrerakm;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Mesa extends Jugador {

    private ArrayList<Carta> mazo;
    private ArrayList<Carta> cartasMesa;

    public Mesa(ArrayList<Carta> mazo, ArrayList<Carta> cartasMesa, String nombre, boolean turno, int totalKM) {
        super(nombre, turno, totalKM);
        this.mazo = mazo;
        this.cartasMesa = cartasMesa;
    }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }

    public ArrayList<Carta> getCartasMesa() {
        return cartasMesa;
    }

    public void setCartasMesa(ArrayList<Carta> cartasMesa) {
        this.cartasMesa = cartasMesa;
    }

    @Override
    public String toString() {
        return super.getNombre() + "\ntotal KM: " + super.getTotalKM() + "\nmazo del jugador: " + mazo;
    }

}
