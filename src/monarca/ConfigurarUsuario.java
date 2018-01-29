package monarca;

import db.ConexionBD;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class ConfigurarUsuario extends javax.swing.JPanel {

    public ConfigurarUsuario() {
        initComponents();

        lblInstructorId.setVisible(false);

      

        lbAlergia.setVisible(false);
        txtAlergia.setVisible(false);

        lbEnfermedad.setVisible(false);
        txtEnfermedad.setVisible(false);
    }
    mainAmbos m = new mainAmbos();
    ConexionBD con = new ConexionBD();

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DeporteGroup = new javax.swing.ButtonGroup();
        AlergiasGroup = new javax.swing.ButtonGroup();
        EnfermedadesGroup = new javax.swing.ButtonGroup();
        back = new javax.swing.JPanel();
        TitlePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtAPat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAMat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDireccion = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbSangre = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        txtAlergia = new javax.swing.JTextField();
        rbAlergiasSi = new javax.swing.JRadioButton();
        rbAlergiasNo = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        lbAlergia = new javax.swing.JLabel();
        txtEnfermedad = new javax.swing.JTextField();
        rbEnfermedadSi = new javax.swing.JRadioButton();
        lbEnfermedad = new javax.swing.JLabel();
        rbEnfermedadNo = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        lblInstructorId = new javax.swing.JLabel();
        dtNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel21 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        cbSangre1 = new javax.swing.JComboBox<>();
        cbSangre2 = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setPreferredSize(new java.awt.Dimension(970, 720));
        back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitlePanel.setBackground(new java.awt.Color(121, 72, 221));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Configurar Instructor");

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(356, 356, 356)
                .addComponent(jLabel1)
                .addContainerGap(492, Short.MAX_VALUE))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        back.add(TitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1070, 70));

        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setNextFocusableComponent(txtNombre);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        back.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 620, 300, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Apellido paterno:");
        back.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        txtAPat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAPat.setNextFocusableComponent(txtAMat);
        txtAPat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAPatActionPerformed(evt);
            }
        });
        back.add(txtAPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 200, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Número telefónico del tutor(10 dígitos)");
        back.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        txtAMat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAMat.setNextFocusableComponent(dtNacimiento);
        txtAMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAMatActionPerformed(evt);
            }
        });
        back.add(txtAMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 200, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tipo Sanguíneo:");
        back.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 300, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Apellido materno:");
        back.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Información personal");
        back.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Dirección:");
        back.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        txtaDireccion.setColumns(20);
        txtaDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtaDireccion.setLineWrap(true);
        txtaDireccion.setRows(5);
        jScrollPane1.setViewportView(txtaDireccion);

        back.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 260, 60));

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel9.setText("Alergias");
        back.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 80, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Información de médica");
        back.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Fecha de nacimiento:");
        back.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        cbSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Instructor", "Administrador de Finanzas", "Instructor y Administrador de Finanzas" }));
        back.add(cbSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 420, 200, 30));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setNextFocusableComponent(txtAPat);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        back.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 200, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Nombre:");
        back.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Información de contacto");
        back.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 200, 30));

        txtAlergia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAlergia.setNextFocusableComponent(rbEnfermedadNo);
        back.add(txtAlergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 170, 30));

        rbAlergiasSi.setBackground(new java.awt.Color(255, 255, 255));
        AlergiasGroup.add(rbAlergiasSi);
        rbAlergiasSi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbAlergiasSi.setText("Sí");
        rbAlergiasSi.setNextFocusableComponent(txtAlergia);
        rbAlergiasSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlergiasSiActionPerformed(evt);
            }
        });
        back.add(rbAlergiasSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, -1, -1));

        rbAlergiasNo.setBackground(new java.awt.Color(255, 255, 255));
        AlergiasGroup.add(rbAlergiasNo);
        rbAlergiasNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbAlergiasNo.setSelected(true);
        rbAlergiasNo.setText("No");
        rbAlergiasNo.setNextFocusableComponent(rbEnfermedadNo);
        rbAlergiasNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlergiasNoActionPerformed(evt);
            }
        });
        back.add(rbAlergiasNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("¿El alumno tiene alergias?");
        back.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, -1, -1));

        lbAlergia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbAlergia.setText("¿Cuáles?");
        back.add(lbAlergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));

        txtEnfermedad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEnfermedad.setNextFocusableComponent(btnAceptar);
        back.add(txtEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 180, 30));

        rbEnfermedadSi.setBackground(new java.awt.Color(255, 255, 255));
        EnfermedadesGroup.add(rbEnfermedadSi);
        rbEnfermedadSi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbEnfermedadSi.setText("Sí");
        rbEnfermedadSi.setNextFocusableComponent(txtEnfermedad);
        rbEnfermedadSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEnfermedadSiActionPerformed(evt);
            }
        });
        back.add(rbEnfermedadSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, -1, -1));

        lbEnfermedad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbEnfermedad.setText("¿Cuáles?");
        back.add(lbEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, -1, -1));

        rbEnfermedadNo.setBackground(new java.awt.Color(255, 255, 255));
        EnfermedadesGroup.add(rbEnfermedadNo);
        rbEnfermedadNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbEnfermedadNo.setSelected(true);
        rbEnfermedadNo.setText("No");
        rbEnfermedadNo.setNextFocusableComponent(btnAceptar);
        rbEnfermedadNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEnfermedadNoActionPerformed(evt);
            }
        });
        back.add(rbEnfermedadNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("¿El alumno tiene enfermedades?");
        back.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel26.setText("Enfermedades");
        back.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 130, -1));

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.setNextFocusableComponent(cbSangre);
        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });
        back.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, 210, 30));
        back.add(lblInstructorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 10));

        dtNacimiento.setToolTipText("");
        back.add(dtNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 200, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Información de la cuenta");
        back.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Usuario:");
        back.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Nombre:");
        back.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 230, -1, -1));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 300, 190, 30));

        jPasswordField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 240, 200, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Contraseña:");
        back.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, -1, -1));

        jPasswordField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 360, 190, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Tipo de usuario:");
        back.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Repetir contraseña:");
        back.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, -1, -1));

        cbSangre1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O +", "O -", "A +", "A -", "B +", "B -", "AB +", "AB -" }));
        back.add(cbSangre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 170, 30));

        cbSangre2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Instructor", "Administrador de Finanzas", "Instructor y Administrador de Finanzas" }));
        cbSangre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSangre2ActionPerformed(evt);
            }
        });
        back.add(cbSangre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 180, 200, 30));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Escuela:");
        back.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 1160, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAPatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAPatActionPerformed
    }//GEN-LAST:event_txtAPatActionPerformed

    private void txtAMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAMatActionPerformed
    }//GEN-LAST:event_txtAMatActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String nombre = txtNombre.getText();
        String aPaterno = txtAPat.getText();
        String aMaterno = txtAMat.getText();

        int anio = dtNacimiento.getCalendar().get(Calendar.YEAR);
        int mes = dtNacimiento.getCalendar().get(Calendar.MONTH) + 1;
        int dia = dtNacimiento.getCalendar().get(Calendar.DAY_OF_MONTH);
        String fNacimiento = String.valueOf(anio) + "/" + String.valueOf(mes) + "/" + String.valueOf(dia);

        
        String tSangre = cbSangre.getSelectedItem().toString();
        String direccion = txtaDireccion.getText();
        
        String tCelular = txtCelular.getText();
        String alergias = txtAlergia.getText();
        String enfermedades = txtEnfermedad.getText();
        
        int instructor = Integer.parseInt(lblInstructorId.getText());
       
