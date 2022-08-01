package Principal;
import vistas.*;
import Modelo.*;

public class Main {

    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        conexion.getConnection();
        DatosModelDB datos = new DatosModelDB();
        datos.getPuestosTrabajo(3);
        datos.getSucursales();
        
        Login login = new Login();
        login.setVisible(true); 
    }
    
}
