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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josue
 */
public class Adeudos {

//    SimpleDateFormat formateador = new SimpleDateFormat("dd '-' MMMMM '-' yyyy", new Locale("es_ES", "MX"));
//    java.util.Date fecha = new Date();
//    String fechaDate = formateador.format(fecha);
//    
    public static void main(String[] args) {  
            //         NewJFrame n= new NewJFrame();
        
        SimpleDateFormat mes1 = new SimpleDateFormat("MM");
        SimpleDateFormat formateador2 = new SimpleDateFormat("yyyy'-'MM'-'dd", new Locale("es_ES"));
        java.util.Date fecha2 = new java.util.Date();
        java.util.Date fecha3;
        String fecha = formateador2.format(fecha2);
        int mes = Integer.parseInt(mes1.format(fecha2));
        System.out.println(fecha);
        fecha3= sumarMesesFecha(fecha2,1);
        String fechaF3 = formateador2.format(fecha3);
        System.out.println(fechaF3);

        System.out.println(mes);

    }
    
    public static java.util.Date sumarMesesFecha(java.util.Date fecha, int meses) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha); // Configuramos la fecha que se recibe	
        calendar.add(Calendar.MONTH, meses);  // numero de días a añadir, o restar en caso de días<0

        return calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos

    }

}
