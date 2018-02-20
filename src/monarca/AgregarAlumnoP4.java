package monarca;

import db.ConexionBD;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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

        CuidadoPeso.setVisible(false);
        CuidadoAltura.setVisible(false);

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

                    if (txtAlergia.getText().equals("Ninguno")) {
                        rbAlergiasNo1.setSelected(true);

                    } else {
                        //Si tiene "si"
                        rbAlergiasSi1.setSelected(true);
                        lblAlergia.setVisible(true);
                        txtAlergia.setVisible(true);
                        txtAlergia.setText(rs.getString("alrgias"));

                    }

                    if (txtEnfermedad.getText().equals("Ninguno")) {
                        rbEnfermedadNo1.setSelected(true);

                    } else {
                        //Si tiene "si"
                        rbEnfermedadSi1.setSelected(true);
                        lblEnfermedad.setVisible(true);
                        txtEnfermedad.setVisible(true);
                        txtEnfermedad.setText(rs.getString("enfermedades"));

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
        jLabel25 = new javax.swing.JLabel();
        rbAlergiasSi1 = new javax.swing.JRadioButton();
        rbAlergiasNo1 = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        rbEnfermedadNo1 = new javax.swing.JRadioButton();
        rbEnfermedadSi1 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
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
        CuidadoPeso = new javax.swing.JLabel();
        VerifiquePeso = new javax.swing.JLabel();
        SiPeso = new javax.swing.JLabel();
        CuidadoAltura = new javax.swing.JLabel();
        VerifiqueAltura = new javax.swing.JLabel();
        SiAltura = new javax.swing.JLabel();
        spnAltura1 = new javax.swing.JSpinner();
        spnPeso1 = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

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

        cbSangre1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O +", "O -", "A +", "A -", "B +", "B -", "AB +", "AB -", "No sabe" }));
        back.add(cbSangre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 110, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel14.setText("Información médica");
        back.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

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

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("FINALIZAR INFORMACIÓN");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        back.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 670, 270, 40));

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

        CuidadoPeso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Error_30px_10.png"))); // NOI18N
        back.add(CuidadoPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, -1, -1));

        VerifiquePeso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        VerifiquePeso.setForeground(new java.awt.Color(255, 153, 0));
        VerifiquePeso.setText("Verifique los valores ingresados");
        back.add(VerifiquePeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 240, 50));

        SiPeso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Ok_30px.png"))); // NOI18N
        back.add(SiPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 50, 40));

        CuidadoAltura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Error_30px_10.png"))); // NOI18N
        back.add(CuidadoAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, -1, -1));

        VerifiqueAltura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        VerifiqueAltura.setForeground(new java.awt.Color(255, 153, 0));
        VerifiqueAltura.setText("Verifique los valores ingresados");
        back.add(VerifiqueAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 240, 50));

        SiAltura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Ok_30px.png"))); // NOI18N
        back.add(SiAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, 40, 40));

        spnAltura1.setModel(new javax.swing.SpinnerNumberModel(1.52d, null, null, 0.01d));
        spnAltura1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnAltura1StateChanged(evt);
                spnAltura1catchValueFromSpinner(evt);
            }
        });
        back.add(spnAltura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 60, 30));

        spnPeso1.setModel(new javax.swing.SpinnerNumberModel(55.0d, null, null, 0.5d));
        spnPeso1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnPeso1catchValueofPesoSpinner(evt);
            }
        });
        spnPeso1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                spnPeso1FocusLost(evt);
            }
        });
        back.add(spnPeso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 60, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Peso en kilogramos:");
        back.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Altura en metros:");
        back.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, -1, 20));

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Connection c = con.conectar();
        ResultSet rs;
        PreparedStatement ps;

        String alergia = null;
        String enfermedad = null;

        if (rbAlergiasNo1.isSelected() == true) {
            alergia = "Ninguno";
        } else {
            alergia = txtAlergia.getText();
            validarAlergia(alergia);
        }

        if (rbEnfermedadNo1.isSelected() == true) {
            enfermedad = "Ninguno";
        } else {
            enfermedad = txtEnfermedad.getText();
            validarEnfermedad(enfermedad);

        }
        // !NoEnfermedad.isVisible() && !NoAlergia.isVisible()

        if ((rbAlergiasSi1.isSelected() && SiAlergia.isVisible())
                || (rbEnfermedadSi1.isSelected() && SiEnfermedad.isVisible())
                || (rbEnfermedadNo1.isSelected() && rbAlergiasNo1.isSelected())
                ) {
            try {
                PreparedStatement modificarAlumno = c.prepareStatement(
                        "UPDATE alumnos "
                        + "SET t_sangre=?,"
                        + " peso =?,"
                        + " altura =?,"
                        + " alrgias =?,"
                        + " enfermedades=?"
                        + " WHERE id=?");

                modificarAlumno.setString(1, cbSangre1.getSelectedItem().toString());
                modificarAlumno.setString(2, spnPeso1.getValue().toString());
                modificarAlumno.setString(3, spnAltura1.getValue().toString());

                modificarAlumno.setString(4, alergia);
                modificarAlumno.setString(5, enfermedad);
                modificarAlumno.setInt(6, obtenerId());

                modificarAlumno.execute();
                modificarAlumno.close();
                //  JOptionPane.showInputDialog("ALumno guardado con éxito");
                //Cambiar a 5

                AgregarAlumnoP5 pantalla = new AgregarAlumnoP5();
                pantalla.setSize(1070, 730);
                pantalla.setLocation(0, 0);

                rightPanelAdmin.removeAll();
                rightPanelAdmin.add(pantalla, BorderLayout.CENTER);
                rightPanelAdmin.revalidate();
                rightPanelAdmin.repaint();

            } catch (SQLException ex) {
                System.out.println("error al guardar los datos: " + ex);
                JOptionPane.showMessageDialog(null, "Error al guardar los datos");
                ModificarAlumnoP4 ag = new ModificarAlumnoP4();
                ag.setSize(1070, 730);
                ag.setLocation(0, 0);
                rightPanelAdmin.removeAll();
                rightPanelAdmin.add(ag, BorderLayout.CENTER);
                rightPanelAdmin.revalidate();
                rightPanelAdmin.repaint();

            } catch (RuntimeException j) {

                //  JOptionPane.showMessageDialog(null, "Verifique la conectividad del detector");
            } finally {
                con.desconectar();
            }

        }

    }//GEN-LAST:event_jButton3ActionPerformed

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
            if (txtAlergia.getText().matches("[a-zA-ZáéíóúÁÉÍÓÚÜüñÑ, ]*")) {
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

    private void spnAltura1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnAltura1StateChanged
        //
    }//GEN-LAST:event_spnAltura1StateChanged

    private void spnAltura1catchValueFromSpinner(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnAltura1catchValueFromSpinner

        String s = spnAltura1.getValue().toString();
        Double altura = Double.parseDouble(s);
        verificarAltura(altura);

    }//GEN-LAST:event_spnAltura1catchValueFromSpinner

    private void spnPeso1catchValueofPesoSpinner(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnPeso1catchValueofPesoSpinner
        String s = spnPeso1.getValue().toString();
        Double peso = Double.parseDouble(s);
        verificarPeso(peso);
    }//GEN-LAST:event_spnPeso1catchValueofPesoSpinner

    private void spnPeso1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_spnPeso1FocusLost

    }//GEN-LAST:event_spnPeso1FocusLost

    ConexionBD con = new ConexionBD();

    void verificarPeso(Double peso) {
        if (peso < 20) {
            VerifiquePeso.setVisible(true);
            SiPeso.setVisible(true);
            CuidadoPeso.setVisible(true);
            System.out.println("Meneor a 20");
        } else if (peso > 200) {
            VerifiquePeso.setVisible(true);
            CuidadoPeso.setVisible(true);
            SiPeso.setVisible(false);
            System.out.println("Mayor a 20");
        } else {
            VerifiquePeso.setVisible(false);
            CuidadoPeso.setVisible(false);
            SiPeso.setVisible(true);
        }
        System.out.println(peso + "");
    }

    void verificarAltura(Double altura) {
        if (altura < .50) {
            VerifiqueAltura.setVisible(true);
            CuidadoAltura.setVisible(true);
            SiAltura.setVisible(false);
            System.out.println("Meneor a 50 cm");
        } else if (altura > 2.7) {
            VerifiqueAltura.setVisible(true);
            CuidadoAltura.setVisible(true);
            SiAltura.setVisible(false);
            System.out.println("Mayor a mayor a ");
        } else {
            VerifiqueAltura.setVisible(false);
            CuidadoAltura.setVisible(false);
            SiAltura.setVisible(true);
        }
        System.out.println(altura + "");
    }

    void validarAlergia(String alergia) {
        if (alergia.isEmpty() || alergia.equals("")) {
            SiAlergia.setVisible(false);
            VerifiqueAlergia.setVisible(false);
            NoAlergia.setVisible(false);
            Necesario.setVisible(true);
        } else if (alergia.matches("[a-zA-ZáéíóúÁÉÍÓÚÜüñÑ, ]*")) {
            SiAlergia();
        } else {
            SiAlergia.setVisible(false);
            VerifiqueAlergia.setVisible(true);
            NoAlergia.setVisible(true);
            Necesario.setVisible(false);

        }
        // JOptionPane.showInputDialog("verificado");
    }

    void validarEnfermedad(String enfermedad) {

        if (enfermedad.isEmpty() || enfermedad.equals("")) {
            SiEnfermedad.setVisible(false);
            VerifiqueEnfermedad.setVisible(false);
            NoEnfermedad.setVisible(false);
            NecesarioEnferm.setVisible(true);
        } else if (enfermedad.matches("[a-zA-ZáéíóúÁÉÍÓÚÜüñÑ, ]*")) {
            SiEnfermedad();

        } else {
            VerifiqueEnfermedad.setVisible(true);
            NoEnfermedad.setVisible(true);
            NecesarioEnferm.setVisible(false);
            SiEnfermedad.setVisible(false);
        }
    }

    void NoEnfermedad() {
        VerifiqueEnfermedad.setVisible(false);
        NoEnfermedad.setVisible(false);
        NecesarioEnferm.setVisible(false);
        SiEnfermedad.setVisible(false);
        txtEnfermedad.setVisible(false);
    }

    void SiEnfermedad() {
        SiEnfermedad.setVisible(true);
        VerifiqueEnfermedad.setVisible(false);
        NoEnfermedad.setVisible(false);
        NecesarioEnferm.setVisible(false);
        txtEnfermedad.setVisible(true);
    }

    void NoAlergia() {
        SiAlergia.setVisible(false);
        VerifiqueAlergia.setVisible(false);
        NoAlergia.setVisible(false);
        Necesario.setVisible(false);
        txtAlergia.setVisible(false);
    }

    void SiAlergia() {
        SiAlergia.setVisible(true);
        VerifiqueAlergia.setVisible(false);
        NoAlergia.setVisible(false);
        Necesario.setVisible(false);
        txtAlergia.setVisible(true);
    }

    public static int obtenerId() throws SQLException {
        int id = 0;
        ResultSet rs;
        PreparedStatement ps;
        ResultSetMetaData rsm;
        DefaultTableModel dtm;
        ConexionBD conn = new ConexionBD();

        Connection c = conn.conectar();
        ps = c.prepareStatement("    SELECT id \n"
                + "FROM alumnos\n"
                + "ORDER BY id DESC\n"
                + "LIMIT 1");

        rs = ps.executeQuery();

        while (rs.next()) {
            id = rs.getInt("id");
        }

        return id;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup AlergiasGroup;
    private javax.swing.JLabel CuidadoAltura;
    private javax.swing.JLabel CuidadoPeso;
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
    private javax.swing.JComboBox<String> cbSangre1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
