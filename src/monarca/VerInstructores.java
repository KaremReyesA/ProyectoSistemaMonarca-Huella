package monarca;

import db.ConexionBD;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class VerInstructores extends javax.swing.JPanel {
public static String idNowModify;
    ConexionBD conn = new ConexionBD();
    ResultSet rs;
    PreparedStatement ps;
    ResultSetMetaData rsm;
    DefaultTableModel dtm;
    String stringDate, folioN;

    public VerInstructores() {
        initComponents();
        idNowModify=null;
        limpiarTabla(jtAlumnos);
        try {
            llenarTabla(jtAlumnos);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error:" + e.getMessage());
            System.out.println("error: " + e.getMessage());
        }

    }

    public void llenarTabla(JTable tabla) throws Exception {

        Connection c = conn.conectar();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
            ps = c.prepareStatement(
                    "SELECT concat_ws(' ', nombre, apellido_paterno, apellido_materno), "
                    + "celular , "
                    + "rol  "
                    + "from usuarios where activo=1");
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
            for (int i = 0; i < datos.size()-1; i++) {
                dtm.addRow(datos.get(i+1));
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
        jtAlumnos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setPreferredSize(new java.awt.Dimension(970, 720));
        back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitlePanel.setBackground(new java.awt.Color(121, 72, 221));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Instructores");

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitlePanelLayout.createSequentialGroup()
                .addContainerGap(466, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(413, 413, 413))
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
        back.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jtAlumnos.setAutoCreateRowSorter(true);
        jtAlumnos.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jtAlumnos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre completo", "Celular", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtAlumnos.setToolTipText("fds");
        jtAlumnos.setAlignmentX(2.0F);
        jtAlumnos.setAlignmentY(2.0F);
        jtAlumnos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jtAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtAlumnos.setDoubleBuffered(true);
        jtAlumnos.setGridColor(new java.awt.Color(255, 255, 255));
        jtAlumnos.setInheritsPopupMenu(true);
        jtAlumnos.setSelectionBackground(new java.awt.Color(84, 65, 118));
        jtAlumnos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtAlumnos.setShowHorizontalLines(false);
        jtAlumnos.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jtAlumnos);

        back.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 780, 280));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Buscar por nombre o apellido del alumno");
        back.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        txtBusqueda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBusqueda.setBorder(null);
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyTyped(evt);
            }
        });
        back.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 260, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Search_30px.png"))); // NOI18N
        back.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));
        back.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 330, 20));

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
private TableRowSorter trsFiltro;
    private void txtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyTyped
txtBusqueda.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtBusqueda.getText());
                txtBusqueda.setText(cadena);
                repaint();
                trsFiltro.setRowFilter(RowFilter.regexFilter(txtBusqueda.getText(), 0));
            }
        });

        trsFiltro = new TableRowSorter(jtAlumnos.getModel());
        jtAlumnos.setRowSorter(trsFiltro);             // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup AlergiasGroup;
    private javax.swing.ButtonGroup DeporteGroup;
    private javax.swing.ButtonGroup EnfermedadesGroup;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JPanel back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtAlumnos;
    public javax.swing.JLabel lblInstructorId;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
