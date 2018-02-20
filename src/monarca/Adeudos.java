/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monarca;

import com.sun.org.apache.xalan.internal.lib.ExsltDatetime;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import db.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josue
 */
public class Adeudos {

//    SimpleDateFormat formateador = new SimpleDateFormat("dd '-' MMMMM '-' yyyy", new Locale("es_ES", "MX"));
//    java.util.Date fecha = new Date();
//    String fechaDate = formateador.format(fecha);

    public static void main(String[] args) throws SQLException {
//         NewJFrame n= new NewJFrame();
//         n.setVisible(true);

        int id= obtenerId();
        System.out.println(id);
       
    }
 public static int obtenerId() throws java.sql.SQLException {
        int id = 0;
        ResultSet rs;
        PreparedStatement ps;
        ResultSetMetaData rsm;
        DefaultTableModel dtm;
        ConexionBD conn = new ConexionBD();

        Connection c = conn.conectar();
        ps = c.prepareStatement("    SELECT id \n"
                + "FROM alumnos\n"
                + "ORDER BY id DESC\n"
                + "LIMIT 1");

        rs = ps.executeQuery();

        while (rs.next()) {
            id = rs.getInt("id");
        }

        return id;
    }
}
