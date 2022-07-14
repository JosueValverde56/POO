package Intento_Proyecto_002;

import java.util.ArrayList;

public class Main_Principal_01 {

    static ArrayList<Auto> listaAuto = new ArrayList<>();
    static ArrayList<Camion> listaCamion = new ArrayList<>();

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
            System.out.println("1.MODULO AUTO");
            System.out.println("2.MODULO CAMION");
            System.out.println("3.SALIR");

            opcion = Lectura_Datos.leerInt("\nSELECCIONE UNA OPCIÓN [1-3]:");

            switch (opcion) {
                case 1:

                    listaAuto = Auto.cargarAuto();
                    moduloAuto();
                    Auto.almacenarAuto(listaAuto);

                    break;
                case 2:
                    listaCamion = Camion.cargarCamion();
                    moduloCamion();

                    Camion.almacenarCamion(listaCamion);

                    break;

                case 3:

                    Consola.notificarÉxito("Modulo Finalizado\n");
                    respuesta = false;

                    break;

                default:
                    System.out.println("");

                    Consola.notificarError("Opcion Incorrecta");
                    Consola.notificarError("SELECCIONE UNA OPCIÓN VALIDA [1-3]:");
                    System.out.println("");
            }
        } while (respuesta);
    }

    public static void moduloAuto() {

        int opcion = 0;
        boolean respuesta = true;

        Auto auto = new Auto();

        do {

            Consola.notificarÉxito("♣♣♣♣♣♣♣ MODULO AUTO ♣♣♣♣♣♣♣\n");

            System.out.println("1.Ingresar Auto");
            System.out.println("2.Listar Auto");
            System.out.println("3.Modificar Auto");
            System.out.println("4.Eliminar Auto");
            System.out.println("5.Listar Auto por Marca");
            System.out.println("6.Finalizar");
            opcion = Lectura_Datos.leerInt("\nSELECCIONE UNA OPCIÓN [1-6]:");

            switch (opcion) {
                case 1:

                    listaAuto.add(auto.ingresarAuto(auto));
                    auto.guardarInfornacion(listaAuto);

                    break;
                case 2:

                    auto.listarAutos(listaAuto);
                    auto.guardarInfornacion(listaAuto);

                    break;

                case 3:

                    auto.modificarAuto(listaAuto);
                    auto.guardarInfornacion(listaAuto);

                    break;

                case 4:

                    auto.eliminarAuto(listaAuto);
                    auto.guardarInfornacion(listaAuto);

                    break;

                case 5:

                    auto.listarAutoMarca(listaAuto);
                    auto.guardarInfornacion(listaAuto);

                    break;

                case 6:

                    Consola.notificarÉxito("Modulo Finalizado\n");
                    respuesta = false;

                    break;

                default:
                    System.out.println("");

                    Consola.notificarError("Opcion Incorrecta");
                    Consola.notificarError("SELECCIONE UNA OPCIÓN VALIDA [1-6]:");
                    System.out.println("");
            }
        } while (respuesta);
    }

    public static void moduloCamion() {

        int opcion = 0;
        boolean respuesta = true;

        Camion camion = new Camion();

        do {

            Consola.notificarÉxito("♣♣♣♣♣♣♣ MODULO CAMION ♣♣♣♣♣♣♣\n");

            System.out.println("1.Ingresar Camion");
            System.out.println("2.Listar Camion");
            System.out.println("3.Modificar Camion");
            System.out.println("4.Eliminar Camion");
            System.out.println("5.Listar Camion por Marca");
            System.out.println("6.Finalizar");
            opcion = Lectura_Datos.leerInt("\nSELECCIONE UNA OPCIÓN [1-6]:");

            switch (opcion) {
                case 1:

                    listaCamion.add(camion.ingresarCamion(camion));
                    camion.guardarInfornacion(listaCamion);
//                    Auto.cargarAuto();

                    break;
                case 2:

                    camion.listarCamion(listaCamion);
                    camion.guardarInfornacion(listaCamion);

                    break;

                case 3:

                    camion.modificarCamion(listaCamion);
                    camion.guardarInfornacion(listaCamion);

                    break;

                case 4:

                    camion.eliminarCamion(listaCamion);
                    camion.guardarInfornacion(listaCamion);

                    break;

                case 5:

                    camion.listarCamionMarca(listaCamion);
                    camion.guardarInfornacion(listaCamion);

                    break;

                case 6:

                    Consola.notificarÉxito("Modulo Finalizado\n");
                    respuesta = false;

                    break;

                default:
                    System.out.println("");

                    Consola.notificarError("Opcion Incorrecta");
                    Consola.notificarError("SELECCIONE UNA OPCIÓN VALIDA [1-6]:");
                    System.out.println("");
            }
        } while (respuesta);
    }
}
