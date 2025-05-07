/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acceso;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Artista;
import modelo.Cancion;

/**
 *
 * @author DAM1A13
 */
public class AccesoCancion {

    public static List<Cancion> consultarTodos() throws ClassNotFoundException, SQLException {
        Connection conexion = null;
        Cancion cancion;
        List<Cancion> listaCanciones = new ArrayList<>();
        try {
            conexion = DerbyUtil.abrirConexion();
            String sentenciaConsultar = "SELECT * FROM cancion"; //preguntar si esta bien esto
            Statement sentencia = conexion.createStatement();
            ResultSet resultados = sentencia.executeQuery(sentenciaConsultar);

            while (resultados.next()) {

                cancion = new Cancion(resultados.getInt("idCancion"),
                        resultados.getString("nombreCancion"),
                        resultados.getDate("fechaLanzamiento"),
                        resultados.getDouble("duracion"),
                        AccesoArtista.consultar(resultados.getInt("idArtista")));

                listaCanciones.add(cancion);
            }
            resultados.close();
            sentencia.close();
        } finally {
            DerbyUtil.cerrarConexion(conexion);
        }
        return listaCanciones;
    }

    public static Cancion consultar(int codigo) throws ClassNotFoundException, SQLException {
        Connection conexion = null;
        Cancion cancion = null;
        try {
            conexion = DerbyUtil.abrirConexion();
            String sentenciaConsultar = "SELECT * FROM cancion WHERE idCancion = " + codigo;
            Statement sentencia = conexion.createStatement();
            ResultSet resultados = sentencia.executeQuery(sentenciaConsultar);
            if (resultados.next()) {

           
                cancion = new Cancion(resultados.getInt("idCancion"),
                        resultados.getString("nombreCancion"),
                          resultados.getDate("fechaLanzamiento"),
                        resultados.getDouble("duracion"),
                        AccesoArtista.consultar(resultados.getInt("idArtista")));

            }
            resultados.close();
            sentencia.close();
        } finally {
            DerbyUtil.cerrarConexion(conexion);
        }
        return cancion;
    }

    public static void insertar(Cancion cancion) throws ClassNotFoundException, SQLException {
        Connection conexion = null;

        try {
            conexion = DerbyUtil.abrirConexion();
            String sentenciaInsertar = "INSERT INTO cancion (nombreCancion, "
                    + "fechaLanzamiento, duracion, idArtista) "
                    + " VALUES('" + cancion.getNombreCancion() + "', '"
                    + cancion.getFechaLanzamiento() + "', '"
                    + cancion.getDuracion()
                    + +cancion.getIdArtista().getIdArtista() + "')";

            Statement sentencia = conexion.createStatement();
            sentencia.executeUpdate(sentenciaInsertar);
            sentencia.close();
        } finally {
            DerbyUtil.cerrarConexion(conexion);
        }
    }

    public static boolean modificar(Cancion cancion) throws ClassNotFoundException, SQLException {
        Connection conexion = null;

        try {
            conexion = DerbyUtil.abrirConexion();

            String sentenciaActualizar = "UPDATE cancion SET "
                    + " nombreCancion = '" + cancion.getNombreCancion() + "', "
                    + " fechaLanzamiento = '" + cancion.getFechaLanzamiento() + "', "
                    + " duracion = '" + cancion.getDuracion() + "'"
                    + " idArtista = '" + cancion.getIdArtista() + "'"
                    + " WHERE idCancion = " + cancion.getIdCancion();

            Statement sentencia = conexion.createStatement();
            if (sentencia.executeUpdate(sentenciaActualizar) == 1) {
                return true;
            }
            sentencia.close();
        } finally {
            DerbyUtil.cerrarConexion(conexion);
        }
        return false;
    }

    public static boolean eliminar(int codigo) throws ClassNotFoundException, SQLException {
        Connection conexion = null;

        try {
            conexion = DerbyUtil.abrirConexion();
            String sentenciaEliminar = "DELETE FROM cancion "
                    + " WHERE idCancion = " + codigo;
            Statement sentencia = conexion.createStatement();
            if (sentencia.executeUpdate(sentenciaEliminar) == 1) {

                return true;

            }
            sentencia.close();
        } finally {
            DerbyUtil.cerrarConexion(conexion);
        }

        return false;

    }

}
