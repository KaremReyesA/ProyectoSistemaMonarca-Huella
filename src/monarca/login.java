package monarca;

import db.ConexionBD;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class login extends javax.swing.JFrame {
    ConexionBD con= new ConexionBD();
      public static String usuario_id = "", usuario_rol="";
    public login() {
        initComponents();
        lblAviso.setVisible(false);
        panel_overImage.setBackground(new Color (0,0,0,150));
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_overImage = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtPass = new javax.swing.JPasswordField();
        btnAceptar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblAviso = new javax.swing.JLabel();
        fingerPrintImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_overImage.setBackground(new java.awt.Color(102, 102, 102));
        panel_overImage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("GFCarts");
        jLabel4.setToolTipText("");
        panel_overImage.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 210, 90));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Conectándote con la tecnología");
        panel_overImage.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 260, 120));

        getContentPane().add(panel_overImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 560));

        jPanel2.setBackground(new java.awt.Color(31, 33, 35));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Contraseña");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(31, 33, 35));
        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(null);
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 291, 21));

        jSeparator1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 320, 10));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 257, -1, -1));

        jSeparator2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 320, 10));

        txtPass.setBackground(new java.awt.Color(31, 33, 35));
        txtPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setBorder(null);
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        jPanel2.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 282, -1));

        btnAceptar.setBackground(new java.awt.Color(102, 0, 204));
        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.setToolTipText("");
        btnAceptar.setBorder(null);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 310, 40));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("Usuario");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        lblAviso.setForeground(new java.awt.Color(255, 0, 0));
        lblAviso.setText("El usuario esta mal escrito o no se encuentra en la base de datos");
        jPanel2.add(lblAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 320, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 0, 620, 560));

        fingerPrintImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iStock_fingerprint31.jpg"))); // NOI18N
        fingerPrintImage.setText("jLabel3");
        getContentPane().add(fingerPrintImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void accederSistema(String usuario, String password) {
        mainAdmin adminGeneral = new mainAdmin();
        mainIntructor menuInstructor = new mainIntructor();

      
        String nombre = "";
        Connection c = con.conectar();
        PreparedStatement buscarUsuario;

        try {
            buscarUsuario = c.prepareStatement(
                    "SELECT *"
                    + "FROM usuarios "
                    + "WHERE usuario='" + usuario + "' AND pass='" + password + "'");
            ResultSet rs = buscarUsuario.executeQuery();
            while (rs.next()) {
                usuario_rol = rs.getString("rol");
                nombre = rs.getString("usuario");
                usuario_id= String.valueOf(rs.getInt("id"));
            }
            switch (usuario_rol) {
                case "Administrador General":
                    JOptionPane.showMessageDialog(null, "Bienvenido Administrador");
                    this.dispose();
                    adminGeneral.setVisible(true);
                    adminGeneral.lblUsuario.setText(nombre);
                    adminGeneral.lblRolid.setText("1");
                    adminGeneral.lblInstructorId.setText(usuario_id);
                    break;
                case "Instructor":
                    JOptionPane.showMessageDialog(null, "Bienvenido Instructor");
                    this.dispose();
                    menuInstructor.setVisible(true);
                    menuInstructor.lblUsuario.setText(nombre);
                    menuInstructor.lblRolid.setText("3");
                    menuInstructor.lblInstructorId.setText(usuario_id);
                    break;
                default:
                    lblAviso.setVisible(true);
                    break;
            }

        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
   
        char[] arrayC = txtPass.getPassword();
        String password = new String(arrayC),
                usuario = txtUsuario.getText();
        accederSistema(usuario, password);
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed

    }//GEN-LAST:event_txtPassActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Macintosh".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel fingerPrintImage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JPanel panel_overImage;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
