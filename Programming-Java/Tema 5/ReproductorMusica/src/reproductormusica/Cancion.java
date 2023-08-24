/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reproductormusica;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Cancion {
    //Atributos
    private String Titulo;
    private String NombreAutor;
    private String NombreAlbum;
    private String GeneroMusical;
    private int FechaSalida;
    private int Estrella = 1;
    
    //Constructores
    public Cancion() {
        
    }
    public Cancion(String Titulo, String NombreAutor, String NombreAlbum, String GeneroMusical, int FechaSalida) {
        this.Titulo = Titulo;
        this.NombreAutor = NombreAutor;
        this.NombreAlbum = NombreAlbum;
        this.GeneroMusical = GeneroMusical;
        this.FechaSalida = FechaSalida;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getNombreAutor() {
        return NombreAutor;
    }

    public void setNombreAutor(String NombreAutor) {
        this.NombreAutor = NombreAutor;
    }

    public String getNombreAlbum() {
        return NombreAlbum;
    }

    public void setNombreAlbum(String NombreAlbum) {
        this.NombreAlbum = NombreAlbum;
    }

    public String getGeneroMusical() {
        return GeneroMusical;
    }

    public void setGeneroMusical(String GeneroMusical) {
        this.GeneroMusical = GeneroMusical;
    }

    public int getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(int FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public int getEstrella() {
        return Estrella;
    }

    public void setEstrella(int Estrella) {
        this.Estrella = Estrella;
    }
    
    //Metodos
    @Override
    public String toString() {
        return "Cancion{" + "Titulo=" + Titulo + ", NombreAutor=" + NombreAutor + ", NombreAlbum=" + NombreAlbum + ", GeneroMusical=" + GeneroMusical + ", FechaSalida=" + FechaSalida + ", Estrella=" + Estrella + '}';
    }
}
