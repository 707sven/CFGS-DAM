/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectorepaso;

/**
 *
 * @author usuario
 */
public abstract class livingthing {
    private String name;

    public String getName() {
        return name;
    }

    public livingthing(String name) {
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void respirar() {
        System.out.println("Respirar");
    }
    
    public void comer () {
        System.out.println("Comer");
    }
    
    public abstract void andar ();
}
