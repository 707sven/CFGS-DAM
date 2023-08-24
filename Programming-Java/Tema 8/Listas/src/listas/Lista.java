/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

/**
 *
 * @author usuario
 */
public class Lista {
    //Atributos
    protected int size;
    protected int array [];
    
    //Constructores
    public Lista() {
        this.array = new int [10];
    }

    public Lista(int size, int[] array) {
        this.size = size;
        this.array = new int [size];
    }
    
    //Metodos
    public void obtener() {
        System.out.println(this.array.length);
    }
    
    public void numFinal (int num) {
        this.array [this.array.length] = num;
    }
    
    public void numInicio(int num) {
        this.array [0] = num;
    }
    
    public void numElegido (int num, int pos) {
        this.array [pos] = num;
    }
    
    //Metodos
    public void eliminarElemento(int indice) {
        
    }
}
