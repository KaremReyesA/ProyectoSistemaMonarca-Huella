package monarca;

import db.ConexionBD;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import static monarca.mainAdmin.rightPanelAdmin;
import static monarca.VerInstructores.idNowModifyInst;

public class ModificarInstructor extends javax.swing.JPanel {
 public static int inicial = 0;
//If any key is typed, set message with error
    public ModificarInstructor() { 
        
        initComponents();

        lblInstructorId.setVisible(false);
        
        IcoCorreNombre.setVisible(false);
        iconIncoNombre.setVisible(false);
        IncoNombre.setVisible(false);
        NombreRequerido.setVisible(false);
        
        IcoCorreApellidoP.setVisible(false);
        iconIncoApellidoP.setVisible(false);
        NoApellidoPa.setVisible(false);
        ApellidoPRequerido.setVisible(false);
        
        IcoCorreApellidoM.setVisible(false);
        iconIncoApellidoM.setVisible(false);
        NoApellidoMate.setVisible(false);
        
        FechaRequerida.setVisible(false);
        SiFecha.setVisible(false);
        labelIDI.setVisible(false);
        
        
    //////////////////////////////////////////////////////
    
         
        try {
            
            Connection c = con.conectar();
            ResultSet rs;
            PreparedStatement ps;
             int numcontrol= Integer.parseInt(idNowModifyInst);
             ps = c.prepareStatement("SELECT * FROM `usuarios` WHERE id=?");
            ps.setInt(1,numcontrol);
            rs= ps.executeQuery();
            
            if(rs.next()){
                    txtNombre.setText(rs.getString("nombre"));
                    txtAPat.setText(rs.getString("apellido_paterno"));
                    txtAMat.setText(rs.getString("apellido_materno"));
                    dtNacimiento.setDate(rs.getDate("fecha_nacimiento"));
                    
            }
           
        
        
        }
            
            // TODO add your handling code here:
         catch (SQLException ex) {
            Logger.getLogger(ModificarInstructor.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel2 = new javax.swing.JLabel();
        txtAPat = new javax.swing.JTextField();
        txtAMat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        lblInstructorId = new javax.swing.JLabel();
        dtNacimiento = new com.toedter.calendar.JDateChooser();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        IcoCorreNombre = new javax.swing.JLabel();
        iconIncoNombre = new javax.swing.JLabel();
        IncoNombre = new javax.swing.JLabel();
        NoApellidoPa = new javax.swing.JLabel();
        NoApellidoMate = new javax.swing.JLabel();
        iconIncoApellidoP = new javax.swing.JLabel();
        IcoCorreApellidoP = new javax.swing.JLabel();
        iconIncoApellidoM = new javax.swing.JLabel();
        IcoCorreApellidoM = new javax.swing.JLabel();
        NombreRequerido = new javax.swing.JLabel();
        ApellidoPRequerido = new javax.swing.JLabel();
        FechaRequerida = new javax.swing.JLabel();
        labelIDInstructor = new javax.swing.JLabel();
        SiFecha = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelIDI = new javax.swing.JLabel();

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setPreferredSize(new java.awt.Dimension(970, 720));
        back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitlePanel.setBackground(new java.awt.Color(121, 72, 221));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modificación de Instructor");

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitlePanelLayout.createSequentialGroup()
                .addContainerGap(377, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(418, 418, 418))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        back.add(TitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1070, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Apellido paterno:");
        back.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, -1));

        txtAPat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAPat.setNextFocusableComponent(txtAMat);
        txtAPat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAPatFocusLost(evt);
            }
        });
        txtAPat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAPatMouseClicked(evt);
            }
        });
        back.add(txtAPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 240, 30));

        txtAMat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAMat.setNextFocusableComponent(dtNacimiento);
        txtAMat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAMatFocusLost(evt);
            }
        });
        txtAMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAMatActionPerformed(evt);
            }
        });
        back.add(txtAMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 240, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Apellido materno:");
        back.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, -1, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Fecha de nacimiento:");
        back.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, -1, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setNextFocusableComponent(txtAPat);
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        back.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 240, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Nombre:");
        back.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, -1));
        back.add(lblInstructorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 10));

        dtNacimiento.setToolTipText("");
        dtNacimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dtNacimientoMouseClicked(evt);
            }
        });
        dtNacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dtNacimientoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dtNacimientoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dtNacimientoKeyTyped(evt);
            }
        });
        back.add(dtNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 570, 250, 30));
        back.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 980, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel13.setText("Información personal");
        back.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("CONTINUAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        back.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 640, 290, 40));

        IcoCorreNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Ok_30px.png"))); // NOI18N
        back.add(IcoCorreNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 50, 40));

        iconIncoNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Cancel_30px.png"))); // NOI18N
        back.add(iconIncoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 50, 40));

        IncoNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        IncoNombre.setForeground(java.awt.Color.red);
        IncoNombre.setText("Solo se pueden ingresar nombres reales");
        back.add(IncoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 240, 50));

        NoApellidoPa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NoApellidoPa.setForeground(java.awt.Color.red);
        NoApellidoPa.setText("Solo se pueden ingresar apellidos reales");
        back.add(NoApellidoPa, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 240, 50));

        NoApellidoMate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NoApellidoMate.setForeground(java.awt.Color.red);
        NoApellidoMate.setText("Solo se pueden ingresar apellidos reales");
        back.add(NoApellidoMate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 240, 50));

        iconIncoApellidoP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Cancel_30px.png"))); // NOI18N
        back.add(iconIncoApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, 50, 40));

        IcoCorreApellidoP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Ok_30px.png"))); // NOI18N
        back.add(IcoCorreApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, 50, 40));

        iconIncoApellidoM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Cancel_30px.png"))); // NOI18N
        back.add(iconIncoApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, 50, 40));

        IcoCorreApellidoM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Ok_30px.png"))); // NOI18N
        back.add(IcoCorreApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, 50, 40));

        NombreRequerido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NombreRequerido.setForeground(java.awt.Color.red);
        NombreRequerido.setText("Este campo es requerido");
        back.add(NombreRequerido, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 240, 50));

        ApellidoPRequerido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ApellidoPRequerido.setForeground(java.awt.Color.red);
        ApellidoPRequerido.setText("Este campo es requerido");
        back.add(ApellidoPRequerido, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 240, 50));

        FechaRequerida.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        FechaRequerida.setForeground(java.awt.Color.red);
        FechaRequerida.setText("Este campo es requerido");
        back.add(FechaRequerida, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, 240, 110));
        back.add(labelIDInstructor, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 220, 110, 40));

        SiFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Ok_30px.png"))); // NOI18N
        back.add(SiFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 570, 50, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Información personal");
        back.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Información de contacto");
        back.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Información de la cuenta");
        back.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, -1, -1));

        labelIDI.setForeground(new java.awt.Color(255, 255, 255));
        back.add(labelIDI, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 220, 50, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 1079, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAMatActionPerformed
    }//GEN-LAST:event_txtAMatActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            String nombre = txtNombre.getText();
            String aPaterno = txtAPat.getText();
            String aMaterno = txtAMat.getText();
            

            if (nombre.isEmpty()){
                NombreRequerido.setVisible(true);
            }

            if (aPaterno.isEmpty()){
                ApellidoPRequerido.setVisible(true);
            }

            int anio = dtNacimiento.getCalendar().get(Calendar.YEAR);
            int mes = dtNacimiento.getCalendar().get(Calendar.MONTH) + 1;
            int dia = dtNacimiento.getCalendar().get(Calendar.DAY_OF_MONTH);
            String fNacimiento = String.valueOf(anio) + "/" + String.valueOf(mes) + "/" + String.valueOf(dia);
            
            ValidarNombre(nombre);
            ValidarAPaterno(aPaterno);
            ValidarAMaterno(aMaterno);
            ///////    
            if(inicial == 0 && (idNowModifyInst==null|| idNowModifyInst.equals(0))){
                //PrimeraVez sin datos
               
                if(!nombre.isEmpty() && !aPaterno.isEmpty() && IcoCorreNombre.isVisible()&& IcoCorreApellidoP.isVisible()){
                    agregarAlumnoBD(nombre, aPaterno, aMaterno, fNacimiento);
                    
                    ModificarInstructorP2 articulos = new ModificarInstructorP2();
                    articulos.setSize(1070,730);
                    articulos.setLocation(0, 0);

                    rightPanelAdmin.removeAll();
                    rightPanelAdmin.add(articulos, BorderLayout.CENTER);
                    rightPanelAdmin.revalidate();
                    rightPanelAdmin.repaint();
                }

                
            } else{
                
                if(!nombre.isEmpty() && !aPaterno.isEmpty()&& IcoCorreNombre.isVisible() && IcoCorreApellidoP.isVisible()){
                    ///Modificar y luego cambiar  
                    try {

                        Connection c = con.conectar();
                        ResultSet rs;
                        PreparedStatement ps;

                        PreparedStatement modificarAlumno = c.prepareStatement("UPDATE usuarios SET nombre=?, apellido_paterno =?, apellido_materno =?, fecha_nacimiento=? WHERE id=?");

                        modificarAlumno.setString(1, txtNombre.getText());
                        modificarAlumno.setString(2, txtAPat.getText());
                        modificarAlumno.setString(3, txtAMat.getText());
                        modificarAlumno.setString(4, fNacimiento);
                        modificarAlumno.setString(5, idNowModifyInst);

                        modificarAlumno.execute();
                        modificarAlumno.close();
                        System.err.println("MODIFICADO");

                    } catch (SQLException ex) {
                        System.out.println("error al guardar los datos: " + ex);
                        JOptionPane.showMessageDialog(null, "Error al guardar los datos");
                    } finally {
                        con.desconectar();
                    }
                   ModificarInstructorP2 articulos = new ModificarInstructorP2();
                    articulos.setSize(1070,730);
                    articulos.setLocation(0, 0);

                    rightPanelAdmin.removeAll();
                    rightPanelAdmin.add(articulos, BorderLayout.CENTER);
                    rightPanelAdmin.revalidate();
                    rightPanelAdmin.repaint();
                }
            }
        }catch(Exception a){
                FechaRequerida.setVisible(true);  
        }
      
       ///////////////////////////////////////////////////////////////////////////////
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        
        String nombre = txtNombre.getText();
        ValidarNombre(nombre);
      
        
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtAPatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAPatFocusLost

         String apellidoP = txtAPat.getText();
       
        ValidarAPaterno(apellidoP);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAPatFocusLost

    private void txtAMatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAMatFocusLost

         
        String apellidoM = txtAMat.getText();
        ValidarAMaterno(apellidoM);

        // TODO add your handling code here:
    }//GEN-LAST:event_txtAMatFocusLost

    private void dtNacimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dtNacimientoMouseClicked
        FechaRequerida.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_dtNacimientoMouseClicked

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        NombreRequerido.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMouseClicked

    private void dtNacimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dtNacimientoKeyTyped
        //If any key is typed, set message with error
         JOptionPane.showMessageDialog(null, "Ño2");
        // TODO add your handling code here:
    }//GEN-LAST:event_dtNacimientoKeyTyped

    private void dtNacimientoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dtNacimientoKeyPressed

