/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapaanimales;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class MapaAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        map.put("color", "rojo");
        map.put("ancho", "640");
        map.put("alto", "360");
        map.put("color", "verde"); //Si repetimos un valor con la misma clave se modifica la anterior
        System.out.println(map);

        map.remove("color");
        System.out.println(map);
        System.out.println(map.get("ancho"));

        for (HashMap.Entry<String, String> datos : map.entrySet()) {
            String clave = datos.getKey();
            String valor = datos.getValue();
            System.out.println(clave + ": " + valor);
        }
        System.out.println(map.size());
        System.out.println(map.containsKey("ancho"));
        System.out.println(map.containsValue("640"));

        System.out.println(map.values());
        ArrayList<String> a = new ArrayList(map.values());
        System.out.println(a);

        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            System.out.println(key + map.get(key));
        }

        // implementa el control de acceso al area restringida de un programa
        // se debe pedir un nombre de usuario y una contraseña. Si el usuario introduce los datos correctamente el programa dirá "has accedido al area restringida"
        // El usuario tendrá un máximo de 3 oportunidades
        // si se agotan las oportunidades el programa dirá "lo siento, no tienes acceso al area restringida"
        // los nombres de usuarios con sus correspondientes contraseñas deben estar guardados en una estructura HashMap
        // 3 usuarios validos
        HashMap<String, String> cont = new HashMap<>();
        cont.put("antonio", "1234");
        cont.put("pepe", "gatonegro21");
        cont.put("elm", "wachin777");

        int intento = 0;
        boolean entra = false;
        do {
            System.out.print("Usuario: ");
            String name = leer.next();
            System.out.print("Contraseña: ");
            String contrasena = leer.next();

            if (cont.containsKey(name)) {
                if (cont.get(name).equals(contrasena)) {
                    System.out.println("Has accedido al area restringida.");
                    entra = true;
                } else {
                    System.out.println("Lo siento, no tienes acceso al area restringida");
                }
            }
            intento++;
        } while ((!entra) && (intento != 3));
    }

}
