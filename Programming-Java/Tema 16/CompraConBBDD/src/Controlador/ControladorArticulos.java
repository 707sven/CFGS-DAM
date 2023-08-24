/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Articulo;
import Controlador.ConexionMySQL;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class ControladorArticulos {

    private ConexionMySQL conexion;

    public ControladorArticulos(ConexionMySQL conexion) {
        this.conexion = conexion;
    }

    public ArrayList<Articulo> ObtenerTodosArticulos() throws SQLException {
        ArrayList<Articulo> lista = new ArrayList<>();
        String consulta = "SELECT * FROM compra";
        ResultSet rset = conexion.ejecutarSelect(consulta);
        while (rset.next()) {
            String nombre = rset.getString("nombre");
            int unidades = rset.getInt("unidades");
            Articulo art = new Articulo(nombre, unidades);
            lista.add(art);
        }
        return lista;
    }

    public void insertarValor(String nombre, int unidades) throws SQLException {
        String consulta = "INSERT INTO compra(nombre, unidades) VALUES ('" + nombre + "', '" + unidades + "')";
        conexion.ejecutarInsertDeleteUpdate(consulta);
    }

    public void borrarValor(String nombre) throws SQLException {
        String consulta = "DELETE FROM compra WHERE nombre='" + nombre + "'";
        conexion.ejecutarInsertDeleteUpdate(consulta);
    }

    public void modificarValorNombre(String nombre, String nombreNuevo) throws SQLException {
        
        String consulta = "UPDATE compra SET nombre='"+nombreNuevo+"' WHERE nombre='"+nombre+"';";
        conexion.ejecutarInsertDeleteUpdate(consulta);
    }

    public void modificarValorUnidades(String nombre, int unidadesNuevas) throws SQLException {
        String consulta = "UPDATE compra SET unidades='"+unidadesNuevas+"' WHERE nombre='"+nombre+"';";
        conexion.ejecutarInsertDeleteUpdate(consulta);
    }
}
