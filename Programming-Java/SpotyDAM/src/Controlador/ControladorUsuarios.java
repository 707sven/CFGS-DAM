/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import Controlador.ConexionMySQL;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class ControladorUsuarios {

    private ConexionMySQL conexion;

    public ControladorUsuarios(ConexionMySQL conexion) {
        this.conexion = conexion;
    }

    public ArrayList<Usuario> ObtenerTodosUsuarios() throws SQLException {
        ArrayList<Usuario> lista = new ArrayList<>();
        String consulta = "SELECT * FROM acceso";
        ResultSet rset = conexion.ejecutarSelect(consulta);
        while (rset.next()) {
            String user = rset.getString("user");
            String password = rset.getString("password");
            String security = rset.getString("security");
            Usuario usuario = new Usuario(user, password, security);
            lista.add(usuario);
        }
        return lista;
    }

    public void insertarValor(String user, String password, String security) throws SQLException {
        String consulta = "INSERT INTO acceso(user, password, security) VALUES ('" + user + "', '" + password + "', '" + security + "')";
        conexion.ejecutarInsertDeleteUpdate(consulta);
    }

    public void borrarValor(String user) throws SQLException {
        String consulta = "DELETE FROM acceso WHERE user='" + user + "'";
        conexion.ejecutarInsertDeleteUpdate(consulta);
    }

    /*
    public void obtenerComprobacionUsuario(String user) throws SQLException {
        String consulta = "SELECT user FROM acceso WHERE user= '" + user + "';";
        conexion.ejecutarSelect(consulta);

    }

    public void obtenerComprobacionPass(String user) throws SQLException {
        String consulta = "SELECT password FROM acceso WHERE user= '" + user + "';";
        conexion.ejecutarSelect(consulta);
    }
        public void modificarValorNombre(String nombre, String nombreNuevo) throws SQLException {
        
        String consulta = "UPDATE compra SET nombre='"+nombreNuevo+"' WHERE nombre='"+nombre+"';";
        conexion.ejecutarInsertDeleteUpdate(consulta);
    }

    public void modificarValorUnidades(String nombre, int unidadesNuevas) throws SQLException {
        String consulta = "UPDATE compra SET unidades='"+unidadesNuevas+"' WHERE nombre='"+nombre+"';";
        conexion.ejecutarInsertDeleteUpdate(consulta);
    }
     */

}
