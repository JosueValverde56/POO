package estatico;

import Intento_Proyecto_002.Auto;

public class AutoElectrico extends Auto {

    private String voltaje;

    public AutoElectrico() {

    }

    public AutoElectrico(String placa, String marca, String modelo, String año, String color,
            String Kilometraje, double precioUnitario, int puertas, String transmision, String voltaje) {
        super(placa, marca, modelo, color, precioUnitario, puertas, transmision);
        this.voltaje = voltaje;
    }

    public String getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(String voltaje) {
        this.voltaje = voltaje;
    }

    @Override
    public void mostrarTodosDatos() {
        System.out.println("Placa: " + getPlaca()
                + " // Marca: " + getMarca()
                + " // Modelo: " + getModelo()
                + " // Color: " + getColor()
                + " // Precio: $" + getPrecioUnitario()
                + " // Puertas: " + getPuertas()
                + " // Transmisión: " + getTransmision()
                + " // Voltaje: " + getVoltaje() + "V");
    }

//    @Override
//    public boolean esLujo() {
//        boolean esLujo = false;
//        if ((int) Double.parseDouble(getVoltaje().substring(0, 3)) >= 240) {
//            return esLujo = true;
//        }
//        return esLujo;
//    }
}
