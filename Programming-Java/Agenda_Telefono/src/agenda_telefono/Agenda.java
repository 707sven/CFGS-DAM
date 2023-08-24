/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda_telefono;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Rafae
 */
public class Agenda{
protected  Contacto agenda[]=new Contacto[20];


    public Agenda(String nombreAgenda) {
        String frase;
        String frase2;
        String frase3;
        int pos=0;
        try{
           File file = new File(nombreAgenda);
           FileReader filereader=new FileReader(file);
           BufferedReader  bufferedReader=new BufferedReader(filereader);
           
                frase=bufferedReader.readLine();
                frase2=bufferedReader.readLine();
                frase3=bufferedReader.readLine();
                 while(frase!=null){
                
                     agenda[pos]= new Contacto(frase2,frase3);
                     
                         frase=bufferedReader.readLine();
                         frase2=bufferedReader.readLine();
                         frase3=bufferedReader.readLine();
                         
                     pos=pos+1;
                 
                }
           
           bufferedReader.close();
           
        }catch(FileNotFoundException e1){
              System.out.println(e1.getMessage());
         }catch(IOException e2){
              System.out.println(e2.getMessage());
     }
        
    }
    
    public  void nuevoContacto(){
        String nombre;
        String numero;
        boolean insertado=false;
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Por favor introduzca el nombre de contacto: ");
        nombre= scan.nextLine();
        System.out.println("Por favor introduzca el numero de contacto: ");
        numero=scan.nextLine();
        for(int i=0;i<agenda.length;i++){
            if(agenda[i]==null && insertado==false){
                agenda[i]=new Contacto(nombre,numero);
                insertado=true;
            }
        }
        insertado=false;
        
    }
    
    public  void buscar(){
        Scanner scan=new Scanner(System.in);
        
        String buscado;
        System.out.println("Escriba que quiere buscar: ");
        buscado=scan.nextLine();
        
        for(int i=0;i<agenda.length;i++){
            if(agenda[i]==null){
            
            }else{
               if( (buscado.toUpperCase()).equals(((agenda[i].getNombre()).toUpperCase()).substring(0,buscado.length()))){
                   System.out.println(agenda[i].toString());
               }
                
            }
        }
    
    }
    
    public  void mostrarTodo(){
    
        for(int i=0;i<agenda.length;i++){
        if(agenda[i]==null){
        
        }else{
            System.out.println(agenda[i].toString());
        }
            
        }
        
        
    }
    
    public void salir(String nombreAgenda){
    
         try{
              File file= new File(nombreAgenda);
              BufferedWriter out = new BufferedWriter(new FileWriter(file,true));
              
              for(int i=0;i<agenda.length;i++){
                  
                   if(agenda[i]==null){
        
                   //}else if(agenda[i].getNombre()==){
                   
                   }else{
                       out.newLine();
                       out.write(agenda[i].getNombre());
                       out.newLine();
                       out.write(agenda[i].getTelefono());
                       out.newLine();
                       
                     }
              }
              
               out.close();
              
         }catch(FileNotFoundException e1){
              System.out.println(e1.getMessage());
         }catch(IOException e2){
              System.out.println(e2.getMessage());
     }
    }
    
    
}
