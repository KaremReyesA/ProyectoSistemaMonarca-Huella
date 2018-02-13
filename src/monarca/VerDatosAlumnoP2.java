package monarca;

import db.ConexionBD;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static monarca.VerDatosAlumno.idNow;
import static monarca.mainAmbos.rightPanel;
import static monarca.mainAdmin.rightPanelAdmin;


public class VerDatosAlumnoP2 extends javax.swing.JPanel {

    public VerDatosAlumnoP2() {
        initComponents();

        lblInstructorId.setVisible(false);
        
        btnPersonal.setOpaque(false);
        btnPersonal.setContentAreaFilled(false);
        btnPersonal.setBorderPainted(false);
        
        btnContacto.setOpaque(false);
        btnContacto.setContentAreaFilled(false);
        btnContacto.setBorderPainted(false);
        
        btnDeporte.setOpaque(false);
        btnDeporte.setContentAreaFilled(false);
        btnDeporte.setBorderPainted(false);
        
        
        btnMédica.setOpaque(false);
        btnMédica.setContentAreaFilled(false);
        btnMédica.setBorderPainted(false);
        
      
     
       try {
            
            Connection c = con.conectar();
            ResultSet rs;
            PreparedStatement ps;
          
            int numcontrol= Integer.parseInt(idNow);
             //Alumno existente
            ps = c.prepareStatement("SELECT * FROM `alumnos` WHERE id=?");
            ps.setInt(1,numcontrol);
            rs= ps.executeQuery();
 
            if(rs.next()){
                lblDomicilio.setText(rs.getString("direccion"));
                lblTutor.setText(rs.getString("nombre_tutor"));
                lblParentesco.setText(rs.getString("parentesco"));
                lblTelefono.setText(rs.getString("tutor_celular"));
                System.out.println("Se obtivo resultado");
                   
            }
        }
            
           //  TODO add your handling code here:
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
        lblInstructorId = new javax.swing.JLabel();
        btnPersonal = new javax.swing.JButton();
        btnContacto = new javax.swing.JButton();
        btnDeporte = new javax.swing.JButton();
        btnMédica = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lblDomicilio = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblTutor = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblParentesco = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setPreferredSize(new java.awt.Dimension(970, 720));
        back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitlePanel.setBackground(new java.awt.Color(121, 72, 221));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Datos del Alumno");

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addComponent(jLabel1)
                .addContainerGap(509, Short.MAX_VALUE))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitlePanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(19, 19, 19))
        );

        back.add(TitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1070, 70));
        back.add(lblInstructorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 10));

        btnPersonal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPersonal.setText("Información Personal");
        btnPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonalActionPerformed(evt);
            }
        });
        back.add(btnPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 190, 40));

        btnContacto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnContacto.setText("Información de Contacto");
        back.add(btnContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 220, 40));

        btnDeporte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeporte.setText("Información deportiva");
        btnDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeporteActionPerformed(evt);
            }
        });
        back.add(btnDeporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 190, 40));

        btnMédica.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMédica.setText("Información médica");
        btnMédica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMédicaActionPerformed(evt);
            }
        });
        back.add(btnMédica, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, 190, 40));
        back.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 200, 20));

        lblDomicilio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.add(lblDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 290, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel13.setText("Información de Contacto");
        jLabel13.setToolTipText("");
        back.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tutor o contacto de emergencia:");
        back.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Parentesco:");
        back.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, -1, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Número telefónico");
        back.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Domicilio");
        back.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, -1));

        lblTutor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.add(lblTutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 290, 30));

        lblTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, 290, 30));

        lblParentesco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.add(lblParentesco, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 290, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("ATRÁS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        back.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 630, 230, 40));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        back.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 630, 140, 40));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("SIGUIENTE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        back.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 630, 230, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 1158, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            VerDatosAlumno articulos = new VerDatosAlumno();
            articulos.setSize(1070,730);
            articulos.setLocation(0, 0);
            
            rightPanelAdmin.removeAll();
            rightPanelAdmin.add(articulos, BorderLayout.CENTER);
            rightPanelAdmin.revalidate();
            rightPanelAdmin.repaint();
            ///////////////////////////////////////////////////////////////////////////////
        } catch (SQLException ex) {
            Logger.getLogger(VerDatosAlumnoP2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 VerAlumnos articulos = new VerAlumnos();
        articulos.setSize(1070,730);
        articulos.setLocation(0, 0);

        rightPanelAdmin.removeAll();
        rightPanelAdmin.add(articulos, BorderLayout.CENTER);
        rightPanelAdmin.revalidate();
        rightPanelAdmin.repaint();       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonalActionPerformed
        try {
            VerDatosAlumno articulos = new VerDatosAlumno();
            articulos.setSize(1070,730);
            articulos.setLocation(0, 0);
            
            rightPanelAdmin.removeAll();
            rightPanelAdmin.add(articulos, BorderLayout.CENTER);
            rightPanelAdmin.revalidate();
            rightPanelAdmin.repaint();
            
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(VerDatosAlumnoP2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPersonalActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      VerDatosAlumnoP3 articulos = new VerDatosAlumnoP3();
        articulos.setSize(1070,730);
        articulos.setLocation(0, 0);

        rightPanelAdmin.removeAll();
        rightPanelAdmin.add(articulos, BorderLayout.CENTER);
        rightPanelAdmin.revalidate();
        rightPanelAdmin.repaint();
  // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeporteActionPerformed
VerDatosAlumnoP3 articulos = new VerDatosAlumnoP3();
        articulos.setSize(1070,730);
        articulos.setLocation(0, 0);

        rightPanelAdmin.removeAll();
        rightPanelAdmin.add(articulos, BorderLayout.CENTER);
        rightPanelAdmin.revalidate();
        rightPanelAdmin.repaint();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeporteActionPerformed

    private void btnMédicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMédicaActionPerformed
  VerDatosAlumnoP4 articulos = new VerDatosAlumnoP4();
        articulos.setSize(1070,730);
        articulos.setLocation(0, 0);

        rightPanelAdmin.removeAll();
        rightPanelAdmin.add(articulos, BorderLayout.CENTER);
        rightPanelAdmin.revalidate();
        rightPanelAdmin.repaint();         
    }//GEN-LAST:event_btnMédicaActionPerformed

    
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
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JPanel back;
    private javax.swing.JButton btnContacto;
    private javax.swing.JButton btnDeporte;
    private javax.swing.JButton btnMédica;
    private javax.swing.JButton btnPersonal;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDomicilio;
    public javax.swing.JLabel lblInstructorId;
    private javax.swing.JLabel lblParentesco;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTutor;
    // End of variables declaration//GEN-END:variables
}
