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
import static monarca.VerInstructores.idNowModifyInst;
import static monarca.mainAdmin.rightPanelAdmin;

public class ModificarInstructorP3 extends javax.swing.JPanel {
 public static int inicial = 0;
 public static String celular;
    public ModificarInstructorP3() {
        initComponents();

        lblInstructorId.setVisible(false);
        
        SiRol.setVisible(false);
        
        SiUsuario.setVisible(false);
        usuarioMal.setVisible(false);
        usuarioMalNoNumeros.setVisible(false);
        usuarioRequerido.setVisible(false);
        
     
/////////////////
  try {
            
            Connection c = con.conectar();
            ResultSet rs;
            PreparedStatement ps;
             int numcontrol= Integer.parseInt(idNowModifyInst);
            ps = c.prepareStatement("SELECT * FROM `usuarios` WHERE id=?");
            ps.setInt(1,numcontrol);
            rs= ps.executeQuery();
            
            if(rs.next()){
                
                cbRol.setSelectedItem(rs.getString("rol"));
                
                txtusuario.setText(rs.getString("usuario"));
  
            }
  
  }
            
            // TODO add your handling code here:
         catch (SQLException ex) {
            Logger.getLogger(ModificarAlumno.class.getName()).log(Level.SEVERE, null, ex);
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
        btnAnteriorP3 = new javax.swing.JButton();
        back1 = new javax.swing.JPanel();
        TitlePanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblInstructorId1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnContinuarP3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        cbRol = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        usuarioRequerido = new javax.swing.JLabel();
        SiRol = new javax.swing.JLabel();
        SiUsuario = new javax.swing.JLabel();
        usuarioMalNoNumeros = new javax.swing.JLabel();
        usuarioMal = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setPreferredSize(new java.awt.Dimension(970, 720));
        back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitlePanel.setBackground(new java.awt.Color(121, 72, 221));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modificación de Instructor");

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitlePanelLayout.createSequentialGroup()
                .addContainerGap(377, Short.MAX_VALUE)
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

        btnAnteriorP3.setBackground(new java.awt.Color(153, 153, 153));
        btnAnteriorP3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAnteriorP3.setText("ANTERIOR");
        btnAnteriorP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorP3ActionPerformed(evt);
            }
        });
        back.add(btnAnteriorP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 640, 200, 40));

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

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel14.setText("Información de la cuenta");
        back1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, -1, -1));

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
        back1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, -1, -1));

        txtusuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtusuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtusuarioFocusLost(evt);
            }
        });
        back1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 220, 30));

        cbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Instructor", "Administrador General" }));
        cbRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRolActionPerformed(evt);
            }
        });
        back1.add(cbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 220, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Nombre de usuario");
        back1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, -1, -1));

        usuarioRequerido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        usuarioRequerido.setForeground(java.awt.Color.red);
        usuarioRequerido.setText("Este campo es requerido");
        back1.add(usuarioRequerido, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 240, 70));

        SiRol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Ok_30px.png"))); // NOI18N
        back1.add(SiRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 50, 40));

        SiUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Ok_30px.png"))); // NOI18N
        back1.add(SiUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 50, 40));

        usuarioMalNoNumeros.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        usuarioMalNoNumeros.setForeground(java.awt.Color.red);
        usuarioMalNoNumeros.setText("Ingresa el nombre de usuario sin números por favor\n");
        back1.add(usuarioMalNoNumeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 320, 70));

        usuarioMal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Cancel_30px.png"))); // NOI18N
        back1.add(usuarioMal, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 50, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Información de la cuenta");
        back1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, -1, -1));

        jProgressBar1.setValue(70);
        back1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 980, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Información de contacto");
        back1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Información personal");
        back1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

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
            ModificarInstructorP2 articulos = new ModificarInstructorP2();
                articulos.setSize(1070,730);
                articulos.setLocation(0, 0);

                rightPanelAdmin.removeAll();
                rightPanelAdmin.add(articulos, BorderLayout.CENTER);
                rightPanelAdmin.revalidate();
                rightPanelAdmin.repaint();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnteriorP3ActionPerformed

    private void cbRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRolActionPerformed

    private void txtusuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusuarioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioFocusLost

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ModificarInstructorP3 articulos = new ModificarInstructorP3();
        articulos.setSize(1070,730);
        articulos.setLocation(0, 0);

        rightPanelAdmin.removeAll();
        rightPanelAdmin.add(articulos, BorderLayout.CENTER);
        rightPanelAdmin.revalidate();
        rightPanelAdmin.repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnContinuarP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarP3ActionPerformed
        String usuario = txtusuario.getText();

        ValidarUsuario(usuario);

        try {
            Connection c = con.conectar();
            ResultSet rs;
            PreparedStatement ps;

            PreparedStatement modificarUsuario = c.prepareStatement("UPDATE usuarios SET usuario=?, rol =? WHERE id=?");

            modificarUsuario.setString(1, txtusuario.getText());
            modificarUsuario.setString(2, cbRol.getSelectedItem().toString());
            modificarUsuario.setString(3, idNowModifyInst);

            modificarUsuario.execute();
            modificarUsuario.close();
            System.err.println("MODIFICADO");
           //JOptionPane.showMessageDialog(null, "Modificado");

        } catch (SQLException ex) {
            System.out.println("error al guardar los datos: " + ex);
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        } finally {
            con.desconectar();
        }

        VerInstructores articulos = new VerInstructores();
        articulos.setSize(1070,730);
        articulos.setLocation(0, 0);

        rightPanelAdmin.removeAll();
        rightPanelAdmin.add(articulos, BorderLayout.CENTER);
        rightPanelAdmin.revalidate();
        rightPanelAdmin.repaint();

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
         // JOptionPane.showMessageDialog(null, "No Numeros");  
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
     
     
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup AlergiasGroup;
    private javax.swing.ButtonGroup DeporteGroup;
    private javax.swing.ButtonGroup EnfermedadesGroup;
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
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    public javax.swing.JLabel lblInstructorId;
    public javax.swing.JLabel lblInstructorId1;
    private javax.swing.JTextField txtusuario;
    private javax.swing.JLabel usuarioMal;
    private javax.swing.JLabel usuarioMalNoNumeros;
    private javax.swing.JLabel usuarioRequerido;
    // End of variables declaration//GEN-END:variables
}
