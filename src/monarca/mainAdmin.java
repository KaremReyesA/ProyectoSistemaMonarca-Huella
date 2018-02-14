
package monarca;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import static monarca.mainAmbos.rightPanel;
public class mainAdmin extends javax.swing.JFrame {

    public mainAdmin() {
        initComponents();
        lblRolid.setVisible(false);
        lblInstructorId.setVisible(false);

        btnAlumnos.setOpaque(false);
        btnAlumnos.setContentAreaFilled(false);
        btnAlumnos.setBorderPainted(false);
        
        btnAgregarAlum.setOpaque(false);
        btnAgregarAlum.setContentAreaFilled(false);
        btnAgregarAlum.setBorderPainted(false);
        
        btnInstructores.setOpaque(false);
        btnInstructores.setContentAreaFilled(false);
        btnInstructores.setBorderPainted(false);
        
        btnAgregarIns.setOpaque(false);
        btnAgregarIns.setContentAreaFilled(false);
        btnAgregarIns.setBorderPainted(false);
        
           
        btnAdeudos.setOpaque(false);
        btnAdeudos.setContentAreaFilled(false);
        btnAdeudos.setBorderPainted(false);
        
         btnAgregarAdeudos.setOpaque(false);
        btnAgregarAdeudos.setContentAreaFilled(false);
        btnAgregarAdeudos.setBorderPainted(false);
     
        
         btnMensualidades1.setOpaque(false);
        btnMensualidades1.setContentAreaFilled(false);
        btnMensualidades1.setBorderPainted(false);
        
        
        btnAsistenciasInstruc.setOpaque(false);
        btnAsistenciasInstruc.setContentAreaFilled(false);
        btnAsistenciasInstruc.setBorderPainted(false);
        
         btnAsistenciasAlumnos.setOpaque(false);
        btnAsistenciasAlumnos.setContentAreaFilled(false);
        btnAsistenciasAlumnos.setBorderPainted(false);

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
        btnAlumnos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btnAgregarAlum = new javax.swing.JButton();
        AsistenciasMenu = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAsistenciasAlumnos = new javax.swing.JButton();
        MensualidadMenu = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnAsistenciasInstruc = new javax.swing.JButton();
        MensualidadMenu1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnMensualidades = new javax.swing.JButton();
        Instructores = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnInstructores = new javax.swing.JButton();
        AgregarIns = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        btnAgregarIns = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblUsuario = new javax.swing.JLabel();
        lblRolid = new javax.swing.JLabel();
        lblInstructorId = new javax.swing.JLabel();
        MensualidadMenu2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnMensualidades1 = new javax.swing.JButton();
        Instructores1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        AgregarIns1 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        btnAgregarAdeudos = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnAdeudos = new javax.swing.JButton();
        rightPanelAdmin = new javax.swing.JPanel();
        AddAlumno = new javax.swing.JPanel();

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
        AlumnosMenu.add(btnAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 60));

        jPanel1.setBackground(new java.awt.Color(64, 43, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Add_35px.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, 59));

