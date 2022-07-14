package Intento_Proyecto_002;

import java.util.ArrayList;

public class Main_Principal_02 {

    static ArrayList<Usuario> listaUsuario = new ArrayList<>();
    static ArrayList<Compra> listaCompra = new ArrayList<>();

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
            System.out.println("1.MODULO USUARIO");
            System.out.println("2.MODULO COMPRA");
            System.out.println("3.SALIR");

            opcion = Lectura_Datos.leerInt("\nSELECCIONE UNA OPCIÓN [1-3]:");

            switch (opcion) {
                case 1:

//                    listaUsuario = Usuario.cargarUsuario();
                    moduloUsuario();
                    Usuario.almacenarUsuario(listaUsuario);

                    break;
                case 2:

                    

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

    public static void moduloUsuario() {

        int opcion = 0;
        boolean respuesta = true;

        Usuario usuario = new Usuario();

        do {

            Consola.notificarÉxito("♣♣♣♣♣♣♣ MODULO USUARIO ♣♣♣♣♣♣♣\n");

            System.out.println("1.Ingresar Usuario");
            System.out.println("2.Listar Usuario");
            System.out.println("3.Modificar Usuario");
            System.out.println("4.Eliminar Usuario");
            System.out.println("5.Listar Usuario por Cedula");
            System.out.println("6.Finalizar");
            opcion = Lectura_Datos.leerInt("\nSELECCIONE UNA OPCIÓN [1-6]:");

            switch (opcion) {
                case 1:

                    listaUsuario.add(usuario.crearUsuario(usuario));
                    usuario.guardarInfornacion(listaUsuario);

                    break;
                case 2:

                    usuario.listarUsuario(listaUsuario);
                    usuario.guardarInfornacion(listaUsuario);

                    break;

                case 3:

                    usuario.modificarUsuario(listaUsuario);
                    usuario.guardarInfornacion(listaUsuario);

                    break;

                case 4:


                    usuario.eliminarUsuario(listaUsuario);
                    usuario.guardarInfornacion(listaUsuario);

                    break;

                case 5:

                    usuario.listarUsuarioCedula(listaUsuario);
                    usuario.guardarInfornacion(listaUsuario);

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

    public static void moduloCompra() {

        int opcion = 0;
        boolean respuesta = true;

        Compra compra = new Compra();

        do {

            Consola.notificarÉxito("♣♣♣♣♣♣♣ MODULO COMPRA ♣♣♣♣♣♣♣\n");

            System.out.println("1.Ingresar Camion");
            System.out.println("2.Listar Camion");
            System.out.println("3.Modificar Camion");
            System.out.println("4.Eliminar Camion");
            System.out.println("5.Listar Camion por Marca");
            System.out.println("6.Finalizar");
            opcion = Lectura_Datos.leerInt("\nSELECCIONE UNA OPCIÓN [1-6]:");

            switch (opcion) {
                case 1:


                    break;
                case 2:


                    break;

                case 3:



                    break;

                case 4:


                    break;

                case 5:


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