//If any key is typed, set message with error

   
      JOptionPane.showMessageDialog(null, "Ño");
   
    

        // TODO add your handling code here:
    }//GEN-LAST:event_dtNacimientoKeyPressed

    private void dtNacimientoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dtNacimientoKeyReleased

 JOptionPane.showMessageDialog(null, "Ño3");
        // TODO add your handling code here:
    }//GEN-LAST:event_dtNacimientoKeyReleased

    private void txtAPatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAPatMouseClicked


        ApellidoPRequerido.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAPatMouseClicked

    ConexionBD con = new ConexionBD();
    
     void agregarAlumnoBD(String nombre, String aPaterno, String aMaterno,
            String fNacimiento) {

        try {
            Connection c = con.conectar();
            PreparedStatement agregarAlumno = c.prepareStatement("INSERT INTO  usuarios (nombre,apellido_paterno,apellido_materno,fecha_nacimiento) "
                    + "VALUES (?,?,?,?)");

            agregarAlumno.setString(1, nombre);
            agregarAlumno.setString(2, aPaterno);
            agregarAlumno.setString(3, aMaterno);
            agregarAlumno.setString(4, fNacimiento);
           

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
        
        dtNacimiento.setDate(null);
    }
    
    void ValidarNombre(String nombre){
    
      if(nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚÜüñÑ ]*")){
             IcoCorreNombre.setVisible(true);
             iconIncoNombre.setVisible(false);
             IncoNombre.setVisible(false);
             
             if(nombre.isEmpty()){
             IcoCorreNombre.setVisible(false);
             iconIncoNombre.setVisible(false);
             IncoNombre.setVisible(false);
             NombreRequerido.setVisible(true);
             }
             
         } else{
             IcoCorreNombre.setVisible(false);
             iconIncoNombre.setVisible(true);
             IncoNombre.setVisible(true);
         }
    
    }
    
     void ValidarAPaterno(String paterno){
    
        if(paterno.matches("[a-zA-ZáéíóúÁÉÍÓÚÜüñÑ ]*")){
            IcoCorreApellidoP.setVisible(true);
            iconIncoApellidoP.setVisible(false);
            NoApellidoPa.setVisible(false);
                
            if(paterno.isEmpty()){
                IcoCorreApellidoP.setVisible(false);
                iconIncoApellidoP.setVisible(false);
                NoApellidoPa.setVisible(false);
                ApellidoPRequerido.setVisible(true);
            }
        } else{
            IcoCorreApellidoP.setVisible(false);
            iconIncoApellidoP.setVisible(true);
            NoApellidoPa.setVisible(true);    
         }
    }
     
     void ValidarAMaterno(String materno){
    
        if(materno.matches("[a-zA-ZáéíóúÁÉÍÓÚÜüñÑ ]*")){
            IcoCorreApellidoM.setVisible(true);
            iconIncoApellidoM.setVisible(false);
            NoApellidoMate.setVisible(false);
       
            if(materno.isEmpty()){
                IcoCorreApellidoM.setVisible(false);
            }
        } else{
            IcoCorreApellidoM.setVisible(false);
            iconIncoApellidoM.setVisible(true);
            NoApellidoMate.setVisible(true);
        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup AlergiasGroup;
    private javax.swing.JLabel ApellidoPRequerido;
    private javax.swing.ButtonGroup DeporteGroup;
    private javax.swing.ButtonGroup EnfermedadesGroup;
    private javax.swing.JLabel FechaRequerida;
    private javax.swing.JLabel IcoCorreApellidoM;
    private javax.swing.JLabel IcoCorreApellidoP;
    private javax.swing.JLabel IcoCorreNombre;
    private javax.swing.JLabel IncoNombre;
    private javax.swing.JLabel NoApellidoMate;
    private javax.swing.JLabel NoApellidoPa;
    private javax.swing.JLabel NombreRequerido;
    private javax.swing.JLabel SiFecha;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JPanel back;
    public com.toedter.calendar.JDateChooser dtNacimiento;
    private javax.swing.JLabel iconIncoApellidoM;
    private javax.swing.JLabel iconIncoApellidoP;
    private javax.swing.JLabel iconIncoNombre;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    public static javax.swing.JLabel labelIDI;
    public static javax.swing.JLabel labelIDInstructor;
    public javax.swing.JLabel lblInstructorId;
    public javax.swing.JTextField txtAMat;
    public javax.swing.JTextField txtAPat;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private Border LineBorder(Color red) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
