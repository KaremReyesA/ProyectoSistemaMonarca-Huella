
package monarca;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import static monarca.mainAdmin.rightPanelAdmin;
public class mainIntructor extends javax.swing.JFrame {

    public mainIntructor() {
        initComponents();
        lblRolid.setVisible(false);
        lblInstructorId.setVisible(false);

        btnAsistencias.setOpaque(false);
        btnAsistencias.setContentAreaFilled(false);
        btnAsistencias.setBorderPainted(false);
        
        btnTomaAsistencias.setOpaque(false);
        btnTomaAsistencias.setContentAreaFilled(false);
        btnTomaAsistencias.setBorderPainted(false);
        
    
          btnAlumnos.setOpaque(false);
        btnAlumnos.setContentAreaFilled(false);
        btnAlumnos.setBorderPainted(false);
        
        
        
        btnCerrarSesion.setOpaque(false);
        btnCerrarSesion.setContentAreaFilled(false);
        btnCerrarSesion.setBorderPainted(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        back = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        AsistenciasMenu = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAsistencias = new javax.swing.JButton();
        TomaAsisteMenu = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnTomaAsistencias = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblUsuario = new javax.swing.JLabel();
        lblRolid = new javax.swing.JLabel();
        lblInstructorId = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        AlumnosMenu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAlumnos = new javax.swing.JButton();
        rightPanelInstructores = new javax.swing.JPanel();
        TitlePanel = new javax.swing.JPanel();
        lblAsistencias = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(54, 33, 89));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AsistenciasMenu.setBackground(new java.awt.Color(84, 65, 118));
        AsistenciasMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Todo_List_35px.png"))); // NOI18N
        AsistenciasMenu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 63, 70));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ver asistencias");
        AsistenciasMenu.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 70));

        btnAsistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsistenciasActionPerformed(evt);
            }
        });
        AsistenciasMenu.add(btnAsistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 80));

        sidePanel.add(AsistenciasMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 250, 320, -1));

        TomaAsisteMenu.setBackground(new java.awt.Color(54, 33, 89));
        TomaAsisteMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Add_List_35px.png"))); // NOI18N
        TomaAsisteMenu.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 43, 92));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Toma de asistencia");
        TomaAsisteMenu.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 70));

        btnTomaAsistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomaAsistenciasActionPerformed(evt);
            }
        });
        TomaAsisteMenu.add(btnTomaAsistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 70));

        sidePanel.add(TomaAsisteMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 330, 560, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CERRAR SESIÓN");
        sidePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 670, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        sidePanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 640, 180, 20));

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText(" @USUARIO");
        sidePanel.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 180, 20));
        sidePanel.add(lblRolid, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 20, 10));
        sidePanel.add(lblInstructorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 20, 10));

        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        sidePanel.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 650, 190, 50));

        AlumnosMenu.setBackground(new java.awt.Color(84, 65, 118));
        AlumnosMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Kicking_35px_1.png"))); // NOI18N
        AlumnosMenu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, 38));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Alumnos");
        AlumnosMenu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 82, 38));

        btnAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnosActionPerformed(evt);
            }
        });
        AlumnosMenu.add(btnAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 60));

        sidePanel.add(AlumnosMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 560, 60));

        back.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 300, 730));

        rightPanelInstructores.setBackground(new java.awt.Color(255, 255, 255));

        TitlePanel.setBackground(new java.awt.Color(121, 72, 221));

        lblAsistencias.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblAsistencias.setForeground(new java.awt.Color(255, 255, 255));
        lblAsistencias.setText(" ");
        lblAsistencias.setToolTipText("");

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(lblAsistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(536, Short.MAX_VALUE))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitlePanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(lblAsistencias)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout rightPanelInstructoresLayout = new javax.swing.GroupLayout(rightPanelInstructores);
        rightPanelInstructores.setLayout(rightPanelInstructoresLayout);
        rightPanelInstructoresLayout.setHorizontalGroup(
            rightPanelInstructoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelInstructoresLayout.createSequentialGroup()
                .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 77, Short.MAX_VALUE))
        );
        rightPanelInstructoresLayout.setVerticalGroup(
            rightPanelInstructoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelInstructoresLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(589, Short.MAX_VALUE))
        );

        back.add(rightPanelInstructores, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1160, 760));

        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsistenciasActionPerformed
        VerAsistenciasAlumnos asistencias = new VerAsistenciasAlumnos();
        asistencias.setSize(1070,730);
        asistencias.setLocation(0, 0);
        

        rightPanelInstructores.removeAll();
        rightPanelInstructores.add(asistencias, BorderLayout.CENTER);
        rightPanelInstructores.revalidate();
        rightPanelInstructores.repaint(); 
    }//GEN-LAST:event_btnAsistenciasActionPerformed

    private void btnTomaAsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomaAsistenciasActionPerformed
     asistenciaForm asistencia = new asistenciaForm();
        asistencia.setSize(1070,730);
        lblAsistencias.setText("Tomar Asistencias");
        rightPanelInstructores.removeAll();
        asistencia.stop();
        asistencia.setVisible(true);
              // TODO add your handling code here:
        
//          TomarAsistencias asistenciaAlum = new TomarAsistencias();
//        asistenciaAlum.stop();
//        asistenciaAlum.setSize(1070,730);
//        asistenciaAlum.setLocation(0, 0);
//        rightPanelAdmin.removeAll();
//        rightPanelAdmin.add(asistenciaAlum, BorderLayout.CENTER);
//        rightPanelAdmin.revalidate();
//        rightPanelAdmin.repaint();   // TODO add your handling code here: // TODO add your handling code here:
    }//GEN-LAST:event_btnTomaAsistenciasActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed

        int dialogButton = JOptionPane.YES_NO_OPTION;
        
        int dialogResult = JOptionPane.showConfirmDialog(this, "¿Desea realmente cerrar sesión?", "Cerrar Sesión", dialogButton);
        if (dialogResult == 0) {
            login log = new login();
            log.setVisible(true);
            this.setVisible(false);
        }       
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnosActionPerformed
        VerAlumnosInstructores alumnos = new VerAlumnosInstructores();
        alumnos.setSize(1070,730);
        alumnos.setLocation(0, 0);

        rightPanelInstructores.removeAll();
        rightPanelInstructores.add(alumnos, BorderLayout.CENTER);
        rightPanelInstructores.revalidate();
        rightPanelInstructores.repaint();
    }//GEN-LAST:event_btnAlumnosActionPerformed

  
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Macintosh".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainIntructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainIntructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainIntructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainIntructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new mainIntructor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AlumnosMenu;
    private javax.swing.JPanel AsistenciasMenu;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JPanel TomaAsisteMenu;
    private javax.swing.JPanel back;
    private javax.swing.JButton btnAlumnos;
    private javax.swing.JButton btnAsistencias;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnTomaAsistencias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAsistencias;
    public javax.swing.JLabel lblInstructorId;
    public javax.swing.JLabel lblRolid;
    public javax.swing.JLabel lblUsuario;
    public static transient volatile javax.swing.JPanel rightPanelInstructores;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
