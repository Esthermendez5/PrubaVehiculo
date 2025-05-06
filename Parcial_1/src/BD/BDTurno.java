
package BD;

import Clases.Turno;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BDTurno {
    Conexion BLcon = new Conexion();

    public int InsertarTurno(Turno objTurno) throws ClassNotFoundException, SQLException {
        String Sentencia = "INSERT INTO Turno (Anden, Dia, Hora, PlacaVehiculo) VALUES (?,?,?,?)";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);
        ps.setString(1, objTurno.getAnden());
        ps.setInt(2, objTurno.getDia());
        ps.setInt(3, objTurno.getHora());
        ps.setString(4, objTurno.getPlacaVehiculo());
        return ps.executeUpdate();
    }

    public List<Turno> obtenerTurnosPorVehiculoYDia(String placa, int dia) throws SQLException, ClassNotFoundException {
        String Sentencia = "SELECT * FROM Turno WHERE PlacaVehiculo = ? AND Dia = ?";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);
        ps.setString(1, placa);
        ps.setString(2, String.valueOf(dia));
        
        ResultSet rs = ps.executeQuery();
        List<Turno> turnos = new ArrayList<>();
        
        while(rs.next()) {
            Turno t = new Turno();
            t.setIdturn(rs.getInt("Idturn"));
            t.setAnden(rs.getString("Anden"));
            t.setDia(rs.getInt("Dia"));
            t.setHora(rs.getInt("Hora"));
            t.setPlacaVehiculo(rs.getString("PlacaVehiculo"));
            turnos.add(t);
        }
        return turnos;
    }

    public boolean existeTurnoEnAnden(int anden, int dia, int hora) throws SQLException, ClassNotFoundException {
        String Sentencia = "SELECT COUNT(*) FROM Turno WHERE Anden = ? AND Dia = ? AND Hora = ?";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);
        ps.setInt(1, anden);
        ps.setInt(2, dia);
        ps.setInt(3, hora);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next()) {
            return rs.getInt(1) > 0;
        }
        return false;
    }
}
