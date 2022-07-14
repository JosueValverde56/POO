package Ejercicio_Crud_03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Garage {

    private String idGarage;
    private double superficie;
    private int numeroPlazas;
    private char tipoPuerta;

    public Garage() {
    }

    public Garage(String idGarage, double superficie, int numeroPlazas, char tipoPuerta) {
        this.idGarage = idGarage;
        this.superficie = superficie;
        this.numeroPlazas = numeroPlazas;
        this.tipoPuerta = tipoPuerta;
    }

    public String getIdGarage() {
        return idGarage;
    }
    public void setIdGarage(String idGarage) {
        this.idGarage = idGarage;
    }
    public double getSuperficie() {
        return superficie;
    }
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    public int getNumeroPlazas() {
        return numeroPlazas;
    }
    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }
    public char getTipoPuerta() {
        return tipoPuerta;
    }
    public void setTipoPuerta(char tipoPuerta) {
        this.tipoPuerta = tipoPuerta;
    }

    public static void almacenarGarage(ArrayList<Garage> listaGarage) {
        File archivo = new File("C:\\Users\\USER\\Documents\\NetBeansProjects\\Proyecto_POO\\src/listaGarage.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            for (Garage garage : listaGarage) {
                escribir.print(
                        garage.getIdGarage() + ";"
                        + garage.getSuperficie() + ";"
                        + garage.getNumeroPlazas() + ";"
                        + garage.getTipoPuerta() + ";");
            }
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Propietario.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Archivo no encontrado");
        }
    }

    public Garage crearGarage(Garage g) {
        System.out.println("***** CREAR GARAGE *****\n");
        Garage garage = new Garage();
        garage.setIdGarage(Lectura_Datos.leerCadena("Identificador Garage: "));
        garage.setSuperficie(Lectura_Datos.leerDouble("Superficie: "));

        do {
            garage.setNumeroPlazas(Lectura_Datos.leerInt("Número de Plazas: "));

            if (garage.getNumeroPlazas() < 0 || garage.getNumeroPlazas() > 3) {
                Consola.notificarError("El Número Ingresado es Incorrecto");
            }
        } while (garage.getNumeroPlazas() > 3);

        char tipoPuerta;
        do {
            System.out.println("Automatico [A] - Manual [M]");
            tipoPuerta = (Lectura_Datos.leerCaracter("Ingrese el tipo de puerta [A/M]:"));

        } while (tipoPuerta != 'A' && tipoPuerta != 'M');
        garage.setTipoPuerta(tipoPuerta);

        Consola.notificarÉxito("***** GARAGE CREADO *****\n");

        return garage;
    }

    public void listarGarage(ArrayList<Garage> listaGarage) {
        Consola.notificarÉxito("***** LISTAR EMPLEADO *****");
        for (Garage garage : listaGarage) {
            System.out.println("\nIdentificador Garage: " + garage.getIdGarage());
            System.out.println("Superficie: " + garage.getSuperficie());
            System.out.println("Numero Plazas: " + garage.getNumeroPlazas());
            System.out.println("Tipo Puerta: " + garage.getTipoPuerta());
            System.out.println("");
        }
        Consola.notificarÉxito("***** GARAGE LISTADO *****\n");
    }
    public void modificarGarage(ArrayList<Garage> listaGarage) {
        int valor = 0;
        do {
            int opcion = 0;
            System.out.println("***** MODIFICAR GARAGE *****\n");
            System.out.println("Seleccione el Garage a Modificar");
            for (Garage garage : listaGarage) {
                System.out.println("");
                System.out.println("Opcion: " + opcion + "\nIdentificador Garage: " + garage.getIdGarage());
                System.out.println("Superficie: " + garage.getSuperficie());
                System.out.println("Número Plazas: " + garage.getNumeroPlazas());
                System.out.println("Tipo Puerta: " + garage.getTipoPuerta());
                opcion++;}
            valor = Lectura_Datos.leerInt("\nSELECCIONE UNA OPCIÓN [0-" + (listaGarage.size() - 1) + "]: ");

        } while (valor < 0 || valor > listaGarage.size());
        Garage g = listaGarage.get(valor);
        crearGarage(g);
        Consola.notificarÉxito("***** EMPLEADO MODIFICADO *****\n");
    }

    public void eliminarGarage(ArrayList<Garage> listaGarage) {
        int opcion;
        Consola.notificarÉxito("***** ELIMINAR GARAGE *****");
        for (int i = 0; i < listaGarage.size(); i++) {
            System.out.println("\nIdentificador Garage: " + listaGarage.get(i).getIdGarage());
            System.out.println("Superficie: " + listaGarage.get(i).getSuperficie());
            System.out.println("Numero Plazas: " + listaGarage.get(i).getNumeroPlazas());
            System.out.println("Tipo Puerta: " + listaGarage.get(i).getTipoPuerta());
        }
        try {
            opcion = Lectura_Datos.leerInt("Seleccione el número "
                    + "de empleado a eliminar [0-" + (listaGarage.size() - 1) + "]");
            listaGarage.remove(opcion);
            Consola.notificarÉxito("***** EMPLEADO ELIMINADO*****");
        } catch (Exception e) {
            Consola.notificarError("Error, no fue posible eliminar el empleado");
            Consola.notificarError("Código de error: " + e.getMessage());
        }
    }
}
