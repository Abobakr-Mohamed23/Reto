package acceso;

import acceso.DerbyUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Artista;
import modelo.Compania_Discografica;

public class AccesoArtista {

    public static void insertar(Artista artista) throws ClassNotFoundException, SQLException {
        Connection conexion = null;
        Compania_Discografica compania = AccesoCompania.consultar(artista.getCompania().getIdCompania());
        int idCompania = compania.getIdCompania();
        try {
            conexion = DerbyUtil.abrirConexion();
            String sentenciaInsertar = "INSERT INTO Artista (nombreCompleto, paisOrigen, fechaNacimiento, IDcompania) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conexion.prepareStatement(sentenciaInsertar);
            ps.setString(1, artista.getNombreCompleto());
            ps.setString(2, artista.getPaisOrigen());
            ps.setDate(3, new java.sql.Date(artista.getFechaNacimiento().getTime()));
            ps.setInt(4, idCompania);
            ps.executeUpdate();
            ps.close();
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
            String sentenciaConsultar = "SELECT * FROM artista";
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

    public static boolean modificar(Artista artista) throws ClassNotFoundException, SQLException {
        Connection conexion = null;
        Compania_Discografica compania = AccesoCompania.consultar(artista.getCompania().getIdCompania());
        int idCompania = compania.getIdCompania();

        try {
            conexion = DerbyUtil.abrirConexion();
            String sentenciaActualizar = "UPDATE artista SET nombreCompleto = ?, paisOrigen = ?, fechaNacimiento = ?, idcompania = ? WHERE idArtista = ?";
            PreparedStatement ps = conexion.prepareStatement(sentenciaActualizar);
            ps.setString(1, artista.getNombreCompleto());
            ps.setString(2, artista.getPaisOrigen());
            ps.setDate(3, new java.sql.Date(artista.getFechaNacimiento().getTime()));
            ps.setInt(4,idCompania );
             ps.setInt(5,artista.getIdArtista());

            int filasAfectadas = ps.executeUpdate();
            ps.close();

            return filasAfectadas == 1;

        } finally {
            DerbyUtil.cerrarConexion(conexion);
        }
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
    
    public static boolean tieneCanciones(int idArtista) throws ClassNotFoundException, SQLException {
        Connection conexion = null;
        try {
            conexion = DerbyUtil.abrirConexion();
            String consulta = "SELECT COUNT(*) FROM Cancion WHERE idCompania = ?";
            PreparedStatement ps = conexion.prepareStatement(consulta);
            ps.setInt(1, idArtista);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
            rs.close();
            ps.close();
        } finally {
            DerbyUtil.cerrarConexion(conexion);
        }
        return false;
    }

}
