/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheroreemplazo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author marta
 */
public class FicheroReemplazo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce la direccion del fichero.");
        String nombrefichero = leer.nextLine();

        File file = null;
        FileReader filereader = null;
        BufferedReader bufferedreader = null;
        String frase3 = " ";
        String frase4 = " ";
        String frase2 = " ";
        String[] frase = null;
        String[] palabrotas = {"idiota", "estupido", "imbecil"};
        String[] palabrabonita = {"guapo", "inteligente", "bueno"};

        try {
            System.out.println("Introduce la frase que quieras");
            file = new File(nombrefichero);
            BufferedWriter out = new BufferedWriter(new FileWriter(file, false));
            frase3 = leer.nextLine();
            out.newLine();
            out.write(frase3);
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            filereader = new FileReader(file);
            bufferedreader = new BufferedReader(filereader);
            if (file.canRead()) {
                System.out.println("El archivo se puede leer.");
            } else {
                System.out.println("El archivo no se puede leer.");
            }
            frase3 = bufferedreader.readLine();
            while (frase3 != null) {
                frase4 += frase3 + "\n";
                frase3 = bufferedreader.readLine();
            }
            bufferedreader.close();
            frase = frase4.split(" ");
            recorrerArray(frase, palabrotas, palabrabonita);
            frase2 = devolverArray(frase, frase4);
            System.out.println(frase2);
            BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
            out.write(frase2);
            out.close();

        } catch (FileNotFoundException e1) {
            System.out.println(e1.getMessage());
        } catch (IOException e2) {
            System.out.println(e2.getMessage());
        }

    }

    public static void recorrerArray(String[] a, String[] b, String[] c) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equalsIgnoreCase(b[j])) {
                    a[i] = c[j];
                }
            }
        }
    }

    public static String devolverArray(String[] a, String b) {
        for (int i = 0; i < a.length; i++) {
            b += a[i] + " ";
        }
        return b;
    }

}
