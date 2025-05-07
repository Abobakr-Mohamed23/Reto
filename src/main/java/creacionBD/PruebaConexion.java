/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creacionBD;

import acceso.DerbyUtil;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author juaan
 */
public class PruebaConexion {
    public static void main(String[] args) {
        try {
            Connection conexion = DerbyUtil.abrirConexion();
            if (conexion != null) {
                System.out.println("✅ Conexión exitosa a la base de datos!");
                DerbyUtil.cerrarConexion(conexion);
            } else {
                System.out.println("❌ No se pudo establecer la conexión.");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Error: No se encontró el driver JDBC.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("❌ Error SQL al conectar.");
            e.printStackTrace();
        }
    }
}

