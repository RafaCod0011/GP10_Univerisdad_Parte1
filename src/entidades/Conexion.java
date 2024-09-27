
package entidades;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;

public class Conexion {

    private static final String URL="jdbc:mysql://localhost/";
    private static final String DB="GP10_universidadulp";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    
    private static Connection connection;

    private Conexion() {}

    public static Connection getConexion(){
    
      if(connection == null){
          try {
              Class.forName("");
              //connection = DriveManager.
              
              
          } catch (Exception e) {
          }
              
      }    
    
    
        return connection;
    }
    
    
    
    
    
    
}
