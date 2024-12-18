/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.udec.poo4.Ventanas;

import co.edu.udec.poo4.model.entidades.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author altoc
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        barraMenu = new javax.swing.JMenuBar();
        menuUsuarios = new javax.swing.JMenu();
        itemIniciarSesionUsuarios = new javax.swing.JMenuItem();
        itemAgregarUsuarios = new javax.swing.JMenuItem();
        itemConsultarUsuarios = new javax.swing.JMenuItem();
        itemEditarUsuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemEliminarUsuarios = new javax.swing.JMenuItem();
        itemListadoUsuarios = new javax.swing.JMenuItem();
        menuGimnasios = new javax.swing.JMenu();
        itemAgregarGimnasio = new javax.swing.JMenuItem();
        itemConsultarGimnasio = new javax.swing.JMenuItem();
        itemEditarGimnasio = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itemEliminarGimnasio = new javax.swing.JMenuItem();
        menuEntrenadores = new javax.swing.JMenu();
        itemAgregarEntrenador = new javax.swing.JMenuItem();
        itemConsultarEntrenador = new javax.swing.JMenuItem();
        itemEditarEntrenador = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        itemEliminarEntrenador = new javax.swing.JMenuItem();
        menuRutinas = new javax.swing.JMenu();
        itemConsultarRutinas = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        itemAyuda = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("..::GESTION GIMNASIO::..");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        menuUsuarios.setText("Usuarios");
        menuUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        itemIniciarSesionUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo4/Ventanas/Iconos/login-24px.png"))); // NOI18N
        itemIniciarSesionUsuarios.setText("Cerrar Sesion");
        itemIniciarSesionUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemIniciarSesionUsuariosActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemIniciarSesionUsuarios);

        itemAgregarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo4/Ventanas/Iconos/add-24px.png"))); // NOI18N
        itemAgregarUsuarios.setText("Agregar Usuario");
        itemAgregarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarUsuariosActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemAgregarUsuarios);

        itemConsultarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo4/Ventanas/Iconos/consult-24px.png"))); // NOI18N
        itemConsultarUsuarios.setText("Consultar mis Datos");
        itemConsultarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarUsuariosActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemConsultarUsuarios);

        itemEditarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo4/Ventanas/Iconos/edit.24px.png"))); // NOI18N
        itemEditarUsuarios.setText("Editar mis Datos");
        itemEditarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarUsuariosActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemEditarUsuarios);
        menuUsuarios.add(jSeparator1);

        itemEliminarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo4/Ventanas/Iconos/delete-24px.png"))); // NOI18N
        itemEliminarUsuarios.setText("Eliminar Usuario");
        itemEliminarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarUsuariosActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemEliminarUsuarios);

        itemListadoUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo4/Ventanas/Iconos/Checklist-24px.png"))); // NOI18N
        itemListadoUsuarios.setText("Listado de Usuarios");
        itemListadoUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListadoUsuariosActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemListadoUsuarios);

        barraMenu.add(menuUsuarios);

        menuGimnasios.setText("Gimnasios");
        menuGimnasios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        itemAgregarGimnasio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo4/Ventanas/Iconos/add-24px.png"))); // NOI18N
        itemAgregarGimnasio.setText("Agregar Usuario");
        menuGimnasios.add(itemAgregarGimnasio);

        itemConsultarGimnasio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo4/Ventanas/Iconos/consult-24px.png"))); // NOI18N
        itemConsultarGimnasio.setText("Consultar mis Datos");
        menuGimnasios.add(itemConsultarGimnasio);

        itemEditarGimnasio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo4/Ventanas/Iconos/edit.24px.png"))); // NOI18N
        itemEditarGimnasio.setText("Editar mis Datos");
        menuGimnasios.add(itemEditarGimnasio);
        menuGimnasios.add(jSeparator2);

        itemEliminarGimnasio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo4/Ventanas/Iconos/delete-24px.png"))); // NOI18N
        itemEliminarGimnasio.setText("Eliminar Usuario");
        menuGimnasios.add(itemEliminarGimnasio);

        barraMenu.add(menuGimnasios);

        menuEntrenadores.setText("Entrenadores");
        menuEntrenadores.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        itemAgregarEntrenador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo4/Ventanas/Iconos/add-24px.png"))); // NOI18N
        itemAgregarEntrenador.setText("Agregar Usuario");
        menuEntrenadores.add(itemAgregarEntrenador);

        itemConsultarEntrenador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo4/Ventanas/Iconos/consult-24px.png"))); // NOI18N
        itemConsultarEntrenador.setText("Consultar mis Datos");
        menuEntrenadores.add(itemConsultarEntrenador);

        itemEditarEntrenador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo4/Ventanas/Iconos/edit.24px.png"))); // NOI18N
        itemEditarEntrenador.setText("Editar mis Datos");
        menuEntrenadores.add(itemEditarEntrenador);
        menuEntrenadores.add(jSeparator3);

        itemEliminarEntrenador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo4/Ventanas/Iconos/delete-24px.png"))); // NOI18N
        itemEliminarEntrenador.setText("Eliminar Usuario");
        menuEntrenadores.add(itemEliminarEntrenador);

        barraMenu.add(menuEntrenadores);

        menuRutinas.setText("Rutinas");
        menuRutinas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        itemConsultarRutinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo4/Ventanas/Iconos/consult-24px.png"))); // NOI18N
        itemConsultarRutinas.setText("Consultar mis Datos");
        menuRutinas.add(itemConsultarRutinas);

        barraMenu.add(menuRutinas);

        menuAyuda.setText("Ayuda");
        menuAyuda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        itemAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo4/Ventanas/Iconos/Search-24px.png"))); // NOI18N
        itemAyuda.setText("Acerca de...");
        menuAyuda.add(itemAyuda);

        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 848, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemAgregarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarUsuariosActionPerformed
       VentanaUsuarios ventana = new VentanaUsuarios(this,true);
       ventana.setLocationRelativeTo(this);
       ventana.setVisible(true);
    }//GEN-LAST:event_itemAgregarUsuariosActionPerformed

    private void itemConsultarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarUsuariosActionPerformed
      VentanaUsuarios ventana = new VentanaUsuarios(this,true);
      
        if(Usuario.UsuarioActual == null){
              ventana.habilitarCampos(false, true, false, false, true, true);
              ventana.habilitarBotones(false,false,true, true);
         }
         else{
              ventana.habilitarCampos(false, false, false, false, false, false);
              ventana.habilitarBotones(false,false,false, false);
      ventana.mostrarDatosDeUsuarioActual();
       ventana.setLocationRelativeTo(this);
       ventana.setVisible(true);
        }
    }//GEN-LAST:event_itemConsultarUsuariosActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       VentanaLogin ventana =  new VentanaLogin(this, true);
       ventana.setLocationRelativeTo(this);
       ventana.setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    private void itemIniciarSesionUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIniciarSesionUsuariosActionPerformed
       formWindowOpened(null);
    }//GEN-LAST:event_itemIniciarSesionUsuariosActionPerformed

    private void itemEditarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarUsuariosActionPerformed
         VentanaUsuarios ventana = new VentanaUsuarios(this,true);
        
         if(Usuario.UsuarioActual == null){
              ventana.habilitarCampos(false, true, true, true, true, true);
              ventana.habilitarBotones(false,false,true, false);
         }
         else{
              ventana.habilitarCampos(false, false, false, false, false, false);
              ventana.habilitarBotones(false,false,false, false);
         }
         ventana.mostrarDatosDeUsuarioActual();
         ventana.setLocationRelativeTo(this);
         ventana.setVisible(true);
    }//GEN-LAST:event_itemEditarUsuariosActionPerformed

    private void itemListadoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListadoUsuariosActionPerformed
        if(Usuario.usuariosGYM == null || Usuario.usuariosGYM.isEmpty()){
          JOptionPane.showMessageDialog(this, "No existe usuarios en el sistema"
          ,"RESULTADO NEGATIVO", JOptionPane.WARNING_MESSAGE);
            return;
      }  
        
        
        VentanaListadoUsuarios ventana = new VentanaListadoUsuarios(this, true);
        
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
        
        
    }//GEN-LAST:event_itemListadoUsuariosActionPerformed

    private void itemEliminarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarUsuariosActionPerformed
         VentanaUsuarios ventana = new VentanaUsuarios(this,true);
         ventana.habilitarCampos(false, true, false, false, true, true);
         if(Usuario.UsuarioActual != null){
              ventana.habilitarBotones(false,false,false, true);
         }
         else{
              ventana.habilitarBotones(false,false,false, false);
         }
         ventana.mostrarDatosDeUsuarioActual();
         ventana.setLocationRelativeTo(this);
         ventana.setVisible(true);
    }//GEN-LAST:event_itemEliminarUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem itemAgregarEntrenador;
    private javax.swing.JMenuItem itemAgregarGimnasio;
    private javax.swing.JMenuItem itemAgregarUsuarios;
    private javax.swing.JMenuItem itemAyuda;
    private javax.swing.JMenuItem itemConsultarEntrenador;
    private javax.swing.JMenuItem itemConsultarGimnasio;
    private javax.swing.JMenuItem itemConsultarRutinas;
    private javax.swing.JMenuItem itemConsultarUsuarios;
    private javax.swing.JMenuItem itemEditarEntrenador;
    private javax.swing.JMenuItem itemEditarGimnasio;
    private javax.swing.JMenuItem itemEditarUsuarios;
    private javax.swing.JMenuItem itemEliminarEntrenador;
    private javax.swing.JMenuItem itemEliminarGimnasio;
    private javax.swing.JMenuItem itemEliminarUsuarios;
    private javax.swing.JMenuItem itemIniciarSesionUsuarios;
    private javax.swing.JMenuItem itemListadoUsuarios;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuEntrenadores;
    private javax.swing.JMenu menuGimnasios;
    private javax.swing.JMenu menuRutinas;
    private javax.swing.JMenu menuUsuarios;
    // End of variables declaration//GEN-END:variables
}
