/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monarca;

import db.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VerTicketDetalles_1 extends javax.swing.JFrame {

    DefaultTableModel tabla;
    int folio;

    ConexionBD conn = new ConexionBD();
    ResultSet rs;
    PreparedStatement ps;
    ResultSetMetaData rsm;
    DefaultTableModel dtm;

    public VerTicketDetalles_1() {
        initComponents();
        lblInstructorId.setVisible(false);
        btnAbonar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JPanel();
        TitlePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAbonar = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblInstructorId = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableVerArticulosPendientes = new javax.swing.JTable();
        lblNombre = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        btnLiquidar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        lblTotalRestante = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(290, 0));
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setPreferredSize(new java.awt.Dimension(970, 720));
        back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitlePanel.setBackground(new java.awt.Color(121, 72, 221));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Artículos pendientes del alumno");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(jLabel1)
                .addContainerGap(372, Short.MAX_VALUE))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitlePanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(19, 19, 19))
        );

        back.add(TitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1070, 70));

        btnAbonar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAbonar.setText("Abonar");
        btnAbonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbonarActionPerformed(evt);
            }
        });
        back.add(btnAbonar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 670, 300, 40));

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTotal.setText("@Sumatoria");
        back.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 490, -1, -1));

        lblId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblId.setText("@id");
        back.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, -1, -1));
        back.add(lblInstructorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 10));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Folio");
        back.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, -1, -1));

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        TableVerArticulosPendientes.setAutoCreateRowSorter(true);
        TableVerArticulosPendientes.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        TableVerArticulosPendientes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TableVerArticulosPendientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cantidad", "Descripción", "Marca", "Precio unitario", "Precio total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
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
        TableVerArticulosPendientes.setToolTipText("fds");
        TableVerArticulosPendientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        TableVerArticulosPendientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TableVerArticulosPendientes.setDoubleBuffered(true);
        TableVerArticulosPendientes.setEnabled(false);
        TableVerArticulosPendientes.setGridColor(new java.awt.Color(255, 255, 255));
        TableVerArticulosPendientes.setInheritsPopupMenu(true);
        TableVerArticulosPendientes.setSelectionBackground(new java.awt.Color(84, 65, 118));
        TableVerArticulosPendientes.setShowHorizontalLines(false);
        TableVerArticulosPendientes.setShowVerticalLines(false);
        TableVerArticulosPendientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TableVerArticulosPendientes);
        if (TableVerArticulosPendientes.getColumnModel().getColumnCount() > 0) {
            TableVerArticulosPendientes.getColumnModel().getColumn(0).setResizable(false);
            TableVerArticulosPendientes.getColumnModel().getColumn(1).setResizable(false);
            TableVerArticulosPendientes.getColumnModel().getColumn(2).setResizable(false);
            TableVerArticulosPendientes.getColumnModel().getColumn(3).setResizable(false);
            TableVerArticulosPendientes.getColumnModel().getColumn(4).setResizable(false);
        }

        back.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 680, 260));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNombre.setText("@Nombre del alumno");
        back.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Total de compra:");
        back.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, -1, -1));

        btnLiquidar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLiquidar.setText("Liquidar");
        btnLiquidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiquidarActionPerformed(evt);
            }
        });
        back.add(btnLiquidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 590, 300, 40));

        btnCerrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        back.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 590, 300, 40));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Adeudo:");
        back.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, -1, -1));

        lblTotalRestante.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTotalRestante.setText("@Resta");
        back.add(lblTotalRestante, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, -1, -1));

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
                .addGap(0, 11, Short.MAX_VALUE))
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
            .addGap(0, 742, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbonarActionPerformed

    }//GEN-LAST:event_btnAbonarActionPerformed

    private void btnLiquidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiquidarActionPerformed
        Connection c = conn.conectar();
        VerAdeudos_1 A = new VerAdeudos_1();
        String nombre = lblNombre.getText();
        int ticket_id = Integer.parseInt(lblId.getText());
        int dialogButton = JOptionPane.YES_NO_OPTION;

        int dialogResult = JOptionPane.showConfirmDialog(this, "¿Se a saldado la deuda de este recibo?", "Liquidar Adeudo", dialogButton);
        if (dialogResult == 0) {
            System.out.println("Yes option");
            try {
                ps = c.prepareStatement("UPDATE tickets SET activo= 0,monto_pendiente=0 WHERE id=?");
                ps.setInt(1, ticket_id);
                ps.execute();
                A.limpiarTabla(A.jtArtPend);
                A.llenarTabla(A.jtArtPend);
            } catch (SQLException ex) {
                Logger.getLogger(VerAdeudos_1.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
            } catch (Exception ex) {
                Logger.getLogger(VerAdeudos_1.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
            }
            JOptionPane.showMessageDialog(null, " Se a liquidado el recibo con el folio #" + folio + " del alumno " + nombre);
        }

    }//GEN-LAST:event_btnLiquidarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            folio = Integer.parseInt(lblId.getText());
            int id_ticket = folio;
            DefaultTableModel modelo = new DefaultTableModel();
            TableVerArticulosPendientes.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            ConexionBD conn = new ConexionBD();
            Connection con = conn.conectar();

            String sql = "SELECT cantidad, nombre_producto, marca, precio,activo "
                    + "FROM ticket_detalles "
                    + "WHERE ticket_id=" + id_ticket;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Cantidad");
            modelo.addColumn("Articulo");
            modelo.addColumn("Marca");
            modelo.addColumn("Precio");
            modelo.addColumn("Precio Total");

            int[] anchos = {30, 200, 50, 50, 50};
            for (int i = 0; i < TableVerArticulosPendientes.getColumnCount(); i++) {
                TableVerArticulosPendientes.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    if (i != (cantidadColumnas - 1)) {
                        filas[i] = rs.getObject(i + 1);
                    } else {
                        double total = Double.parseDouble(rs.getObject(1).toString()) * Double.parseDouble(rs.getObject(4).toString());
                        filas[i] = total;
                    }

                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        VerAdeudos_1 a = new VerAdeudos_1();
        a.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(VerTicketDetalles_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerTicketDetalles_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerTicketDetalles_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerTicketDetalles_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VerTicketDetalles_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TableVerArticulosPendientes;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JPanel back;
    private javax.swing.JButton btnAbonar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnLiquidar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblId;
    public javax.swing.JLabel lblInstructorId;
    public javax.swing.JLabel lblNombre;
    public javax.swing.JLabel lblTotal;
    public javax.swing.JLabel lblTotalRestante;
    // End of variables declaration//GEN-END:variables
}