//        agregarAlumnoBD(nombre, aPaterno, aMaterno, fNacimiento, peso, altura, tSangre, direccion, cinta, tutor, parentesco, tCelular,
//                alergias, enfermedades, deporte, instructor);
//       
        
       
        
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed

    }//GEN-LAST:event_txtCelularActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void rbEnfermedadNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEnfermedadNoActionPerformed
        lbEnfermedad.setVisible(false);
        txtEnfermedad.setVisible(false);
    }//GEN-LAST:event_rbEnfermedadNoActionPerformed

    private void rbEnfermedadSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEnfermedadSiActionPerformed
        lbEnfermedad.setVisible(true);
        txtEnfermedad.setVisible(true);
    }//GEN-LAST:event_rbEnfermedadSiActionPerformed

    private void rbAlergiasNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlergiasNoActionPerformed
        lbAlergia.setVisible(false);
        txtAlergia.setVisible(false);
    }//GEN-LAST:event_rbAlergiasNoActionPerformed

    private void rbAlergiasSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlergiasSiActionPerformed
        lbAlergia.setVisible(true);
        txtAlergia.setVisible(true);
    }//GEN-LAST:event_rbAlergiasSiActionPerformed

    private void cbSangre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSangre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSangre2ActionPerformed

    
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
        txtNombre.setText("");
        txtAPat.setText("");
        txtAMat.setText("");
        txtAlergia.setText("");
        txtCelular.setText("");
        
        txtEnfermedad.setText("");
        
        txtaDireccion.setText("");
        
        dtNacimiento.setDate(null);
       
        cbSangre.setSelectedIndex(0);
        rbAlergiasNo.setSelected(true);
       
        rbEnfermedadNo.setSelected(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup AlergiasGroup;
    private javax.swing.ButtonGroup DeporteGroup;
    private javax.swing.ButtonGroup EnfermedadesGroup;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JPanel back;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JComboBox<String> cbSangre;
    private javax.swing.JComboBox<String> cbSangre1;
    private javax.swing.JComboBox<String> cbSangre2;
    private com.toedter.calendar.JDateChooser dtNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lbAlergia;
    private javax.swing.JLabel lbEnfermedad;
    public javax.swing.JLabel lblInstructorId;
    private javax.swing.JRadioButton rbAlergiasNo;
    private javax.swing.JRadioButton rbAlergiasSi;
    private javax.swing.JRadioButton rbEnfermedadNo;
    private javax.swing.JRadioButton rbEnfermedadSi;
    private javax.swing.JTextField txtAMat;
    private javax.swing.JTextField txtAPat;
    private javax.swing.JTextField txtAlergia;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtEnfermedad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtaDireccion;
    // End of variables declaration//GEN-END:variables
}
