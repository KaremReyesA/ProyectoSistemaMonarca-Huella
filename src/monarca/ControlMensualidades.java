package monarca;

import db.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControlMensualidades extends javax.swing.JPanel {

    ConexionBD conn = new ConexionBD();
    ResultSet rs;
    PreparedStatement ps;
    ResultSetMetaData rsm;
    DefaultTableModel dtm;

    public ControlMensualidades() {
        initComponents();
        limpiarTabla(jtMensualidades);
        try {
            llenarTabla(jtMensualidades);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error:" + e.getMessage());
            System.out.println("error: " + e.getMessage());
        }
    }

    public void llenarTabla(JTable tabla) throws Exception {

        String status = null;
        String proximo_pago = null;
        String nombreMes = null;

        Connection c = conn.conectar();
        ps = c.prepareStatement("SELECT concat_ws(' ',alumnos.nombre, alumnos.a_paterno, alumnos.a_materno), "
                + "mensualidades.dia_pago, mensualidades.ultimo_pago, mensualidades.dia_pago, mensualidades.ultimo_pago "
                + "FROM alumnos INNER JOIN mensualidades ON alumnos.id = mensualidades.alumno_id "
                + "WHERE mensualidades.activo=1 and alumnos.activo=1 AND alumnos.id = mensualidades.alumno_id");
        rs = ps.executeQuery();
        rsm = rs.getMetaData();

        ArrayList<Object[]> datos = new ArrayList<>();

        while (rs.next()) {

            Object[] filas = new Object[rsm.getColumnCount()];

            //Toma la fecha del ultimo y lo desglosa en mes, dia y año para compararlo
            //Con la fecha actual
            String ultimopago = rs.getString("mensualidades.ultimo_pago");
            DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/uuuu");
            LocalDate ld = LocalDate.parse(ultimopago, f);
            int d = ld.getDayOfMonth​();
            int m = ld.getMonthValue();
            int y = ld.getYear();

            //Comparacion con la fecha actual
            LocalDate today = LocalDate.now();
            LocalDate birthday = LocalDate.of(y, m, d);

            Period p = Period.between(birthday, today);
            long p2 = ChronoUnit.DAYS.between(birthday, today);

            int diferenciaYear = p.getYears();
            int diferenciaMeses = p.getMonths();
            int diferenciaDias = p.getDays();
            int total;
            String diaMensualidad;

            for (int i = 0; i < filas.length; i++) {
                //Estado
                switch (i) {
                    case 1:
                        //Estado
                        if (diferenciaMeses < 1 || (diferenciaMeses == 1 && diferenciaDias <= 7)) {
                            status = "Regular";
                            filas[i] = status;

                        } else if (diferenciaMeses < 2 && (diferenciaMeses == 1 && diferenciaDias > 7)) {
                            status = "Atrasado por " + (diferenciaDias - 7) + " días";
                            filas[i] = status;
                        } else {
                            status = "Atrasado por " + diferenciaMeses + " meses y " + (diferenciaDias - 7) + " días";
                            filas[i] = status;
                        }
                        break;
                    case 2:
                        //Ultimo periodo de pago

                        switch (m) {
                            case 1:
                                filas[i] = "Enero-Febrero";
                                break;

                            case 2:
                                filas[i] = "Febrero-Marzo";
                                break;

                            case 3:
                                filas[i] = "Marzo-Abril";
                                break;

                            case 4:
                                filas[i] = "Abril-Mayo";
                                break;

                            case 5:
                                filas[i] = "Mayo-Junio";
                                break;

                            case 6:
                                filas[i] = "Junio-Julio";
                                break;

                            case 7:
                                filas[i] = "Julio-Agosto";
                                break;

                            case 8:
                                filas[i] = "Agosto-Septiembre";
                                break;

                            case 9:
                                filas[i] = "Septiembre-Octubre";
                                break;

                            case 10:
                                filas[i] = "Octubre-Noviembre";
                                break;

                            case 11:
                                filas[i] = "Noviembre-Diciembre";
                                break;

                            case 12:
                                filas[i] = "Diciembre-Enero ";
                                break;

                        }

                        break;
                    case 3:
                        //proximo periodo de pago
                        //Dia de pago
                        diaMensualidad = rs.getObject(i + 1).toString();

                        if (status.equals("Regular")) {
                            m = ld.getMonthValue() + 1;
                            if (m == 13) {
                                y = ld.getYear() + 1;
                                m = 1;
                            }

                            switch (m) {
                                case 1:
                                    nombreMes = "Enero";
                                    break;
                                case 2:
                                    nombreMes = "Febrero";
                                    break;
                                case 3:
                                    nombreMes = "Marzo";
                                    break;
                                case 4:
                                    nombreMes = "Abril";
                                    break;
                                case 5:
                                    nombreMes = "Mayo";
                                    break;
                                case 6:
                                    nombreMes = "Junio";
                                    break;
                                case 7:
                                    nombreMes = "Julio";
                                    break;
                                case 8:
                                    nombreMes = "Agosto";
                                    break;
                                case 9:
                                    nombreMes = "Septiembre";
                                    break;
                                case 10:
                                    nombreMes = "Octubre";
                                    break;
                                case 11:
                                    nombreMes = "Noviembre";
                                    break;
                                case 12:
                                    nombreMes = "Diciembre";
                                    break;
                                default:
                                    break;
                            }

                            proximo_pago = diaMensualidad + " de " + nombreMes;

                        } else {
                            proximo_pago = "Lo antes posible";
                        }
                        filas[i] = proximo_pago;

                        //Si esta regular, un mes mas a la ultima fecha de pago (semana antes y despues de dia de
                        //mensualidad)
                        //Si es irregular, la fecha mas cercana a la actual
                        break;
                    case 4:
                        //Total a pagar

                        if (status.equals("Regular")) {
                            filas[i] = "$150";

                        } else {
                            diferenciaDias = diferenciaDias / 7;
                            total = (diferenciaMeses * 150) + (diferenciaDias * 50);
                            filas[i] = "$" + total;
                        }

                        //Si esta regular, 0 a menos que se encuentre en la semana de pago
                        //(una antes o 5 dias despues 
                        //Del dia de expedicion
                        break;

                    default:
                        //Nombre
                        filas[i] = rs.getObject(i + 1);
                        break;
                }

                datos.add(filas);
            }
            dtm = (DefaultTableModel) tabla.getModel();

            dtm.addRow(filas);

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
        btnAdelanto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMensualidades = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        btnPagarMensualidades = new javax.swing.JButton();

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setPreferredSize(new java.awt.Dimension(970, 720));
        back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitlePanel.setBackground(new java.awt.Color(121, 72, 221));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mensualidades");

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(417, 417, 417)
                .addComponent(jLabel1)
                .addContainerGap(421, Short.MAX_VALUE))
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

        btnAdelanto.setText("Realizar adelanto de mensualidad");
        btnAdelanto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdelantoActionPerformed(evt);
            }
        });
        back.add(btnAdelanto, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 630, 260, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Seleccione primero un registro de la tabla y después elija una opción de los botones");
        back.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jtMensualidades.setAutoCreateRowSorter(true);
        jtMensualidades.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jtMensualidades.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtMensualidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre completo", "Estado", "Último periodo pagado", "Fecha de próxima mensualidad", "Total a pagar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtMensualidades.setToolTipText("fds");
        jtMensualidades.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jtMensualidades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtMensualidades.setDoubleBuffered(true);
        jtMensualidades.setGridColor(new java.awt.Color(255, 255, 255));
        jtMensualidades.setInheritsPopupMenu(true);
        jtMensualidades.setSelectionBackground(new java.awt.Color(84, 65, 118));
        jtMensualidades.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtMensualidades.setShowHorizontalLines(false);
        jtMensualidades.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jtMensualidades);

        back.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 971, 310));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Buscar por nombre o apellido del alumno");
        back.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));
        back.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 330, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Search_30px.png"))); // NOI18N
        back.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        txtBusqueda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBusqueda.setBorder(null);
        back.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 260, 40));

        btnPagarMensualidades.setText(" Pagar mensualidad o Atrasos");
        btnPagarMensualidades.setActionCommand("Ver  Datos");
        btnPagarMensualidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarMensualidadesActionPerformed(evt);
            }
        });
        back.add(btnPagarMensualidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 630, 230, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 1158, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdelantoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdelantoActionPerformed
//Cambiar fecha de adelanto a la seleccionada

//Adelantar por meses sin cambiar el dia
       
   if (jtMensualidades.getSelectedRowCount() == 1) {
            Connection c = conn.conectar();
            int fila = jtMensualidades.getSelectedRow();
            float pago = (float) jtMensualidades.getValueAt(fila, 4);
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "¿Se a saldado la deuda de este recibo?", "Liquidar Adeudo", dialogButton);
            if (dialogResult == 0) {
                System.out.println("Yes option");
            } else {
                System.out.println("No Option");
            }

        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningun alumno, por favor seleccione uno.");
        }
    }//GEN-LAST:event_btnAdelantoActionPerformed

    private void btnPagarMensualidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarMensualidadesActionPerformed
        if (jtMensualidades.getSelectedRowCount() == 1) {
            Connection c = conn.conectar();
            int fila = jtMensualidades.getSelectedRow();
            float pago = (float) jtMensualidades.getValueAt(fila, 4);
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "¿Se a saldado la deuda de este recibo?", "Liquidar Adeudo", dialogButton);
            if (dialogResult == 0) {
                System.out.println("Yes option");
            } else {
                System.out.println("No Option");
            }

        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningun alumno, por favor seleccione uno.");
        }

    }//GEN-LAST:event_btnPagarMensualidadesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup AlergiasGroup;
    private javax.swing.ButtonGroup DeporteGroup;
    private javax.swing.ButtonGroup EnfermedadesGroup;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JPanel back;
    private javax.swing.JButton btnAdelanto;
    private javax.swing.JButton btnPagarMensualidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtMensualidades;
    public javax.swing.JLabel lblInstructorId;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
