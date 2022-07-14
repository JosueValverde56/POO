package Ejercicio_Crud_00;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Persistencia {

    public static void almacenarEmpleado(ArrayList<Empleado> listaEmpleados) {
        File archivo = new File("C:\\Users\\USER\\Documents\\NetBeansProjects\\Proyecto_POO\\src/listaEmpleados.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            for (Empleado empleado : listaEmpleados) {
                escribir.print(
                        empleado.getCedulaEmpleado() + ";"
                        + empleado.getNombreEmpleado() + ";"
                        + empleado.getApellidoEmpleado() + ";"
                        + empleado.getTelefonoEmpleado() + ";"
                        + empleado.getGeneroEmpleado() + ";"
                        + empleado.getEdadEmpleado() + ";");
            }
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Archivo no encontrado");

        }
    }

    public static ArrayList<Empleado> cargrarEmpleado() {

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        File archivo = new File("C:\\/listaEmpleados.txt");
        try {
            Scanner leer = new Scanner(archivo);
            while (leer.hasNextLine()) {
                String linea = leer.nextLine();
                String[] vectorEmpleado = linea.split(";");
                Empleado empleado = new Empleado();
                empleado.setCedulaEmpleado(vectorEmpleado[0]);
                empleado.setNombreEmpleado(vectorEmpleado[1]);
                empleado.setApellidoEmpleado(vectorEmpleado[2]);
                empleado.setTelefonoEmpleado(vectorEmpleado[3]);
                empleado.setEdadEmpleado(Integer.parseInt(vectorEmpleado[4]));
                empleado.setGeneroEmpleado(vectorEmpleado[5].charAt(0));
                listaEmpleados.add(empleado);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Archivo no encontrado");
        }
        return null;
    }
}
