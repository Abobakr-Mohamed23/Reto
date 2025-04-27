import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertarDatos {

    public static void main(String[] args) {
        try {
            Connection conexion = null;
            // Carga del driver para Derby
            Class.forName("org.apache.derby.client.ClientAutoloadedDriver");

            // Establece la conexión con la base de datos
            conexion = DriverManager.getConnection("jdbc:derby://localhost:1527/reto", "reto", "reto");
            System.out.println("✔ Conectado a la base de datos.");

            Statement sentencia = conexion.createStatement();

            // Insertar compañías
            for (int i = 1; i <= 20; i++) {
                String sql = "INSERT INTO compania (nombreCompania, ubicacion, anioFundacion) "
                        + "VALUES ('Compania " + i + "', 'Ciudad " + i + "', '20" + (i < 10 ? "0" : "") + i + "')";
                sentencia.executeUpdate(sql);
            }
            System.out.println("✔ Compañías insertadas.");

            // Insertar artistas
            for (int i = 1; i <= 20; i++) {
                String sql = "INSERT INTO artista (nombreCompleto, paisOrigen, fechaNacimiento, idCompania) "
                        + "VALUES ('Artista " + i + "', 'Pais " + i + "', '199" + (i % 10) + "-0" + ((i % 12) + 1) + "-15', " + ((i % 20) + 1) + ")";
                sentencia.executeUpdate(sql);
            }
            System.out.println("✔ Artistas insertados.");

            // Insertar canciones
            for (int i = 1; i <= 20; i++) {
                String sql = "INSERT INTO cancion (nombreCancion, fechaLanzamiento, duracion, idArtista, idCompania) "
                        + "VALUES ('Cancion " + i + "', '2023-0" + ((i % 12) + 1) + "-01', " + (2.5 + (i * 0.1)) + ", " + ((i % 20) + 1) + ", " + ((i % 20) + 1) + ")";
                sentencia.executeUpdate(sql);
            }
            System.out.println("✔ Canciones insertadas.");

            // Cerrar recursos
            sentencia.close();
            conexion.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
