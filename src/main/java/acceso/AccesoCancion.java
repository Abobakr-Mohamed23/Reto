/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acceso;

/**
 *
 * @author 34631
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Cancion;

public class AccesoCancion {
    
    public static void insertar(Cancion cancion)throws ClassNotFoundException, SQLException{
        
    }
    
    public static List<Cancion> consultarTodos() throws ClassNotFoundException, SQLException{ 
        return null;
    }
    public static Cancion consultar(int codigo) throws ClassNotFoundException, SQLException {
    return null;
    }
      public static boolean modificar(Cancion cancion)
            throws ClassNotFoundException, SQLException {
          return false;
      }
      public static boolean eliminar(int codigo)
            throws ClassNotFoundException, SQLException {
          return false;
      }
}
