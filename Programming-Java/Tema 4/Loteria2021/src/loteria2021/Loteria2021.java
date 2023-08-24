/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loteria2021;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class Loteria2021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Probabilidad de que salga cada número por posición de la lotería
        
        int [] loteria2012 = {7, 6, 0, 5, 8};
        int [] loteria2013 = {6, 2, 2, 4, 6};
        int [] loteria2014 = {1, 3, 4, 3, 7};
        int [] loteria2015 = {7, 9, 1, 4, 0};
        int [] loteria2016 = {6, 6, 5, 1, 3};
        int [] loteria2017 = {7, 1, 1, 9, 8};
        int [] loteria2018 = {0, 3, 3, 4, 7};
        int [] loteria2019 = {2, 6, 5, 9, 0};
        int [] loteria2020 = {7, 2, 8, 9, 7};
        int [] loteria2021 = {8, 6, 1, 4, 8};
        
        System.out.print("Lo más probable es que el número de la lotería del gordo 2022 sea: "); 
        for (int i = 0; i < loteria2012.length; i++) {
            NumLoteria2022(loteria2012, loteria2013, loteria2014, loteria2015, loteria2016, loteria2017, loteria2018, loteria2019, loteria2020, loteria2021, i);
            
          } System.out.println("");
          for (int i = 0; i < loteria2012.length; i++) {
            probabilidadPorPosicion(loteria2012, loteria2013, loteria2014, loteria2015, loteria2016, loteria2017, loteria2018, loteria2019, loteria2020, loteria2021, i);
            
          } System.out.println("");
        
    }
    public static void NumLoteria2022 (int [] loteria2012, int [] loteria2013, int [] loteria2014, int [] loteria2015, int [] loteria2016, int [] loteria2017, int [] loteria2018, int [] loteria2019, int [] loteria2020, int [] loteria2021, int i){
        //Creamos el contador de probabilidad
        int [] contador = new int[10];
        
        //Recorremos todas los números de las loterías y si se repite, los agregamos al contador de probabilidad
        for (int num = 0; num < 10; num++) {
            if (loteria2012[i] == num){
                contador[num]++;
            } if (loteria2013[i] == num){
                contador[num]++;
            } if (loteria2014[i] == num){
                contador[num]++;
            } if (loteria2015[i] == num){
                contador[num]++;
            } if (loteria2016[i] == num){
                contador[num]++;
            } if (loteria2017[i] == num){
                contador[num]++;
            } if (loteria2018[i] == num){
                contador[num]++;
            } if (loteria2019[i] == num){
                contador[num]++;
            } if (loteria2020[i] == num){
                contador[num]++;
            } if (loteria2021[i] == num){
                contador[num]++;
            }
        } numLoteria(contador);
  } 
    
       public static void probabilidadPorPosicion (int [] loteria2012, int [] loteria2013, int [] loteria2014, int [] loteria2015, int [] loteria2016, int [] loteria2017, int [] loteria2018, int [] loteria2019, int [] loteria2020, int [] loteria2021, int i){
        //Creamos el contador de probabilidad
        int [] contador = new int[10];
        
        //Recorremos todas los números de las loterías y si se repite, los agregamos al contador de probabilidad
        for (int num = 0; num < 10; num++) {
            if (loteria2012[i] == num){
                contador[num]++;
            } if (loteria2013[i] == num){
                contador[num]++;
            } if (loteria2014[i] == num){
                contador[num]++;
            } if (loteria2015[i] == num){
                contador[num]++;
            } if (loteria2016[i] == num){
                contador[num]++;
            } if (loteria2017[i] == num){
                contador[num]++;
            } if (loteria2018[i] == num){
                contador[num]++;
            } if (loteria2019[i] == num){
                contador[num]++;
            } if (loteria2020[i] == num){
                contador[num]++;
            } if (loteria2021[i] == num){
                contador[num]++;
            }
        } probabilidad(contador);
  } 
    
    public static void probabilidad(int [] contador) {
        int posicion = 0;
        int c = 2012;
        System.out.println("=============Loteria "+ c + "=================");
        c = c + 1;
        for (int b = 0; b < 10; b ++){
            System.out.println("La probabilidad de que salga " + posicion + " es " + contador[b]);
            posicion ++;
        }
    }
        
    public static void numLoteria (int [] contador){
        int NumLoteria = 0;
        
        for (int a = 1; a < contador.length; a++) {
            if (contador[a] > contador[NumLoteria]){
                NumLoteria = a;
            }
        } System.out.print(NumLoteria);
    }
    
    public static void mostrarArray (int [] a){
        for (int i = 0; i < a.length; i ++){
            System.out.print(a[i] + " ");
        } System.out.println( " ");
    }    
}