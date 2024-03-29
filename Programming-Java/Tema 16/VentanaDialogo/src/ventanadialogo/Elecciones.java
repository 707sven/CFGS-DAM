/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanadialogo;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Elecciones extends javax.swing.JFrame {

    /**
     * Creates new form Elecciones
     */
    public Elecciones() {
        initComponents();
        // Para que se abra la ventana en el centro
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonSimple = new javax.swing.ButtonGroup();
        botonComplejo = new javax.swing.ButtonGroup();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        VentanaSimple = new javax.swing.JPanel();
        MDefecto = new javax.swing.JRadioButton();
        MWarning = new javax.swing.JRadioButton();
        MInfo = new javax.swing.JRadioButton();
        MPersonalizado = new javax.swing.JRadioButton();
        MPregunta = new javax.swing.JRadioButton();
        Complejo = new javax.swing.JButton();
        VentanaComplejo = new javax.swing.JPanel();
        MYesNo = new javax.swing.JRadioButton();
        MOpciones = new javax.swing.JRadioButton();
        MDatosDefecto = new javax.swing.JRadioButton();
        Simple = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        VentanaSimple.setBackground(new java.awt.Color(102, 255, 153));

        botonSimple.add(MDefecto);
        MDefecto.setText("Mensaje por defecto");
        MDefecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MDefectoActionPerformed(evt);
            }
        });

        botonSimple.add(MWarning);
        MWarning.setText("Mensaje de warning");
        MWarning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MWarningActionPerformed(evt);
            }
        });

        botonSimple.add(MInfo);
        MInfo.setText("Mensaje de información");
        MInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MInfoActionPerformed(evt);
            }
        });

        botonSimple.add(MPersonalizado);
        MPersonalizado.setText("Mensaje personalizado (icono)");
        MPersonalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPersonalizadoActionPerformed(evt);
            }
        });

        botonSimple.add(MPregunta);
        MPregunta.setText("Mensaje de pregunta");
        MPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPreguntaActionPerformed(evt);
            }
        });

        Complejo.setText("Complejo");
        Complejo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComplejoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VentanaSimpleLayout = new javax.swing.GroupLayout(VentanaSimple);
        VentanaSimple.setLayout(VentanaSimpleLayout);
        VentanaSimpleLayout.setHorizontalGroup(
            VentanaSimpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaSimpleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VentanaSimpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentanaSimpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(MDefecto, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addComponent(MWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(MInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MPersonalizado, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(VentanaSimpleLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(Complejo)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        VentanaSimpleLayout.setVerticalGroup(
            VentanaSimpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaSimpleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MDefecto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MWarning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MPersonalizado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MPregunta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Complejo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Simple", VentanaSimple);

        VentanaComplejo.setBackground(new java.awt.Color(255, 102, 102));

        botonComplejo.add(MYesNo);
        MYesNo.setText("ShowConfirmDialog Yes/No");
        MYesNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MYesNoActionPerformed(evt);
            }
        });

        botonComplejo.add(MOpciones);
        MOpciones.setText("ShowOptionDialog con 4 opciones");
        MOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOpcionesActionPerformed(evt);
            }
        });

        botonComplejo.add(MDatosDefecto);
        MDatosDefecto.setText("ShowInputDatos con texto por defecto");
        MDatosDefecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MDatosDefectoActionPerformed(evt);
            }
        });

        Simple.setText("Simple");
        Simple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VentanaComplejoLayout = new javax.swing.GroupLayout(VentanaComplejo);
        VentanaComplejo.setLayout(VentanaComplejoLayout);
        VentanaComplejoLayout.setHorizontalGroup(
            VentanaComplejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaComplejoLayout.createSequentialGroup()
                .addGroup(VentanaComplejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentanaComplejoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(VentanaComplejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MDatosDefecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MYesNo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(VentanaComplejoLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(Simple)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        VentanaComplejoLayout.setVerticalGroup(
            VentanaComplejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaComplejoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MYesNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MOpciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MDatosDefecto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Simple)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Complejo", VentanaComplejo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MWarningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MWarningActionPerformed
        // TODO add your handling code here:
        String mensaje = "Mensaje de peligro";
        String titulo = "Peligro";
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_MWarningActionPerformed

    private void SimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpleActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_SimpleActionPerformed

    private void MDefectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MDefectoActionPerformed
        // TODO add your handling code here:
        String mensaje = "Mensaje por defecto";
        JOptionPane.showMessageDialog(null, mensaje);
    }//GEN-LAST:event_MDefectoActionPerformed

    private void MInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MInfoActionPerformed
        // TODO add your handling code here:
        String mensaje = "Mensaje de información";
        JOptionPane.showMessageDialog(null, mensaje);
    }//GEN-LAST:event_MInfoActionPerformed

    private void MPersonalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPersonalizadoActionPerformed
        // TODO add your handling code here:
        // Creamos el icono para mostrar
        String r_icono = "corazon_rojoV2.png";
        ImageIcon icono = new ImageIcon(r_icono);

        // Título personalizado, icono personalizado
        String mensaje4 = "Mensaje de texto normal";
        String titulo4 = "Titulo";
        JOptionPane.showMessageDialog(null, mensaje4, titulo4, JOptionPane.INFORMATION_MESSAGE, icono);
    }//GEN-LAST:event_MPersonalizadoActionPerformed

    private void MPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPreguntaActionPerformed
        // TODO add your handling code here:
        Object[] opciones = {"Patata", "Pochoclo"};
        int respuesta = JOptionPane.showOptionDialog(null,
                "¿Qué palabra te gusta más?",
                "Pregunta",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);
    }//GEN-LAST:event_MPreguntaActionPerformed

    private void ComplejoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComplejoActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_ComplejoActionPerformed

    private void MYesNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MYesNoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(null, "miau?");
    }//GEN-LAST:event_MYesNoActionPerformed

    private void MOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOpcionesActionPerformed
        // TODO add your handling code here:
        Object[] options = {"Si", "No", "Tal vez", "Depende"};
        String r_icono = "corazon_rojoV2.png";
        ImageIcon icon = new ImageIcon(r_icono);
        JOptionPane.showOptionDialog(null, "Elige una opción", "Opciones", WIDTH, HEIGHT, icon, options, EXIT_ON_CLOSE);
    }//GEN-LAST:event_MOpcionesActionPerformed

    private void MDatosDefectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MDatosDefectoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showInputDialog("Introduce tu contraseña del banco :)");
    }//GEN-LAST:event_MDatosDefectoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Elecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Elecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Elecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Elecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Elecciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Complejo;
    private javax.swing.JRadioButton MDatosDefecto;
    private javax.swing.JRadioButton MDefecto;
    private javax.swing.JRadioButton MInfo;
    private javax.swing.JRadioButton MOpciones;
    private javax.swing.JRadioButton MPersonalizado;
    private javax.swing.JRadioButton MPregunta;
    private javax.swing.JRadioButton MWarning;
    private javax.swing.JRadioButton MYesNo;
    private javax.swing.JButton Simple;
    private javax.swing.JPanel VentanaComplejo;
    private javax.swing.JPanel VentanaSimple;
    private javax.swing.ButtonGroup botonComplejo;
    private javax.swing.ButtonGroup botonSimple;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
