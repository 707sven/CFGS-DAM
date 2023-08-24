/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domino;

/**
 *
 * @author MEDAC
 */
public class Ficha implements Comparable{
    //Atributos
    private int a, b;
    private Integer peso;
    
    //Constructores
    public Ficha() {
    }

    public Ficha(int a, int b) {
        this.a = a;
        this.b = b;
        
        if(a==b){
            peso = a*100+1000;
        } else {
            switch(a){
                case 0:
                    peso=a+b;
                    break;
                case 1:
                    peso = a*10+b;
                    break;
                case 2:
                    peso = a*20+b;
                    break;
                case 3:
                    peso = a*30+b;
                    break;
                case 4:
                    peso = a*40+b;
                    break;
                case 5:
                    peso = a*50+b;
                    break;
                case 6:
                    peso = a*60+b;
                    break;
            }
        }
    }
    
    //Métodos

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

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
    

    @Override
    public String toString() {
        return a+":"+b;
    }

    @Override
    public int compareTo(Object o) {
        return peso.compareTo(((Ficha)o).peso);
    }
    
    
}
