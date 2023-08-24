/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package explicacionarchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author marta
 */
public class ExplicacionArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //escribir archivo de texto

        String texto = "hola Marcos que tal";
        String nombre_archivo = "Saludo.txt";
        //crea el archivo
        File file = new File(nombre_archivo);
        //false permite sobreescribir el archivo
        FileWriter fw = new FileWriter(file, false);
        BufferedWriter bw = new BufferedWriter(fw);
        /*El primer bw. escribe lo que teneos en texto, la siguiente es un salto de linea,
        la siguiente vuelve a escribir y la siguiente cierra el flujo de texto*/
        try {
            bw.write(texto);
            bw.newLine();
            bw.write("Hola Pablo");
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }

        //Leer un archivo .txt
        File file1 = new File(nombre_archivo);
        FileReader fr = new FileReader(file1);
        BufferedReader br = new BufferedReader(fr);
        texto = br.readLine();
        while (texto != null) {
            System.out.println(texto);
            texto = br.readLine();

        }
    }

}
