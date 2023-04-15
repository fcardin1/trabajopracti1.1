package entities;

public class Vehiculo {
    private String color;
    private String marca;
    private String modelo;
    private String Radio;
    
    public Vehiculo(String color, String marca, String modelo, String radio) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        Radio = radio;
    }

    @Override
    public String toString() {
        return "Vehiculo [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", Radio=" + Radio + "]";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getRadio() {
        return Radio;
    }

    public void setRadio(String radio) {
        Radio = radio;
    }

    

    
    
    
    
}
