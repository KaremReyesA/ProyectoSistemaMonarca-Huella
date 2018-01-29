package monarca;

import db.ConexionBD;
import java.awt.Font;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class VerAsistenciasInstructores extends javax.swing.JPanel {

    public VerAsistenciasInstructores() {
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dtNacimiento = new com.toedter.calendar.JDateChooser();
        dtNacimiento1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setPreferredSize(new java.awt.Dimension(970, 720));
        back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitlePanel.setBackground(new java.awt.Color(121, 72, 221));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Asistencias de instructores");

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(jLabel1)
                .addContainerGap(339, Short.MAX_VALUE))
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
        back.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

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
                "Nombre completo", "Número de asistencias", "Porcentaje"
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

        back.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 710, 320));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Search_30px.png"))); // NOI18N
        back.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Buscar segun fecha inicio de periodo");
        back.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        dtNacimiento.setToolTipText("");
        back.add(dtNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 200, 30));

        dtNacimiento1.setToolTipText("");
        back.add(dtNacimiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 200, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Search_30px.png"))); // NOI18N
        back.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Buscar segun fecha fin de periodo");
        back.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, -1, -1));

        jButton4.setText("BUSCAR");
        back.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 150, 30));

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

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup AlergiasGroup;
    private javax.swing.ButtonGroup DeporteGroup;
    private javax.swing.ButtonGroup EnfermedadesGroup;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JPanel back;
    private com.toedter.calendar.JDateChooser dtNacimiento;
    private com.toedter.calendar.JDateChooser dtNacimiento1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JLabel lblInstructorId;
    // End of variables declaration//GEN-END:variables
}
