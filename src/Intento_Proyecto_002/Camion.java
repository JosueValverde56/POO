package Intento_Proyecto_002;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Camion extends Vehiculo {

    private float cilindraje;
    private float capacidad;

    public Camion() {

    }

    public Camion(String placa, String marca, String modelo, String color,
            double precioUnitario, float cilindraje, float capacidad) {
        super(placa, marca, modelo, color, precioUnitario);
        this.cilindraje = cilindraje;
        this.capacidad = capacidad;
    }

    public float getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(float cilindraje) {
        this.cilindraje = cilindraje;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public void mostrarTodosDatos() {

        System.out.println("Placa: " + getPlaca()
                + " // Marca: " + getMarca()
                + " // Modelo: " + getModelo()
                + " // Color: " + getColor()
                + " // Precio: $" + getPrecioUnitario()
                + " // Cilindraje en Litros: " + getCilindraje() + " lt"
                + " // Capacidad Carga en Filos: " + getCapacidad() + " kl");
    }

    public Camion ingresarCamion(Camion a) {

        Consola.notificarÉxito("***** INGRESAR CAMION *****\n");
        Camion camion = new Camion();

        String vocales = "AEIOU";
        String consonantes = "BCDFGHJKLMNPQRSTVWXYZ";

        Random r = new Random();

        for (int i = 0; i < 1; i++) {
            String matricula = "";

            int cons_length = consonantes.length();
            int voc_length = vocales.length();

            // primer y segundo caracter:
            matricula += consonantes.charAt(r.nextInt(cons_length));
            matricula += consonantes.charAt(r.nextInt(cons_length));

            // tercer caracter:
            matricula += vocales.charAt(r.nextInt(voc_length));

            // cuarto caracter:
            matricula += '-';

            // quinto, sexto y septimo caracter:
            matricula += r.nextInt(1);
            matricula += r.nextInt(1);
            matricula += r.nextInt(1);

            // octavo caracter:
            matricula += '-';

            // noveno caracter:
            matricula += vocales.charAt(r.nextInt(voc_length));

//            System.out.println(i + " . " + matricula);
            camion.setPlaca(Lectura_Datos.leerCadena("Placa Camion Generada : " + matricula));
            camion.setMarca(Lectura_Datos.leerCadena("Marca Camion: "));
            camion.setModelo(Lectura_Datos.leerCadena("Modelo Camion: "));
            camion.setColor(Lectura_Datos.leerCadena("Color Camion: "));
            camion.setPrecioUnitario(Lectura_Datos.leerInt("Precio Camion: "));
            camion.setCilindraje(Lectura_Datos.leerFloat("Cilindraje Camion: "));
            camion.setCapacidad(Lectura_Datos.leerFloat("Capacidad Camion: "));
        }
        Consola.notificarÉxito("***** CAMION INGRESADO *****\n");
        return camion;
    }

    public void listarCamion(ArrayList<Camion> lista) {
        int valor = 0;

        for (Camion camion : lista) {
            Consola.notificarÉxito("***** LISTAR CAMION *****\n");

            System.out.println("Opción: " + valor);
            System.out.println("Marca: " + camion.getMarca());
            System.out.println("Modelo: " + camion.getModelo());
            System.out.println("Color: " + camion.getColor());
            System.out.println("Precio: $" + camion.getPrecioUnitario());
            System.out.println("Cilindraje: " + camion.getCilindraje());
            System.out.println("Capacidad: " + camion.getCapacidad());

            valor++;
            System.out.println("");
        }
    }

    public void modificarCamion(ArrayList<Camion> lista) {

        int valor = 0;
        do {
            int opcion = 0;
            Consola.notificarÉxito("***** MODIFICAR CAMION *****\n");
            System.out.println("Seleccione el Camion a Modificar");
            for (Camion camion : lista) {
                System.out.println("");

                System.out.println("Opcion: " + opcion + "\n");
                System.out.println("Marca: " + camion.getMarca());
                System.out.println("Modelo: " + camion.getModelo());
                System.out.println("Color: " + camion.getColor());
                System.out.println("Precio: $" + camion.getPrecioUnitario());
                System.out.println("Cilindraje: " + camion.getCilindraje());
                System.out.println("Capacidad: " + camion.getCapacidad());

                opcion++;
            }
            valor = Lectura_Datos.leerInt("\nSELECCIONE UNA OPCIÓN [0-" + (lista.size() - 1) + "]: ");

        } while (valor < 0 || valor > lista.size());

        Camion c = lista.get(valor);
        ingresarCamion(c);
        Consola.notificarÉxito("***** CAMION MODIFICADO *****\n");
    }

    public void eliminarCamion(ArrayList<Camion> lista) {
        int opcion;
        Consola.notificarÉxito("** ELIMINAR CAMION **");
        for (int i = 0; i < lista.size(); i++) {

            System.out.println("Opción: " + i + ".-Camion"
                    + "  " + lista.get(i).getMarca()
                    + "  " + lista.get(i).getModelo());
        }
        try {
            opcion = Lectura_Datos.leerInt("Seleccione el número "
                    + "del camion a eliminar [0-" + (lista.size() - 1) + "]");
            lista.remove(opcion);
            Consola.notificarError("***** CAMION ELINIMADO *****\n");
        } catch (Exception e) {
            Consola.notificarError("Error, no fue posible eliminar el camion");
            Consola.notificarError("Código de error: " + e.getMessage());
        }
    }

    public void listarCamionMarca(ArrayList<Camion> lista) {
        boolean auxiliar = true;
        int valor = 0;
        Consola.notificarÉxito("** BUSCAR CAMION **");
        char letra = Lectura_Datos.leerCaracter("Ingrese la inical de la Marca");
        for (Camion camion : lista) {
            if (letra == camion.getMarca().charAt(0) || letra == camion.getModelo().charAt(0)) {

                System.out.println("Opción: " + valor);
                System.out.println("Marca: " + camion.getMarca());
                System.out.println("Modelo: " + camion.getModelo());
                System.out.println("Color: " + camion.getColor());
                System.out.println("Precio: $" + camion.getPrecioUnitario());
                System.out.println("Cilindraje: " + camion.getCilindraje());
                System.out.println("Capacidad: " + camion.getCapacidad());

                Consola.notificarÉxito("** CAMION ENCONTRADO **\n");
                valor++;
                auxiliar = false;
                break;
            } else {
                Consola.notificarError("** NO HAY COINCIDENCIAS **\n");
            }
        }
    }

    public void guardarInfornacion(ArrayList<Camion> listaAutos) {
        File archivo = new File("C:\\Users\\USER\\Documents\\NetBeansProjects\\Proyecto_POO\\src/Camion.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            listaAutos.forEach((camion) -> {
                escribir.print(camion.getPlaca()
                        + ";" + camion.getMarca()
                        + ";" + camion.getModelo()
                        + ";" + camion.getColor()
                        + ";" + camion.getPrecioUnitario()
                        + ";" + camion.getCilindraje()
                        + ";" + camion.getCapacidad() + ";");
            });
            escribir.close();
        } catch (FileNotFoundException e) {
        }
    }

    public static void almacenarCamion(ArrayList<Camion> listaCamion) {
        File archivo = new File("C:\\Users\\USER\\Documents\\NetBeansProjects\\Proyecto_POO\\src/Camion.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            for (Camion camion : listaCamion) {
                escribir.print(
                        camion.getMarca() + ";"
                        + camion.getModelo() + ";"
                        + camion.getColor() + ";"
                        + camion.getPrecioUnitario() + ";"
                        + camion.getCilindraje() + ";"
                        + camion.getCapacidad() + ";");

            }
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Camion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Archivo no encontrado");
        }
    }

    public static ArrayList<Camion> cargarCamion() {

        ArrayList<Camion> listaCamion = new ArrayList<>();
        File archivo = new File("C:\\Users\\USER\\Documents\\NetBeansProjects\\Proyecto_POO\\src/Lista_Camion.txt");
        try {
            Scanner leer = new Scanner(archivo);
            while (leer.hasNextLine()) {
                String linea = leer.nextLine();
                String[] vectorAuto = linea.split(";");
                Camion camion = new Camion();

                camion.setPlaca(vectorAuto[0]);
                camion.setMarca(vectorAuto[1]);
                camion.setModelo(vectorAuto[2]);
                camion.setColor(vectorAuto[3]);
                camion.setPrecioUnitario(Integer.parseInt(vectorAuto[4]));
                camion.setCilindraje(Float.parseFloat(vectorAuto[5]));
                camion.setCapacidad(Float.parseFloat(vectorAuto[6]));

                listaCamion.add(camion);
//                listaCamion.addAll(listaCamion);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Camion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Archivo no encontrado");
        }
        return null;
    }
}
