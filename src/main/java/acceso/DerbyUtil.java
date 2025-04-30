package acceso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DerbyUtil {

    private static final String CONECTOR_DERBY = "org.apache.derby.client.ClientAutoloadedDriver";

    private static final String URL_CONEXION = "jdbc:derby://localhost:1527/reto";

    private static final String USUARIO = "reto";

    private static final String CONTRASEGNA = "reto";

    public static Connection abrirConexion() throws ClassNotFoundException, SQLException {
        Class.forName(CONECTOR_DERBY);
        Connection conexion = DriverManager.getConnection(URL_CONEXION, USUARIO, CONTRASEGNA);
        return conexion;
    }

    public static void cerrarConexion(Connection conexion) throws SQLException {
        if (conexion != null) {
            conexion.close();
        }
    }
}
