/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author usuario
 */
public abstract class Content {
    //Atributos
    protected String codigo;
    protected String nombre;
    protected int year;
    
    //Constructores
    public Content() {
    }

    public Content(String codigo, String nombre, int year) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.year = year;
    }
    
    
    
}
