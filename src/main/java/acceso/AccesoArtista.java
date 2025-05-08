package acceso;

import acceso.DerbyUtil;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Artista;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author DAM1A03
 */
public class AccesoArtista {

    public static void insertar(Artista artista)
            throws ClassNotFoundException, SQLException {
        Connection conexion = null;
        try {
            conexion = DerbyUtil.abrirConexion();
            String sentenciaInsertar = "INSERT INTO Artista (nombreCompleto, paisOrigen, fechaNacimiento, idCompania) "
                    + " VALUES('" + artista.getNombreCompleto() + "', '" + artista.getPaisOrigen() + "', '" + artista.getFechaNacimiento() + "', '" + artista.getIdCompania() + "')";

            Statement sentencia = conexion.createStatement();
            sentencia.executeUpdate(sentenciaInsertar);
            sentencia.close();
        } finally {
            DerbyUtil.cerrarConexion(conexion);
        }
    }

    public static List<Artista> consultarTodos()
            throws ClassNotFoundException, SQLException {
        Connection conexion = null;
        Artista artista;
        List<Artista> listaCompania = new ArrayList<>();
        try {
            conexion = DerbyUtil.abrirConexion();
            String sentenciaConsultar = "SELECT * FROM Artista";
            Statement sentencia = conexion.createStatement();
            ResultSet resultados = sentencia.executeQuery(sentenciaConsultar);
            while (resultados.next()) {
                artista = new Artista(
                        resultados.getInt("idArtista"),
                        resultados.getString("nombreCompleto"),
                        resultados.getString("paisOrigen"),
                        resultados.getDate("fechaNacimiento"),
                        AccesoCompania.consultar(resultados.getInt("idCompania")));

                listaCompania.add(artista);
            }
            resultados.close();
            sentencia.close();
        } finally {
            DerbyUtil.cerrarConexion(conexion);
        }
        return listaCompania;
    }

    public static Artista consultar(int codigo)
            throws ClassNotFoundException, SQLException {
        Connection conexion = null;
        Artista artista = null;
        try {
            conexion = DerbyUtil.abrirConexion();
            String sentenciaConsultar = "SELECT * FROM Artista WHERE idArtista = " + codigo;
            Statement sentencia = conexion.createStatement();
            ResultSet resultados = sentencia.executeQuery(sentenciaConsultar);
            if (resultados.next()) {
                artista = new Artista(
                        resultados.getInt("idArtista"),
                        resultados.getString("nombreCompleto"),
                        resultados.getString("paisOrigen"),
                        resultados.getDate("fechaNacimiento"),
                        AccesoCompania.consultar(resultados.getInt("idCompania")));

            }
            resultados.close();
            sentencia.close();
        } finally {
            DerbyUtil.cerrarConexion(conexion);
        }
        return artista;
    }

    public static boolean modificar(Artista artista)
            throws ClassNotFoundException, SQLException {
        Connection conexion = null;

        try {
            conexion = DerbyUtil.abrirConexion();

            String sentenciaActualizar = "UPDATE compania SET "
                    + " nombreCompleto = '" + artista.getNombreCompleto() + "', "
                    + " paisOrigen = '" + artista.getPaisOrigen() + "', "
                    + " fechaNacimiento = '" + artista.getFechaNacimiento() + "'"
                    + " idCompania = '" + artista.getIdCompania() + "'"
                    + " WHERE idArtista = " + artista.getIdArtista();

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

    public static boolean eliminar(int codigo)
            throws ClassNotFoundException, SQLException {
        Connection conexion = null;

        try {
            conexion = DerbyUtil.abrirConexion();
            String sentenciaEliminar = "DELETE FROM Artista "
                    + " WHERE idArtista = " + codigo;
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

    public static int eliminarPorNombre(String nombreCompleto)
            throws ClassNotFoundException, SQLException {
        Connection conexion = null;
        int numEliminados;
        try {
            conexion = DerbyUtil.abrirConexion();
            String sentenciaEliminar = "DELETE FROM Artista "
                    + " WHERE nombreCompleto = '" + nombreCompleto + "'";
            Statement sentencia = conexion.createStatement();
            numEliminados = sentencia.executeUpdate(sentenciaEliminar);
            sentencia.close();
        } finally {
            DerbyUtil.cerrarConexion(conexion);
        }
        return numEliminados;
    }

}
