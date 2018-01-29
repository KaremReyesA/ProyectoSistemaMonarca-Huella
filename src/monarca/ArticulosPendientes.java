package monarca;

import db.ConexionBD;
import java.awt.Font;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class ArticulosPendientes extends javax.swing.JPanel {

    public ArticulosPendientes() {
        initComponents();
        jTable1.setFont(new Font("Vivaldi", Font.BOLD, 28));
        
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

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

        jButton1.setText("Editar datos de adeudo");
        back.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 640, 170, 40));

        jButton2.setText("Pagar Adeudo");
        jButton2.setActionCommand("Ver  Datos");
        back.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 640, 170, 40));

        jButton3.setText("Liquidar Adeudo");
        back.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 640, 170, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Seleccione primero un registro de la tabla y después elija una opción de los botones");
        back.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jTable1.setFont(new java.awt.Font("Tekton Pro Ext", 0, 36)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre completo", "Cantidad de artículos", "Adeudo total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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

        back.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 600, 300));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Buscar por nombre o apellido del alumno");
        back.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Search_30px.png"))); // NOI18N
        back.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        txtBusqueda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBusqueda.setBorder(null);
        back.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 260, 40));
        back.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 330, 20));

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

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup AlergiasGroup;
    private javax.swing.ButtonGroup DeporteGroup;
    private javax.swing.ButtonGroup EnfermedadesGroup;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JPanel back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    public javax.swing.JLabel lblInstructorId;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
