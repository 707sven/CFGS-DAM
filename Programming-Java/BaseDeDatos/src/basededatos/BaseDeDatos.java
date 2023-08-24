/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basededatos;

import java.util.Calendar;
import java.util.TimeZone;
import java.sql.*;

/**
 *
 * @author MEDAC
 */
public class BaseDeDatos {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String BD = "peliculas";
        String USUARIO = "root";
        String PASS = "";
        String HOST = "localhost";

        //Registrar driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciar la conexion
        Calendar now = Calendar.getInstance();
        TimeZone zonaHoraria = now.getTimeZone();
        Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BD + "?user=" + USUARIO + "&password=" + PASS + "&userLegacyDateTimeCode=false&serverTimeZone=" + zonaHoraria.getID());

        //Crear Tabla
        PreparedStatement ST = null;
        try {
            ST = connection.prepareStatement("CREATE TABLE peliculas(nombre varchar(50) NOT NULL,year INT(5),director varchar(50))");
            ST.execute();
            ST.close();
        } catch (SQLException sqle) {
            System.out.println("no se puede");
        }

        //Ejecutar un insert
        String consulta = "INSERT INTO peliculas(nombre, year, director) VALUES ('Titanic', '1998', 'Lopez')";
        try {
            Statement stnt = connection.createStatement();
            int fila = stnt.executeUpdate(consulta);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

        //Consulta con SELECT
        consulta = "SELECT * FROM peliculas ORDER BY nombre";
        Statement stm = connection.createStatement();
        ResultSet rset = stm.executeQuery(consulta);
        //Recorrer
        while (rset.next()) {
            String nombre = rset.getString("nombre");
            int year = rset.getInt("year");
            System.out.println(nombre + " " + year);
        }

        //Borrar una fila
        consulta = "DELETE FROM peliculas";
        Statement stb = connection.createStatement();
        stb.executeUpdate(consulta);

        //Cierra la conexión
        connection.close();
    }

}
