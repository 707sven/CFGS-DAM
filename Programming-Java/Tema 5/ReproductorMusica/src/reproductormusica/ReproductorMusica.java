/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reproductormusica;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ReproductorMusica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Canciones (5 canciones)
        Cancion cancion1 = new Cancion ("Match", "David Rees", "VacacionesEP", "Pop", 2021);
        Cancion cancion2 = new Cancion ("Todo lo que odiabas", "David Rees", "EscalofrioEP", "Pop", 2021);
        Cancion cancion3 = new Cancion ("Luces", "Paulo Londra", "Luces", " Urbano latino", 2022);
        Cancion cancion4 = new Cancion ("Water Fountain", "Alec Benjamin", "Narrated For You", "R&B/Soul, Pop", 2018);
        Cancion cancion5 = new Cancion ("Viernes 13", "Charlie USG", "Todo lo que por fin me atreví a decirte", "Pop", 2022);
                
        //Creacion de la lista de canciones del reproductor
        Cancion ReproductorAudio [] = new Cancion [5];
        ReproductorAudio [0] = cancion1;
        ReproductorAudio [1] = cancion2;
        ReproductorAudio [2] = cancion3;
        ReproductorAudio [3] = cancion4;
        ReproductorAudio [4] = cancion5;
        
        //Estrellas
        for (int i = 0; i < ReproductorAudio.length; i ++){
            System.out.print("Estrellas para " + ReproductorAudio[i].getTitulo() + " (1 - 3 estrellas): ");
            ReproductorAudio[i].setEstrella(leer.nextInt());
        }
        
        //Impresion de las canciones ordenadas por estrellas
        System.out.println("===== Canciones de 3 estrellas =====");
        for (int i = 0; i < ReproductorAudio.length; i++){
            if (ReproductorAudio[i].getEstrella() == 3){
                 System.out.println(ReproductorAudio[i].getTitulo());
            }
        }
        System.out.println("===== Canciones de 2 estrellas =====");
        for (int i = 0; i < ReproductorAudio.length; i++){
            if (ReproductorAudio[i].getEstrella() == 2){
                 System.out.println(ReproductorAudio[i].getTitulo());
            }
        }
        System.out.println("===== Canciones de 1 estrella =====");
        for (int i = 0; i < ReproductorAudio.length; i++){
            if (ReproductorAudio[i].getEstrella() == 1){
                 System.out.println(ReproductorAudio[i].getTitulo());
            }
        }
    }
    
}
