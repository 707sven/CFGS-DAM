/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda;

/**
 *
 * @author usuario
 */
public class Agenda {

    //Atributos
    private Contacto[] agenda = new Contacto[20];
    private int contador = 0;

    //Constructor
    public Agenda() {
    }

    public Contacto[] getAgenda() {
        return agenda;
    }

    public void setAgenda(Contacto[] agenda) {
        this.agenda = agenda;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    //Metodos
    public void agregarContacto(Contacto a) {
        if (contador > 20) {
            System.out.println("Imposible de introducir un nuevo contacto. Agenda llena.");
        } else {
            int posicion = contador;
            agenda[posicion] = a;
            contador++;
        }
    }

    public void mostrarAgenda() {
        for (int i = 0; i < contador; i++) {
            System.out.println(agenda[i]);
        }
    }

    public void buscarContacto(String nombre) {
        for (int i = 0; i < contador; i++) {
            if (agenda[i].getNombre().startsWith(nombre)) {
                System.out.println(agenda[i].toString());
            }
        }
    }

}
