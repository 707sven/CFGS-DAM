/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accesobasedatos;

import java.sql.*;
import com.sun.jdi.connect.Connector;
import java.util.Calendar;
import java.util.TimeZone;

/**
 *
 * @author usuario
 */
public class AccesoBaseDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Crear una base de datos
        String bd = "peliculas";
        String usuario = "root";
        String pass = "";
        String host = "localhost";
        
        // Registrar Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Iniciar la conexión
        Calendar now= Calendar.getInstance();
        TimeZone zonaHoraria = now.getTimeZone();
        Connection connection = (Connection)DriverManager.getConnection("jdbc:mysql://" + host + "/" + bd + "?user="  + usuario + "&password=" + pass + "&userLegacyDateTimeCode=false&serverTimeZone=" + zonaHoraria.getID());
        
        // Crear tabla
        PreparedStatement ST = null;
        try {
            ST = connection.prepareStatement("CREATE TABLE peliculas(nombre varchar(50) NOT NULL, year INT(5), director varchar(50))");
            ST.execute();
            ST.close();
           
        } catch(SQLException sqle) {
            System.out.println("No se puede hacer la tabla.");
        }
        
    }

}
