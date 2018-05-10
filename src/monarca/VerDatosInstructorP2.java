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
import static monarca.VerDatosInstructor.idNowInstructores;
import static monarca.mainAdmin.rightPanelAdmin;


public class VerDatosInstructorP2 extends javax.swing.JPanel {

    public VerDatosInstructorP2() {
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
        
        
      
     
       try {
            
            Connection c = con.conectar();
            ResultSet rs;
            PreparedStatement ps;
          
            int numcontrol= Integer.parseInt(idNowInstructores);
             //Alumno existente
            ps = c.prepareStatement("SELECT * FROM `usuarios` WHERE id=?");
            ps.setInt(1,numcontrol);
            rs= ps.executeQuery();
 
            if(rs.next()){
                lblDomicilio.setText(rs.getString("direccion"));
                
                lblTelefono.setText(rs.getString("celular"));
                System.out.println("Se obtivo resultado");
                   
            }
        }
            
           //  TODO add your handling code here:
         catch (SQLException ex) {
            Logger.getLogger(ModificarAlumno.class.getName()).log(Level.SEVERE, null, ex);
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
        lblDomicilio = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnDeporte = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnContacto = new javax.swing.JButton();
        btnPersonal = new javax.swing.JButton();
        lblTelefono = new javax.swing.JLabel();
        lblDomicilio2 = new javax.swing.JLabel();

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

        lblDomicilio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.add(lblDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 450, 60));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel13.setText("Información de Contacto");
        jLabel13.setToolTipText("");
        back.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Número telefónico");
        back.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Domicilio");
        back.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

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

        btnDeporte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeporte.setText("Información de la cuenta");
        btnDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeporteActionPerformed(evt);
            }
        });
        back.add(btnDeporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, 230, 40));
        back.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 240, 20));

        btnContacto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnContacto.setText("Información de Contacto");
        btnContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactoActionPerformed(evt);
            }
        });
        back.add(btnContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 220, 40));

        btnPersonal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPersonal.setText("Información Personal");
        btnPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonalActionPerformed(evt);
            }
        });
        back.add(btnPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 190, 40));

        lblTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 280, 40));

        lblDomicilio2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.add(lblDomicilio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 450, 60));

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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          VerDatosInstructorP3 articulos = new VerDatosInstructorP3();
        articulos.setSize(1070,730);
        articulos.setLocation(0, 0);

        rightPanelAdmin.removeAll();
        rightPanelAdmin.add(articulos, BorderLayout.CENTER);
        rightPanelAdmin.revalidate();
        rightPanelAdmin.repaint(); 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        VerInstructores articulos = new VerInstructores();
        articulos.setSize(1070,730);
        articulos.setLocation(0, 0);

        rightPanelAdmin.removeAll();
        rightPanelAdmin.add(articulos, BorderLayout.CENTER);
        rightPanelAdmin.revalidate();
        rightPanelAdmin.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       VerDatosInstructor articulos = null;
        try {
            articulos = new VerDatosInstructor();
        } catch (SQLException ex) {
            Logger.getLogger(VerDatosInstructorP2.class.getName()).log(Level.SEVERE, null, ex);
        }
            articulos.setSize(1070,730);
            articulos.setLocation(0, 0);

            rightPanelAdmin.removeAll();
            rightPanelAdmin.add(articulos, BorderLayout.CENTER);
            rightPanelAdmin.revalidate();
            rightPanelAdmin.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeporteActionPerformed
          VerDatosInstructorP3 articulos = new VerDatosInstructorP3();
        articulos.setSize(1070,730);
        articulos.setLocation(0, 0);

        rightPanelAdmin.removeAll();
        rightPanelAdmin.add(articulos, BorderLayout.CENTER);
        rightPanelAdmin.revalidate();
        rightPanelAdmin.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeporteActionPerformed

    private void btnContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactoActionPerformed
     
    }//GEN-LAST:event_btnContactoActionPerformed

    private void btnPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonalActionPerformed
        try {
            VerDatosInstructor articulos = new VerDatosInstructor();
            articulos.setSize(1070,730);
            articulos.setLocation(0, 0);

            rightPanelAdmin.removeAll();
            rightPanelAdmin.add(articulos, BorderLayout.CENTER);
            rightPanelAdmin.revalidate();
            rightPanelAdmin.repaint();

            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(VerDatosInstructorP3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPersonalActionPerformed

    
    ConexionBD con = new ConexionBD();
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup AlergiasGroup;
    private javax.swing.ButtonGroup DeporteGroup;
    private javax.swing.ButtonGroup EnfermedadesGroup;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JPanel back;
    private javax.swing.JButton btnContacto;
    private javax.swing.JButton btnDeporte;
    private javax.swing.JButton btnPersonal;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblDomicilio2;
    private javax.swing.JLabel lblInstructorId;
    private javax.swing.JLabel lblTelefono;
    // End of variables declaration//GEN-END:variables
}
