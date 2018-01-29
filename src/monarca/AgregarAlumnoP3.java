package monarca;

import db.ConexionBD;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static monarca.AgregarAlumno.labelID;
import static monarca.AgregarAlumnoP2.inicial;
import static monarca.mainAmbos.rightPanel;
import static monarca.mainAdmin.rightPanelAdmin;

public class AgregarAlumnoP3 extends javax.swing.JPanel {
 public static int inicial = 0;
    public AgregarAlumnoP3() {
        initComponents();

        lblInstructorId.setVisible(false);
        lblDeporte.setVisible(false);
        txtDeporte.setVisible(false);  
        Verifique.setVisible(false);
        Necesario.setVisible(false);
        SiDeporte.setVisible(false);
        NoDeporte.setVisible(false);

      try {

        Connection c = con.conectar();
        ResultSet rs;
        PreparedStatement ps;
        ps = c.prepareStatement("SELECT * FROM `alumnos` ORDER BY `id` DESC LIMIT 1");

        rs= ps.executeQuery();

        if(rs.next()){
            if(rs.getString("deportes")!=null){
                inicial=1;
               
                cbCinta.setSelectedItem(rs.getString("cinta"));
                txtDeporte.setText(rs.getString("deportes"));
                SiCinta.setVisible(true);
                
                if(txtDeporte.getText().equals("Ninguno")){
                    rbDeporteNo.setSelected(true);
                   
                }else {
                     //Si tiene "si"
                     rbDeporteSi.setSelected(true);
                    lblDeporte.setVisible(true);
                    txtDeporte.setVisible(true);
                   
                    
                }

               }
        }}

        // TODO add your handling code here:
     catch (SQLException ex) {
        Logger.getLogger(AgregarAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jLabel7 = new javax.swing.JLabel();
        lblInstructorId = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cbCinta = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        rbDeporteNo = new javax.swing.JRadioButton();
        rbDeporteSi = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblDeporte = new javax.swing.JLabel();
        txtDeporte = new javax.swing.JTextField();
        SiDeporte = new javax.swing.JLabel();
        NoDeporte = new javax.swing.JLabel();
        Verifique = new javax.swing.JLabel();
        Necesario = new javax.swing.JLabel();
        SiCinta = new javax.swing.JLabel();

        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setPreferredSize(new java.awt.Dimension(970, 720));
        back.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                backFocusLost(evt);
            }
        });
        back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitlePanel.setBackground(new java.awt.Color(121, 72, 221));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inscripción de alumno");

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(356, 356, 356)
                .addComponent(jLabel1)
                .addContainerGap(482, Short.MAX_VALUE))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        back.add(TitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1070, 70));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Huella Digital");
        back.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 130, -1, -1));
        back.add(lblInstructorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 10));

        jProgressBar1.setValue(43);
        back.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 980, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Información personal");
        back.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Información de contacto");
        back.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Información deportiva");
        back.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Información médica");
        back.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel13.setText("Información deportiva");
        back.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Grado de cinta actual del alumno");
        back.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 210, 20));

        cbCinta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blanca", "Blanca Avanzada", "Amarilla", "Amarilla Avanzada", "Verde", "Verde Avanzada", "Azul", "Azul Avanzada", "Roja", "Roja Avanzada", "Negra" }));
        back.add(cbCinta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 200, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("¿El alumno practica otro deporte?");
        back.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, -1, 30));

        rbDeporteNo.setBackground(new java.awt.Color(255, 255, 255));
        DeporteGroup.add(rbDeporteNo);
        rbDeporteNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbDeporteNo.setSelected(true);
        rbDeporteNo.setText("No");
        rbDeporteNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDeporteNoActionPerformed(evt);
            }
        });
        back.add(rbDeporteNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, -1, -1));

        rbDeporteSi.setBackground(new java.awt.Color(255, 255, 255));
        DeporteGroup.add(rbDeporteSi);
        rbDeporteSi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbDeporteSi.setText("Sí");
        rbDeporteSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDeporteSiActionPerformed(evt);
            }
        });
        back.add(rbDeporteSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("CONTINUAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        back.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 640, 270, 40));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("ANTERIOR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        back.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 640, 200, 40));

        lblDeporte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDeporte.setText("¿Cuál?");
        back.add(lblDeporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, -1, -1));

        txtDeporte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDeporte.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDeporteFocusLost(evt);
            }
        });
        txtDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeporteActionPerformed(evt);
            }
        });
        back.add(txtDeporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 550, 220, 30));

        SiDeporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Ok_30px.png"))); // NOI18N
        back.add(SiDeporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, 50, 40));

        NoDeporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Cancel_30px.png"))); // NOI18N
        back.add(NoDeporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 540, 50, 40));

        Verifique.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Verifique.setForeground(java.awt.Color.red);
        Verifique.setText("Verifique el nombre del deporte ingresado");
        back.add(Verifique, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 570, 240, 50));

        Necesario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Necesario.setForeground(java.awt.Color.red);
        Necesario.setText("Este campo es requerido");
        back.add(Necesario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 570, 240, 50));

        SiCinta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Ok_30px.png"))); // NOI18N
        back.add(SiCinta, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 1091, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rbDeporteNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDeporteNoActionPerformed
        lblDeporte.setVisible(false);
        txtDeporte.setVisible(false);   
        SiDeporte.setVisible(false);   
        NoDeporte.setVisible(false);   
        Verifique.setVisible(false);
        Necesario.setVisible(false); 
    }//GEN-LAST:event_rbDeporteNoActionPerformed

    private void rbDeporteSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDeporteSiActionPerformed
    lblDeporte.setVisible(true);
        txtDeporte.setVisible(true);    
        txtDeporte.setText("");
        
        
    }//GEN-LAST:event_rbDeporteSiActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try { 
            String deporteFile = txtDeporte.getText();
            
            Connection c = con.conectar();
            ResultSet rs;
            PreparedStatement ps;
            String deporte = null;

            if (rbDeporteNo.isSelected()==true){
                    deporte="Ninguno";
                      PreparedStatement modificarAlumno = c.prepareStatement("UPDATE alumnos SET cinta=?, deportes =? WHERE id=?");


                    modificarAlumno.setString(1, cbCinta.getSelectedItem().toString());
                    modificarAlumno.setString(2, deporte);
                    modificarAlumno.setString(3, labelID.getText());

                    modificarAlumno.execute();
                    modificarAlumno.close(); 
                    AgregarAlumnoP4 articulos = new AgregarAlumnoP4();
                            articulos.setSize(1070,730);
                            articulos.setLocation(0, 0);

                            rightPanelAdmin.removeAll();
                            rightPanelAdmin.add(articulos, BorderLayout.CENTER);
                            rightPanelAdmin.revalidate();
                            rightPanelAdmin.repaint();
                    
                    
                    
                    
            } else{
                    deporte=txtDeporte.getText();
            }

            if (rbDeporteSi.isSelected()){
                if (deporteFile.isEmpty()){
                    Necesario.setVisible(true);
                }else{
                    
                     if(deporte.matches("[a-zA-ZáéíóúÁÉÍÓÚÜüñÑ ]*")){
                          SiDeporte.setVisible(true);
                           Verifique.setVisible(false);
                   NoDeporte.setVisible(false);
                     Necesario.setVisible(false);
                      
                         PreparedStatement modificarAlumno = c.prepareStatement("UPDATE alumnos SET cinta=?, deportes =? WHERE id=?");


                    modificarAlumno.setString(1, cbCinta.getSelectedItem().toString());
                    modificarAlumno.setString(2, deporte);
                    modificarAlumno.setString(3, labelID.getText());

                    modificarAlumno.execute();
                    modificarAlumno.close();
//                   
                             AgregarAlumnoP4 articulos = new AgregarAlumnoP4();
                            articulos.setSize(1070,730);
                            articulos.setLocation(0, 0);

                            rightPanelAdmin.removeAll();
                            rightPanelAdmin.add(articulos, BorderLayout.CENTER);
                            rightPanelAdmin.revalidate();
                            rightPanelAdmin.repaint();
                    
                    }
                    else{
                   Verifique.setVisible(true);
                   NoDeporte.setVisible(true);
                     Necesario.setVisible(false);
                      SiDeporte.setVisible(false);

                }}
            }
               
        } catch (SQLException ex) {
            System.out.println("error al guardar los datos: " + ex);
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        } finally {
            con.desconectar();
        }
        
