/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cancion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class ControladorCancion {

    private ConexionMySQL conexion;

    public ControladorCancion(ConexionMySQL conexion) {
        this.conexion = conexion;
    }

    public ArrayList<Cancion> ObtenerTodasCanciones() throws SQLException {
        ArrayList<Cancion> lista = new ArrayList<>();
        String consulta = "SELECT * FROM musica";
        ResultSet rset = conexion.ejecutarSelect(consulta);
        while (rset.next()) {
            String titulo = rset.getString("titulo");
            String album = rset.getString("album");
            String artista = rset.getString("artista");
            String duracion = rset.getString("duracion");
            Cancion cancion = new Cancion(titulo, album, artista, duracion);
            lista.add(cancion);
        }
        return lista;
    }

    public void insertarValor(String titulo, String album, String artista, String duracion) throws SQLException {
        String consulta = "INSERT INTO musica(titulo, album, artista, duracion) VALUES ('" + titulo + "', '" + album + "', '" + artista + "', '" + duracion + "')";
        conexion.ejecutarInsertDeleteUpdate(consulta);
    }
    
    
}
