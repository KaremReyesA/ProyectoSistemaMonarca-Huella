package monarca;

import java.awt.BorderLayout;

import static monarca.mainAdmin.rightPanelAdmin;
import static monarca.ModificarAlumno.labelID;
import com.digitalpersona.onetouch.DPFPDataPurpose;
import com.digitalpersona.onetouch.DPFPFeatureSet;
import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.DPFPSample;
import com.digitalpersona.onetouch.DPFPTemplate;
import com.digitalpersona.onetouch.capture.DPFPCapture;
import com.digitalpersona.onetouch.capture.event.DPFPDataAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPDataEvent;
import com.digitalpersona.onetouch.capture.event.DPFPErrorAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPErrorEvent;
import com.digitalpersona.onetouch.capture.event.DPFPReaderStatusAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPReaderStatusEvent;
import com.digitalpersona.onetouch.capture.event.DPFPSensorAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPSensorEvent;
import com.digitalpersona.onetouch.processing.DPFPEnrollment;
import com.digitalpersona.onetouch.processing.DPFPFeatureExtraction;
import com.digitalpersona.onetouch.processing.DPFPImageQualityException;
import com.digitalpersona.onetouch.verification.DPFPVerification;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import db.ConexionBD;
import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

public class AgregarAlumnoP5 extends javax.swing.JPanel {
    
