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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josue
 */
public class AbonarForm extends javax.swing.JFrame {

    ConexionBD conn = new ConexionBD();
    ResultSet rs;
    PreparedStatement ps;
    ResultSetMetaData rsm;
    DefaultTableModel dtm;

    /**
     * Creates new form Abonar
     */
    public AbonarForm() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnAbono = new javax.swing.JSpinner();
        btnAceptar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblAlumno = new javax.swing.JLabel();
        lblFolio = new javax.swing.JLabel();
        lblAlumno2 = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        lblMonto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        spnAbono.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));
        spnAbono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                spnAbonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spnAbonoKeyTyped(evt);
            }
        });

        btnAceptar.setText("aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jButton2.setText("cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Alumno:");

        lblAlumno.setText("@Nombre");

        lblFolio.setText("@Folio");

        lblAlumno2.setText("folio:");

        lbl.setText("Monto por saldar:");

        lblMonto.setText("@monto");

        jLabel2.setText("Ingrese el monto que se abonara:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnAceptar)
                        .addGap(100, 100, 100)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAlumno2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFolio))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(spnAbono, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlumno2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(spnAbono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(jButton2))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        Connection c = conn.conectar();
        VerAdeudosForm ver = new VerAdeudosForm();
        int folio = Integer.parseInt(lblFolio.getText());
        String nombre = lblAlumno.getText();
        float abonodb, abono = (float) spnAbono.getValue();
        float pendiente = Float.parseFloat(lblMonto.getText());
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "¿Se recibieron $" + abono + "?", "Abonar", dialogButton);
        abonodb = pendiente - abono;
        if (dialogResult == 0) {
            if (abonodb < 0) {
                float feria = (abonodb * (-1));
                try {
                    ps = c.prepareStatement("UPDATE tickets SET activo= 0 WHERE id=?");
                    ps.setInt(1, folio);
                    ps.execute();
                    ver.limpiarTabla(ver.jtArtPend);
                    ver.llenarTabla(ver.jtArtPend);
                } catch (SQLException ex) {
                    Logger.getLogger(VerAdeudosForm.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex);
                } catch (Exception ex) {
                    Logger.getLogger(VerAdeudosForm.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex);
                }
                JOptionPane.showMessageDialog(null, " Se a liquidado el recibo con el folio #" + folio + " del alumno " + nombre + "."
                        + "\nLa feria es de $" + feria);
                this.dispose();

            } else if (abonodb == 0) {
                try {
                    ps = c.prepareStatement("UPDATE tickets SET activo= 0 WHERE id=?");
                    ps.setInt(1, folio);
                    ps.execute();
                    ver.limpiarTabla(ver.jtArtPend);
                    ver.llenarTabla(ver.jtArtPend);
                } catch (SQLException ex) {
                    Logger.getLogger(VerAdeudosForm.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex);
                } catch (Exception ex) {
                    Logger.getLogger(VerAdeudosForm.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex);
                }
                JOptionPane.showMessageDialog(null, " Se a liquidado el recibo con el folio #" + folio + " del alumno " + nombre);
                this.dispose();
            } else {
                try {
                    ps = c.prepareStatement("UPDATE tickets SET monto_pendiente=? WHERE id=?");
                    ps.setFloat(1, abonodb);
                    ps.setInt(2, Integer.parseInt(lblFolio.getText()));
                    ps.execute();
                    ver.limpiarTabla(ver.jtArtPend);
                    ver.llenarTabla(ver.jtArtPend);
                } catch (SQLException ex) {
                    Logger.getLogger(VerAdeudosForm.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex);
                } catch (Exception ex) {
                    Logger.getLogger(VerAdeudosForm.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex);
                }
                    this.dispose();
            }
        } else {
            System.out.println("No Option");
        }


    }//GEN-LAST:event_btnAceptarActionPerformed

    private void spnAbonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spnAbonoKeyTyped

    }//GEN-LAST:event_spnAbonoKeyTyped

    private void spnAbonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spnAbonoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_spnAbonoKeyReleased

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
            java.util.logging.Logger.getLogger(AbonarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbonarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbonarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbonarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AbonarForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl;
    public javax.swing.JLabel lblAlumno;
    private javax.swing.JLabel lblAlumno2;
    public javax.swing.JLabel lblFolio;
    public javax.swing.JLabel lblMonto;
    private javax.swing.JSpinner spnAbono;
    // End of variables declaration//GEN-END:variables
}
