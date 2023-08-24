/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectorepaso;

/**
 *
 * @author usuario
 */
public class Mono extends livingthing {

    @Override
    public void andar() {
        System.out.println(super.getName() + " camina con las manos y pies");
    }
    
    public Mono(String name) {
        super(name);
    }
    
}
