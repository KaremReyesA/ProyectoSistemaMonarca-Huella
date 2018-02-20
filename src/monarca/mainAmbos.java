
package monarca;

import java.awt.BorderLayout;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static monarca.mainAdmin.rightPanelAdmin;
public class mainAmbos extends javax.swing.JFrame {

    public mainAmbos() {
        initComponents();
        lblRolid.setVisible(false);
        lblInstructorId.setVisible(false);

        btnAgregarAlum.setOpaque(false);
        btnAgregarAlum.setContentAreaFilled(false);
        btnAgregarAlum.setBorderPainted(false);
        
        btnAlumnos.setOpaque(false);
        btnAlumnos.setContentAreaFilled(false);
        btnAlumnos.setBorderPainted(false);
        
     
        btnArticulos.setOpaque(false);
        btnArticulos.setContentAreaFilled(false);
        btnArticulos.setBorderPainted(false);
        
        btnAgregarArticu.setOpaque(false);
        btnAgregarArticu.setContentAreaFilled(false);
        btnAgregarArticu.setBorderPainted(false);
        
        
        btnMensualidades.setOpaque(false);
        btnMensualidades.setContentAreaFilled(false);
        btnMensualidades.setBorderPainted(false);
        
        btnAsistencias.setOpaque(false);
        btnAsistencias.setContentAreaFilled(false);
        btnAsistencias.setBorderPainted(false);
        
        btnTomaAsistencias.setOpaque(false);
        btnTomaAsistencias.setContentAreaFilled(false);
        btnTomaAsistencias.setBorderPainted(false);
        
        
       
        
        
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
        AlumnosMenu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btnAgregarAlum = new javax.swing.JButton();
        btnAlumnos = new javax.swing.JButton();
        AsistenciasMenu = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAsistencias = new javax.swing.JButton();
        ArticulosMenu = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnArticulos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        btnAgregarArticu = new javax.swing.JButton();
        TomaAsisteMenu = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnTomaAsistencias = new javax.swing.JButton();
        MensualidadMenu = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnMensualidades = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblUsuario = new javax.swing.JLabel();
        lblRolid = new javax.swing.JLabel();
        lblInstructorId = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();

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

        AlumnosMenu.setBackground(new java.awt.Color(84, 65, 118));
        AlumnosMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Kicking_35px_1.png"))); // NOI18N
        AlumnosMenu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 38));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Alumnos");
        AlumnosMenu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 82, 38));

        jPanel1.setBackground(new java.awt.Color(64, 43, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Add_35px.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 59));

        btnAgregarAlum.setText("yt");
        btnAgregarAlum.setToolTipText("Inscribir Alumno");
        btnAgregarAlum.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        btnAgregarAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlumActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, -7, 90, 80));

        AlumnosMenu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 70, 70));

        btnAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnosActionPerformed(evt);
            }
        });
        AlumnosMenu.add(btnAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 70));

        sidePanel.add(AlumnosMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 180, -1, 70));

        AsistenciasMenu.setBackground(new java.awt.Color(84, 65, 118));
        AsistenciasMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Todo_List_35px.png"))); // NOI18N
        AsistenciasMenu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 63, 70));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ver asistencias");
        AsistenciasMenu.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 70));

        btnAsistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsistenciasActionPerformed(evt);
            }
        });
        AsistenciasMenu.add(btnAsistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 80));

        sidePanel.add(AsistenciasMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 390, 320, 70));

        ArticulosMenu.setBackground(new java.awt.Color(84, 65, 118));
        ArticulosMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Kimono_35px_2.png"))); // NOI18N
        ArticulosMenu.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 70));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Adeudos");
        ArticulosMenu.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 160, 60));

        btnArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArticulosActionPerformed(evt);
            }
        });
        ArticulosMenu.add(btnArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 70));

        jPanel3.setBackground(new java.awt.Color(64, 43, 100));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Add_35px.png"))); // NOI18N
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 59));

        btnAgregarArticu.setToolTipText("Agregar artículo pendiente");
        btnAgregarArticu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarArticuActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarArticu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        ArticulosMenu.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 70, 70));

        sidePanel.add(ArticulosMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 250, 290, 70));

        TomaAsisteMenu.setBackground(new java.awt.Color(54, 33, 89));
        TomaAsisteMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Add_List_35px.png"))); // NOI18N
        TomaAsisteMenu.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -10, 43, 92));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Toma de asistencia");
        TomaAsisteMenu.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 70));

        btnTomaAsistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomaAsistenciasActionPerformed(evt);
            }
        });
        TomaAsisteMenu.add(btnTomaAsistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 70));

        sidePanel.add(TomaAsisteMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 460, 560, 70));

        MensualidadMenu.setBackground(new java.awt.Color(84, 65, 118));
        MensualidadMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Initiate_Money_Transfer_35px.png"))); // NOI18N
        MensualidadMenu.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 70));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Control de mensualidades");
        MensualidadMenu.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 70));

        btnMensualidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMensualidadesActionPerformed(evt);
            }
        });
        MensualidadMenu.add(btnMensualidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 70));

        sidePanel.add(MensualidadMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 320, 300, 70));

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

        back.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 300, 730));

        rightPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );

        back.add(rightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1160, 760));

        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnosActionPerformed
        VerAlumnos alumnos = new VerAlumnos();
        alumnos.setSize(1070,730);
        alumnos.setLocation(0, 0);

        rightPanel.removeAll();
        rightPanel.add(alumnos, BorderLayout.CENTER);
        rightPanel.revalidate();
        rightPanel.repaint();
    }//GEN-LAST:event_btnAlumnosActionPerformed

    private void btnArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArticulosActionPerformed

