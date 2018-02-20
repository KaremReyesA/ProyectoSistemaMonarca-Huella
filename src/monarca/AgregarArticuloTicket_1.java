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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josue
 */
public class AgregarArticuloTicket_1 extends javax.swing.JFrame {

    ConexionBD con = new ConexionBD();

    /**
     * Creates new form AgregarArticuloTicket
     */
    public AgregarArticuloTicket_1() {
        initComponents();
        ModificarTicketDetalles_1 m=new ModificarTicketDetalles_1();
        lblTotalRest.setText(""+m.totalRest);
        lbltotal.setVisible(false);
        lblTotalRest.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        TitlePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtArticulo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        spnCantidad = new javax.swing.JSpinner();
        lblNombre = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        spnPrecio = new javax.swing.JSpinner();
        lbltotal = new javax.swing.JLabel();
        lblTotalRest = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(290, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitlePanel.setBackground(new java.awt.Color(121, 72, 221));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Agregar Artículo");

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(356, 356, 356)
                .addComponent(jLabel2)
                .addContainerGap(482, Short.MAX_VALUE))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.add(TitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 210, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cantidad");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Descripción");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Marca");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Precio unitario");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, -1, -1));

        txtArticulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(txtArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 240, 40));

        txtMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 180, 40));

        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel3.add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 80, 40));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNombre.setText("@Nombre del alumno");
        jPanel3.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Folio");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, -1, -1));

        lblId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblId.setText("1");
        jPanel3.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, -1, -1));

        spnPrecio.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));
        jPanel3.add(spnPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 80, 40));

        lbltotal.setText("jLabel6");
        jPanel3.add(lbltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        lblTotalRest.setText("jLabel6");
        jPanel3.add(lblTotalRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        float suma=0;
        int cantidad;
        float precio, total,nvoTotal;
        String articulo, marca;
        ModificarTicketDetalles_1 m=new ModificarTicketDetalles_1();
        
        cantidad = Integer.parseInt(spnCantidad.getValue().toString());
        articulo = txtArticulo.getText();
        marca = txtMarca.getText();
        precio = Float.parseFloat(spnPrecio.getValue().toString());
        total = precio * cantidad;
        nvoTotal= total+Float.parseFloat(lbltotal.getText());
        m.totalRest=nvoTotal;
        
        
        System.out.println(cantidad + " \n" + articulo + " \n" + marca + " \n" + precio + "\n" + total);
        agregarArticuloDB(Integer.parseInt(lblId.getText()), cantidad, precio, articulo, marca);
        
        
        this.dispose();
    }//GEN-LAST:event_btnAgregarActionPerformed

    public void agregarArticuloDB(int id_ticket, int cantidad, float precio, String articulo, String marca) {

        try {
            Connection c = con.conectar();
            PreparedStatement agregarArticulo = c.prepareStatement(
                    "INSERT INTO  ticket_detalles"
                    + "(ticket_id,nombre_producto,marca,cantidad,precio)"
                    + " VALUES (?,?,?,?,?)");

            agregarArticulo.setInt(1, id_ticket);
            agregarArticulo.setString(2, articulo);
            agregarArticulo.setString(3, marca);
            agregarArticulo.setInt(4, cantidad);
            agregarArticulo.setDouble(5, precio);

            agregarArticulo.execute();
            agregarArticulo.close();
            JOptionPane.showMessageDialog(null, "Articulo guardado correctamente");
        } catch (SQLException ex) {
            System.out.println("error al guardar los datos: " + ex);
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        } finally {
            con.desconectar();
        }

    }

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
            java.util.logging.Logger.getLogger(AgregarArticuloTicket_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarArticuloTicket_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarArticuloTicket_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarArticuloTicket_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarArticuloTicket_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel lblId;
    public javax.swing.JLabel lblNombre;
    protected javax.swing.JLabel lblTotalRest;
    protected javax.swing.JLabel lbltotal;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JSpinner spnPrecio;
    private javax.swing.JTextField txtArticulo;
    private javax.swing.JTextField txtMarca;
    // End of variables declaration//GEN-END:variables
}
