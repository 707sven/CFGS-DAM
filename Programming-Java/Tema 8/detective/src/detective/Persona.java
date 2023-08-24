/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package detective;

/**
 *
 * @author usuario
 */
public abstract class Persona {
    //Atributos
    protected String nombre;
    protected String lugar;
    protected String relacion;
    protected String quienEsAsesino;
    protected boolean asesino;
    protected int contador = 0;
    
    //Constructores
    public Persona() {
    }

    public Persona(String nombre, String lugar, String relacion, String quienEsAsesino, boolean asesino) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.relacion = relacion;
        this.quienEsAsesino = quienEsAsesino;
        this.asesino = asesino;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public String getRelacion() {
        return relacion;
    }

    public String getQuienEsAsesino() {
        return quienEsAsesino;
    }

    public boolean isAsesino() {
        return asesino;
    }
    
    //Metodos
   public  void hablar(Persona array []){
    if (asesino){
        switch(contador){
         case 1:
             for(int i=0;i<=array.length;i++) {
                if (!array[i].isAsesino()) {
                    System.out.println("Estaba en" + array[i].getLugar());
                    }
            }
             contador ++;
             break;
         case 2:
             for(int i=0;i<=array.length;i++) {
                if (!array[i].isAsesino()) {
                    System.out.println("Me llevaba " + array[i].getRelacion());
                    }
                }
             contador ++;
             break;
         case 3:
             for(int i=0;i<=array.length;i++) {
                if (!array[i].isAsesino()) {
                    System.out.println("Creo que es " + array[i].getQuienEsAsesino());
                    }
            }
             contador ++;
             break;
         default:
             System.out.println("No lo sé");
             contador ++;
             break;
            }
    }
    else{
     switch(contador){
     case 1:
         System.out.println("Estaba en " + this.lugar);
         contador ++;
         break;
     case 2:
         System.out.println("Me llevaba " + this.relacion);
         contador ++;
         break;
     case 3:
         for(int i=0;i<=array.length;i++) {
            if (array[i].isAsesino()) {
                System.out.println(array[i].isAsesino());
                }
            }
         contador ++;
         break;
     default:
         System.out.println("No lo sé");
         contador ++;
         break;
     }
    }
  }
}
