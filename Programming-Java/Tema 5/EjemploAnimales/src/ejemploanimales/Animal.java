/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploanimales;

/**
 *
 * @author usuario
 */
public class Animal {
    int patas;
    String dieta;
    boolean pelo;
    String color;
    
    public void comer(String alimento) {
        this.dieta = alimento;
    }
    public void cambiarColor() {
    }
    public Animal (){
    }
    public Animal (int paw) {
        this.patas = paw;
    }
    public Animal (int patas, String dieta, boolean pelo, String color) {
        this.patas = patas;
        this.dieta = dieta;
        this.pelo = pelo;
        this.color = color;
    }
    
    public void mostrarClase() {
        System.out.println("Número de patas: " + this.patas + ", dieta: " + this.dieta + ", pelo: " + this.pelo +  ", color: " + this.color);
    }
}
