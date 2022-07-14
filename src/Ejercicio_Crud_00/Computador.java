package Ejercicio_Crud_00;

import Ejercicio_Crud_03.Lectura_Datos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Computador {

    private int capacidadDisco, memoriaRam, memoriaCore;
    private float tamañoPantalla, velocidadCpu;
    private boolean teclado, mouse;

    public Computador() {
    }

    public Computador(int capacidadDisco, int memoriaRam, int memoriaCore, float tamañoPantalla, float velocidadCpu, boolean teclado, boolean mouse) {
        this.capacidadDisco = capacidadDisco;
        this.memoriaRam = memoriaRam;
        this.memoriaCore = memoriaCore;
        this.tamañoPantalla = tamañoPantalla;
        this.velocidadCpu = velocidadCpu;
        this.teclado = teclado;
        this.mouse = mouse;
    }

    public Computador crearComputador(Computador computador) {

        Computador c;
        if (computador != null) {
            c = computador;
        } else {
            c = new Computador();
        }
        c.setCapacidadDisco(Lectura_Datos.leerInt("Ingrese el tamaño del Disco"));
        c.setMemoriaRam(Lectura_Datos.leerInt("Ingrese la cantidad de RAM"));
        c.setMemoriaCore(Lectura_Datos.leerInt("Ingrese la cantidad de CORE"));
        c.setTamañoPantalla(Lectura_Datos.leerFloat("Ingrese el tamaño de la pantalla"));
        c.setVelocidadCpu(Lectura_Datos.leerFloat("Ingrese la velocidad del CPU"));
        c.setTeclado(Lectura_Datos.leerBoolean());
        c.setMouse(Lectura_Datos.leerBoolean());

        return c;
    }

    public Computador devolverComputador(ArrayList<Computador> listaComputador) {
        int opcion;
        System.out.println("***** BUSCAR COMPUTADOR *****");
        for (int i = 0; i < listaComputador.size(); i++) {
            System.out.println(i
                    + ".- Computador: "
                    + "; Disco: " + listaComputador.get(i).getCapacidadDisco()
                    + "; Ram: " + listaComputador.get(i).getMemoriaRam()
                    + "; Core: " + listaComputador.get(i).getMemoriaCore()
                    + "Pantalla: " + listaComputador.get(i).getTamañoPantalla()
                    + "; Cpu: " + listaComputador.get(i).getVelocidadCpu()
                    + "; Teclado: " + listaComputador.get(i).teclado
                    + "; Mouse: " + listaComputador.get(i).mouse);
        }
        try {
            opcion = Lectura_Datos.leerInt("Seleccione el número "
                    + "de computador a asignar [0-" + (listaComputador.size() - 1) + "]");
            return listaComputador.get(opcion);

        } catch (Exception e) {
            System.out.println("Error, no fue posible seleccionar el computador");
            System.out.println("Código de error: " + e.getMessage());
            return null;
        }
    }

    public static void listarComputador(ArrayList<Computador> listaComputador) {

        for (int i = 0; i < listaComputador.size(); i++) {
            System.out.println(i
                    + ".- Computador: "
                    + "; Disco: " + listaComputador.get(i).getCapacidadDisco()
                    + "; Ram: " + listaComputador.get(i).getMemoriaRam()
                    + "; Core: " + listaComputador.get(i).getMemoriaCore()
                    + "Pantalla: " + listaComputador.get(i).getTamañoPantalla()
                    + "; Cpu: " + listaComputador.get(i).getVelocidadCpu()
                    + "; Teclado: " + listaComputador.get(i).isTeclado()
                    + "; Mouse: " + listaComputador.get(i).isMouse());
        }
    }

    public void modificarComputador(ArrayList<Computador> listaComputador) {

        int valor = 0;
        do {
            int opcion = 0;
            System.out.println("***** MODIFICAR COMPUTADORES *****\n");
            System.out.println("Seleccione el Computador a Modificar");
            for (Computador computador : listaComputador) {
                System.out.println("");
                System.out.println("Opcion: " + opcion + "\nDisco: " + computador.getCapacidadDisco());
                System.out.println("Ram: " + computador.getMemoriaRam());
                System.out.println("Core: " + computador.getMemoriaCore());
                System.out.println("Pantalla: " + computador.getTamañoPantalla());
                System.out.println("Cpu: " + computador.getVelocidadCpu());
                System.out.println("Teclado: " + computador.isTeclado());
                System.out.println("Mouse: " + computador.isMouse());
                opcion++;
            }
            valor = Lectura_Datos.leerInt("\nSELECCIONE UNA OPCIÓN [0-" + (listaComputador.size() - 1) + "]: ");

        } while (valor < 0 || valor > listaComputador.size());

        Computador c = listaComputador.get(valor);
        crearComputador(c);
        System.out.println("");
    }

    public void guardarInfornacion(ArrayList<Computador> listaComputador) {
        File archivo = new File("d:/empleado.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            listaComputador.forEach((computador) -> {
                escribir.print(
                        computador.getCapacidadDisco() + ";"
                        + computador.getMemoriaRam() + ";"
                        + computador.getMemoriaCore() + ";"
                        + computador.getTamañoPantalla() + ";"
                        + computador.getVelocidadCpu() + ";"
                        + computador.isTeclado() + ";"
                        + computador.isMouse() + ";");
            });
            escribir.close();
        } catch (FileNotFoundException e) {
        }
    }
     public static void almacenarComputador(ArrayList<Computador> listaComputador) {
        File archivo = new File("C:\\Users\\USER\\Documents\\NetBeansProjects\\Proyecto_POO\\src/listaEmpleados.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            for (Computador computador : listaComputador) {
                 escribir.print(
                        computador.getCapacidadDisco() + ";"
                        + computador.getMemoriaRam() + ";"
                        + computador.getMemoriaCore() + ";"
                        + computador.getTamañoPantalla() + ";"
                        + computador.getVelocidadCpu() + ";"
                        + computador.isTeclado() + ";"
                        + computador.isMouse() + ";");
            }
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Archivo no encontrado");

        }
    }
         public static ArrayList<Empleado> cargrarComputador() {

        ArrayList<Computador> listaComputador = new ArrayList<>();
        File archivo = new File("C:\\/listaComputador.txt");
        try {
            Scanner leer = new Scanner(archivo);
            while (leer.hasNextLine()) {
                String linea = leer.nextLine();
                String[] vectorComputador = linea.split(";");
                Computador computador = new Computador();
                computador.setCapacidadDisco(0);
                computador.setMemoriaRam(0);
                computador.setMemoriaCore(0);
                computador.setTamañoPantalla(0);
                computador.setVelocidadCpu(0);
                computador.setTeclado(true);
                computador.setMouse(true);
                
                listaComputador.add(computador);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Archivo no encontrado");
        }
        return null;
    }

    public int getCapacidadDisco() {
        return capacidadDisco;
    }

    public void setCapacidadDisco(int capacidadDisco) {
        this.capacidadDisco = capacidadDisco;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getMemoriaCore() {
        return memoriaCore;
    }

    public void setMemoriaCore(int memoriaCore) {
        this.memoriaCore = memoriaCore;
    }

    public float getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(float tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public float getVelocidadCpu() {
        return velocidadCpu;
    }

    public void setVelocidadCpu(float velocidadCpu) {
        this.velocidadCpu = velocidadCpu;
    }

    public boolean isTeclado() {
        return teclado;
    }

    public void setTeclado(boolean teclado) {
        this.teclado = teclado;
    }

    public boolean isMouse() {
        return mouse;
    }

    public void setMouse(boolean mouse) {
        this.mouse = mouse;
    }
}
