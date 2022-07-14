package Ejercicio_Crud_00;

import Lectura_Datos.Consola;
import Ejercicio_Crud_03.Lectura_Datos;
import java.util.ArrayList;

public class Main_Principal {

    static ArrayList<Empleado> listaEmpleado = new ArrayList<>();
    static ArrayList<Computador> listaComputador = new ArrayList<>();

    public static void main(String[] args) {

        gestionAsignacion();

    }
    public static void gestionAsignacion() {

        int opcion = 0;
        boolean respuesta = true;
        do {

            System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
            Consola.notificarÉxito("          MODULO ASIGNACION           ");
            System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
            System.out.println("");
            System.out.println("1.MODULO EMPLEADO");
            System.out.println("2.MODULO COMPUTADOR");
            System.out.println("3.MODULO ASIGNACION");
            System.out.println("4.SALIR");

            opcion = Lectura_Datos.leerInt("\nSELECCIONE UNA OPCIÓN [1-4]:");

            switch (opcion) {
                case 1:

                    moduloEmpleado();
                    Persistencia.almacenarEmpleado(listaEmpleado);

                    break;
                case 2:

                    moduloComputador();
                    Persistencia.almacenarEmpleado(listaEmpleado);

                    break;

                case 3:

                    moduloAsignacion();
                    Persistencia.almacenarEmpleado(listaEmpleado);

                    break;

                case 4:

                    Consola.notificarÉxito("Finalizar ");
                    respuesta = false;

                    break;

                default:
                    System.out.println("");

                    Consola.notificarError("Opcion Incorrecta");
                    Consola.notificarError("SELECCIONE UNA OPCIÓN VALIDA [1-4]:");
                    System.out.println("");
            }
        } while (respuesta);

    }

    public static void moduloEmpleado() {

        int opcion = 0;
        boolean respuesta = true;

        Empleado empleado = new Empleado();

        do {

            Consola.notificarÉxito("♣♣♣♣♣♣♣ MODULO EMPLEADO ♣♣♣♣♣♣♣");
            System.out.println("1.Crear");
            System.out.println("2.Modificar");
            System.out.println("3.Eliminar");
            System.out.println("4.Listar Completo");
            System.out.println("5.Lista Parametrizada");
            System.out.println("6.Listar Inicial");
            System.out.println("7.Finalizar");
            opcion = Lectura_Datos.leerInt("\nSELECCIONE UNA OPCIÓN [1-5]:");

            switch (opcion) {
                case 1:

                    listaEmpleado.add(empleado.crearEmpleado(empleado));
                    empleado.guardarInfornacion(listaEmpleado);

                    break;
                case 2:

                    empleado.modificarEmpleados(listaEmpleado);
                    empleado.guardarInfornacion(listaEmpleado);
                    
                    break;

                case 3:

                    empleado.eliminarEmpleado(listaEmpleado);
                    empleado.guardarInfornacion(listaEmpleado);

                    break;

                case 4:

                    empleado.listarEmpleados(listaEmpleado);
                    empleado.guardarInfornacion(listaEmpleado);

                    break;
                case 5:

                    empleado.listarEmpleadoParametros(listaEmpleado);
                    empleado.guardarInfornacion(listaEmpleado);

                    break;

                case 6:

                    empleado.listarEmpleadoNombre(listaEmpleado);
                    empleado.guardarInfornacion(listaEmpleado);

                    break;

                case 7:

                    Consola.notificarÉxito("Finalizar ");
                    respuesta = false;

                    break;

                default:
                    System.out.println("");
                    Consola.notificarError("Opcion Incorrecta");
                    Consola.notificarError("SELECCIONE UNA OPCIÓN VALIDA [1-7]:");
                    System.out.println("");
            }
        } while (respuesta);
    }

    public static void moduloComputador() {
        int opcion = 0;
        boolean respuesta = true;

        Computador computador = new Computador();

        do {

            Consola.notificarÉxito("♣♣♣♣♣♣♣ MODULO COMPUTADOR ♣♣♣♣♣♣♣");
            System.out.println("1.Crear");
            System.out.println("2.Modificar");
            System.out.println("3.Eliminar");
            System.out.println("4.Listar");
            System.out.println("5.Finalizar");
            opcion = Lectura_Datos.leerInt("\nSELECCIONE UNA OPCIÓN VALIDA [1-5]:");

            switch (opcion) {
                case 1:

                    listaComputador.add(computador.crearComputador(null));
                    

                    break;
                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    computador.listarComputador(listaComputador);
                    

                    break;

                case 5:

                default:
                    System.out.println("");
                    Consola.notificarError("Opcion Incorrecta");
                    Consola.notificarError("SELECCIONE UNA OPCIÓN [1-4]:");
                    System.out.println("");

            }
        } while (respuesta);
    }

    public static void moduloAsignacion() {
        int opcion = 0;
        boolean respuesta = true;

        Computador computador = new Computador();

        do {
            Consola.notificarÉxito("♣♣♣♣♣♣♣ MODULO ASIGNACION ♣♣♣♣♣♣♣");

            System.out.println("1.Asignar");
            System.out.println("2.Retirar");
            System.out.println("3.Finalizar");
            opcion = Lectura_Datos.leerInt("\nSELECCIONE UNA OPCIÓN VALIDA [1-3]:");

            switch (opcion) {
                case 1:

                    Empleado.asignarComputador(listaEmpleado, listaComputador);

                    break;
                case 2:

                    break;

                case 3:

                    respuesta = false;
                    break;

                default:
                    System.out.println("");
                    Consola.notificarError("Opcion Incorrecta");
                    Consola.notificarError("SELECCIONE UNA OPCIÓN [1-3]:");
                    System.out.println("");
            }
        } while (respuesta);
    }
}
