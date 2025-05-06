
package BD;

import Clases.Vehiculo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Clases.Propietario;

public class BDVehiculo {
    
    Conexion BLcon = new Conexion();

    
    public int InsertarV(Vehiculo objVehiculo) throws ClassNotFoundException, SQLException {
             // Sentencia actualizada
        String Sentencia = "INSERT INTO Vehiculo (Placa, Marca, Estado, PlacaVehiculo) VALUES (?,?,?,?)";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);
        
        ps.setString(1, objVehiculo.getPlaca());
        ps.setString(2, objVehiculo.getMarca());
        ps.setString(3, objVehiculo.getEstado());
        ps.setString(4, objVehiculo.getPlaca()); // Usamos la placa como identificador
        
        return ps.executeUpdate();
    
    }
}
