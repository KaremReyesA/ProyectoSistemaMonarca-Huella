package monarca;

import com.digitalpersona.onetouch.jni.JniException;
import db.ConexionBD;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import static monarca.ModificarAlumno.labelID;
import static monarca.VerAlumnos.idNowModify;
import static monarca.VerDatosAlumno.idNow;


import static monarca.mainAdmin.rightPanelAdmin;

public class ModificarAlumnoP4 extends javax.swing.JPanel {

    public static int inicial = 0;

    public ModificarAlumnoP4() {
        initComponents();

        lblInstructorId.setVisible(false);

        SiSangre.setVisible(false);

        SiPeso.setVisible(false);
        VerifiquePeso.setVisible(false);
        CuidadoPeso.setVisible(false);

        SiAltura.setVisible(false);
        VerifiqueAltura.setVisible(false);
        CuidadoAltura.setVisible(false);

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
        
        
       //////// ////
        try {

            Connection c = con.conectar();
            ResultSet rs;
            PreparedStatement ps;

                String aler=null, enfer=null;

                int numcontrol= Integer.parseInt(idNowModify);
                ps = c.prepareStatement("SELECT * FROM `alumnos` WHERE id=?");
                ps.setInt(1,numcontrol);
                rs= ps.executeQuery();
                if(rs.next()){
                    
                    cbSangre1.setSelectedItem(rs.getString("t_sangre"));
                    spnPeso1.setValue(Double.parseDouble(rs.getString("peso")));
                    spnAltura1.setValue(Double.parseDouble(rs.getString("altura")));

                   
                    aler= rs.getString("alrgias");
                    
                        if (aler.equals("Ninguno")){
                         rbAlergiasNo1.setSelected(true);
                    //System.out.println("Ningun deporte");
                    NoAlergia();

                    }else{
                       // System.out.println("deportes "+ aler);
                        rbAlergiasSi1.setSelected(true);
                        SiAlergia();
                        txtAlergia.setText(rs.getString("alrgias"));
                    }   
                    
                    enfer= rs.getString("enfermedades");
                    
//                   
                    if (enfer.equals("Ninguno")){
                         rbEnfermedadNo1.setSelected(true);
                    //System.out.println("Ningun deporte");
                    NoEnfermedad();

                    }else{
                        //System.out.println("deportes "+ aler);
                        rbEnfermedadSi1.setSelected(true);
                        SiEnfermedad();
                        txtEnfermedad.setText(rs.getString("enfermedades"));
                    }   
                }
            }


         catch (SQLException ex) {
            Logger.getLogger(ModificarAlumno.class.getName()).log(Level.SEVERE, null, ex);
            }
        
      


//        //Modificar datos en caso que se encuentre agregando un alumno 
//        try catch (SQLException ex) {
//            Logger.getLogger(ModificarAlumno.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }
    
//      public static void main(String args[]) {
//       JSpinner spnPeso1 = new JSpinner();
//
//        ChangeListener listener = new ChangeListener() {
//          public void stateChanged(ChangeEvent e) {
//            System.out.println("Source: " + e.getSource());
//          }
//        };
//
//      spnPeso1.addChangeListener(listener);
//        spnPeso1.setValue(new Float(100));
//      }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DeporteGroup = new javax.swing.ButtonGroup();
        AlergiasGroup = new javax.swing.ButtonGroup();
        EnfermedadesGroup = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        back = new javax.swing.JPanel();
        TitlePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblInstructorId = new javax.swing.JLabel();
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
        CuidadoPeso = new javax.swing.JLabel();
        CuidadoAltura = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();

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
        back.add(lblInstructorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 10));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Tipo Sanguíneo:");
        back.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 120, -1));

        cbSangre1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O +", "O -", "A +", "A -", "B +", "B -", "AB +", "AB -", "No Disponible" }));
        cbSangre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSangre1ActionPerformed(evt);
            }
        });
        back.add(cbSangre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 110, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel14.setText("Información médica");
        back.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Peso en kilogramos:");
        back.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Altura en metros:");
        back.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, -1, 20));

        spnAltura1.setModel(new javax.swing.SpinnerNumberModel(1.52d, null, null, 0.01d));
        spnAltura1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnAltura1StateChanged(evt);
                catchValueFromSpinner(evt);
            }
        });
        back.add(spnAltura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 60, 30));

        spnPeso1.setModel(new javax.swing.SpinnerNumberModel(55.0d, null, null, 0.5d));
        spnPeso1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                catchValueofPesoSpinner(evt);
            }
        });
        spnPeso1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                spnPeso1FocusLost(evt);
            }
        });
        back.add(spnPeso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 60, 30));

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
        txtAlergia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlergiaActionPerformed(evt);
            }
        });
        back.add(txtAlergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 220, 30));

        SiAlergia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Ok_30px.png"))); // NOI18N
        back.add(SiAlergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, 50, 40));

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
        back.add(NoEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 590, 50, 40));

        SiEnfermedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Ok_30px.png"))); // NOI18N
        back.add(SiEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 590, 50, 40));

        txtEnfermedad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEnfermedad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEnfermedadFocusLost(evt);
            }
        });
        back.add(txtEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 600, 220, 30));

        lblEnfermedad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEnfermedad.setText("¿Cuál?");
        back.add(lblEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 610, -1, 20));

        SiSangre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Ok_30px.png"))); // NOI18N
        back.add(SiSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 50, 40));

        SiPeso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Ok_30px.png"))); // NOI18N
        back.add(SiPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 50, 40));

        SiAltura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Ok_30px.png"))); // NOI18N
        back.add(SiAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, 40, 40));

        VerifiqueAltura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        VerifiqueAltura.setForeground(new java.awt.Color(255, 153, 0));
        VerifiqueAltura.setText("Verifique los valores ingresados");
        back.add(VerifiqueAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 240, 50));

        VerifiquePeso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        VerifiquePeso.setForeground(new java.awt.Color(255, 153, 0));
        VerifiquePeso.setText("Verifique los valores ingresados");
        back.add(VerifiquePeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 240, 50));

        CuidadoPeso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Error_30px_10.png"))); // NOI18N
        back.add(CuidadoPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, -1, -1));

        CuidadoAltura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Error_30px_10.png"))); // NOI18N
        back.add(CuidadoAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Información personal");
        back.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Información de contacto");
        back.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Información deportiva");
        back.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Información médica");
        back.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, -1, -1));

        jProgressBar1.setValue(77);
        back.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 980, 20));

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


    }//GEN-LAST:event_rbEnfermedadSi1ActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
                    
            Connection c = con.conectar();
            ResultSet rs;
            PreparedStatement ps;
            
            String alergia =null;
            String enfermedad = null;
            
            if (rbAlergiasNo1.isSelected()==true) {
                alergia = "Ninguno";
            } else {
               alergia = txtAlergia.getText();
                validarAlergia(alergia);                    
            }
                
            
            if (rbEnfermedadNo1.isSelected()==true) {
                enfermedad = "Ninguno";
            } else {
                enfermedad = txtEnfermedad.getText();
                    validarEnfermedad(enfermedad);
                
            }
            
            if(!NoEnfermedad.isVisible() && !NoAlergia.isVisible()
            ){
                try {
                    PreparedStatement modificarAlumno = c.prepareStatement("UPDATE alumnos SET t_sangre=?, peso =?, altura =?, alrgias =?, enfermedades=? WHERE id=?");

                    modificarAlumno.setString(1, cbSangre1.getSelectedItem().toString());
                    modificarAlumno.setString(2, spnPeso1.getValue().toString());
                    modificarAlumno.setString(3, spnAltura1.getValue().toString());

                    modificarAlumno.setString(4, alergia);
                    modificarAlumno.setString(5, enfermedad);
                    modificarAlumno.setString(6, labelID.getText());

                    modificarAlumno.execute();
                    modificarAlumno.close();
                    //Cambiar a 5
                     idNow = labelID.getText();
                    
                    VerDatosAlumno pantalla = new VerDatosAlumno();
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

                } catch(RuntimeException j){
                
                    JOptionPane.showMessageDialog(null, "Verifique la conectividad del detector");
                }
                finally {
                    con.desconectar();
                    }
                
                
             }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        ModificarAlumnoP3 articulos = new ModificarAlumnoP3();
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
    
    }//GEN-LAST:event_spnPeso1FocusLost

    private void txtEnfermedadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnfermedadFocusLost
        validarEnfermedad(txtEnfermedad.getText());

        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnfermedadFocusLost

    private void txtAlergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlergiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlergiaActionPerformed

    private void cbSangre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSangre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSangre1ActionPerformed

    private void spnAltura1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnAltura1StateChanged
