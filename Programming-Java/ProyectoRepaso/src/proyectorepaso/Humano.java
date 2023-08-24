/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectorepaso;

/**
 *
 * @author usuario
 */
public class Humano extends livingthing{

    @Override
    public void andar() {
        System.out.println(super.getName() + " camina con los pies");
    }
    
     public Humano(String name) {
        super(name);
    }
    
    
}
