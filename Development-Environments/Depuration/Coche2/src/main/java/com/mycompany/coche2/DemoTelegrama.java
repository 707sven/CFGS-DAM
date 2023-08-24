/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.coche2;

/**
 *
 * @author usuario
 */
public class DemoTelegrama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Telegrama telegrama1 = new Telegrama("Ordinario", 8);
        telegrama1.calculaCosto();
        System.out.println(telegrama1);
        telegrama1.setNumPalabras(12);
        telegrama1.calculaCosto();
        System.out.println(telegrama1);
        Telegrama telegrama2 = new Telegrama("Urgente", 8);
        telegrama2.calculaCosto();
        System.out.println(telegrama2);
        telegrama2.setNumPalabras(12);
        telegrama2.calculaCosto();
        System.out.println(telegrama2);
    }
}