//     
    }//GEN-LAST:event_spnAltura1StateChanged

    private void catchValueFromSpinner(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_catchValueFromSpinner
   
      String s= spnAltura1.getValue().toString();
      Double altura= Double.parseDouble(s);
        verificarAltura(altura);
     
    }//GEN-LAST:event_catchValueFromSpinner

    private void catchValueofPesoSpinner(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_catchValueofPesoSpinner
        String s= spnPeso1.getValue().toString();
        Double peso= Double.parseDouble(s);
        verificarPeso(peso);
    }//GEN-LAST:event_catchValueofPesoSpinner

    ConexionBD con = new ConexionBD();

    void validarAlergia(String alergia) {
         if(alergia.isEmpty()){
                    SiAlergia.setVisible(false);
                    VerifiqueAlergia.setVisible(false);
                    NoAlergia.setVisible(false);
                    Necesario.setVisible(true);
                }
         else if(alergia.matches("[a-zA-ZáéíóúÁÉÍÓÚÜüñÑ ]*")){
               SiAlergia();
            } else{
               SiAlergia.setVisible(false);
                VerifiqueAlergia.setVisible(true);
                NoAlergia.setVisible(true);
                Necesario.setVisible(false);
            
            }
        // JOptionPane.showInputDialog("verificado");
    }

    
    void validarEnfermedad(String enfermedad) {
                
            if(enfermedad.isEmpty()){
                    SiEnfermedad.setVisible(false);
                    VerifiqueEnfermedad.setVisible(false);
                    NoEnfermedad.setVisible(false);
                    NecesarioEnferm.setVisible(true);
                    }else if(enfermedad.matches("[a-zA-ZáéíóúÁÉÍÓÚÜüñÑ ]*")){
                SiEnfermedad();

                
            } else{
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
    void verificarPeso(Double peso) {
            if(peso<20){
                VerifiquePeso.setVisible(true);
                SiPeso.setVisible(true);
                CuidadoPeso.setVisible(true);
                System.out.println("Meneor a 20");
            }else if (peso>200){
                VerifiquePeso.setVisible(true);
                CuidadoPeso.setVisible(true);
                SiPeso.setVisible(false);
                 System.out.println("Mayor a 20");
            }
            else{
             VerifiquePeso.setVisible(false);
             CuidadoPeso.setVisible(false);
             SiPeso.setVisible(true);
            }
             System.out.println(peso +"");
    }
    
    void verificarAltura(Double altura) {
            if(altura<.50){
                VerifiqueAltura.setVisible(true);
                CuidadoAltura.setVisible(true);
                SiAltura.setVisible(false);
                System.out.println("Meneor a 50 cm");
            }else if (altura>2.7){
                VerifiqueAltura.setVisible(true);
                CuidadoAltura.setVisible(true);
                SiAltura.setVisible(false);
                 System.out.println("Mayor a mayor a ");
            }else{
             VerifiqueAltura.setVisible(false);
             CuidadoAltura.setVisible(false);
             SiAltura.setVisible(true);
            }
             System.out.println(altura +"");
    }

    
     void noAlergia() {
       lblAlergia.setVisible(false);
        txtAlergia.setVisible(false);   
        SiAlergia.setVisible(false);   
        NoAlergia.setVisible(false);   
        VerifiqueAlergia.setVisible(false);
        Necesario.setVisible(false); 
        

    }

     void siAlergia() {
        lblAlergia.setVisible(true);
        txtAlergia.setVisible(true);    
        txtAlergia.setText("");
     }
     
      void noEnfermedad() {
       lblEnfermedad.setVisible(false);
        txtEnfermedad.setVisible(false);   
        SiEnfermedad.setVisible(false);   
        NoEnfermedad.setVisible(false);   
        VerifiqueEnfermedad.setVisible(false);
        NecesarioEnferm.setVisible(false); 
        

    }

     void siEnfermedad() {
        lblEnfermedad.setVisible(true);
        txtEnfermedad.setVisible(true);    
        txtEnfermedad.setText("");
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
    private javax.swing.JButton btnFinalizar;
    private javax.swing.ButtonGroup buttonGroup1;
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
