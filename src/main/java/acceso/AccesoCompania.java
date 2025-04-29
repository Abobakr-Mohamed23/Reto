package acceso;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Compania_Discografica;

public class AccesoCompania {

    public static void insertar(Compania_Discografica compania)
            throws ClassNotFoundException, SQLException {
        Connection conexion = null;
        try {
            conexion = DerbyUtil.abrirConexion();
            String sentenciaInsertar = "INSERT INTO compania (nombreCompania, ubicacion, anioFundacion) "
                    + " VALUES('" + compania.getNombreCompania() + "', '" + compania.getUbicacion() + "', '" + compania.getAnioFundacion() + "')";
            Statement sentencia = conexion.createStatement();
            sentencia.executeUpdate(sentenciaInsertar);
            sentencia.close();
        } finally {
            DerbyUtil.cerrarConexion(conexion);
        }
    }

    public static List<Compania_Discografica> consultarTodos()
            throws ClassNotFoundException, SQLException {
        Connection conexion = null;
        Compania_Discografica compania;
        List<Compania_Discografica> listaCompania = new ArrayList<>();
        try {
            conexion = DerbyUtil.abrirConexion();
            String sentenciaConsultar = "SELECT * FROM compania";
            Statement sentencia = conexion.createStatement();
            ResultSet resultados = sentencia.executeQuery(sentenciaConsultar);
            while (resultados.next()) {
                compania = new Compania_Discografica(resultados.getInt("idCompania"),
                        resultados.getString("nombreCompania"),
                        resultados.getString("ubicacion"),
                        resultados.getDate("anioFundacion"));
                listaCompania.add(compania);
            }
            resultados.close();
            sentencia.close();
        } finally {
            DerbyUtil.cerrarConexion(conexion);
        }
        return listaCompania;
    }

    public static Compania_Discografica consultar(int codigo)
            throws ClassNotFoundException, SQLException {
        Connection conexion = null;
        Compania_Discografica compania = null;
        try {
            conexion = DerbyUtil.abrirConexion();
            String sentenciaConsultar = "SELECT * FROM compania WHERE idCompania = " + codigo;
            Statement sentencia = conexion.createStatement();
            ResultSet resultados = sentencia.executeQuery(sentenciaConsultar);
            if (resultados.next()) {
                compania = new Compania_Discografica(resultados.getInt("idCompania"),
                        resultados.getString("nombreCompania"),
                        resultados.getString("ubicacion"),
                        resultados.getDate("anioFundacion"));
            }
            resultados.close();
            sentencia.close();
        } finally {
            DerbyUtil.cerrarConexion(conexion);
        }
        return compania;
    }

    public static boolean modificar(Compania_Discografica compania)
            throws ClassNotFoundException, SQLException {
        Connection conexion = null;
       
        try {
            conexion = DerbyUtil.abrirConexion();
            String sentenciaActualizar = "UPDATE compania SET "
                    + " nombreCompania = '" + compania.getNombreCompania() + "', "
                    + " ubicacion = '" + compania.getUbicacion() + "', "
                    + " anioFundacion = '" + compania.getAnioFundacion() + "'"
                    + " WHERE idCompania = " + compania.getIdCompania();
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
            String sentenciaEliminar = "DELETE FROM compania "
                    + " WHERE idCompania = " + codigo;
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

    public static int eliminarPorUbicacion(String ubicacion)
            throws ClassNotFoundException, SQLException {
        Connection conexion = null;
        int numEliminados;
        try {
            conexion = DerbyUtil.abrirConexion();
            String sentenciaEliminar = "DELETE FROM compania "
                    + " WHERE ubicacion = '" + ubicacion + "'";
            Statement sentencia = conexion.createStatement();
            numEliminados = sentencia.executeUpdate(sentenciaEliminar);
            sentencia.close();
        } finally {
            DerbyUtil.cerrarConexion(conexion);
        }
        return numEliminados;
    }

}
