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
import static monarca.mainAdmin.rightPanelAdmin;

public class AgregarInstructorP2 extends javax.swing.JPanel {
 public static int inicial = 0;
 public static String celular;
  public static String IDInstructor;
    public AgregarInstructorP2() {
        initComponents();
       
        lblInstructorId.setVisible(false);
        NecesitaDirecc.setVisible(false);
        SiDireccion.setVisible(false);
        
        
        TelefonoRequerido.setVisible(false);
        SiTelefono.setVisible(false);
        
      
/////////////////
  try {
            
            Connection c = con.conectar();
            ResultSet rs;
            PreparedStatement ps;
            ps = c.prepareStatement("SELECT * FROM `usuarios` ORDER BY `id` DESC LIMIT 1");
            
            rs= ps.executeQuery();
            
            if(rs.next()){
                if(rs.getString("direccion")!=null){
                    inicial=1;
                    txtaDireccion.setText(rs.getString("direccion"));
                    txtTelefono1.setText(rs.getString("celular"));
                    IDInstructor= rs.getString("id");
                   }
            }}
            
            // TODO add your handling code here:
         catch (SQLException ex) {
            Logger.getLogger(ModificarAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    ConexionBD con = new ConexionBD();
    public static int obtenerId() throws SQLException {
        int id = 0;
        ResultSet rs;
        PreparedStatement ps;
        ConexionBD conn = new ConexionBD();

        Connection c = conn.conectar();
        ps = c.prepareStatement("    SELECT id \n"
                + "FROM usuarios\n"
                + "ORDER BY id DESC\n"
                + "LIMIT 1");

        rs = ps.executeQuery();

        while (rs.next()) {
            id = rs.getInt("id");
        }

        return id;
    }
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
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDireccion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TelefonoRequerido = new javax.swing.JLabel();
        NecesitaDirecc = new javax.swing.JLabel();
        SiDireccion = new javax.swing.JLabel();
        SiTelefono = new javax.swing.JLabel();
        txtTelefono1 = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel13.setText("Información de contacto");
        back.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("CONTINUAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        back.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 640, 270, 40));

        txtaDireccion.setColumns(20);
        txtaDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtaDireccion.setLineWrap(true);
        txtaDireccion.setRows(5);
        txtaDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtaDireccionFocusLost(evt);
            }
        });
        txtaDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtaDireccionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtaDireccion);

        back.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 320, 60));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("(10 dígitos)");
        back.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Domicilio:");
        back.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("ANTERIOR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        back.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 640, 200, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Número telefónico de contacto:");
        back.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, -1, -1));

        TelefonoRequerido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TelefonoRequerido.setForeground(java.awt.Color.red);
        TelefonoRequerido.setText("Este campo es requerido");
        back.add(TelefonoRequerido, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 240, 60));

        NecesitaDirecc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NecesitaDirecc.setForeground(java.awt.Color.red);
        NecesitaDirecc.setText("Este campo es requerido");
        back.add(NecesitaDirecc, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 240, 70));

        SiDireccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Ok_30px.png"))); // NOI18N
        back.add(SiDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 50, 40));

        SiTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Ok_30px.png"))); // NOI18N
        back.add(SiTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 490, 50, 40));

        try {
            txtTelefono1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefono1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefono1FocusLost(evt);
            }
        });
        txtTelefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefono1ActionPerformed(evt);
            }
        });
        back.add(txtTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 210, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Información personal");
        back.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Información de contacto");
        back.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Información de la cuenta");
        back.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Huella Digital");
        back.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, -1, -1));

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

    private void txtTelefono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefono1ActionPerformed

    }//GEN-LAST:event_txtTelefono1ActionPerformed

    private void txtTelefono1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefono1FocusLost
        if(txtTelefono1.getText().length()==14){
            SiTelefono.setVisible(true);
        }
    }//GEN-LAST:event_txtTelefono1FocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //SELECT * FROM `usuario` ORDER BY `id` DESC LIMIT 1
         AgregarInstructor articulos = new AgregarInstructor();
        articulos.setSize(1070,730);
        articulos.setLocation(0, 0);

        rightPanelAdmin.removeAll();
        rightPanelAdmin.add(articulos, BorderLayout.CENTER);
        rightPanelAdmin.revalidate();
        rightPanelAdmin.repaint();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtaDireccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtaDireccionMouseClicked
        NecesitaDirecc.setVisible(false);
    }//GEN-LAST:event_txtaDireccionMouseClicked

    private void txtaDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaDireccionFocusLost

        String domicilio = txtaDireccion.getText();

        VerificaDomicilio(domicilio);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaDireccionFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Modificar
        System.out.println(IDInstructor);
        if(!txtaDireccion.getText().isEmpty() && !txtTelefono1.getText().isEmpty()&& SiTelefono.isVisible()){
            
            try {
                Connection c = con.conectar();
                ResultSet rs;
                PreparedStatement ps;

                try (PreparedStatement modificarAlumno = c.prepareStatement(
                        "UPDATE usuarios SET"
                                + " direccion= ?, celular = ? WHERE id= ?")) {
                    modificarAlumno.setString(1, txtaDireccion.getText());
                    
                    modificarAlumno.setString(2, txtTelefono1.getText());
                    modificarAlumno.setInt(3, obtenerId());
                    
                    modificarAlumno.execute(); 
                    modificarAlumno.close();
                }
                System.err.println("MODIFICADO");
               // JOptionPane.showMessageDialog(null, "Modificado");

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

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    void VerificarTutor(String tutor){
        if(tutor.matches("[a-zA-ZáéíóúÁÉÍÓÚÜüñÑ ]*")){
//            TutorMal.setVisible(false);
//            SiTutor.setVisible(true);
//            NoTutor.setVisible(false);
//            TutorRequer.setVisible(false);
//
//            if(tutor.isEmpty()){
//                TutorMal.setVisible(false);
//                SiTutor.setVisible(false);
//                NoTutor.setVisible(false);
//                TutorRequer.setVisible(true);
//            }
        }else{
//            TutorMal.setVisible(true);
//            SiTutor.setVisible(false);
//            NoTutor.setVisible(true);
//            TutorRequer.setVisible(false);
        }
    }
    
    void VerificaDomicilio(String domicilio){
        if(domicilio.isEmpty()){
             NecesitaDirecc.setVisible(true);
             SiDireccion.setVisible(false);
        }else {
             NecesitaDirecc.setVisible(false);
             SiDireccion.setVisible(true);
         }
    }
    
    void VerificaTelefono(String telefono){
        if(txtTelefono1.getText().length()==14){
            SiTelefono.setVisible(true);
        }
    }
    
    
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup AlergiasGroup;
    private javax.swing.ButtonGroup DeporteGroup;
    private javax.swing.ButtonGroup EnfermedadesGroup;
    private javax.swing.JLabel NecesitaDirecc;
    private javax.swing.JLabel SiDireccion;
    private javax.swing.JLabel SiTelefono;
    private javax.swing.JLabel TelefonoRequerido;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JPanel back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblInstructorId;
    private javax.swing.JFormattedTextField txtTelefono1;
    private javax.swing.JTextArea txtaDireccion;
    // End of variables declaration//GEN-END:variables
}

