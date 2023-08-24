/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventanadialogo;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class VentanaDialogo extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Peligro
        String mensaje = "Mensaje de peligro";
        String titulo = "Peligro";
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.WARNING_MESSAGE);

        // Información
        String mensaje2 = "Mensaje de información";
        JOptionPane.showMessageDialog(null, mensaje2);

        // Error
        String mensaje3 = "Mensaje de error";
        String titulo3 = "Error";
        JOptionPane.showMessageDialog(null, mensaje3, titulo3, JOptionPane.ERROR_MESSAGE);

        // Personalizado
        // Creamos el icono para mostrar
        String r_icono = "corazon_rojoV2.png";
        ImageIcon icono = new ImageIcon(r_icono);

        // Título personalizado, icono personalizado
        String mensaje4 = "Mensaje de texto normal";
        String titulo4 = "Titulo";
        JOptionPane.showMessageDialog(null, mensaje4, titulo4, JOptionPane.INFORMATION_MESSAGE, icono);

        // Ventana con respuesta
        Object[] opciones = {"Si", "No"};
        int respuesta = JOptionPane.showOptionDialog(null,
                "¿Desea guardar los cambios realizados?",
                "Pregunta",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);
        System.out.println("Has respondido " + respuesta);

        // Guardar fichero
        // Creamos un JFileChooser, es una ventana para seleccionar un fichero
        JFileChooser fileChooser = new JFileChooser();
        // Hacemos que aparezca un fichero por defecto
        fileChooser.setSelectedFile(new File("fichero.txt"));
        // Cambiamos el título de la ventana
        fileChooser.setDialogTitle("Selecciona un fichero");
        // Mostramos la ventana de seleccionar el fichero
        int resultado = fileChooser.showSaveDialog(null);
        // Si se ha seleccionado un fichero, si se pulsa cancelar no se ejecuta
        if (resultado == JFileChooser.APPROVE_OPTION) {
            // Obtenemos la ruta del fichero
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();
        }

    }

}
