package Intento_Proyecto_002;

public abstract class Vehiculo implements Comparable<Vehiculo> {

    private String placa;
    private String marca;
    private String modelo;
    private String color;
    private double precioUnitario;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String marca, String modelo, String color, double precioUnitario) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precioUnitario = precioUnitario;
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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String mostrarMarcaModelo() {
        String marcaModelo = getMarca() + " " + getModelo();
        return marcaModelo;
    }

    public abstract void mostrarTodosDatos();


    @Override
    public int compareTo(Vehiculo v) {
        if (this.getPrecioUnitario() > v.getPrecioUnitario()) {
            return -1;
        }
        if (this.getPrecioUnitario() < v.getPrecioUnitario()) {
            return 1;
        }
        return 0;
    }

    boolean esLujo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
