package Clases;

public class Turno {
    int Idturn;
    String Anden;
    int Dia;
    int Hora;
    String PlacaVehiculo; // Nuevo campo

    public Turno() {
    }

    public Turno(int Idturn, String Anden, int Dia, int Hora, String PlacaVehiculo) {
        this.Idturn = Idturn;
        this.Anden = Anden;
        this.Dia = Dia;
        this.Hora = Hora;
        this.PlacaVehiculo = PlacaVehiculo;
    }

    public int getIdturn() {
        return Idturn;
    }

    public void setIdturn(int Idturn) {
        this.Idturn = Idturn;
    }

    public String getAnden() {
        return Anden;
    }

    public void setAnden(String Anden) {
        this.Anden = Anden;
    }

    public int getDia() {
        return Dia;
    }

    public void setDia(int Dia) {
        this.Dia = Dia;
    }

    public int getHora() {
        return Hora;
    }

    public void setHora(int Hora) {
        this.Hora = Hora;
    }

    public String getPlacaVehiculo() {
        return PlacaVehiculo;
    }

    public void setPlacaVehiculo(String PlacaVehiculo) {
        this.PlacaVehiculo = PlacaVehiculo;
    }
}