//         VerAdeudosForm adeudos = new VerAdeudosForm();
//        adeudos.setSize(1070,730);
//        adeudos.setLocation(0, 0);
//
//        rightPanelAdmin.removeAll();
//        rightPanelAdmin.add(adeudos, BorderLayout.CENTER);
//        rightPanelAdmin.revalidate();
//        rightPanelAdmin.repaint();
    }//GEN-LAST:event_btnArticulosActionPerformed

    private void btnMensualidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMensualidadesActionPerformed

        ControlMensualidades mensualidades = new ControlMensualidades();
        mensualidades.setSize(1070,730);
        mensualidades.setLocation(0, 0);

        rightPanel.removeAll();
        rightPanel.add(mensualidades, BorderLayout.CENTER);
        rightPanel.revalidate();
        rightPanel.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_btnMensualidadesActionPerformed

    private void btnAsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsistenciasActionPerformed
        VerAsistenciasAlumnos asistencias = new VerAsistenciasAlumnos();
        asistencias.setSize(1070,730);
        asistencias.setLocation(0, 0);

        rightPanel.removeAll();
        rightPanel.add(asistencias, BorderLayout.CENTER);
        rightPanel.revalidate();
        rightPanel.repaint(); 
    }//GEN-LAST:event_btnAsistenciasActionPerformed

    private void btnTomaAsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomaAsistenciasActionPerformed
    TomarAsistencias asistencia = new TomarAsistencias();
        asistencia.setSize(1070,730);
        asistencia.setLocation(0, 0);
        asistencia.stop();

        rightPanel.removeAll();
        rightPanel.add(asistencia, BorderLayout.CENTER);
        rightPanel.revalidate();
        rightPanel.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_btnTomaAsistenciasActionPerformed

    private void btnAgregarAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlumActionPerformed
        
        try {
            ModificarAlumno asistencia =  new ModificarAlumno();
            
            
            
            asistencia.setSize(1070,730);
            asistencia.setLocation(0, 0);
            
            rightPanel.removeAll();
            rightPanel.add(asistencia, BorderLayout.CENTER);
            rightPanel.revalidate();
            rightPanel.repaint();
            // TODO add your handling code here:
        } catch (ParseException ex) {
            Logger.getLogger(mainAmbos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarAlumActionPerformed

    private void btnAgregarArticuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarArticuActionPerformed
        AgregarTicketDetalles adeudos = new AgregarTicketDetalles();
        adeudos.setSize(1070,730);
        adeudos.setLocation(0, 0);

        rightPanelAdmin.removeAll();
        rightPanelAdmin.add(adeudos, BorderLayout.CENTER);
        rightPanelAdmin.revalidate();
        rightPanelAdmin.repaint();       
    }//GEN-LAST:event_btnAgregarArticuActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed

        int dialogButton = JOptionPane.YES_NO_OPTION;
        
        int dialogResult = JOptionPane.showConfirmDialog(this, "¿Desea realmente cerrar sesión?", "Cerrar Sesión", dialogButton);
        if (dialogResult == 0) {
            login log = new login();
            log.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

  
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Macintosh".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainAmbos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainAmbos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainAmbos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainAmbos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new mainAmbos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AlumnosMenu;
    private javax.swing.JPanel ArticulosMenu;
    private javax.swing.JPanel AsistenciasMenu;
    private javax.swing.JPanel MensualidadMenu;
    private javax.swing.JPanel TomaAsisteMenu;
    private javax.swing.JPanel back;
    private javax.swing.JButton btnAgregarAlum;
    private javax.swing.JButton btnAgregarArticu;
    private javax.swing.JButton btnAlumnos;
    private javax.swing.JButton btnArticulos;
    private javax.swing.JButton btnAsistencias;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnMensualidades;
    private javax.swing.JButton btnTomaAsistencias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel lblInstructorId;
    public javax.swing.JLabel lblRolid;
    public javax.swing.JLabel lblUsuario;
    public static transient volatile javax.swing.JPanel rightPanel;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
