/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package co.edu.udec.poo4.Ventanas;

import co.edu.udec.poo4.model.entidades.Usuario;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author altoc
 */
public class VentanaUsuarios extends javax.swing.JDialog {

        Usuario usuario;
    /**
     * Creates new form VentanaUsuarios
     */
    public VentanaUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        campoApellido = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        botonCancelar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        campoClave = new javax.swing.JPasswordField();
        botonEditar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FORMULARIO");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo4/Ventanas/Iconos/Usuarios-128px.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("FORMULARIO PARA GESTIONAR USUARIO");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 3, true), "  Datos del Usuario:  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 204, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("CEDULA:");

        campoCedula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoCedula.setPreferredSize(new java.awt.Dimension(70, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("PASSWORD:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("NOMBRE:");

        campoNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoNombre.setPreferredSize(new java.awt.Dimension(70, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("APELLIDO:");

        campoApellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoApellido.setPreferredSize(new java.awt.Dimension(70, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("EMAIL:");

        campoEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoEmail.setPreferredSize(new java.awt.Dimension(70, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("TELEFONO:");

        campoTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoTelefono.setPreferredSize(new java.awt.Dimension(70, 30));

        botonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo4/Ventanas/Iconos/exit-32px.png"))); // NOI18N
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo4/Ventanas/Iconos/Save-32px.png"))); // NOI18N
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        campoClave.setPreferredSize(new java.awt.Dimension(70, 30));

        botonEditar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo4/Ventanas/Iconos/Save2-32px.png"))); // NOI18N
        botonEditar.setEnabled(false);
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        botonBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo4/Ventanas/Iconos/find-32px.png"))); // NOI18N
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        botonEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo4/Ventanas/Iconos/Delete-file-32px.png"))); // NOI18N
        botonEliminar.setEnabled(false);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonCancelar)
                        .addGap(40, 40, 40)
                        .addComponent(botonEliminar)
                        .addGap(40, 40, 40)
                        .addComponent(botonEditar)
                        .addGap(40, 40, 40)
                        .addComponent(botonBuscar)
                        .addGap(40, 40, 40)
                        .addComponent(botonGuardar)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoClave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        //recuperar los datos ingresados en los campos de VentanaUsuarios
        String cedula = campoCedula.getText();
        char[] clave = campoClave.getPassword();
        String nombre = campoNombre.getText();
        String apellido = campoApellido.getText();
        String email = campoEmail.getText();
        String telefono = campoTelefono.getText();
        // crear objeto de la variable tipo Usuario
        Usuario u1 = new Usuario();
        
        u1.cedula = cedula;
        String clave1 = String.valueOf(clave);
        u1.password = clave1;
        u1.nombre = nombre;
        u1.apellido = apellido;
        u1.email = email;
        u1.telefono = telefono;
        
        //esto verifica si el diccionario existe
        if(Usuario.usuariosGYM == null){
            
            Usuario.usuariosGYM = new HashMap<String, Usuario>();
            }
        // valida si el diccionario ya tiene usuario adentro
        if(Usuario.usuariosGYM.containsKey(cedula)){
            String msj = "El usuario ya existe con la cedula: "+cedula;
            JOptionPane.showMessageDialog(this, msj);
            LimpiarCampos();
            }
        else{
            // aqui se guarda el usuario en el diccionario
            Usuario.usuariosGYM.put(cedula, u1 );
            if(Usuario.UsuarioActual == null){
                Usuario.UsuarioActual = u1;
            
            }
            //se obtiene cuantos(en numeros) usuarios hay 
            int cuentaUsuarios = Usuario.usuariosGYM.size();
            String msj = "Este usuario fue guardado con exito\n"
                    + "Existen "+cuentaUsuarios + " usuarios.";
            JOptionPane.showMessageDialog(this, msj);
            LimpiarCampos();
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    public void LimpiarCampos(){
        campoCedula.setText("");
        campoClave.setText("");
        campoNombre.setText("");
        campoApellido.setText("");
        campoEmail.setText("");
        campoTelefono.setText("");
        botonEditar.setEnabled(false);
        botonEliminar.setEnabled(false);
    }
    
    
    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
       // botonGuardarActionPerformed(evt);
       
       //validar con el campo cedula tenga algun dato
        if(campoCedula.getText() != null || campoCedula.getText().isEmpty()){
            String msj = "Para editar primero tiene que buscar usuario";
            JOptionPane.showMessageDialog(this, msj);
             LimpiarCampos();
             return;
        }
        if(campoCedula.getText().equals(this.usuario.cedula) != true ){
            String msj = "La cedula no coincide con la cedula del usuario consultado";
            JOptionPane.showMessageDialog(this, msj);
            LimpiarCampos();
            return;
        }
        //obtenermos el usuario desde el diccionario apartir de la cedula 
        this.usuario  = Usuario.usuariosGYM.get(campoCedula.getText());
        //obtenemos  los nuevos datos ingresados desde el formulario 
        String cedula = campoCedula.getText();
        char[] clave = campoClave.getPassword();
        String nombre = campoNombre.getText();
        String apellido = campoApellido.getText();
        String email = campoEmail.getText();
        String telefono = campoTelefono.getText();
        //cambiarle datos al usuario por los datos ingresados en el formulario
        this.usuario.password= String.valueOf(clave);
        this.usuario.nombre = nombre;
        this.usuario.apellido = apellido;
        this.usuario.email = email;
        this.usuario.telefono = telefono;
        //guardar el usuario con los nuevos datos editados
         Usuario.usuariosGYM.put(this.usuario.cedula, usuario );
            //mostrar el mensaje
            String msj = "Este usuario fue modificado con exito";   
            JOptionPane.showMessageDialog(this, msj);
    }//GEN-LAST:event_botonEditarActionPerformed

    
    
    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // recuperar la cedula del formulario
        String cedula = campoCedula.getText();
        //verificar si el diccionario existe o esta vacio
        if(Usuario.usuariosGYM == null || Usuario.usuariosGYM.isEmpty()){
            String msj = "No existe usuario en la base de datos";
            JOptionPane.showMessageDialog(this, msj);
            LimpiarCampos();
                    }
        else{
            //buscar usuario en el diccionario
           if(Usuario.usuariosGYM.containsKey(cedula)){
               this.usuario = Usuario.usuariosGYM.get(cedula);
               campoNombre.setText(this.usuario.cedula);
               campoClave.setText(this.usuario.password);
               campoApellido.setText(this.usuario.apellido);
               campoEmail.setText(this.usuario.email);
               campoTelefono.setText(this.usuario.telefono);
               campoNombre.setText(this.usuario.nombre);
               botonEditar.setEnabled(true);//activar los botones cuando haya bibliotecas guardadas
               botonEliminar.setEnabled(true);//activar los botones cuando haya bibliotecas guardadas, luego de dar click en Guardar
           }
           else{
            String msj = "No existe un usuario con la cedula "+cedula;
            JOptionPane.showMessageDialog(this, msj); 
            LimpiarCampos();}
               
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        
        //aqui lo que hice es generar la ventana para que el usuario cierre o no 
        int opcion = JOptionPane.showConfirmDialog(this,"¿Desea Cerrar?", 
                " OJO ", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE );
        if(opcion == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        //validar con el campo cedula tenga algun dato
        if(campoCedula.getText() == null || campoCedula.getText().isEmpty()){
            String msj = "Para editar primero tiene que buscar usuario";
            JOptionPane.showMessageDialog(this, msj);
             LimpiarCampos();
             return;
        }
        //validar que la cedula en el formulario coincida con la cedula del usuario consultado previamente
        //de lo contrario se muestre el error con el mensaje
        if(campoCedula.getText().equals(this.usuario.cedula) != true ){
            String msj = "La cedula no coincide con la cedula del usuario consultado";
            JOptionPane.showMessageDialog(this, msj);
            LimpiarCampos();
            return;
        }
        String msj = "¿Seguro que desea eliminar este usuario?";
        int respuesta =JOptionPane.showConfirmDialog(this, msj, "CONFIRMAR"
        , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(respuesta == JOptionPane.YES_OPTION){
           Usuario.usuariosGYM.remove(this.usuario.cedula);
           int total = Usuario.usuariosGYM.size();
           String msj2 = "Usuario eliminado con exito \n Total: "+total;
           JOptionPane.showMessageDialog(this, msj2);
           LimpiarCampos();
           usuario.UsuarioActual = null;
                 VentanaLogin ventana =  new VentanaLogin((VentanaPrincipal)this.getOwner(), true);
                 ventana.setLocationRelativeTo(this);
                 ventana.setVisible(true);
                  dispose();
                  if(Usuario.usuariosGYM.isEmpty()){
                      Usuario.usuariosGYM = null;
                        }
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaUsuarios dialog = new VentanaUsuarios(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
      
    }
      public void habilitarCampos (boolean estadoCedula, boolean estadoPassword,
                        boolean estadosNombre, boolean estadoApellido, boolean estadoEmail, boolean estadoTelefono  ) {
          campoCedula.setEditable(estadoCedula);
          campoClave.setEditable(estadoPassword);
          campoNombre.setEditable(estadosNombre);
          campoApellido.setEditable(estadoApellido);
          campoEmail.setEditable(estadoEmail);
          campoTelefono.setEditable(estadoTelefono);

          
      }
      
      public void habilitarBotones(boolean estadoGuardar, boolean estadoBuscar, boolean estadoEditar, boolean estadoEliminar){
            botonGuardar.setEnabled(estadoGuardar);
            botonBuscar.setEnabled(estadoBuscar);
            botonEditar.setEnabled(estadoEditar);
            botonEliminar.setEnabled(estadoEliminar);
      }
      public void mostrarDatosDeUsuarioActual(){
          if(Usuario.UsuarioActual != null){
          
          campoCedula.setText(Usuario.UsuarioActual.cedula);
          campoClave.setText(Usuario.UsuarioActual.password);
          campoNombre.setText(Usuario.UsuarioActual.nombre);
          campoApellido.setText(Usuario.UsuarioActual.apellido);
          campoEmail.setText(Usuario.UsuarioActual.email);
          campoTelefono.setText(Usuario.UsuarioActual.telefono);
                botonBuscar.setEnabled(true);
                botonGuardar.setEnabled(true);
            }
          else {
              habilitarCampos(false,false,false,false,false,false);
              botonBuscar.setEnabled(false);
              botonGuardar.setEnabled(false);

          }
          
          
      }
      
      
  
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JPasswordField campoClave;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
