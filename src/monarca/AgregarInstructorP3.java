package monarca;

import db.ConexionBD;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static monarca.AgregarInstructor.labelIDInstructor;
import static monarca.mainAdmin.rightPanelAdmin;

public class AgregarInstructorP3 extends javax.swing.JPanel {
 public static int inicial = 0;
 public static String celular;
    public AgregarInstructorP3() {
        initComponents();

        lblInstructorId.setVisible(false);
        
        SiRol.setVisible(false);
        
        SiUsuario.setVisible(false);
        usuarioMal.setVisible(false);
        usuarioMalNoNumeros.setVisible(false);
        usuarioRequerido.setVisible(false);
        
        SiPass.setVisible(false);
        passMal.setVisible(false);   
        passRequerida.setVisible(false);  
        
        SiPassCheck.setVisible(false);  
        passCheckMal.setVisible(false);  
        passCheckRequerida.setVisible(false); 
        
        NoIguales.setVisible(false);  
/////////////////
  try {
            
            Connection c = con.conectar();
            ResultSet rs;
            PreparedStatement ps;
            //CREAS USUARIO
            
             
            
            
            
            ps = c.prepareStatement("SELECT * FROM `instructores` ORDER BY `id` DESC LIMIT 1");
            
            rs= ps.executeQuery();
            
            if(rs.next()){
//                if(rs.getString("direccion")!=null){
//                    inicial=1;
//                    txtaDireccion.setText(rs.getString("direccion"));
//                    txtTutor1.setText(rs.getString("nombre_tutor"));
//                    cbParentesco.setSelectedItem(rs.getString("parentesco"));
//                    txtTelefono1.setText(rs.getString("tutor_celular"));
//                    
//                    //Validar 
//                    
//                    VerificaDomicilio( txtaDireccion.getText());
//                    VerificaTelefono(txtTelefono1.getText());
//                    VerificarTutor(txtTutor1.getText());
//                    SiParentesco.setVisible(true);
//                   }
            }}
            
            // TODO add your handling code here:
         catch (SQLException ex) {
            Logger.getLogger(AgregarAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    ConexionBD con = new ConexionBD();
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DeporteGroup = new javax.swing.ButtonGroup();
        AlergiasGroup = new javax.swing.ButtonGroup();
        EnfermedadesGroup = new javax.swing.ButtonGroup();
        back = new javax.swing.JPanel();
        TitlePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblInstructorId = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        btnAnteriorP3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        back1 = new javax.swing.JPanel();
        TitlePanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblInstructorId1 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel14 = new javax.swing.JLabel();
        btnContinuarP3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        cbRol = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        txtpasswordCheck = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        passRequerida = new javax.swing.JLabel();
        passCheckRequerida = new javax.swing.JLabel();
        usuarioRequerido = new javax.swing.JLabel();
        SiPassCheck = new javax.swing.JLabel();
        SiPass = new javax.swing.JLabel();
        SiRol = new javax.swing.JLabel();
        SiUsuario = new javax.swing.JLabel();
        usuarioMalNoNumeros = new javax.swing.JLabel();
        usuarioMal = new javax.swing.JLabel();
        NoIguales = new javax.swing.JLabel();
        passCheckMal = new javax.swing.JLabel();
        passMal = new javax.swing.JLabel();

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setPreferredSize(new java.awt.Dimension(970, 720));
        back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitlePanel.setBackground(new java.awt.Color(121, 72, 221));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inscripción de Instructor");

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitlePanelLayout.createSequentialGroup()
                .addContainerGap(393, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(418, 418, 418))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        back.add(TitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1070, 70));
        back.add(lblInstructorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 10));

        jProgressBar1.setValue(54);
        back.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 980, 20));

        btnAnteriorP3.setBackground(new java.awt.Color(153, 153, 153));
        btnAnteriorP3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAnteriorP3.setText("ANTERIOR");
        btnAnteriorP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorP3ActionPerformed(evt);
            }
        });
        back.add(btnAnteriorP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 640, 200, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Información personal");
        back.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Información de contacto");
        back.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Información de la cuenta");
        back.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Huella Digital");
        back.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, -1, -1));

        back1.setBackground(new java.awt.Color(255, 255, 255));
        back1.setPreferredSize(new java.awt.Dimension(970, 720));
        back1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitlePanel1.setBackground(new java.awt.Color(121, 72, 221));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inscripción de Instructor");

        javax.swing.GroupLayout TitlePanel1Layout = new javax.swing.GroupLayout(TitlePanel1);
        TitlePanel1.setLayout(TitlePanel1Layout);
        TitlePanel1Layout.setHorizontalGroup(
            TitlePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitlePanel1Layout.createSequentialGroup()
                .addContainerGap(393, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(418, 418, 418))
        );
        TitlePanel1Layout.setVerticalGroup(
            TitlePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        back1.add(TitlePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1070, 70));
        back1.add(lblInstructorId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 10));

        jProgressBar2.setValue(20);
        back1.add(jProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 980, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel14.setText("Información de la cuenta");
        back1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        btnContinuarP3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnContinuarP3.setText("CONTINUAR");
        btnContinuarP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarP3ActionPerformed(evt);
            }
        });
        back1.add(btnContinuarP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 640, 270, 40));

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("ANTERIOR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        back1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 640, 200, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Encargo:");
        back1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        txtusuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtusuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtusuarioFocusLost(evt);
            }
        });
        back1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 220, 30));

        cbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Instructor", "Instructor y Administrador de Finanzas", "Administrsador General" }));
        back1.add(cbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 220, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Nombre de usuario");
        back1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Contraseña:");
        back1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, -1, -1));

        txtpassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 220, 30));

        txtpasswordCheck.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back1.add(txtpasswordCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, 220, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Comprobar contraseña:");
        back1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, -1, -1));

        passRequerida.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        passRequerida.setForeground(java.awt.Color.red);
        passRequerida.setText("Este campo es requerido");
        back1.add(passRequerida, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 240, 70));

        passCheckRequerida.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        passCheckRequerida.setForeground(java.awt.Color.red);
        passCheckRequerida.setText("Este campo es requerido");
        back1.add(passCheckRequerida, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 570, 240, 70));

        usuarioRequerido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        usuarioRequerido.setForeground(java.awt.Color.red);
        usuarioRequerido.setText("Este campo es requerido");
        back1.add(usuarioRequerido, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 240, 70));

        SiPassCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Ok_30px.png"))); // NOI18N
        back1.add(SiPassCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 550, 50, 40));

        SiPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Ok_30px.png"))); // NOI18N
        back1.add(SiPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 50, 40));

        SiRol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Ok_30px.png"))); // NOI18N
        back1.add(SiRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 50, 40));

        SiUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Ok_30px.png"))); // NOI18N
        back1.add(SiUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 50, 40));

        usuarioMalNoNumeros.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        usuarioMalNoNumeros.setForeground(java.awt.Color.red);
        usuarioMalNoNumeros.setText("Ingresa el nombre de usuario sin números por favor\n");
        back1.add(usuarioMalNoNumeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 320, 70));

        usuarioMal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Cancel_30px.png"))); // NOI18N
        back1.add(usuarioMal, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 50, 40));

        NoIguales.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NoIguales.setForeground(java.awt.Color.red);
        NoIguales.setText("Las contraseñas no coinciden");
        back1.add(NoIguales, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 570, 240, 70));

        passCheckMal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Cancel_30px.png"))); // NOI18N
        back1.add(passCheckMal, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, 50, 40));

        passMal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Cancel_30px.png"))); // NOI18N
        back1.add(passMal, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 50, 40));

        back.add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 1081, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnteriorP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorP3ActionPerformed
            //SELECT * FROM `usuario` ORDER BY `id` DESC LIMIT 1
            AgregarAlumnoP2 articulos = new AgregarAlumnoP2();
                articulos.setSize(1070,730);
                articulos.setLocation(0, 0);

                rightPanelAdmin.removeAll();
                rightPanelAdmin.add(articulos, BorderLayout.CENTER);
                rightPanelAdmin.revalidate();
                rightPanelAdmin.repaint();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnteriorP3ActionPerformed

    private void txtusuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusuarioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioFocusLost

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                AgregarInstructorP3 articulos = new AgregarInstructorP3();
                articulos.setSize(1070,730);
                articulos.setLocation(0, 0);

                rightPanelAdmin.removeAll();
                rightPanelAdmin.add(articulos, BorderLayout.CENTER);
                rightPanelAdmin.revalidate();
                rightPanelAdmin.repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnContinuarP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarP3ActionPerformed
        String usuario = txtusuario.getText();
        String password = txtpassword.getText();
        String passwordCheck = txtpasswordCheck.getText();
          
      

        ValidarUsuario(usuario);   
        ValidarContraseña(password,passwordCheck);   
            
        //Modificar
        if ( txtpassword.getText().equals(txtpasswordCheck.getText())
            && !usuario.isEmpty() 
            && !password.isEmpty() 
            && !passwordCheck.isEmpty()
            && SiUsuario.isVisible()
            && SiPass.isVisible()
            && SiPassCheck.isVisible() 
        ){
 
            try {
                Connection c = con.conectar();
                ResultSet rs;
                PreparedStatement ps;

                PreparedStatement modificarUsuario = c.prepareStatement("UPDATE usuarios SET usuario=?, pass =?, rol =? WHERE id=?");

                modificarUsuario.setString(1, txtusuario.getText());
                modificarUsuario.setString(2, txtpassword.getText());
                modificarUsuario.setString(3, cbRol.getSelectedItem().toString());
                modificarUsuario.setString(4, labelIDInstructor.getText());

                modificarUsuario.execute();
                modificarUsuario.close();
                System.err.println("MODIFICADO");
                JOptionPane.showMessageDialog(null, "Modificado");

            } catch (SQLException ex) {
                System.out.println("error al guardar los datos: " + ex);
                JOptionPane.showMessageDialog(null, "Error al guardar los datos");
            } finally {
                con.desconectar();
            }

            AgregarInstructorP3 articulos = new AgregarInstructorP3();
            articulos.setSize(1070,730);
            articulos.setLocation(0, 0);

            rightPanelAdmin.removeAll();
            rightPanelAdmin.add(articulos, BorderLayout.CENTER);
            rightPanelAdmin.revalidate();
            rightPanelAdmin.repaint();
    }
    }//GEN-LAST:event_btnContinuarP3ActionPerformed

    
      void agregarUsuarioBD(String usuario, String pass, String rol) {

        try {
            Connection c = con.conectar();
            PreparedStatement agregarAlumno = c.prepareStatement("INSERT INTO usuarios (usuario,pass,rol_id,instructor) "
                    + "VALUES (?,?,?,?)");

//            agregarAlumno.setString(1, nombre);
//            agregarAlumno.setString(2, aPaterno);
//            agregarAlumno.setString(3, aMaterno);
//            agregarAlumno.setString(4, fNacimiento);
//           

            agregarAlumno.execute();
            agregarAlumno.close();
            JOptionPane.showMessageDialog(null, "Alumno guardado correctamente");
        } catch (SQLException ex) {
            System.out.println("error al guardar los datos: " + ex);
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        } finally {
            con.desconectar();
        }
    }

    
    
     void ValidarUsuario(String usuario){
    
      if(usuario.contains("1")
          ||usuario.contains("2")
          ||usuario.contains("3")
          ||usuario.contains("4")
          ||usuario.contains("5")
          ||usuario.contains("6") 
          ||usuario.contains("7") 
          ||usuario.contains("8") 
          ||usuario.contains("9") 
          ||usuario.contains("10")
    ){
          //Sin numeros
//            JOptionPane.showMessageDialog(null, "Numeros");  
          usuarioMal.setVisible(true);
             usuarioMalNoNumeros.setVisible(true);
             SiUsuario.setVisible(false);
             usuarioRequerido.setVisible(false);
             
        } else{
          JOptionPane.showMessageDialog(null, "No Numeros");  
            if(usuario.isEmpty()){
                usuarioMal.setVisible(false);
                usuarioMalNoNumeros.setVisible(false);
                SiUsuario.setVisible(false);
                usuarioRequerido.setVisible(true);
            }
            else{
            
             usuarioMal.setVisible(false);
             usuarioMalNoNumeros.setVisible(false);
             SiUsuario.setVisible(true);
             usuarioRequerido.setVisible(false);
            }
         }
    
    }
     
     
     void ValidarContraseña(String pass, String passCheck){
        
         if (pass.isEmpty()){
            passRequerida.setVisible(true);
        }
         else if (passCheck.isEmpty()){
            passCheckRequerida.setVisible(true);
        } else {
            if ( txtpassword.getText().equals(txtpasswordCheck.getText())){
               passMal.setVisible(true);
            passMal.setVisible(false);
            passCheckMal.setVisible(false);
            NoIguales.setVisible(false);
            passRequerida.setVisible(false); 
            passCheckRequerida.setVisible(false);
            SiPass.setVisible(true);
            SiPassCheck.setVisible(true);
            }
            else{
            //no coinciden
            passMal.setVisible(true);
            passCheckMal.setVisible(true);
            NoIguales.setVisible(true);
            passRequerida.setVisible(false); 
            passCheckRequerida.setVisible(false);
            SiPass.setVisible(false);
            SiPassCheck.setVisible(false);
              
            }
            
        }
    }
    
    
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup AlergiasGroup;
    private javax.swing.ButtonGroup DeporteGroup;
    private javax.swing.ButtonGroup EnfermedadesGroup;
    private javax.swing.JLabel NoIguales;
    private javax.swing.JLabel SiPass;
    private javax.swing.JLabel SiPassCheck;
    private javax.swing.JLabel SiRol;
    private javax.swing.JLabel SiUsuario;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JPanel TitlePanel1;
    private javax.swing.JPanel back;
    private javax.swing.JPanel back1;
    private javax.swing.JButton btnAnteriorP3;
    private javax.swing.JButton btnContinuarP3;
    private javax.swing.JComboBox<String> cbRol;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    public javax.swing.JLabel lblInstructorId;
    public javax.swing.JLabel lblInstructorId1;
    private javax.swing.JLabel passCheckMal;
    private javax.swing.JLabel passCheckRequerida;
    private javax.swing.JLabel passMal;
    private javax.swing.JLabel passRequerida;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JPasswordField txtpasswordCheck;
    private javax.swing.JTextField txtusuario;
    private javax.swing.JLabel usuarioMal;
    private javax.swing.JLabel usuarioMalNoNumeros;
    private javax.swing.JLabel usuarioRequerido;
    // End of variables declaration//GEN-END:variables
}
