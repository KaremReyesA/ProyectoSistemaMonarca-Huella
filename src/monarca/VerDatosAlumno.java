package monarca;

import db.ConexionBD;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static monarca.mainAdmin.rightPanelAdmin;

public class VerDatosAlumno extends javax.swing.JPanel {

public static String idNow;

    public VerDatosAlumno() throws SQLException {
      
        initComponents();

       // lblIdAlumno.setVisible(false);
        
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
        
      
      
        
        //Consulta para poner resultados
        //Consulta tipo busqueda
        
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
                lblNombre.setText(rs.getString("nombre"));
                lblApellidoP.setText(rs.getString("a_paterno"));
                lblApellidoM.setText(rs.getString("a_materno"));
                lblNacimiento.setText(rs.getString("fecha_nacimiento"));
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
        btnPersonal = new javax.swing.JButton();
        btnContacto = new javax.swing.JButton();
        btnDeporte = new javax.swing.JButton();
        btnMédica = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lblNombre = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblApellidoP = new javax.swing.JLabel();
        lblNacimiento = new javax.swing.JLabel();
        lblApellidoM = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

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

        btnPersonal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPersonal.setText("Información Personal");
        back.add(btnPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 190, 40));

        btnContacto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnContacto.setText("Información de Contacto");
        btnContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactoActionPerformed(evt);
            }
        });
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
        back.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 200, 20));

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 290, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel13.setText("Información personal");
        back.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Apellido paterno:");
        back.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Apellido materno:");
        back.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Fecha de nacimiento:");
        back.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Nombre:");
        back.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, -1));

        lblApellidoP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.add(lblApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 290, 30));

        lblNacimiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.add(lblNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, 290, 30));

        lblApellidoM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.add(lblApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 290, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("SIGUIENTE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        back.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 630, 230, 40));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        back.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 630, 140, 40));

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
    VerDatosAlumnoP2 articulos = new VerDatosAlumnoP2();
    articulos.setSize(1070,730);
    articulos.setLocation(0, 0);
    rightPanelAdmin.removeAll();
    rightPanelAdmin.add(articulos, BorderLayout.CENTER);
    rightPanelAdmin.revalidate();
    rightPanelAdmin.repaint();
     
        ///////////////////////////////////////////////////////////////////////////////

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

    private void btnContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactoActionPerformed
    VerDatosAlumnoP2 articulos = new VerDatosAlumnoP2();
        articulos.setSize(1070,730);
        articulos.setLocation(0, 0);

        rightPanelAdmin.removeAll();
        rightPanelAdmin.add(articulos, BorderLayout.CENTER);
        rightPanelAdmin.revalidate();
        rightPanelAdmin.repaint();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnContactoActionPerformed

    private void btnDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeporteActionPerformed
       VerDatosAlumnoP3 articulos = new VerDatosAlumnoP3();
        articulos.setSize(1070,730);
        articulos.setLocation(0, 0);

        rightPanelAdmin.removeAll();
        rightPanelAdmin.add(articulos, BorderLayout.CENTER);
        rightPanelAdmin.revalidate();
        rightPanelAdmin.repaint();  // TODO add your handling code here:
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblApellidoM;
    private javax.swing.JLabel lblApellidoP;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
