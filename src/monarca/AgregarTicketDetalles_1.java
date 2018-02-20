package monarca;

import db.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AgregarTicketDetalles_1 extends javax.swing.JFrame {

    public static float total;
    DefaultTableModel tabla;
    public static int folio;
    public static String nombre;
    public AgregarTicketDetalles_1() {
        initComponents();
        lblInstructorId.setVisible(false);
        lblValCantidad.setVisible(false);
        lblValDescripcion.setVisible(false);
        lblValMarca.setVisible(false);
        lblValPrecio.setVisible(false);
        lblPrecioTotal.setVisible(false);
        
    }

    ConexionBD conn = new ConexionBD();
    ResultSet rs;
    PreparedStatement ps;
    ResultSetMetaData rsm;
    DefaultTableModel dtm;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        btnAceptar = new javax.swing.JButton();
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
        lblPrecioTotal = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();

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
        jLabel1.setText("Ticket de artículos del alumno");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(jLabel1)
                .addContainerGap(421, Short.MAX_VALUE))
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
        lblTotal.setText("0");
        back.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 130, -1));

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
        if (jtVerArticulosPendientes.getColumnModel().getColumnCount() > 0) {
            jtVerArticulosPendientes.getColumnModel().getColumn(0).setResizable(false);
            jtVerArticulosPendientes.getColumnModel().getColumn(0).setPreferredWidth(40);
            jtVerArticulosPendientes.getColumnModel().getColumn(1).setResizable(false);
            jtVerArticulosPendientes.getColumnModel().getColumn(1).setPreferredWidth(50);
            jtVerArticulosPendientes.getColumnModel().getColumn(2).setResizable(false);
            jtVerArticulosPendientes.getColumnModel().getColumn(2).setPreferredWidth(200);
            jtVerArticulosPendientes.getColumnModel().getColumn(3).setResizable(false);
            jtVerArticulosPendientes.getColumnModel().getColumn(3).setPreferredWidth(130);
            jtVerArticulosPendientes.getColumnModel().getColumn(4).setResizable(false);
            jtVerArticulosPendientes.getColumnModel().getColumn(4).setPreferredWidth(95);
            jtVerArticulosPendientes.getColumnModel().getColumn(5).setResizable(false);
            jtVerArticulosPendientes.getColumnModel().getColumn(5).setPreferredWidth(95);
        }

        back.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 680, 260));

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
        back.add(btnEli, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, 220, 40));

        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        back.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 590, 280, 40));

        jLabel2.setText("Precio Unitario");
        back.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 380, -1, -1));

        spnPrecio.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));
        spnPrecio.setEnabled(false);
        spnPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                spnPrecioFocusLost(evt);
            }
        });
        back.add(spnPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 400, 180, -1));

        txtMarca.setEnabled(false);
        txtMarca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMarcaFocusLost(evt);
            }
        });
        back.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, 180, -1));

        txtDescripcion.setEnabled(false);
        txtDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescripcionFocusLost(evt);
            }
        });
        back.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 260, 180, -1));

        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnCantidad.setEnabled(false);
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
        btnGuardar.setEnabled(false);
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
        back.add(lblPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 450, 110, 20));

        btnEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        back.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, 220, 40));

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

    public float llenarTabla(JTable tabla) throws Exception {

        Connection c = conn.conectar();
        float suma = 0;
        String sql = "SELECT id,cantidad, nombre_producto, marca, precio,activo "
                + "FROM ticket_detalles "
                + "WHERE ticket_id=" + folio;
        ps = c.prepareStatement(sql);
        rs = ps.executeQuery();
        rsm = rs.getMetaData();
        ArrayList<Object[]> datos = new ArrayList<>();
        while (rs.next()) {
            Object[] filas = new Object[rsm.getColumnCount()];
            for (int i = 0; i < filas.length; i++) {
                if (i != (filas.length - 1)) {
                    filas[i] = rs.getObject(i + 1);
                } else {
                    float total2 = Float.parseFloat(rs.getObject(2).toString()) * Float.parseFloat(rs.getObject(5).toString());
                    filas[i] = total2;
                    suma = suma + total2;
                    total=suma;
                }
            }
            datos.add(filas);
        }
        dtm = (DefaultTableModel) tabla.getModel();
        for (int i = 0; i < datos.size(); i++) {
            dtm.addRow(datos.get(i));
        }
        return suma;
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

    void vaciarCombos() {
        lblCodigoProd.setText("");
        txtDescripcion.setText("");
        txtMarca.setText("");
        spnCantidad.setValue(0);
        spnPrecio.setValue(0);
    }

    private void btnEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliActionPerformed

        if (jtVerArticulosPendientes.getSelectedRowCount() == 1) {
            float suma = 0;
            Connection c = conn.conectar();
            int fila = jtVerArticulosPendientes.getSelectedRow();
            String codigo = jtVerArticulosPendientes.getValueAt(fila, 0).toString();
            float monto = (float) jtVerArticulosPendientes.getValueAt(fila, 5);
            String descripcion = jtVerArticulosPendientes.getValueAt(fila, 2).toString();

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
                        lblTotal.setText("" + llenarTabla(jtVerArticulosPendientes));
                        
                    } catch (SQLException ex) {
                        System.err.println(ex.toString());
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(VerAdeudos_1.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex);
                } catch (Exception ex) {
                    Logger.getLogger(VerAdeudos_1.class.getName()).log(Level.SEVERE, null, ex);
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            lblTotal.setText("" + llenarTabla(jtVerArticulosPendientes));
        } catch (Exception ex) {
            Logger.getLogger(AgregarTicketDetalles_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblId.setText(""+folio);
        lblNombre.setText(nombre);
    }//GEN-LAST:event_formWindowOpened

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        float precioTotal = Float.parseFloat(lblTotal.getText());

        modificarTicket(folio, precioTotal);
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jtVerArticulosPendientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtVerArticulosPendientesMouseClicked

    }//GEN-LAST:event_jtVerArticulosPendientesMouseClicked
    public boolean estaVacio(String texto) {
        if (texto.equals("")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esCero(float numero) {
        if (numero != 0) {
            return false;
        } else {
            return true;
        }
    }

    public float ModificarArticulo(int codigo, String articulo, String marca, int cantidad, float precio) {
        float preciototal = cantidad * precio;
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ConexionBD conn = new ConexionBD();
            Connection con = conn.conectar();

            String sql = "UPDATE ticket_detalles "
                    + "SET "
                    + "nombre_producto=?,"
                    + "marca=?,"
                    + "cantidad=?,"
                    + "precio=?"
                    + "WHERE id=" + codigo;
            ps = con.prepareStatement(sql);
            ps.setString(1, articulo);
            ps.setString(2, marca);
            ps.setInt(3, cantidad);
            ps.setFloat(4, precio);

            ps.execute();
            JOptionPane.showMessageDialog(null, "se a hecho el cambio :3");
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }

        return preciototal;
    }

    public void modificarTicket(int codigo, float adeudoTotal) {

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ConexionBD conn = new ConexionBD();
            Connection con = conn.conectar();

            String sql = "UPDATE `tickets` SET `monto_total`= ?,`monto_pendiente`= ? WHERE id=" + codigo;
            ps = con.prepareStatement(sql);

            ps.setFloat(1, adeudoTotal);
            ps.setFloat(2, adeudoTotal);

            ps.execute();
            JOptionPane.showMessageDialog(null, "se a hecho el cambio :3");
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }

    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int codigo = Integer.parseInt(lblCodigoProd.getText());
        String articulo = txtDescripcion.getText();
        String marca = txtMarca.getText();
        int cantidad = (int) spnCantidad.getValue();
        float precio = (float) spnPrecio.getValue();
        float totalNvo = cantidad * precio;
       

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
        if (articulo.equals("") | marca.equals("") | cantidad == 0 | precio == 0) {
            JOptionPane.showMessageDialog(null, "Revisar que los campos esten correctos");
        } else {

            ModificarArticulo(codigo, articulo, marca, cantidad, precio);

            limpiarTabla(jtVerArticulosPendientes);
            try {
                lblTotal.setText("" + llenarTabla(jtVerArticulosPendientes));
                lblPrecioTotal.setText("" + totalNvo);
            } catch (Exception ex) {
                Logger.getLogger(AgregarTicketDetalles_1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        txtDescripcion.setEnabled(false);
        txtMarca.setEnabled(false);
        spnCantidad.setEnabled(false);
        spnPrecio.setEnabled(false);
        btnGuardar.setEnabled(false);
        vaciarCombos();
    }//GEN-LAST:event_btnGuardarActionPerformed


    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String id = lblId.getText();

        AgregarTicketAgregarArticuloTicket_1 add = new AgregarTicketAgregarArticuloTicket_1();
        AgregarTicketAgregarArticuloTicket_1.folio=folio;
        add.lblId.setText(id);
        add.lblNombre.setText(nombre);

        add.setVisible(true);


    }//GEN-LAST:event_btnAddActionPerformed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowLostFocus

    private void spnCantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_spnCantidadFocusLost

    }//GEN-LAST:event_spnCantidadFocusLost

    private void spnPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_spnPrecioFocusLost

    }//GEN-LAST:event_spnPrecioFocusLost

    private void txtDescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescripcionFocusLost

    }//GEN-LAST:event_txtDescripcionFocusLost

    private void txtMarcaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMarcaFocusLost

    }//GEN-LAST:event_txtMarcaFocusLost

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (jtVerArticulosPendientes.getSelectedRowCount() == 1) {
            int Fila = jtVerArticulosPendientes.getSelectedRow();
            int codigo = (int) jtVerArticulosPendientes.getValueAt(Fila, 0);
            int cantidad = (int) jtVerArticulosPendientes.getValueAt(Fila, 1);
            String articulo = jtVerArticulosPendientes.getValueAt(Fila, 2).toString();
            String marca = jtVerArticulosPendientes.getValueAt(Fila, 3).toString();
            float total = (float) jtVerArticulosPendientes.getValueAt(Fila, 4);
            float totalPrecio = (float) jtVerArticulosPendientes.getValueAt(Fila, 5);

            lblCodigoProd.setText(String.valueOf(codigo));
            spnPrecio.setValue(total);
            spnPrecio.setEnabled(true);
            spnCantidad.setValue(cantidad);
            spnCantidad.setEnabled(true);
            txtDescripcion.setText(articulo);
            txtDescripcion.setEnabled(true);
            txtMarca.setText(marca);
            txtMarca.setEnabled(true);
            lblPrecioTotal.setText("" + totalPrecio);
            btnGuardar.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningun alumno, por favor seleccione uno.");
        }

    }//GEN-LAST:event_btnEditActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {
        limpiarTabla(jtVerArticulosPendientes);
        try {
            lblTotal.setText("" + llenarTabla(jtVerArticulosPendientes));;
        } catch (Exception ex) {
            Logger.getLogger(AgregarTicketDetalles_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblId.setText(""+folio);
        lblNombre.setText(nombre);
    }

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
            java.util.logging.Logger.getLogger(AgregarTicketDetalles_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarTicketDetalles_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarTicketDetalles_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarTicketDetalles_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new AgregarTicketDetalles_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JPanel back;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEli;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtVerArticulosPendientes;
    private javax.swing.JLabel lblCodigoProd;
    public javax.swing.JLabel lblId;
    public javax.swing.JLabel lblInstructorId;
    public javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecioTotal;
    public javax.swing.JLabel lblTotal;
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
