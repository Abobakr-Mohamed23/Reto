package creacionBD;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertarDatos {

    public static void main(String[] args) {
        try {
            // Carga del driver de Derby
            Class.forName("org.apache.derby.client.ClientAutoloadedDriver");

            // Conexión a la base de datos
            Connection conexion = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/reto", "reto", "reto");
            System.out.println("✔ Conectado a la base de datos.");

            // Insertar compañías
            String sqlCompania = "INSERT INTO compania (nombreCompania, ubicacion, anioFundacion) VALUES (?, ?, ?)";
            PreparedStatement psCompania = conexion.prepareStatement(sqlCompania);

            for (int i = 1; i <= 20; i++) {
                psCompania.setString(1, "Compania " + i);
                psCompania.setString(2, "Ciudad " + i);
                psCompania.setDate(3, Date.valueOf("20" + (i < 10 ? "0" : "") + i + "-01-01"));
                psCompania.executeUpdate();
            }
            System.out.println("✔ Compañías insertadas.");

            // Insertar artistas
            String sqlArtista = "INSERT INTO artista (nombreCompleto, paisOrigen, fechaNacimiento, idCompania) VALUES (?, ?, ?, ?)";
            PreparedStatement psArtista = conexion.prepareStatement(sqlArtista);

            for (int i = 1; i <= 20; i++) {
                psArtista.setString(1, "Artista " + i);
                psArtista.setString(2, "Pais " + i);
                String fechaNac = "199" + (i % 10) + "-0" + ((i % 12) + 1) + "-15";
                psArtista.setDate(3, Date.valueOf(fechaNac));
                psArtista.setInt(4, ((i % 20) + 1));
                psArtista.executeUpdate();
            }
            System.out.println("✔ Artistas insertados.");

            // Insertar canciones
            String sqlCancion = "INSERT INTO cancion (nombreCancion, fechaLanzamiento, duracion, idArtista, idCompania) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement psCancion = conexion.prepareStatement(sqlCancion);

            for (int i = 1; i <= 20; i++) {
                psCancion.setString(1, "Cancion " + i);
                String fechaLanz = "2023-0" + ((i % 12) + 1) + "-01";
                psCancion.setDate(2, Date.valueOf(fechaLanz));
                psCancion.setDouble(3, 2.5 + (i * 0.1));
                psCancion.setInt(4, ((i % 20) + 1));
                psCancion.setInt(5, ((i % 20) + 1));
                psCancion.executeUpdate();
            }
            System.out.println("✔ Canciones insertadas.");

            // Cierre de recursos
            psCompania.close();
            psArtista.close();
            psCancion.close();
            conexion.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
