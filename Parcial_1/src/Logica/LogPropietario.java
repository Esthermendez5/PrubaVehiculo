
package Logica;

import BD.BDPropietario;
import BD.BDVehiculo;
import Clases.Propietario;
import Clases.Vehiculo;
import java.sql.SQLException;
import java.sql.ResultSet;

public class LogPropietario {
    
    BDPropietario objBDPropietario = new BDPropietario();
    BDVehiculo objBDVehiculo = new BDVehiculo();
    
    public void Insertar1(Propietario objPropietario) throws ClassNotFoundException, Exception {
        try {
            int resultado = objBDPropietario.InsertarP(objPropietario);
            if (resultado <= 0) {
                throw new Exception("No se pudo registrar el propietario");
            }
        } catch (SQLException e) {
            throw new Exception("Error en base de datos: " + e.getMessage());
        }
    

    } 
    
    public void Insertar2(Vehiculo objVehiculo) throws ClassNotFoundException, SQLException {
        // Asegúrate que el objeto Vehiculo tenga todos los datos necesarios
        objBDVehiculo.InsertarV(objVehiculo);
    }
    
}
