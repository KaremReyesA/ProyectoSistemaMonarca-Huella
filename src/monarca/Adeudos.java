/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monarca;

import com.sun.org.apache.xalan.internal.lib.ExsltDatetime;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class Adeudos {

    SimpleDateFormat formateador = new SimpleDateFormat("dd '-' MMMMM '-' yyyy", new Locale("es_ES", "MX"));
    java.util.Date fecha = new Date();
    String fechaDate = formateador.format(fecha);

    public static void main(String[] args) {
         NewJFrame n= new NewJFrame();
         n.setVisible(true);
       
    }

}
