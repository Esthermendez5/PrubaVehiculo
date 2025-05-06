package Logica;

import BD.BDTurno;
import Clases.Turno;
import java.sql.SQLException;
import java.util.List;

public class LogTurno {
    BDTurno objBDTurno = new BDTurno();

    public void reservarTurno(Turno objTurno) throws Exception {
        // Validar que el vehículo no tenga otro turno el mismo día
        List<Turno> turnosDelDia = objBDTurno.obtenerTurnosPorVehiculoYDia(
            objTurno.getPlacaVehiculo(), objTurno.getDia());
        
        if(!turnosDelDia.isEmpty()) {
            throw new Exception("El vehículo ya tiene un turno asignado para este día");
        }
        
         if (objTurno.getHora() < 10 || objTurno.getHora() > 13) {
        throw new Exception("Solo se permiten horas entre 10:00 AM y 1:00 PM");
         }
    
        
        // Validar que no haya otro turno en el mismo andén a la misma hora
        if (objTurno.getAnden() == null || objTurno.getAnden().isEmpty()) {
        throw new Exception("El andén no puede estar vacío");
        }
        
        // Si pasa las validaciones, insertar el turno
        objBDTurno.InsertarTurno(objTurno);
    }
    
    public List<Turno> consultarTurnosPorVehiculo(String placa) throws SQLException, ClassNotFoundException {
        return objBDTurno.obtenerTurnosPorVehiculoYDia(placa, -1); // -1 para obtener todos los días
    }
}
