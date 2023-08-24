/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fugademedac;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class FugaDeMedac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Philips Jones
        
        //Creación del tablero de juego
        char [] [] tablero = new char [10] [10];
        RellenarTableroX(tablero);
        RellenarTableroEspaciosSeguros(tablero);
        
        //Clonación del tablero de juego
        char [] [] tableroJuego = new char [10] [10];
        ClonarTablero (tablero, tableroJuego);
        
        RellenarCentinelas(tablero);
        
        //Pasaporte
        int ID [] = {3,5,4,6,1,2,0,8,7};
        
        //Dado
        int dado = (int) (Math.random()*6) + 1;
        
        //Jugador
        tableroJuego [4] [4] = 'j';
        MostrarTablero (tableroJuego);
        
        boolean juego= true;
        int contador = 0;
        
            while (contador != 10) {
                MostrarTablero(tablero);
                System.out.println("Tiras un dado. El resultado es " + dado);
                System.out.println("Puedes moverte " + dado + " pasos o menos hacia donde quieras.");
                System.out.println("¿ A donde quieres moverte?");
                System.out.print("Fila: ");
                int fila = leer.nextInt();
                System.out.print("Columna: ");
                int columna = leer.nextInt();

                if (tablero[fila] [columna] == 'x') {
                tableroJuego [fila] [columna] = 'j';
                MostrarTablero (tableroJuego);
                } else if (tablero[fila] [columna] == 'p') {
                    JugarPasaporte(ID);
                    System.out.println("");
                } else if (tablero[fila] [columna] == 'a') {
                    JugarAlicates(juego);
                    System.out.println("");
                } else if (tablero[fila] [columna] == 'u') {
                    JugarUniformes(juego);
                    System.out.println("");
                } else if (tablero[fila] [columna] == 'c') {
                    System.out.println("Te has topado con un centinela. Te ha llevado de vuelta a la celda.");
                    System.out.println("Has perdido");
                    juego = false;
                }  
                contador ++;
            } 
        } 
   

    //Me ha faltado conseguir que salga del juego cuando falla.
    
        public static void MostrarTablero(char array [] []) {
        for (int fila = 0; fila < array.length; fila ++) {
            for (int col = 0; col < array[fila].length; col ++) {
                System.out.print(array[fila] [col]);
                System.out.print(" ");
            } System.out.println("");
        }
    }
        
        public static void RellenarTableroX(char array [] []) {
            for (int fila = 0; fila < array.length; fila++) {
                for (int col = 0; col < array[fila].length; col++) {
                    array[fila][col] = 'x';
                }
            }
        }
    
        public static void RellenarTableroEspaciosSeguros(char array [] []) {
            //Colocación de  Pasaporte
            for (int fila = 0; fila < 1; fila++) {
                for (int col = 0; col < 3; col++) {
                    array[fila][col + 3] = 'p';
                }
            }
            //Colocación de Uniforme
            for (int fila = 0; fila < 3; fila++) {
                for (int col = 0; col < 1; col++) {
                    array[fila + 3][col + 9] = 'u';
                }
            }
            //Colocación de Alicates
            for (int fila = 0; fila < 1; fila++) {
                for (int col = 0; col < 3; col++) {
                    array[fila + 9][col + 3] = 'a';
                }
            }
        }
        
        public static void RellenarCentinelas (char array [] []) {
            //Colocación de las centinelas con un random
            for (int i = 0; i < 10; i ++) {
                int colRandom =(int) (Math.random()*10);
                int filaRandom = (int) (Math.random()*10);
                    for (int fila = 0; fila < 1; fila++) {
                    for (int col = 0; col < 1; col++) {
                        //Comprobar si el centinela se coloca en una posición de pasaporte, uniforme o alicate
                        if (array[filaRandom] [colRandom] != 'p' && array[filaRandom] [colRandom] != 'a' && array[filaRandom] [colRandom] != 'u' ){
                            array[filaRandom][colRandom] = 'c';
                        } else {
                            i --;
                        }
                    }
                }
            }
        }
        
        public static void ClonarTablero (char array [] [], char copy [] []) {
            //Recorrer el primer array
            for (int fila = 0; fila < array.length; fila ++) {
                for (int col = 0; col < array[fila].length; col ++) {
                    //Clonar el contenido de cada posición del array original
                    copy [fila] [col] = array [fila] [col];
                }
            }
     }
                
        public static void JugarPasaporte (int [] ID) {
          Arrays.sort(ID);
            System.out.println("Tu pasaporte actual es: " + (Arrays.toString(ID)));
            
        }
        
        public static void JugarAlicates (boolean juego) {
            Scanner leer = new Scanner(System.in);
            int IA = (int) (Math.random()*3);
            
            System.out.println("Te topas con otro preso, ambos necesitais los alicates.");
            System.out.println("El preso te hace una propuesta, quien gane al piedra papel o tijera se queda con los alicates.");
            System.out.println("(0 = piedra, 1 = papel, 2 = tijeras)");
            
            System.out.print("¿Con qué decides jugar? ");   
            int jugador = leer.nextInt();
            
            if (IA == 0 && jugador == 0) {  //piedra - piedra
                System.out.println("Ambos sacáis piedra, empate.");
            } else if (IA == 1 && jugador == 0) {   //papel - piedra
                System.out.println("El preso ha sacado papel, has perdido, más suerte la próxima.");
                juego = false;
            } else if (IA == 2 && jugador == 0) {   //tijera - piedra
                System.out.println("El preso ha sacado tijeras, has ganado, recoges los alicates.");
                juego = true;
            } else if (IA == 0 && jugador == 1) {   //piedra - papel
                System.out.println("El preso ha sacado papel, has ganado, recoges los alicates.");
                juego = true;
            } else if (IA == 0 && jugador == 2) {   // piedra - tijeras
                System.out.println("El preso ha sacado tijeras, has perdido, más suerte la próxima.");
                juego = false;
            } else if (IA == 1 && jugador == 1) {   //papel - papel
                System.out.println("Ambos sacáis papel, empate.");
            } else if (IA == 1 && jugador == 2) {   // papel - tijeras
                System.out.println("El preso ha sacado papel, has ganado, recoges los alicates.");
                juego = true;
            } else if (IA == 2 && jugador == 1) {   //tijeras - papel
                System.out.println("El preso ha sacado tijeras, has perdido, más suerte la próxima.");
                juego = false;
            } else if (IA == 2 && jugador == 2) {   // tijeras - tijeras
                System.out.println("Ambos sacáis tijeras, empate.");
            }
            
            
        }
        
        public static void JugarUniformes (boolean juego) {
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Te topas con un armario un poco oscuro, entre todas las prendas encuentras 3 uniformes...");
            System.out.println("Uniforme 1: bigote, gorra, chaqueta, pantalón corto.");
            System.out.println("Uniforme 2: peluca, sombrero, chaqueta, pantalón largo.");
            System.out.println("Uniforme 3: gafas, abrigo, pantalón pinza. ");
            System.out.print("¿Con cuál decides quedarte? ");
            int eleccion = leer.nextInt();
            
            if (eleccion == 1) {
                System.out.println("Elegiste el uniforme equivocado. Los guardias te detienen.");
                juego = false;
            } else if (eleccion == 2) {
                System.out.println("Elegiste el uniforme equivocado. Los guardias te detienen.");
                juego = false;
            } else if (eleccion == 3) {
                System.out.println("Parce que nadie duda de tu disfraz. Puedes seguir adelante.");
                juego = true;
            }
        }
}