    public AgregarAlumnoP5() {
        initComponents();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, "Imposible modificar el tema visual", "Lookandfeel inválido.",
                    JOptionPane.ERROR_MESSAGE);
        }
        lblAlumnoId.setVisible(false);
        lblid.setVisible(false);
        Iniciar();
        start();
        EstadoHuellas();
        btnFinalizar.setEnabled(false);
        
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
        lblAlumnoId = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panHuellas = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblImagenHuella = new javax.swing.JLabel();
        panBtns = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        lblid = new javax.swing.JLabel();

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
        jLabel7.setText("Huella Digital");
        back.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 130, -1, -1));
        back.add(lblAlumnoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 10));

        jProgressBar1.setValue(85);
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

        panHuellas.setBackground(new java.awt.Color(255, 255, 255));
        panHuellas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Huella Digital Capturada", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        panHuellas.setPreferredSize(new java.awt.Dimension(400, 270));
        panHuellas.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new java.awt.BorderLayout());

        lblImagenHuella.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblImagenHuella, java.awt.BorderLayout.CENTER);

        panBtns.setBackground(new java.awt.Color(255, 255, 255));
        panBtns.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        panBtns.setPreferredSize(new java.awt.Dimension(400, 190));
        panBtns.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Lucida Sans", 1, 10)); // NOI18N
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        jPanel4.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        panBtns.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel1.add(panBtns, java.awt.BorderLayout.LINE_END);

        panHuellas.add(jPanel1, java.awt.BorderLayout.CENTER);

        back.add(panHuellas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 570, 250));
        panHuellas.getAccessibleContext().setAccessibleName("Huella Digital S");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel13.setText("Agregar Huella Digital");
        back.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        btnFinalizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnFinalizar.setText("FINALIZAR");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        back.add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 640, 270, 40));
        back.add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 170, 30));

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

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        try {
            //Guarda la huella
            guardarHuella();
            Reclutador.clear();
            lblImagenHuella.setIcon(null);
            start();
            //Desconecta de la base de datos
            stop();
            agregarMensualidadAlumno(Integer.parseInt(lblid.getText()));
            con.desconectar();
            
            //AbrePanel para ver datos del alumno
            VerDatosAlumno articulos = new VerDatosAlumno();
            articulos.setSize(1070, 730);
            articulos.setLocation(0, 0);
            
            rightPanelAdmin.removeAll();
            rightPanelAdmin.add(articulos, BorderLayout.CENTER);
            rightPanelAdmin.revalidate();
            rightPanelAdmin.repaint();
        } catch (SQLException ex) {
            Logger.getLogger(AgregarAlumnoP5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed
    
    void agregarMensualidadAlumno(int id) {
        SimpleDateFormat mes1 = new SimpleDateFormat("MM");
        SimpleDateFormat formateador2 = new SimpleDateFormat("dd'/'MM'/'yyyy", new Locale("es_ES"));
        java.util.Date fecha2 = new java.util.Date();
        String fecha = formateador2.format(fecha2);
        int mes = Integer.parseInt(mes1.format(fecha2));
       
        try {
            Connection c = con.conectar();
            ResultSet rs;
            PreparedStatement ps;
//   
            PreparedStatement modificarAlumno = c.prepareStatement(" INSERT INTO mensualidades(alumno_id, dia_pago, ultimo_pago) VALUES (?,?,?)");
            
            modificarAlumno.setInt(1, id);
            modificarAlumno.setInt(2, mes);
            modificarAlumno.setString(3, fecha);
            
            modificarAlumno.execute();
            modificarAlumno.close();
        } catch (SQLException ex) {
            Logger.getLogger(ModificarAlumnoP4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
    
    private DPFPCapture Lector = DPFPGlobal.getCaptureFactory().createCapture();
    private DPFPEnrollment Reclutador = DPFPGlobal.getEnrollmentFactory().createEnrollment();
    private DPFPVerification Verificador = DPFPGlobal.getVerificationFactory().createVerification();
    private DPFPTemplate template;
    public static String TEMPLATE_PROPERTY = "template";
    
    protected void Iniciar() {
        Lector.addDataListener(new DPFPDataAdapter() {
            @Override
            public void dataAcquired(final DPFPDataEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        ProcesarCaptura(e.getSample());
                    }
                });
            }
        });
        
        Lector.addReaderStatusListener(new DPFPReaderStatusAdapter() {
            @Override
            public void readerConnected(final DPFPReaderStatusEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        EnviarTexto("El Sensor de Huella Digital esta conectado. \nYa puede iniciar la captura.");
                    }
                });
            }
            
            @Override
            public void readerDisconnected(final DPFPReaderStatusEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        EnviarTexto("No se detecta el sensor, favor de conectarlo");
                    }
                });
            }
        });
        
        Lector.addSensorListener(new DPFPSensorAdapter() {
            @Override
            public void fingerTouched(final DPFPSensorEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                    }
                });
            }
            
            @Override
            public void fingerGone(final DPFPSensorEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                    }
                });
            }
        });
        
        Lector.addErrorListener(new DPFPErrorAdapter() {
            public void errorReader(final DPFPErrorEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        EnviarTexto("Error: " + e.getError());
                    }
                });
            }
        });
    }
    
    public DPFPFeatureSet featuresinscripcion;
    public DPFPFeatureSet featuresverificacion;
    
    public void ProcesarCaptura(DPFPSample sample) {
        featuresinscripcion = extraerCaracteristicas(sample, DPFPDataPurpose.DATA_PURPOSE_ENROLLMENT);
        
        featuresverificacion = extraerCaracteristicas(sample, DPFPDataPurpose.DATA_PURPOSE_VERIFICATION);
        
        if (featuresinscripcion != null) {
            try {
                System.out.println("Las Caracteristicas de la Huella han sido creada");
                Reclutador.addFeatures(featuresinscripcion);
                Image image = CrearImagenHuella(sample);
                DibujarHuella(image);
            } catch (DPFPImageQualityException ex) {
                System.err.println("Error: " + ex.getMessage());
            } finally {
                EstadoHuellas();
                switch (Reclutador.getTemplateStatus()) {
                    case TEMPLATE_STATUS_READY:
                        stop();
                        setTemplate(Reclutador.getTemplate());
                        EnviarTexto("Se a guardado la huella exitosamente");
                        btnFinalizar.setEnabled(true);
                        btnFinalizar.grabFocus();
                        break;
                    
                    case TEMPLATE_STATUS_FAILED:
                        Reclutador.clear();
                        stop();
                        EstadoHuellas();
                        setTemplate(null);
                        JOptionPane.showMessageDialog(AgregarAlumnoP5.this, "Oops! hubo un error, por favor intentalo de nuevo.", "Registro de huella de alumno.", JOptionPane.ERROR_MESSAGE);
                        start();
                        break;
                }
            }
        }
    }
    
    public DPFPFeatureSet extraerCaracteristicas(DPFPSample sample, DPFPDataPurpose purpose) {
        DPFPFeatureExtraction extractor = DPFPGlobal.getFeatureExtractionFactory().createFeatureExtraction();
        try {
            return extractor.createFeatureSet(sample, purpose);
        } catch (DPFPImageQualityException e) {
            return null;
        }
    }
    
    public Image CrearImagenHuella(DPFPSample sample) {
        return DPFPGlobal.getSampleConversionFactory().createImage(sample);
    }
    
    public void DibujarHuella(Image image) {
        lblImagenHuella.setIcon(new ImageIcon(
                image.getScaledInstance(lblImagenHuella.getWidth(), lblImagenHuella.getHeight(), Image.SCALE_DEFAULT)));
        repaint();
    }
    
    public void EstadoHuellas() {
        EnviarTexto("Faltan " + Reclutador.getFeaturesNeeded() + " Capturas de la huella.");
    }
    
    public void EnviarTexto(String string) {
        txtArea.append(string + "\n");
    }
    
    public void start() {
        Lector.startCapture();
        EnviarTexto("El lector esta en funcionamiento. ");
    }
    
    public void stop() {
        Lector.stopCapture();
        EnviarTexto("El lector no esta en funcionamiento. ");
    }
    
    public DPFPTemplate getTemplate() {
        return template;
    }
    
    public void setTemplate(DPFPTemplate template) {
        DPFPTemplate old = this.template;
        this.template = template;
        firePropertyChange(TEMPLATE_PROPERTY, old, template);
    }
    
    public void guardarHuella() {
        SimpleDateFormat formateador2 = new SimpleDateFormat("yyyy'-'MM'-'dd", new Locale("es_ES"));
        java.util.Date fecha2 = new java.util.Date();
        String fechaDate2 = formateador2.format(fecha2);
        ByteArrayInputStream datosHuella = new ByteArrayInputStream(template.serialize());
        Integer tamañoHuella = template.serialize().length;
        try {
            Connection c = con.conectar();
            PreparedStatement guardarStmt = c.prepareStatement("INSERT INTO huellas_alumnos(huella, alumno_id) values(?,?)");
            
            guardarStmt.setBinaryStream(1, datosHuella, tamañoHuella);
            guardarStmt.setInt(2, Integer.parseInt(labelID.getText()));
            guardarStmt.execute();
            guardarStmt.close();
//            this.dispose();
            JOptionPane.showMessageDialog(null, "Huella Guardada Correctamente");
        } catch (SQLException ex) {
            EnviarTexto("Error al guardar los datos de la huella.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup AlergiasGroup;
    private javax.swing.ButtonGroup DeporteGroup;
    private javax.swing.ButtonGroup EnfermedadesGroup;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JPanel back;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblAlumnoId;
    private javax.swing.JLabel lblImagenHuella;
    public javax.swing.JLabel lblid;
    private javax.swing.JPanel panBtns;
    private javax.swing.JPanel panHuellas;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
  
}
