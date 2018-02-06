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
import static monarca.AgregarAlumno.labelID;

import static monarca.mainAdmin.rightPanelAdmin;

public class AgregarAlumnoP4 extends javax.swing.JPanel {

    public static int inicial = 0;

    public AgregarAlumnoP4() {
        initComponents();

        lblInstructorId.setVisible(false);

        SiSangre.setVisible(false);

        SiPeso.setVisible(false);
        VerifiquePeso.setVisible(false);

        SiAltura.setVisible(false);
        VerifiqueAltura.setVisible(false);

        SiAlergia.setVisible(false);
        NoAlergia.setVisible(false);
        VerifiqueAlergia.setVisible(false);
        Necesario.setVisible(false);
        lblAlergia.setVisible(false);
        txtAlergia.setVisible(false);

        SiEnfermedad.setVisible(false);
        NoEnfermedad.setVisible(false);
        VerifiqueEnfermedad.setVisible(false);
        NecesarioEnferm.setVisible(false);
        lblEnfermedad.setVisible(false);
        txtEnfermedad.setVisible(false);

        //Modificar datos en caso que se encuentre agregando un alumno 
        try {

            Connection c = con.conectar();
            ResultSet rs;
            PreparedStatement ps;
            ps = c.prepareStatement("SELECT * FROM `alumnos` ORDER BY `id` DESC LIMIT 1");

            rs = ps.executeQuery();

            if (rs.next()) {
                if (rs.getString("alrgias") != null) {
                    inicial = 1;

                    cbSangre1.setSelectedItem(rs.getString("t_sangre"));
                    spnAltura1.setValue(Float.parseFloat(rs.getString("altura")));
                    spnPeso1.setValue(Float.parseFloat(rs.getString("peso")));
                    txtAlergia.setText(rs.getString("alrgias"));

                    //FALTA ENFERMEDADES
                    //SiCinta.setVisible(true);
                    if (txtAlergia.getText().equals("Ninguno")) {
                        rbAlergiasNo1.setSelected(true);

                    } else {
                        //Si tiene "si"
                        rbAlergiasSi1.setSelected(true);
                        lblAlergia.setVisible(true);
                        txtAlergia.setVisible(true);

                    }

                }
            }

        } // TODO add your handling code here:
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
        jLabel6 = new javax.swing.JLabel();
        cbSangre1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        spnAltura1 = new javax.swing.JSpinner();
        spnPeso1 = new javax.swing.JSpinner();
        jLabel25 = new javax.swing.JLabel();
        rbAlergiasSi1 = new javax.swing.JRadioButton();
        rbAlergiasNo1 = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        rbEnfermedadNo1 = new javax.swing.JRadioButton();
        rbEnfermedadSi1 = new javax.swing.JRadioButton();
        btnFinalizar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblAlergia = new javax.swing.JLabel();
        txtAlergia = new javax.swing.JTextField();
        SiAlergia = new javax.swing.JLabel();
        NoAlergia = new javax.swing.JLabel();
        VerifiqueAlergia = new javax.swing.JLabel();
        Necesario = new javax.swing.JLabel();
        NecesarioEnferm = new javax.swing.JLabel();
        VerifiqueEnfermedad = new javax.swing.JLabel();
        NoEnfermedad = new javax.swing.JLabel();
        SiEnfermedad = new javax.swing.JLabel();
        txtEnfermedad = new javax.swing.JTextField();
        lblEnfermedad = new javax.swing.JLabel();
        SiSangre = new javax.swing.JLabel();
        SiPeso = new javax.swing.JLabel();
        SiAltura = new javax.swing.JLabel();
        VerifiqueAltura = new javax.swing.JLabel();
        VerifiquePeso = new javax.swing.JLabel();

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setPreferredSize(new java.awt.Dimension(970, 720));
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

        jProgressBar1.setValue(65);
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
        jLabel11.setText("Información médica");
        back.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Tipo Sanguíneo:");
        back.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 120, -1));

        cbSangre1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O +", "O -", "A +", "A -", "B +", "B -", "AB +", "AB -" }));
        back.add(cbSangre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 110, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel14.setText("Información médica");
        back.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Peso:");
        back.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Altura:");
        back.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, -1, -1));

        spnAltura1.setModel(new javax.swing.SpinnerNumberModel(1.65d, null, 2.3d, 0.01d));
        back.add(spnAltura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 60, 30));

        spnPeso1.setModel(new javax.swing.SpinnerNumberModel(55.0d, null, 150.0d, 0.5d));
        spnPeso1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                spnPeso1FocusLost(evt);
            }
        });
        back.add(spnPeso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 60, 30));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("¿El alumno tiene alergias?");
        back.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, -1, -1));

        rbAlergiasSi1.setBackground(new java.awt.Color(255, 255, 255));
        AlergiasGroup.add(rbAlergiasSi1);
        rbAlergiasSi1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbAlergiasSi1.setText("Sí");
        rbAlergiasSi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlergiasSi1ActionPerformed(evt);
            }
        });
        back.add(rbAlergiasSi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, -1, -1));

        rbAlergiasNo1.setBackground(new java.awt.Color(255, 255, 255));
        AlergiasGroup.add(rbAlergiasNo1);
        rbAlergiasNo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbAlergiasNo1.setSelected(true);
        rbAlergiasNo1.setText("No");
        rbAlergiasNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlergiasNo1ActionPerformed(evt);
            }
        });
        back.add(rbAlergiasNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("¿El alumno tiene enfermedades?");
        back.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, -1, -1));

        rbEnfermedadNo1.setBackground(new java.awt.Color(255, 255, 255));
        EnfermedadesGroup.add(rbEnfermedadNo1);
        rbEnfermedadNo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbEnfermedadNo1.setSelected(true);
        rbEnfermedadNo1.setText("No");
        rbEnfermedadNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEnfermedadNo1ActionPerformed(evt);
            }
        });
        back.add(rbEnfermedadNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 570, -1, -1));

        rbEnfermedadSi1.setBackground(new java.awt.Color(255, 255, 255));
        EnfermedadesGroup.add(rbEnfermedadSi1);
        rbEnfermedadSi1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbEnfermedadSi1.setText("Sí");
        rbEnfermedadSi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEnfermedadSi1ActionPerformed(evt);
            }
        });
        back.add(rbEnfermedadSi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 570, -1, -1));

        btnFinalizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnFinalizar.setText("FINALIZAR INFORMACIÓN");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        back.add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 670, 270, 40));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("ANTERIOR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        back.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 670, 200, 40));

        lblAlergia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAlergia.setText("¿Cuál?");
        back.add(lblAlergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, -1, 20));

        txtAlergia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAlergia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAlergiaFocusLost(evt);
            }
        });
        back.add(txtAlergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 220, 30));

        SiAlergia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Ok_30px.png"))); // NOI18N
        back.add(SiAlergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 50, 40));

        NoAlergia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Cancel_30px.png"))); // NOI18N
        back.add(NoAlergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 50, 40));

        VerifiqueAlergia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        VerifiqueAlergia.setForeground(java.awt.Color.red);
        VerifiqueAlergia.setText("Verifique el nombre la alergia  ingresada");
        back.add(VerifiqueAlergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 240, 50));

        Necesario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Necesario.setForeground(java.awt.Color.red);
        Necesario.setText("Este campo es requerido");
        back.add(Necesario, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 240, 50));

        NecesarioEnferm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NecesarioEnferm.setForeground(java.awt.Color.red);
        NecesarioEnferm.setText("Este campo es requerido");
        back.add(NecesarioEnferm, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 620, 170, 50));

        VerifiqueEnfermedad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        VerifiqueEnfermedad.setForeground(java.awt.Color.red);
        VerifiqueEnfermedad.setText("Verifique el nombre de la enfermedad ingresada");
        back.add(VerifiqueEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 620, 290, 50));

        NoEnfermedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Cancel_30px.png"))); // NOI18N
        back.add(NoEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 590, 50, 40));

        SiEnfermedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Ok_30px.png"))); // NOI18N
        back.add(SiEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 590, 50, 40));

        txtEnfermedad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.add(txtEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 600, 220, 30));

        lblEnfermedad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEnfermedad.setText("¿Cuál?");
        back.add(lblEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 610, -1, 20));

        SiSangre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Ok_30px.png"))); // NOI18N
        back.add(SiSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 50, 40));

        SiPeso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Ok_30px.png"))); // NOI18N
        back.add(SiPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 50, 40));

        SiAltura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Ok_30px.png"))); // NOI18N
        back.add(SiAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 50, 40));

        VerifiqueAltura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        VerifiqueAltura.setForeground(java.awt.Color.red);
        VerifiqueAltura.setText("Ingrese una altura real");
        back.add(VerifiqueAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 240, 50));

        VerifiquePeso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        VerifiquePeso.setForeground(java.awt.Color.red);
        VerifiquePeso.setText("Ingrese un peso real");
        back.add(VerifiquePeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 240, 50));

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

    private void rbAlergiasSi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlergiasSi1ActionPerformed
        SiAlergia.setVisible(false);
        NoAlergia.setVisible(false);
        VerifiqueAlergia.setVisible(false);
        Necesario.setVisible(false);
        lblAlergia.setVisible(true);
        txtAlergia.setVisible(true);
        txtAlergia.setText("");
    }//GEN-LAST:event_rbAlergiasSi1ActionPerformed

    private void rbAlergiasNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlergiasNo1ActionPerformed
        SiAlergia.setVisible(false);
        NoAlergia.setVisible(false);
        VerifiqueAlergia.setVisible(false);
        Necesario.setVisible(false);
        lblAlergia.setVisible(false);
        txtAlergia.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_rbAlergiasNo1ActionPerformed

    private void rbEnfermedadNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEnfermedadNo1ActionPerformed

        SiEnfermedad.setVisible(false);
        NoEnfermedad.setVisible(false);
        VerifiqueEnfermedad.setVisible(false);
        NecesarioEnferm.setVisible(false);
        lblEnfermedad.setVisible(false);
        txtEnfermedad.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_rbEnfermedadNo1ActionPerformed

    private void rbEnfermedadSi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEnfermedadSi1ActionPerformed
        SiEnfermedad.setVisible(false);
        NoEnfermedad.setVisible(false);
        VerifiqueEnfermedad.setVisible(false);
        NecesarioEnferm.setVisible(false);
        lblEnfermedad.setVisible(true);
        txtEnfermedad.setVisible(true);
        txtEnfermedad.setText("");

