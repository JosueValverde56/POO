package Intento_Proyecto_002;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Auto extends Vehiculo {

    private int puertas;
    private String transmision;

    public Auto() {
    }

    public Auto(String placa, String marca, String modelo, String color,
            double precioUnitario, int puertas, String transmision) {
        super(placa, marca, modelo, color, precioUnitario);
        this.puertas = puertas;
        this.transmision = transmision;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    @Override
    public void mostrarTodosDatos() {
        System.out.println("Placa: " + getPlaca()
                + " // Marca: " + getMarca()
                + " // Modelo: " + getModelo()
                + " // Color: " + getColor()
                + " // Precio: $" + getPrecioUnitario()
                + " // Puertas: " + getPuertas()
                + " // Transmisión: " + getTransmision());
    }

    public Auto ingresarAuto(Auto a) {

        Consola.notificarÉxito("***** INGRESAR AUTO *****\n");
        Auto auto = new Auto();

        String vocales = "AEIOU";
        String consonantes = "BCDFGHJKLMNPQRSTVWXYZ";

        Random r = new Random();

        for (int i = 0; i < 1; i++) {
            String matricula = "";

            int cons_length = consonantes.length();
            int voc_length = vocales.length();

            matricula += consonantes.charAt(r.nextInt(cons_length));
            matricula += consonantes.charAt(r.nextInt(cons_length));

            matricula += vocales.charAt(r.nextInt(voc_length));

            matricula += '-';

            matricula += r.nextInt(1);
            matricula += r.nextInt(1);
            matricula += r.nextInt(1);

            matricula += '-';

            matricula += vocales.charAt(r.nextInt(voc_length));

//            System.out.println(i + " . " + matricula);
            auto.setPlaca(Lectura_Datos.leerCadena("Placa Auto Generada : " + matricula));
            auto.setMarca(Lectura_Datos.leerCadena("Marca Auto: "));
            auto.setModelo(Lectura_Datos.leerCadena("Modelo Auto: "));
            auto.setColor(Lectura_Datos.leerCadena("Color Auto: "));
            auto.setPrecioUnitario(Lectura_Datos.leerDouble("Precio Auto: "));
            auto.setPuertas(Lectura_Datos.leerInt("Puertas Auto: "));
            auto.setTransmision(Lectura_Datos.leerCadena("Transmisión Auto: "));
        }
        Consola.notificarÉxito("***** AUTO INGRESADO *****\n");
        return auto;

    }

    public void listarAutos(ArrayList<Auto> lista) {
        int valor = 0;

        for (Auto auto : lista) {
            Consola.notificarÉxito("***** LISTAR AUTOS *****\n");

            System.out.println("Opción: " + valor);
            System.out.println("Marca: " + auto.getMarca());
            System.out.println("Modelo: " + auto.getModelo());
            System.out.println("Color: " + auto.getColor());
            System.out.println("Precio: $" + auto.getPrecioUnitario());
            System.out.println("Puertas: " + auto.getPuertas());
            System.out.println("Transmisión: " + auto.getTransmision());
        }
        valor++;
        System.out.println("");
    }

    public void modificarAuto(ArrayList<Auto> lista) {
        int valor = 0;
        do {
            int opcion = 0;
            Consola.notificarÉxito("***** MODIFICAR AUTOS *****\n");
            System.out.println("Seleccione el Auto a Modificar");

            for (Auto auto : lista) {

                System.out.println("");
                System.out.println("Opcion: " + opcion + "\n");
                Consola.notificarError(auto.getMarca());
                System.out.println("Marca : ");
                System.out.println(auto.getMarca());
                System.out.println("Modelo anterior: " + auto.getModelo());
                auto.setModelo(Lectura_Datos.leerCadena("Nuevo modelo: "));
                System.out.println("Color: " + auto.getColor());
                auto.setColor(Lectura_Datos.leerCadena("Nuevo color: "));
                System.out.println("Precio: $" + auto.getPrecioUnitario());
                auto.setPrecioUnitario(Lectura_Datos.leerInt("Nuevo precio: "));
                System.out.println("");

                opcion++;
            }
            valor = Lectura_Datos.leerInt("\nSELECCIONE UNA OPCIÓN [0-" + (lista.size() - 1) + "]: ");

        } while (valor < 0 || valor > lista.size());

        Auto c = lista.get(valor);
        ingresarAuto(c);
        Consola.notificarÉxito("***** AUTO MODIFICADO *****\n");
    }

    public void eliminarAuto(ArrayList<Auto> lista) {
        int opcion;
        Consola.notificarÉxito("** ELIMINAR AUTO **");
        for (int i = 0; i < lista.size(); i++) {

            System.out.println("Opción: " + i + ".-Auto"
                    + "  " + lista.get(i).getMarca()
                    + "  " + lista.get(i).getModelo());
        }
        try {
            opcion = Lectura_Datos.leerInt("Seleccione el número "
                    + "del auto a eliminar [0-" + (lista.size() - 1) + "]");
            lista.remove(opcion);
            Consola.notificarError("***** AUTO ELINIMADO *****\n");
        } catch (Exception e) {
            Consola.notificarError("Error, no fue posible eliminar el auto");
            Consola.notificarError("Código de error: " + e.getMessage());
        }
    }

    public void listarAutoMarca(ArrayList<Auto> lista) {
        boolean auxiliar = true;
        int valor = 0;
        Consola.notificarÉxito("** BUSCAR AUTO **");
        char letra = (Lectura_Datos.leerCaracter("Ingrese la Inicial de la Marca: "));

        for (Auto auto : lista) {
            if (letra == auto.getMarca().charAt(0) || letra == auto.getModelo().charAt(0)) {

                System.out.println("Opción: " + valor);
                System.out.println("Marca: " + auto.getMarca());
                System.out.println("Modelo: " + auto.getModelo());
                System.out.println("Color: " + auto.getColor());
                System.out.println("Precio: $" + auto.getPrecioUnitario());
                System.out.println("Puertas: " + auto.getPuertas());
                System.out.println("Transmisión: " + auto.getTransmision());

                Consola.notificarÉxito("** AUTO ENCONTRADO **\n");
                valor++;
                auxiliar = false;
                break;
            } else {
                Consola.notificarError("** NO HAY COINCIDENCIAS **\n");
            }
        }
    }

//     public static void imprimirVehiculoCaroBarato(ArrayList<Vehiculo> vehiculos) {
//        double precioMasCaro = 0;
//        String autoMasCaro = null;
//        double precioMasBarato = 0;
//        String autoMasBarato = null;
//
//        for (Vehiculo vehiculo : vehiculos) {
//            if (vehiculo.getPrecioUnitario() > precioMasCaro) {
//                precioMasCaro = vehiculo.getPrecioUnitario();
//                autoMasCaro = vehiculo.mostrarMarcaModelo();
//            }
//        }
//        
//        precioMasBarato = precioMasCaro;
//
//        for (Vehiculo vehiculo : vehiculos) {
//            if (vehiculo.getPrecioUnitario() < precioMasBarato) {
//                precioMasBarato = vehiculo.getPrecioUnitario();
//                autoMasBarato = vehiculo.mostrarMarcaModelo();
//            }
//        }
//        System.out.println("Vehículo más caro: " + autoMasCaro);
//        System.out.println("Vehículo más barato: " + autoMasBarato);
//    }
//      public static void imprimirVehiculosOrdenadosPrecio(ArrayList<Vehiculo> vehiculos) {
//        System.out.println("Vehículos ordenados por precio de mayor a menor:");
//        Collections.sort(vehiculos);
//        for (Vehiculo vehiculo : vehiculos) {
//            System.out.println(vehiculo.mostrarMarcaModelo());
//        }
//        System.out.println("===================================================");
//    }
    public void guardarInfornacion(ArrayList<Auto> listaAutos) {
        File archivo = new File("C:\\Users\\USER\\Documents\\NetBeansProjects\\Proyecto_POO\\src/List_Car.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            listaAutos.forEach((auto) -> {
                escribir.print(
                        auto.getMarca()
                        + ";" + auto.getModelo()
                        + ";" + auto.getColor()
                        + ";" + auto.getPrecioUnitario()
                        + ";" + auto.getPuertas()
                        + ";" + auto.getTransmision() + ";");
            });
            escribir.close();
        } catch (FileNotFoundException e) {
        }
    }

    public static void almacenarAuto(ArrayList<Auto> listaAuto) {
        File archivo = new File("C:\\Users\\USER\\Documents\\NetBeansProjects\\Proyecto_POO\\src/Autos.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            for (Auto auto : listaAuto) {
                escribir.print(
                        auto.getMarca() + ";"
                        + auto.getModelo() + ";"
                        + auto.getColor() + ";"
                        + auto.getPrecioUnitario() + ";"
                        + auto.getPuertas() + ";"
                        + auto.getTransmision() + ";");

            }
            escribir.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Auto.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Archivo no encontrado");
        }
    }

    public static ArrayList<Auto> cargarAuto() {

        ArrayList<Auto> listaAuto = new ArrayList<>();
        File archivo = new File("C:\\Users\\USER\\Documents\\NetBeansProjects\\Proyecto_POO\\src/Lista_Autos.txt");
        try {
            Scanner leer = new Scanner(archivo);
            while (leer.hasNextLine()) {
                String linea = leer.nextLine();
                String[] vectorAuto = linea.split(";");
                Auto auto = new Auto();

                auto.setMarca(vectorAuto[0]);
                auto.setModelo(vectorAuto[1]);
                auto.setColor(vectorAuto[2]);
                auto.setPrecioUnitario(Double.parseDouble(vectorAuto[3]));
                auto.setPuertas(Integer.parseInt(vectorAuto[4]));
                auto.setTransmision(vectorAuto[5]);

                listaAuto.add(auto);
//                listaAuto.addAll(listaAuto);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Auto.class
                    .getName()).log(Level.SEVERE, null, ex);
            System.out.println("Archivo no encontrado");
        }
        return null;
    }
}
