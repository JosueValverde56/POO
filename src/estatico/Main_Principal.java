package estatico;

import Intento_Proyecto_002.Auto;
import Intento_Proyecto_002.Camion;
import Intento_Proyecto_002.Compra;
import Intento_Proyecto_002.Vehiculo;
import java.util.ArrayList;
import java.util.Collections;


public class Main_Principal {

    public static void main(String[] args) {
        
        Compra compra= new Compra();
        


        ArrayList<Vehiculo> vehiculos = agregaVehiculo();
        imprimirVehiculos(vehiculos);
        imprimirVehiculoCaroBarato(vehiculos);
        contieneLetraY(vehiculos);
        imprimirVehiculosOrdenadosPrecio(vehiculos);
    }

    public static ArrayList<Vehiculo> agregaVehiculo() {
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();

//        Vehiculo auto1 = new Auto("LAE-647", "Yamaha", "206", "2019", "Negro", "15.000", 20000.00, "4", "Manual");
//        Vehiculo camion1 = new Camion("125", "5.000", "MCB-250", "Caterpillar", "797F", "2020", "Amarillo", "10.000", 10000.00);
//        Vehiculo auto2 = new Auto("FAT-459", "Ford", "F650", "2021", "Rojo", "00.000", 50500.00, "4", "Manual");
//        Vehiculo camion2 = new Camion("160", "6.000", "JOS-684", "Volvo", "FMX", "2019", "Plateado", "0.0", 10000.00);
////        Vehiculo autoE = new AutoElectrico("MAR-521", "Peugeot", "208", "2018", "Plomo", "5.000", 240000.00, "5", "Automatica", "240");
//
//        listaVehiculos.add(auto1);
//        listaVehiculos.add(camion1);
//        listaVehiculos.add(auto2);
//        listaVehiculos.add(camion2);
//        listaVehiculos.add(autoE);

        return listaVehiculos;
    }

    public static void imprimirVehiculos(ArrayList<Vehiculo> vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarTodosDatos();
        }
        System.out.println("=============================");
    }

    public static void imprimirVehiculoCaroBarato(ArrayList<Vehiculo> vehiculos) {
        double precioMasCaro = 0;
        String autoMasCaro = null;
        double precioMasBarato = 0;
        String autoMasBarato = null;
        // Busca Vehiculo mas caro
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPrecioUnitario() > precioMasCaro) {
                precioMasCaro = vehiculo.getPrecioUnitario();
                autoMasCaro = vehiculo.mostrarMarcaModelo();
            }
        }
        // Para no tener que asignar en linea de codigo un valor de inicio en la variable precioMasBarato
        precioMasBarato = precioMasCaro;

        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPrecioUnitario() < precioMasBarato) {
                precioMasBarato = vehiculo.getPrecioUnitario();
                autoMasBarato = vehiculo.mostrarMarcaModelo();
            }
        }
        System.out.println("Vehículo más caro: " + autoMasCaro);
        System.out.println("Vehículo más barato: " + autoMasBarato);
    }

    public static void contieneLetraY(ArrayList<Vehiculo> vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMarca().contains("C")) {
                System.out.println("Vehículo que contiene en el modelo la letra ‘C’: " + vehiculo.mostrarMarcaModelo()
                        + " $" + vehiculo.getPrecioUnitario());
            }
        }
        System.out.println("=============================");
    }

    public static void imprimirVehiculosOrdenadosPrecio(ArrayList<Vehiculo> vehiculos) {
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        Collections.sort(vehiculos);
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.mostrarMarcaModelo());
        }
        System.out.println("=============================");
    }

//    public static void imprimirVehiculosLujo(ArrayList<Vehiculo> vehiculos) {
//        System.out.println("Vehículos de lujo:");
//        for (Vehiculo vehiculo : vehiculos) {
//            if (vehiculo.esLujo()) {
//                System.out.println(vehiculo.mostrarMarcaModelo());
//            }
//        }
//    }
}
