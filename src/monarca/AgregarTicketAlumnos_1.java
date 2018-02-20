/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monarca;

import db.ConexionBD;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author josue
 */
public class AgregarTicketAlumnos_1 extends javax.swing.JFrame {

    private TableRowSorter trsFiltro;
    float abono;
    int folio;

    public void setAbono(float abono) {
        this.abono = abono;
    }
    ConexionBD conn = new ConexionBD();
    ResultSet rs;
    PreparedStatement ps;
    ResultSetMetaData rsm;
    DefaultTableModel dtm;

    public AgregarTicketAlumnos_1() {
        initComponents();
        try {
            llenarTabla(jtArtPend);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error:" + e.getMessage());
            System.out.println("error: " + e.getMessage());
        }
        folio = obtenerID();

    }

    public void llenarTabla(JTable tabla) throws Exception {

        Connection c = conn.conectar();

        ps = c.prepareStatement("SELECT id, concat_ws(' ',alumnos.nombre, alumnos.a_paterno, alumnos.a_materno) "
                + "FROM alumnos "
                + "WHERE  alumnos.activo=1");
        rs = ps.executeQuery();
        rsm = rs.getMetaData();
        ArrayList<Object[]> datos = new ArrayList<>();
        while (rs.next()) {
            Object[] filas = new Object[rsm.getColumnCount()];
            for (int i = 0; i < filas.length; i++) {
                
                    filas[i] = rs.getObject(i + 1);
                
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

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JPanel();
        TitlePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblInstructorId = new javax.swing.JLabel();
        btnAgregarTicket = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtArtPend = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(290, 0));
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1formFocusGained(evt);
            }
        });

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setPreferredSize(new java.awt.Dimension(970, 720));
        back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitlePanel.setBackground(new java.awt.Color(121, 72, 221));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Alumnos");

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitlePanelLayout.createSequentialGroup()
                .addContainerGap(474, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(460, 460, 460))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        back.add(TitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1070, 80));
        back.add(lblInstructorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 10));

        btnAgregarTicket.setText("Generar Ticket");
        btnAgregarTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTicketActionPerformed(evt);
            }
        });
        back.add(btnAgregarTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 640, 170, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Seleccione un alumno y genere el ticket");
        back.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Buscar por nombre o apellido del alumno");
        back.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));
        back.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        txtBusqueda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBusqueda.setBorder(null);
        txtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaActionPerformed(evt);
            }
        });
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyTyped(evt);
            }
        });
        back.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 260, 40));
        back.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 330, 20));

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jtArtPend.setAutoCreateRowSorter(true);
        jtArtPend.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jtArtPend.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtArtPend.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre completo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtArtPend.setToolTipText("fds");
        jtArtPend.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtArtPend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtArtPend.setDoubleBuffered(true);
        jtArtPend.setGridColor(new java.awt.Color(255, 255, 255));
        jtArtPend.setInheritsPopupMenu(true);
        jtArtPend.setSelectionBackground(new java.awt.Color(84, 65, 118));
        jtArtPend.setShowHorizontalLines(false);
        jtArtPend.setShowVerticalLines(false);
        jtArtPend.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtArtPend);
        if (jtArtPend.getColumnModel().getColumnCount() > 0) {
            jtArtPend.getColumnModel().getColumn(0).setResizable(false);
            jtArtPend.getColumnModel().getColumn(0).setPreferredWidth(54);
            jtArtPend.getColumnModel().getColumn(1).setResizable(false);
            jtArtPend.getColumnModel().getColumn(1).setPreferredWidth(554);
        }

        back.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 610, 300));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 1158, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1158, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 753, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1formFocusGained
        folio = obtenerID();
    }//GEN-LAST:event_jPanel1formFocusGained

    private void btnAgregarTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTicketActionPerformed
        if (jtArtPend.getSelectedRowCount() == 1) {
            Connection c = conn.conectar();
            int fila = jtArtPend.getSelectedRow();
            int id_alumno=(int)jtArtPend.getValueAt(fila, 0);
            String nombre = jtArtPend.getValueAt(fila, 1).toString();
            crearTicket(id_alumno);
            AgregarTicketDetalles_1 a = new AgregarTicketDetalles_1();
            System.out.println(""+folio);
            System.out.println(nombre);
            AgregarTicketDetalles_1.folio = folio;
            AgregarTicketDetalles_1.total = 0;
            AgregarTicketDetalles_1.nombre = nombre;
           
            a.lblTotal.setText("0");

            a.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningun alumno, por favor seleccione uno.");
        }
    }//GEN-LAST:event_btnAgregarTicketActionPerformed

    int obtenerID() {
        int id = 0;
        Connection c = conn.conectar();
        try {
            PreparedStatement obtenerId = c.prepareStatement(
                    "SELECT MAX(id) AS id FROM tickets");
            rs = obtenerId.executeQuery();
            while (rs.next()) {
                id = rs.getInt("id");
            }

        } catch (SQLException ex) {
            Logger.getLogger(AgregarTicketAlumnos_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("" + id);
        return id + 1;
    }

    void crearTicket(int id_ticket) {
        try {
            SimpleDateFormat formateador2 = new SimpleDateFormat("yyyy'-'MM'-'dd", new Locale("es_ES"));
            java.util.Date fecha2 = new Date();
            String fechaDate2 = formateador2.format(fecha2);
            System.out.println(fechaDate2);
            Connection c = conn.conectar();
            PreparedStatement agregarTicket = c.prepareStatement(
                    "INSERT INTO tickets(alumno_id,fecha,monto_total,monto_pendiente)"
                    + " VALUES (?,?,?,?) ");

            agregarTicket.setInt(1, id_ticket);
            agregarTicket.setString(2, fechaDate2);
            agregarTicket.setFloat(3, 0);
            agregarTicket.setFloat(4, 0);

            agregarTicket.execute();
            agregarTicket.close();
        } catch (SQLException ex) {
            System.out.println("error al guardar los datos: " + ex);
            JOptionPane.showMessageDialog(null, "Error al crear el ticket intentelo de nuevo.");
        } finally {
            conn.desconectar();
        }

    }
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        limpiarTabla(jtArtPend);
        try {
            llenarTabla(jtArtPend);
        } catch (Exception ex) {
            Logger.getLogger(AgregarTicketAlumnos_1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed

    }//GEN-LAST:event_txtBusquedaActionPerformed

    private void txtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyTyped
        txtBusqueda.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtBusqueda.getText());
                txtBusqueda.setText(cadena);
                repaint();
                trsFiltro.setRowFilter(RowFilter.regexFilter(txtBusqueda.getText(), 1));
            }
        });

        trsFiltro = new TableRowSorter(jtArtPend.getModel());
        jtArtPend.setRowSorter(trsFiltro);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaKeyTyped

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
       // TODO add your handling code here:
    }//GEN-LAST:event_formWindowLostFocus

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgregarTicketAlumnos_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarTicketAlumnos_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarTicketAlumnos_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarTicketAlumnos_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarTicketAlumnos_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JPanel back;
    private javax.swing.JButton btnAgregarTicket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable jtArtPend;
    public javax.swing.JLabel lblInstructorId;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
