/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.TimeZone;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Calendar;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author usuario
 */
public class ConexionMySQL {

    private String BD;
    private String USUARIO;
    private String PASS;
    private Connection connection;
    private String HOST;
    private TimeZone zonaHoraria;

    public ConexionMySQL(String BD, String USUARIO, String PASS) {
        this.BD = BD;
        this.HOST = "localhost";
        this.USUARIO = USUARIO;
        this.PASS = PASS;
        this.connection = null;
    }

    // Conectar la base de datos
    public void conectar() throws SQLException, ClassNotFoundException {
        if (connection == null || connection.isClosed()) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Calendar now = Calendar.getInstance();
                zonaHoraria = now.getTimeZone();
                connection = (Connection) DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BD + "?user=" + USUARIO + "&password=" + PASS + "&userLegacyDateTimeCode=false&serverTimeZone=" + zonaHoraria.getID());
            } catch (SQLException sqle) {
                System.out.println("no se puede");
            }
        }
    }

    // Desconectar de la base de datos
    public void desconectar() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

    // Ejecutar una consulta SELECT
    public ResultSet ejecutarSelect(String consulta) throws SQLException {
        Statement stmt = connection.createStatement();
        ResultSet rset = stmt.executeQuery(consulta);
        return rset;
    }

    // Ejecutar una consulta INSERT, SELECT O UPDATE
    public int ejecutarInsertDeleteUpdate(String consulta) throws SQLException {
        Statement stmt = connection.createStatement();
        int fila = stmt.executeUpdate(consulta);
        return fila;
    }

}