        btnAgregarAlum.setToolTipText("Inscribir Alumno");
        btnAgregarAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlumActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        AlumnosMenu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 80, 60));

        sidePanel.add(AlumnosMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 99, 560, 60));

        AsistenciasMenu.setBackground(new java.awt.Color(84, 65, 118));
        AsistenciasMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Todo_List_35px.png"))); // NOI18N
        AsistenciasMenu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 63, 70));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Asistencias Alumnos");
        AsistenciasMenu.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 0, 210, 70));

        btnAsistenciasAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsistenciasAlumnosActionPerformed(evt);
            }
        });
        AsistenciasMenu.add(btnAsistenciasAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 80));

        sidePanel.add(AsistenciasMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 560, 70));

        MensualidadMenu.setBackground(new java.awt.Color(84, 65, 118));
        MensualidadMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_List_35px.png"))); // NOI18N
        MensualidadMenu.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -10, -1, 82));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Asistencias Instructores");
        MensualidadMenu.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 390, 50));

        btnAsistenciasInstruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsistenciasInstrucActionPerformed(evt);
            }
        });
        MensualidadMenu.add(btnAsistenciasInstruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 460, 60));

        MensualidadMenu1.setBackground(new java.awt.Color(84, 65, 118));
        MensualidadMenu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Initiate_Money_Transfer_35px.png"))); // NOI18N
        MensualidadMenu1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 70));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Control de mensualidades");
        MensualidadMenu1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 70));

        btnMensualidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMensualidadesActionPerformed(evt);
            }
        });
        MensualidadMenu1.add(btnMensualidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 70));

        MensualidadMenu.add(MensualidadMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 320, 300, 70));

        sidePanel.add(MensualidadMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 560, 80));

        Instructores.setBackground(new java.awt.Color(84, 65, 118));
        Instructores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Ninja_35px_1.png"))); // NOI18N
        Instructores.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 59));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Instructores");
        Instructores.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, 70));

        btnInstructores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstructoresActionPerformed(evt);
            }
        });
        Instructores.add(btnInstructores, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 10, 260, 60));

        AgregarIns.setBackground(new java.awt.Color(64, 43, 100));
        AgregarIns.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Add_35px.png"))); // NOI18N
        AgregarIns.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 59));

        btnAgregarIns.setToolTipText("Inscribir Alumno");
        btnAgregarIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarInsActionPerformed(evt);
            }
        });
        AgregarIns.add(btnAgregarIns, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 60));

        Instructores.add(AgregarIns, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 90, 70));

        sidePanel.add(Instructores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 310, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CERRAR SESIÓN");
        sidePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 650, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONFIGURACIÓN");
        sidePanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, 140, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        sidePanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, 180, 20));

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText(" @USUARIO");
        sidePanel.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 180, 20));
        sidePanel.add(lblRolid, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 20, 10));
        sidePanel.add(lblInstructorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 20, 10));

        MensualidadMenu2.setBackground(new java.awt.Color(84, 65, 118));
        MensualidadMenu2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Initiate_Money_Transfer_35px.png"))); // NOI18N
        MensualidadMenu2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -10, 40, 70));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Control de mensualidades");
        MensualidadMenu2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 210, 60));

        btnMensualidades1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMensualidades1ActionPerformed(evt);
            }
        });
        MensualidadMenu2.add(btnMensualidades1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 60));

        sidePanel.add(MensualidadMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 280, 310, 70));

        Instructores1.setBackground(new java.awt.Color(84, 65, 118));
        Instructores1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Adeudos");
        Instructores1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 160, 60));

        AgregarIns1.setBackground(new java.awt.Color(64, 43, 100));
        AgregarIns1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Add_35px.png"))); // NOI18N
        AgregarIns1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 59));

        btnAgregarAdeudos.setToolTipText("Inscribir Alumno");
        btnAgregarAdeudos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAdeudosActionPerformed(evt);
            }
        });
        AgregarIns1.add(btnAgregarAdeudos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 60));

        Instructores1.add(AgregarIns1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 90, 70));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Kimono_35px_2.png"))); // NOI18N
        Instructores1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 70));

        btnAdeudos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdeudosActionPerformed(evt);
            }
        });
        Instructores1.add(btnAdeudos, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 10, 260, 60));

        sidePanel.add(Instructores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 310, 80));

        back.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 300, 730));

        rightPanelAdmin.setBackground(new java.awt.Color(255, 255, 255));
        rightPanelAdmin.setAutoscrolls(true);

        javax.swing.GroupLayout rightPanelAdminLayout = new javax.swing.GroupLayout(rightPanelAdmin);
        rightPanelAdmin.setLayout(rightPanelAdminLayout);
        rightPanelAdminLayout.setHorizontalGroup(
            rightPanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        rightPanelAdminLayout.setVerticalGroup(
            rightPanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );

        back.add(rightPanelAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1090, 740));

        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 730));

        AddAlumno.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout AddAlumnoLayout = new javax.swing.GroupLayout(AddAlumno);
        AddAlumno.setLayout(AddAlumnoLayout);
        AddAlumnoLayout.setHorizontalGroup(
            AddAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        AddAlumnoLayout.setVerticalGroup(
            AddAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(AddAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 720, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnosActionPerformed
        VerAlumnos alumnos = new VerAlumnos();
        alumnos.setSize(1070,730);
        alumnos.setLocation(0, 0);

        rightPanelAdmin.removeAll();
        rightPanelAdmin.add(alumnos, BorderLayout.CENTER);
        rightPanelAdmin.revalidate();
        rightPanelAdmin.repaint();
    }//GEN-LAST:event_btnAlumnosActionPerformed

    private void btnInstructoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstructoresActionPerformed
        
        VerInstructores instructor = new VerInstructores();
        instructor.setSize(1070,730);
        instructor.setLocation(0, 0);
        rightPanelAdmin.removeAll();
        rightPanelAdmin.add(instructor, BorderLayout.CENTER);
        rightPanelAdmin.revalidate();
        rightPanelAdmin.repaint();
    }//GEN-LAST:event_btnInstructoresActionPerformed

    private void btnAsistenciasAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsistenciasAlumnosActionPerformed
        TomarAsistencias asistenciaAlum = new TomarAsistencias();
        asistenciaAlum.stop();
        asistenciaAlum.setSize(1070,730);
        asistenciaAlum.setLocation(0, 0);
        rightPanelAdmin.removeAll();
        rightPanelAdmin.add(asistenciaAlum, BorderLayout.CENTER);
        rightPanelAdmin.revalidate();
        rightPanelAdmin.repaint();   // TODO add your handling code here: // TODO add your handling code here:
    }//GEN-LAST:event_btnAsistenciasAlumnosActionPerformed

    private void btnAsistenciasInstrucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsistenciasInstrucActionPerformed
     VerAsistenciasInstructores asistenciaIns = new VerAsistenciasInstructores();
        asistenciaIns.setSize(1070,730);
        asistenciaIns.setLocation(0, 0);
        rightPanelAdmin.removeAll();
        rightPanelAdmin.add(asistenciaIns, BorderLayout.CENTER);
        rightPanelAdmin.revalidate();
        rightPanelAdmin.repaint();   // TODO add your handling code here:
    }//GEN-LAST:event_btnAsistenciasInstrucActionPerformed

    private void btnAgregarAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlumActionPerformed
   AgregarAlumno asistencia = new AgregarAlumno();
        asistencia.setSize(1070,730);
        asistencia.setLocation(0, 0);

        rightPanelAdmin.removeAll();
        rightPanelAdmin.add(asistencia, BorderLayout.CENTER);
        rightPanelAdmin.revalidate();
        rightPanelAdmin.repaint();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarAlumActionPerformed

    private void btnAgregarInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarInsActionPerformed
      AgregarInstructor instructor = new AgregarInstructor();
        instructor.setSize(1070,730);
        instructor.setLocation(0, 0);
        rightPanelAdmin.removeAll();
        rightPanelAdmin.add(instructor, BorderLayout.CENTER);
        rightPanelAdmin.revalidate();
        rightPanelAdmin.repaint();  
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarInsActionPerformed

    private void btnMensualidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMensualidadesActionPerformed
        ControlMensualidades mensualidades = new ControlMensualidades();
        mensualidades.setSize(1070,730);
        mensualidades.setLocation(0, 0);

        rightPanel.removeAll();
        rightPanel.add(mensualidades, BorderLayout.CENTER);
        rightPanel.revalidate();
        rightPanel.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_btnMensualidadesActionPerformed

    private void btnMensualidades1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMensualidades1ActionPerformed
        ControlMensualidades mensualidades = new ControlMensualidades();
        mensualidades.setSize(1070,730);
        mensualidades.setLocation(0, 0);

        rightPanelAdmin.removeAll();
        rightPanelAdmin.add(mensualidades, BorderLayout.CENTER);
        rightPanelAdmin.revalidate();
        rightPanelAdmin.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_btnMensualidades1ActionPerformed

    private void btnAdeudosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdeudosActionPerformed
         VerAdeudos adeudos = new VerAdeudos();
        adeudos.setSize(1070,730);
        adeudos.setLocation(0, 0);

        rightPanelAdmin.removeAll();
        rightPanelAdmin.add(adeudos, BorderLayout.CENTER);
        rightPanelAdmin.revalidate();
        rightPanelAdmin.repaint();
    }//GEN-LAST:event_btnAdeudosActionPerformed

    private void btnAgregarAdeudosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAdeudosActionPerformed
        AgregarTicketD adeudos = new AgregarTicketD();
        adeudos.setSize(1070,730);
        adeudos.setLocation(0, 0);

        rightPanelAdmin.removeAll();
        rightPanelAdmin.add(adeudos, BorderLayout.CENTER);
        rightPanelAdmin.revalidate();
        rightPanelAdmin.repaint();
    }//GEN-LAST:event_btnAgregarAdeudosActionPerformed

  
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Macintosh".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new mainAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddAlumno;
    private javax.swing.JPanel AgregarIns;
    private javax.swing.JPanel AgregarIns1;
    private javax.swing.JPanel AlumnosMenu;
    private javax.swing.JPanel AsistenciasMenu;
    private javax.swing.JPanel Instructores;
    private javax.swing.JPanel Instructores1;
    private javax.swing.JPanel MensualidadMenu;
    private javax.swing.JPanel MensualidadMenu1;
    private javax.swing.JPanel MensualidadMenu2;
    private javax.swing.JPanel back;
    private javax.swing.JButton btnAdeudos;
    private javax.swing.JButton btnAgregarAdeudos;
    private javax.swing.JButton btnAgregarAlum;
    private javax.swing.JButton btnAgregarIns;
    private javax.swing.JButton btnAlumnos;
    private javax.swing.JButton btnAsistenciasAlumnos;
    private javax.swing.JButton btnAsistenciasInstruc;
    private javax.swing.JButton btnInstructores;
    private javax.swing.JButton btnMensualidades;
    private javax.swing.JButton btnMensualidades1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel lblInstructorId;
    public javax.swing.JLabel lblRolid;
    public javax.swing.JLabel lblUsuario;
    public static transient volatile javax.swing.JPanel rightPanelAdmin;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