//        

        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        AgregarAlumnoP2 articulos = new AgregarAlumnoP2();
        articulos.setSize(1070,730);
        articulos.setLocation(0, 0);

        rightPanelAdmin.removeAll();
        rightPanelAdmin.add(articulos, BorderLayout.CENTER);
        rightPanelAdmin.revalidate();
        rightPanelAdmin.repaint();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtDeporteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDeporteFocusLost

        if (txtDeporte.getText().isEmpty()){
            Necesario.setVisible(true);
            SiDeporte.setVisible(false);
            Verifique.setVisible(false);
            NoDeporte.setVisible(false);
        }else{
            if(txtDeporte.getText().matches("[a-zA-ZáéíóúÁÉÍÓÚÜüñÑ ]*")){
                SiDeporte.setVisible(true);
                Verifique.setVisible(false);
                NoDeporte.setVisible(false);
                Necesario.setVisible(false);
            }else{
                SiDeporte.setVisible(false);
                Verifique.setVisible(true);
                NoDeporte.setVisible(true);
                Necesario.setVisible(false);

            }
        }

       
    }//GEN-LAST:event_txtDeporteFocusLost

    private void txtDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeporteActionPerformed

    private void backFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_backFocusLost

JOptionPane.showMessageDialog(null, "Los datos se perderán");
        // TODO add your handling code here:
    }//GEN-LAST:event_backFocusLost

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
JOptionPane.showMessageDialog(null, "Error al guardar los datos2");        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusLost

    
    ConexionBD con = new ConexionBD();
    
     void agregarAlumnoBD(String nombre, String aPaterno, String aMaterno,
            String fNacimiento, float peso, float altura,
            String tSangre, String direccion, String cinta,
            String tutor, String parentesco, String tCelular,
            String alergias, String enfermedades, String deporte,
            int instructor) {

        try {
            Connection c = con.conectar();
            PreparedStatement agregarAlumno = c.prepareStatement("INSERT INTO  alumnos (nombre,a_paterno,a_materno,fecha_nacimiento,"
                    + "peso,t_sangre,altura,direccion,cinta,nombre_tutor,"
                    + "parentesco,tutor_celular,alrgias,enfermedades,deportes,"
                    + "instructor_id) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            agregarAlumno.setString(1, nombre);
            agregarAlumno.setString(2, aPaterno);
            agregarAlumno.setString(3, aMaterno);
            agregarAlumno.setString(4, fNacimiento);
            agregarAlumno.setFloat(5, peso);
            agregarAlumno.setString(6, tSangre);
            agregarAlumno.setFloat(7, altura);
            agregarAlumno.setString(8, direccion);
            agregarAlumno.setString(9, cinta);
            agregarAlumno.setString(10, tutor);
            agregarAlumno.setString(11, parentesco);
            agregarAlumno.setString(12, tCelular);
            agregarAlumno.setString(13, alergias);
            agregarAlumno.setString(14, enfermedades);
            agregarAlumno.setString(15, deporte);
            agregarAlumno.setInt(16, instructor);

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

    void vaciar() {
     
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup AlergiasGroup;
    private javax.swing.ButtonGroup DeporteGroup;
    private javax.swing.ButtonGroup EnfermedadesGroup;
    private javax.swing.JLabel Necesario;
    private javax.swing.JLabel NoDeporte;
    private javax.swing.JLabel SiCinta;
    private javax.swing.JLabel SiDeporte;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JLabel Verifique;
    private javax.swing.JPanel back;
    private javax.swing.JComboBox<String> cbCinta;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblDeporte;
    public javax.swing.JLabel lblInstructorId;
    private javax.swing.JRadioButton rbDeporteNo;
    private javax.swing.JRadioButton rbDeporteSi;
    private javax.swing.JTextField txtDeporte;
    // End of variables declaration//GEN-END:variables
}
