
package Clases;

public class Vehiculo {
    
    int IdVehi;
    String Placa;
    String Marca;
    String Estado;

    public Vehiculo() {
    }

    public Vehiculo(int IdVehi, String Placa, String Marca, String Estado) {
        this.IdVehi = IdVehi;
        this.Placa = Placa;
        this.Marca = Marca;
        this.Estado = Estado;
    }

    public int getIdVehi() {
        return IdVehi;
    }

    public void setIdVehi(int IdVehi) {
        this.IdVehi = IdVehi;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
    
}
