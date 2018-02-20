package monarca;

import db.ConexionBD;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public final class VerAsistenciasAlumnos extends javax.swing.JPanel {

    public VerAsistenciasAlumnos() {

        initComponents();
        limpiarTabla(jTable1);
        jTable1.setFont(new Font("Arial", Font.PLAIN, 12));
        SimpleDateFormat formateador2 = new SimpleDateFormat("yyyy'-'MM'-'dd", new Locale("es_ES"));
        java.util.Date fecha1 = new java.util.Date();
        java.util.Date fecha2 = sumarRestarDiasFecha(fecha1, -3);

        String fecha1F = formateador2.format(fecha1);
        String fecha2F = formateador2.format(fecha2);
        try {
            llenarTabla(jTable1, fecha2F, fecha1F);
        } catch (Exception ex) {
            Logger.getLogger(VerAsistenciasAlumnos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public java.util.Date sumarRestarDiasFecha(java.util.Date fecha, int dias) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha); // Configuramos la fecha que se recibe	
        calendar.add(Calendar.MONTH, dias);  // numero de días a añadir, o restar en caso de días<0

        return calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos

    }

    public static int numMax(String fecha1, String fecha2) throws java.sql.SQLException {
        ResultSet rs;
        PreparedStatement ps;
        ResultSetMetaData rsm;
        DefaultTableModel dtm;
        ConexionBD conn = new ConexionBD();
        int max = 0;
        Connection c = conn.conectar();
        ps = c.prepareStatement("SELECT  count(asistencias_alumnos.alumno_id) asistencias \n"
                + "FROM asistencias_alumnos INNER JOIN alumnos ON alumnos.id = asistencias_alumnos.alumno_id \n"
                + "WHERE fecha BETWEEN ? AND ? AND alumnos.activo=1 \n"
                + "GROUP BY alumno_id \n"
                + "HAVING COUNT(alumno_id) \n"
                + "ORDER BY  asistencias DESC \n"
                + "LIMIT 1");
        ps.setString(1, fecha1);
        ps.setString(2, fecha2);
        rs = ps.executeQuery();

        while (rs.next()) {
            max = rs.getInt("asistencias");
        }

        return max;
    }

    public void llenarTabla(JTable tabla, String fecha1, String fecha2) throws Exception {
        ResultSet rs;
        PreparedStatement ps;
        ResultSetMetaData rsm;
        DefaultTableModel dtm;
        ConexionBD conn = new ConexionBD();
        int max;
        max = numMax(fecha1, fecha2);
        System.out.println("maximo " + max);
        Connection c = conn.conectar();

        ps = c.prepareStatement("SELECT alumnos.id, "
                + "concat_ws(' ',alumnos.nombre, alumnos.a_paterno, alumnos.a_materno) nombre,"
                + "count(asistencias_alumnos.alumno_id) asistencias,"
                + "alumnos.activo  \n"
                + "FROM alumnos INNER JOIN asistencias_alumnos ON asistencias_alumnos.alumno_id=alumnos.id\n"
                + "WHERE fecha BETWEEN ? AND ? AND alumnos.activo=1\n"
                + "GROUP BY asistencias_alumnos.alumno_id\n"
                + "HAVING COUNT(asistencias_alumnos.alumno_id)");
        ps.setString(1, fecha1);
        ps.setString(2, fecha2);
        rs = ps.executeQuery();
        rsm = rs.getMetaData();

        ArrayList<Object[]> datos = new ArrayList<>();
        while (rs.next()) {
            Object[] filas = new Object[rsm.getColumnCount()];
            for (int i = 0; i < filas.length; i++) {
                switch (i) {
                    case 2:
                        filas[i] = rs.getObject(i + 1);
                        if (Integer.parseInt(filas[i].toString()) > max) {
                            max = Integer.parseInt(filas[i].toString());
                        }
                        break;
                    case 3:

                        float porcentaje = Float.parseFloat(rs.getObject(3).toString()) / max;
                        System.out.println(porcentaje);
                        filas[i] = Math.round(porcentaje * 100);
                        break;
                    default:
                        filas[i] = rs.getObject(i + 1);
                        break;
                }
            }
            datos.add(filas);
        }

        dtm = (DefaultTableModel) tabla.getModel();
        for (int i = 0; i < datos.size(); i++) {
            dtm.addRow(datos.get(i));
        }

    }

    public void limpiarTabla(JTable tabla) {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            int filas = tabla.getRowCount();
            for (int i = 0; filas > i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
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
        lblInstructorId = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dtFechaInicio = new com.toedter.calendar.JDateChooser();
        dtFechaFinal = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setPreferredSize(new java.awt.Dimension(970, 720));
        back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitlePanel.setBackground(new java.awt.Color(121, 72, 221));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Asistencias de alumnos");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(jLabel1)
                .addContainerGap(375, Short.MAX_VALUE))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitlePanelLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        back.add(TitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1070, 80));
        back.add(lblInstructorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Seleccione primero un registro de la tabla y después elija una opción de los botones");
        back.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jTable1.setFont(new java.awt.Font("Tekton Pro Ext", 0, 36)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre completo", "Número de asistencias", "Porcentaje"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("fds");
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setDoubleBuffered(true);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setInheritsPopupMenu(true);
        jTable1.setSelectionBackground(new java.awt.Color(84, 65, 118));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        back.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 710, 320));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Search_30px.png"))); // NOI18N
        back.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Buscar segun fecha inicio de periodo");
        back.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        dtFechaInicio.setToolTipText("");
        back.add(dtFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 200, 30));

        dtFechaFinal.setToolTipText("");
        back.add(dtFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 200, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Search_30px.png"))); // NOI18N
        back.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Buscar segun fecha fin de periodo");
        back.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, -1, -1));

        jButton4.setText("BUSCAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        back.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 1181, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        SimpleDateFormat formateador2 = new SimpleDateFormat("yyyy'-'MM'-'dd", new Locale("es_ES"));

        if (dtFechaInicio.getDate() != null && dtFechaFinal.getDate() != null) {
            java.util.Date fecha1 = dtFechaInicio.getDate();
            java.util.Date fecha2 = dtFechaFinal.getDate();
            if (fecha2.before(fecha1)) {
                JOptionPane.showMessageDialog(null, "La fecha inicial debe ser menor que la fecha final");
            } else {
                String fecha1F = formateador2.format(fecha1);
                String fecha2F = formateador2.format(fecha2);
                limpiarTabla(jTable1);
                try {
                    llenarTabla(jTable1, fecha1F, fecha2F);
                } catch (Exception ex) {
                    Logger.getLogger(VerAsistenciasAlumnos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor ingrese las fechas que quiere revisar.");
        }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup AlergiasGroup;
    private javax.swing.ButtonGroup DeporteGroup;
    private javax.swing.ButtonGroup EnfermedadesGroup;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JPanel back;
    private com.toedter.calendar.JDateChooser dtFechaFinal;
    private com.toedter.calendar.JDateChooser dtFechaInicio;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JLabel lblInstructorId;
    // End of variables declaration//GEN-END:variables
}
