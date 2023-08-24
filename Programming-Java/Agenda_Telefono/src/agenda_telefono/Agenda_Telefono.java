/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agenda_telefono;

import java.util.Scanner;

/**
 *
 * @author Rafae
 */
public class Agenda_Telefono {

    public static void main(String[] args) {

   /*     diseña una pequeña agenda con este comportamiento: 
1. nuevo contacto, 2. buscar por nombre, 3. mostrar todo, 4. salir
1.se guarda el nombre y telefono de 20 personas (comprobar que la agenda no este llena y que el nombre no esté)
2.muestra todos los telefonos que coinciden con una cadena nombre(aunque sean solo las primeras letras, con pe sale pepe petunia pepa por ejm)
3. mostrar listado de toda la información
4. guarda todos los datos en agenda.txt y sale.
cuando se ejecute la agenda otra vez deberan de cargarse los datos anteriormente guardados*/
        Scanner scan=new Scanner(System.in);
        boolean salir=false;
        String teclado;
        String nombreAgenda="Agenda.txt";
        
        Agenda agenda1=new Agenda(nombreAgenda);
        
   while(salir==false){
   
       System.out.println("Agenda\n-------------------\n1.Nuevo Contacto\n2.Buscar\n3.Mostrar Todo\n4.Salir");
       teclado=scan.nextLine();
       switch(teclado.toUpperCase()){
           case "1":
               agenda1.nuevoContacto();
               break;
           case "2":
               agenda1.buscar();
               break;
           case "3":
               agenda1.mostrarTodo();
               break;
           case "4":
               agenda1.salir(nombreAgenda);
               salir=true;
               System.out.println("Cerrando...");
               break;
           case "NUEVO CONTACTO":
               agenda1.nuevoContacto();
               break;
           case "BUSCAR":
               agenda1.buscar();
               break;
            case "MOSTRAR TODO":
               agenda1.mostrarTodo();
               break;
            case "SALIR":
                agenda1.salir(nombreAgenda);
               salir=true;
                System.out.println("Cerrando...");
               break;
               default:
                   System.out.println("Parece que se equivoco al elegir la opción, por favor vuelva a elegirla:");
       }
   
   
   
   }
   
   
    }
    
}
