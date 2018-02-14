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
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author josue
 */
public class VerAdeudosForm extends javax.swing.JFrame {

    private TableRowSorter trsFiltro;
    float abono;

    public void setAbono(float abono) {
        this.abono = abono;
    }
    ConexionBD conn = new ConexionBD();
    ResultSet rs;
    PreparedStatement ps;
    ResultSetMetaData rsm;
    DefaultTableModel dtm;

    public VerAdeudosForm() {
        initComponents();
        try {
            llenarTabla(jtArtPend);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error:" + e.getMessage());
            System.out.println("error: " + e.getMessage());
        }

    }

    public void llenarTabla(JTable tabla) throws Exception {

        Connection c = conn.conectar();

        ps = c.prepareStatement("SELECT tickets.id, concat_ws(' ',alumnos.nombre, alumnos.a_paterno, alumnos.a_materno),tickets.fecha, tickets.monto_total, tickets.monto_pendiente "
                + "FROM alumnos INNER JOIN tickets ON alumnos.id = tickets.alumno_id "
                + "WHERE  tickets.activo=1 and alumnos.activo=1");
        rs = ps.executeQuery();
        rsm = rs.getMetaData();
        ArrayList<Object[]> datos = new ArrayList<>();
        while (rs.next()) {
            Object[] filas = new Object[rsm.getColumnCount()];
            for (int i = 0; i < filas.length; i++) {
                if (i == 2) {
                    SimpleDateFormat formateador2 = new SimpleDateFormat("dd'/'MMM'/'yyyy", new Locale("ES", "MX"));
                    Date fecha = java.sql.Date.valueOf(rs.getObject(i + 1).toString());
                    String fechaDate2 = formateador2.format(fecha);

                    filas[i] = fechaDate2;
                } else {
                    filas[i] = rs.getObject(i + 1);
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

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JPanel();
        TitlePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblInstructorId = new javax.swing.JLabel();
        btnLiquidar = new javax.swing.JButton();
        btnAbono = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtArtPend = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
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
        jLabel1.setText("Artículos pendientes");

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(449, 449, 449)
                .addComponent(jLabel1)
                .addContainerGap(301, Short.MAX_VALUE))
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

        btnLiquidar.setText("Liquidar adeudo");
        btnLiquidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiquidarActionPerformed(evt);
            }
        });
        back.add(btnLiquidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 640, 170, 40));

        btnAbono.setText("Abonar pago");
        btnAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbonoActionPerformed(evt);
            }
        });
        back.add(btnAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 640, 170, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Seleccione primero un registro de la tabla y después elija una opción de los botones");
        back.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

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

        jButton4.setText("Ver Ticket");
        jButton4.setActionCommand("Ver  Datos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        back.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 640, 170, 40));

        btnMod.setText("Modificar adeudo");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });
        back.add(btnMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 640, 170, 40));

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jtArtPend.setAutoCreateRowSorter(true);
        jtArtPend.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jtArtPend.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtArtPend.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio", "Nombre completo", "Fecha", "Monto total", "Pendiente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
            jtArtPend.getColumnModel().getColumn(1).setPreferredWidth(254);
            jtArtPend.getColumnModel().getColumn(2).setResizable(false);
            jtArtPend.getColumnModel().getColumn(2).setPreferredWidth(100);
            jtArtPend.getColumnModel().getColumn(3).setResizable(false);
            jtArtPend.getColumnModel().getColumn(3).setPreferredWidth(100);
            jtArtPend.getColumnModel().getColumn(4).setResizable(false);
            jtArtPend.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        back.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 630, 300));

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

    }//GEN-LAST:event_jPanel1formFocusGained

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  
        if (jtArtPend.getSelectedRowCount() == 1) {
            int fila = jtArtPend.getSelectedRow();
            String folio = jtArtPend.getValueAt(fila, 0).toString();
            String nombre = jtArtPend.getValueAt(fila, 1).toString();
            String monto_total = jtArtPend.getValueAt(fila, 3).toString();
            String monto_deuda = jtArtPend.getValueAt(fila, 4).toString();
            VerTicketDetallesForm ver = new VerTicketDetallesForm();
            ver.lblId.setText(folio);
            ver.lblNombre.setText(nombre);
            ver.lblTotalRestante.setText(monto_deuda);
            ver.lblTotal.setText(monto_total);
            ver.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningun alumno, por favor seleccione uno.");
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnLiquidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiquidarActionPerformed
        if (jtArtPend.getSelectedRowCount() == 1) {
            Connection c = conn.conectar();
            int fila = jtArtPend.getSelectedRow();
            String folio = jtArtPend.getValueAt(fila, 0).toString();
            String nombre = jtArtPend.getValueAt(fila, 1).toString();
            String monto_total = jtArtPend.getValueAt(fila, 3).toString();
            String monto_deuda = jtArtPend.getValueAt(fila, 4).toString();
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "¿Se a saldado la deuda de este recibo?", "Liquidar Adeudo", dialogButton);
            if (dialogResult == 0) {
                System.out.println("Yes option");
                try {
                    ps = c.prepareStatement("UPDATE tickets SET activo= 0, monto_pendiente=0 WHERE id=?");
                    ps.setInt(1, Integer.parseInt(folio));
                    ps.execute();
                    limpiarTabla(jtArtPend);
                    llenarTabla(jtArtPend);
                } catch (SQLException ex) {
                    Logger.getLogger(VerAdeudosForm.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex);
                } catch (Exception ex) {
                    Logger.getLogger(VerAdeudosForm.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex);
                }
                JOptionPane.showMessageDialog(null, " Se a liquidado el recibo con el folio #" + folio + " del alumno " + nombre);
            } else {
                System.out.println("No Option");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningun alumno, por favor seleccione uno.");
        }


    }//GEN-LAST:event_btnLiquidarActionPerformed

    private void btnAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbonoActionPerformed
        if (jtArtPend.getSelectedRowCount() == 1) {
            Connection c = conn.conectar();
            int fila = jtArtPend.getSelectedRow();
            String folio = jtArtPend.getValueAt(fila, 0).toString();
            String nombre = jtArtPend.getValueAt(fila, 1).toString();
            String fecha = jtArtPend.getValueAt(fila, 2).toString();
            String monto_total = jtArtPend.getValueAt(fila, 3).toString();
            String monto_deuda = jtArtPend.getValueAt(fila, 4).toString();
            AbonarForm a = new AbonarForm();
            a.lblAlumno.setText(nombre);
            a.lblFolio.setText(folio);
            a.lblMonto.setText(monto_deuda);
            a.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningun alumno, por favor seleccione uno.");
        }
    }//GEN-LAST:event_btnAbonoActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        limpiarTabla(jtArtPend);
        try {
            llenarTabla(jtArtPend);
        } catch (Exception ex) {
            Logger.getLogger(VerAdeudosForm.class.getName()).log(Level.SEVERE, null, ex);
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

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed

        if (jtArtPend.getSelectedRowCount() == 1) {
            int fila = jtArtPend.getSelectedRow();
            String folio = jtArtPend.getValueAt(fila, 0).toString();
            String nombre = jtArtPend.getValueAt(fila, 1).toString();
            String monto_total = jtArtPend.getValueAt(fila, 3).toString();
            String monto_deuda = jtArtPend.getValueAt(fila, 4).toString();
            ModificarTicketDetallesForm ver = new ModificarTicketDetallesForm();
            ver.lblId.setText(folio);
            ver.lblNombre.setText(nombre);
            ver.lblTotalRestante.setText(monto_deuda);
            ver.lblTotal.setText(monto_total);
            ver.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningun alumno, por favor seleccione uno.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnModActionPerformed

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
            java.util.logging.Logger.getLogger(VerAdeudosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerAdeudosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerAdeudosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerAdeudosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerAdeudosForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JPanel back;
    private javax.swing.JButton btnAbono;
    private javax.swing.JButton btnLiquidar;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton jButton4;
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