// TODO add your handling code here:
    }//GEN-LAST:event_rbEnfermedadSi1ActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed

        try {
            String alergiaFile = txtAlergia.getText();

            Connection c = con.conectar();
            ResultSet rs;
            PreparedStatement ps;
            String alergia = null;

            //FALTA ALERGIA && ENFERMEDADES
            if (rbAlergiasNo1.isSelected() == true) {
                alergia = "Ninguno";
                PreparedStatement modificarAlumno = c.prepareStatement("UPDATE alumnos SET t_sangre=?, peso =?, altura =?, alrgias =? WHERE id=?");

                modificarAlumno.setString(1, cbSangre1.getSelectedItem().toString());
                modificarAlumno.setString(2, spnPeso1.getValue().toString());
                modificarAlumno.setString(3, spnAltura1.getValue().toString());

                modificarAlumno.setString(4, alergia);
                modificarAlumno.setString(5, labelID.getText());

                modificarAlumno.execute();
                modificarAlumno.close();
                
                    AgregarAlumnoP5 huella = new AgregarAlumnoP5();
                    huella.lblAlumnoId.setText(labelID.getText());
                    huella.setSize(1070,730);
                    huella.setLocation(0, 0);

                    rightPanelAdmin.removeAll();
                    rightPanelAdmin.add(huella, BorderLayout.CENTER);
                    rightPanelAdmin.revalidate();
                    rightPanelAdmin.repaint();
                
//                System.err.println("MODIFICADO");
//                JOptionPane.showMessageDialog(null, "Modificado");
            } else {
                alergia = txtAlergia.getText();
            }

            if (rbAlergiasSi1.isSelected()) {
                if (alergiaFile.isEmpty()) {
                    Necesario.setVisible(true);
                } else {

                    if (alergia.matches("[a-zA-ZáéíóúÁÉÍÓÚÜüñÑ ]*")) {
                        SiAlergia.setVisible(true);
                        VerifiqueAlergia.setVisible(false);
                        NoAlergia.setVisible(false);
                        Necesario.setVisible(false);

                        PreparedStatement modificarAlumno = c.prepareStatement("UPDATE alumnos SET t_sangre=?, peso =?, altura =?, alrgias =? WHERE id=?");

                        modificarAlumno.setString(1, cbSangre1.getSelectedItem().toString());
                        modificarAlumno.setString(2, spnPeso1.getValue().toString());
                        modificarAlumno.setString(3, spnPeso1.getValue().toString());

                        modificarAlumno.setString(4, alergia);
                        modificarAlumno.setString(5, labelID.getText());

                        modificarAlumno.execute();
                        modificarAlumno.close();
//                        System.err.println("MODIFICADO");
//                        JOptionPane.showMessageDialog(null, "Modificado");

                    AgregarAlumnoP5 huella = new AgregarAlumnoP5();
//                    huella.lblAlumnoId.setText(labelID.getText());
                    huella.setSize(1070,730);
                    huella.setLocation(0, 0);

                    rightPanelAdmin.removeAll();
                    rightPanelAdmin.add(huella, BorderLayout.CENTER);
                    rightPanelAdmin.revalidate();
                    rightPanelAdmin.repaint();
                      
                       huella.setVisible(true);
                       huella.lblid.setText(labelID.getText());
                    } else {
                        VerifiqueAlergia.setVisible(true);
                        NoAlergia.setVisible(true);
                        Necesario.setVisible(false);
                        SiAlergia.setVisible(false);

                    }
                }
            }

        } catch (SQLException ex) {
            System.out.println("error al guardar los datos: " + ex);
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        } finally {
            con.desconectar();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        AgregarAlumnoP3 articulos = new AgregarAlumnoP3();
        articulos.setSize(1070, 730);
        articulos.setLocation(0, 0);

        rightPanelAdmin.removeAll();
        rightPanelAdmin.add(articulos, BorderLayout.CENTER);
        rightPanelAdmin.revalidate();
        rightPanelAdmin.repaint();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtAlergiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAlergiaFocusLost

        if (txtAlergia.getText().isEmpty()) {
            Necesario.setVisible(true);
            SiAlergia.setVisible(false);
            NoAlergia.setVisible(false);
            VerifiqueAlergia.setVisible(false);

        } else {
            if (txtAlergia.getText().matches("[a-zA-ZáéíóúÁÉÍÓÚÜüñÑ ]*")) {
                SiAlergia.setVisible(true);
                NoAlergia.setVisible(false);
                VerifiqueAlergia.setVisible(false);
                Necesario.setVisible(false);
            } else {
                SiAlergia.setVisible(false);
                NoAlergia.setVisible(true);
                VerifiqueAlergia.setVisible(true);
                Necesario.setVisible(false);

            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlergiaFocusLost

    private void spnPeso1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_spnPeso1FocusLost


       if((Integer)spnPeso1.getValue() == 55){
       JOptionPane.showMessageDialog(null, "55");
       }
    }//GEN-LAST:event_spnPeso1FocusLost

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
    private javax.swing.JLabel NecesarioEnferm;
    private javax.swing.JLabel NoAlergia;
    private javax.swing.JLabel NoEnfermedad;
    private javax.swing.JLabel SiAlergia;
    private javax.swing.JLabel SiAltura;
    private javax.swing.JLabel SiEnfermedad;
    private javax.swing.JLabel SiPeso;
    private javax.swing.JLabel SiSangre;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JLabel VerifiqueAlergia;
    private javax.swing.JLabel VerifiqueAltura;
    private javax.swing.JLabel VerifiqueEnfermedad;
    private javax.swing.JLabel VerifiquePeso;
    private javax.swing.JPanel back;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JComboBox<String> cbSangre1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblAlergia;
    private javax.swing.JLabel lblEnfermedad;
    public javax.swing.JLabel lblInstructorId;
    private javax.swing.JRadioButton rbAlergiasNo1;
    private javax.swing.JRadioButton rbAlergiasSi1;
    private javax.swing.JRadioButton rbEnfermedadNo1;
    private javax.swing.JRadioButton rbEnfermedadSi1;
    private javax.swing.JSpinner spnAltura1;
    private javax.swing.JSpinner spnPeso1;
    private javax.swing.JTextField txtAlergia;
    private javax.swing.JTextField txtEnfermedad;
    // End of variables declaration//GEN-END:variables
}
