
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

/**
 *
 * @author Karem Ra
 */
public class AgregarTicketD extends javax.swing.JPanel {

     DefaultTableModel tabla;
    int folio;

    ConexionBD conn = new ConexionBD();
    ResultSet rs;
    PreparedStatement ps;
    ResultSetMetaData rsm;
    DefaultTableModel dtm;

    public AgregarTicketD() {
        initComponents();
         lblInstructorId.setVisible(false);
        lblValCantidad.setVisible(false);
        lblValDescripcion.setVisible(false);
        lblValMarca.setVisible(false);
        lblValPrecio.setVisible(false);
        lblId.setText("2");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JPanel();
        TitlePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblInstructorId = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtVerArticulosPendientes = new javax.swing.JTable();
        lblNombre = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        btnEli = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        lblTotalRestante = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spnPrecio = new javax.swing.JSpinner();
        txtMarca = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        spnCantidad = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        lblCodigoProd = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblValDescripcion = new javax.swing.JLabel();
        lblValMarca = new javax.swing.JLabel();
        lblValPrecio = new javax.swing.JLabel();
        lblValCantidad = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();

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
                .addContainerGap(402, Short.MAX_VALUE))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitlePanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(19, 19, 19))
        );

        back.add(TitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1100, 70));

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTotal.setText("@Sumatoria");
        back.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, -1, -1));

        lblId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblId.setText("@id");
        back.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));
        back.add(lblInstructorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 10));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Folio");
        back.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jtVerArticulosPendientes.setAutoCreateRowSorter(true);
        jtVerArticulosPendientes.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jtVerArticulosPendientes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtVerArticulosPendientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Cantidad", "Descripción", "Marca", "Precio unitario", "Precio total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtVerArticulosPendientes.setToolTipText("Seleccione una fila para modificar");
        jtVerArticulosPendientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jtVerArticulosPendientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtVerArticulosPendientes.setDoubleBuffered(true);
        jtVerArticulosPendientes.setGridColor(new java.awt.Color(255, 255, 255));
        jtVerArticulosPendientes.setInheritsPopupMenu(true);
        jtVerArticulosPendientes.setSelectionBackground(new java.awt.Color(84, 65, 118));
        jtVerArticulosPendientes.setShowHorizontalLines(false);
        jtVerArticulosPendientes.setShowVerticalLines(false);
        jtVerArticulosPendientes.getTableHeader().setReorderingAllowed(false);
        jtVerArticulosPendientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtVerArticulosPendientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtVerArticulosPendientes);

        back.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 680, 260));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNombre.setText("@Nombre del alumno");
        back.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Total de compra:");
        back.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, -1, -1));

        btnEli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEli.setText("Eliminar");
        btnEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliActionPerformed(evt);
            }
        });
        back.add(btnEli, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 220, 40));

        btnCerrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        back.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 580, 280, 40));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Adeudo:");
        back.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        lblTotalRestante.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTotalRestante.setText("@Resta");
        back.add(lblTotalRestante, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, -1, -1));

        jLabel2.setText("Precio Unitario");
        back.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 380, -1, -1));

        spnPrecio.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));
        spnPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                spnPrecioFocusLost(evt);
            }
        });
        back.add(spnPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 400, 180, -1));

        txtMarca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMarcaFocusLost(evt);
            }
        });
        back.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, 180, -1));

        txtDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescripcionFocusLost(evt);
            }
        });
        back.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 260, 180, -1));

        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnCantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                spnCantidadFocusLost(evt);
            }
        });
        back.add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, 180, -1));

        jLabel3.setText("Cantidad");
        back.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 170, -1, -1));

        jLabel4.setText("Descripcion");
        back.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, -1, -1));

        jLabel5.setText("Marca");
        back.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 310, -1, 10));

        btnGuardar.setText("Guardar Cambios");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        back.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 470, 280, 40));

        lblCodigoProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        back.add(lblCodigoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, 180, 20));

        jLabel7.setText("Codigo de producto:");
        back.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, -1, -1));

        lblValDescripcion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblValDescripcion.setForeground(new java.awt.Color(255, 0, 0));
        lblValDescripcion.setText("El campo no debe estar vacio");
        back.add(lblValDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, -1, -1));

        lblValMarca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblValMarca.setForeground(new java.awt.Color(255, 0, 0));
        lblValMarca.setText("El campo no debe estar vacio");
        back.add(lblValMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 360, -1, -1));

        lblValPrecio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblValPrecio.setForeground(new java.awt.Color(255, 0, 0));
        lblValPrecio.setText("El campo no debe de ser 0");
        back.add(lblValPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 430, -1, -1));

        lblValCantidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblValCantidad.setForeground(new java.awt.Color(255, 0, 0));
        lblValCantidad.setText("El campo no debe de ser 0");
        back.add(lblValCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 220, -1, -1));

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        back.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 220, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtVerArticulosPendientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtVerArticulosPendientesMouseClicked
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ConexionBD objCon = new ConexionBD();
            Connection conn = objCon.conectar();

            int Fila = jtVerArticulosPendientes.getSelectedRow();
            int codigo = Integer.parseInt(jtVerArticulosPendientes.getValueAt(Fila, 0).toString());

            ps = conn.prepareStatement("SELECT id,nombre_producto,marca,cantidad,precio  FROM ticket_detalles WHERE id=?");
            ps.setInt(1, codigo);
            rs = ps.executeQuery();

            while (rs.next()) {
                lblCodigoProd.setText(rs.getString("id"));
                spnPrecio.setValue(rs.getFloat("precio"));
                spnCantidad.setValue(rs.getInt("cantidad"));
                txtDescripcion.setText(rs.getString("nombre_producto"));
                txtMarca.setText(rs.getString("marca"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_jtVerArticulosPendientesMouseClicked

    private void btnEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliActionPerformed

        if (jtVerArticulosPendientes.getSelectedRowCount() == 1) {
            float suma = 0;
            Connection c = conn.conectar();
            int fila = jtVerArticulosPendientes.getSelectedRow();
            String codigo = jtVerArticulosPendientes.getValueAt(fila, 0).toString();
            String cantidad = jtVerArticulosPendientes.getValueAt(fila, 1).toString();
            String descripcion = jtVerArticulosPendientes.getValueAt(fila, 2).toString();
            String marca = jtVerArticulosPendientes.getValueAt(fila, 3).toString();
            float precio = Float.parseFloat(jtVerArticulosPendientes.getValueAt(fila, 4).toString());

            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "¿Quiere eliminar " + descripcion + " este ticket?", "Liquidar Articulo", dialogButton);
            if (dialogResult == 0) {
                System.out.println("Yes option");
                try {
                    ps = c.prepareStatement("DELETE FROM ticket_detalles WHERE id=?");
                    ps.setInt(1, Integer.parseInt(codigo));
                    ps.execute();
                    limpiarTabla(jtVerArticulosPendientes);
                    try {

                        folio = Integer.parseInt(lblId.getText());
                        int id_ticket = folio;
                        DefaultTableModel modelo = new DefaultTableModel();
                        jtVerArticulosPendientes.setModel(modelo);

                        PreparedStatement ps = null;
                        ResultSet rs = null;
                        ConexionBD conn = new ConexionBD();
                        Connection con = conn.conectar();

                        String sql = "SELECT id,cantidad, nombre_producto, marca, precio,activo "
                        + "FROM ticket_detalles "
                        + "WHERE ticket_id=" + id_ticket;
                        ps = con.prepareStatement(sql);
                        rs = ps.executeQuery();

                        ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
                        int cantidadColumnas = rsMd.getColumnCount();

                        modelo.addColumn("Codigo");
                        modelo.addColumn("Cantidad");
                        modelo.addColumn("Articulo");
                        modelo.addColumn("Marca");
                        modelo.addColumn("Precio");
                        modelo.addColumn("Precio Total");

                        int[] anchos = {30, 30, 200, 50, 50, 50};
                        for (int i = 0; i < jtVerArticulosPendientes.getColumnCount(); i++) {
                            jtVerArticulosPendientes.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
                        }

                        while (rs.next()) {
                            Object[] filas = new Object[cantidadColumnas];
                            for (int i = 0; i < cantidadColumnas; i++) {
                                if (i != (cantidadColumnas - 1)) {
                                    filas[i] = rs.getObject(i + 1);

                                } else {
                                    float total = Float.parseFloat(rs.getObject(2).toString()) * Float.parseFloat(rs.getObject(5).toString());
                                    filas[i] = total;
                                    suma = suma + total;
                                }

                            }
                            modelo.addRow(filas);
                        }
                        lblTotal.setText("" + suma);
                    } catch (SQLException ex) {
                        System.err.println(ex.toString());
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(VerAdeudosForm.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex);
                } catch (Exception ex) {
                    Logger.getLogger(VerAdeudosForm.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex);
                }
            } else {
                System.out.println("No Option");
            }

        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningun alumno, por favor seleccione uno.");
        }
        vaciarCombos();
    }//GEN-LAST:event_btnEliActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
     //   this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void spnPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_spnPrecioFocusLost

    }//GEN-LAST:event_spnPrecioFocusLost

    private void txtMarcaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMarcaFocusLost

    }//GEN-LAST:event_txtMarcaFocusLost

    private void txtDescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescripcionFocusLost

    }//GEN-LAST:event_txtDescripcionFocusLost

    private void spnCantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_spnCantidadFocusLost

    }//GEN-LAST:event_spnCantidadFocusLost

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int codigo=Integer.parseInt(lblCodigoProd.getText());
        String articulo = txtDescripcion.getText();
        String marca = txtMarca.getText();
        int cantidad = (int) spnCantidad.getValue();
        float precio = (float) spnPrecio.getValue();
        if (estaVacio(marca)) {
            lblValMarca.setVisible(true);
        } else {
            lblValMarca.setVisible(false);
        }

        if (estaVacio(articulo)) {
            lblValDescripcion.setVisible(true);
        } else {
            lblValDescripcion.setVisible(false);
        }

        if (esCero(precio)) {
            lblValPrecio.setVisible(true);
        } else {
            lblValPrecio.setVisible(false);
        }

        if (esCero(cantidad)) {
            lblValCantidad.setVisible(true);
        } else {
            lblValCantidad.setVisible(false);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String nombre = lblNombre.getText();
        String id = lblId.getText();

        AgregarArticuloTicket add = new AgregarArticuloTicket();
        add.lblId.setText(id);
        add.lblNombre.setText(nombre);
        add.setVisible(true);

    }//GEN-LAST:event_btnAddActionPerformed
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

void vaciarCombos() {
        lblCodigoProd.setText("");
        txtDescripcion.setText("");
        txtMarca.setText("");
        spnCantidad.setValue(0);
        spnPrecio.setValue(0);
    }


public boolean estaVacio(String texto) {
        if (texto.equals(null)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean esCero(float numero) {
        if (numero != 0) {
            return false;
        } else {
            return true;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JPanel back;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEli;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtVerArticulosPendientes;
    private javax.swing.JLabel lblCodigoProd;
    public javax.swing.JLabel lblId;
    public javax.swing.JLabel lblInstructorId;
    public javax.swing.JLabel lblNombre;
    public javax.swing.JLabel lblTotal;
    public javax.swing.JLabel lblTotalRestante;
    private javax.swing.JLabel lblValCantidad;
    private javax.swing.JLabel lblValDescripcion;
    private javax.swing.JLabel lblValMarca;
    private javax.swing.JLabel lblValPrecio;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JSpinner spnPrecio;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtMarca;
    // End of variables declaration//GEN-END:variables
}
