package Modelo;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    Connection connection;
    String driver = "com.mysql.cj.jdbc.Driver";
    String cadenaConexion = "jdbc:mysql://localhost:3306/reto1_g55_db";
    String usuario = "root";
    String password = "";
     

    public Conexion() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(cadenaConexion, usuario, password);
            if(connection != null){
                System.out.println("Conexion exitosa con la BD");
            
            
            }
        
        } catch ( ClassNotFoundException | SQLException e) {
            System.out.println("No se pudo establecer conexion");
        
        
        }
        
    }
     
    public Connection getConnection(){
            return connection; 
        }
}
