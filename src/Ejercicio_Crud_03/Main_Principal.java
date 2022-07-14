package Ejercicio_Crud_03;

import java.util.ArrayList;

public class Main_Principal {

    static ArrayList<Propietario> listaPropietarios = new ArrayList<>();
    static ArrayList<Garage> listaGarage = new ArrayList<>();

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
            System.out.println("1.MODULO PROPIETARIO");
            System.out.println("2.MODULO GARAGE");
            System.out.println("3.MODULO ASIGNACIÓN");
            System.out.println("4.SALIR");

            opcion = Lectura_Datos.leerInt("\nSELECCIONE UNA OPCIÓN [1-4]:");

            switch (opcion) {
                case 1:

                    moduloPropietario();
                    Propietario.almacenarPropietario(listaPropietarios);

                    break;
                case 2:
                    moduloGarage();
                    Garage.almacenarGarage(listaGarage);

                   

                    break;

                case 3:

                    

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
    
    
    public static void moduloPropietario() {
        int opcion = 0;
        boolean respuesta = true;

        Propietario propietario = new Propietario();

        do {
            System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
            Consola.notificarÉxito("♣♣♣♣♣♣♣ MODULO PROPIETARIO ♣♣♣♣♣♣♣");
            System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
            System.out.println("1.Crear");
            System.out.println("2.Listar");
            System.out.println("3.Modificar");
            System.out.println("4.Eliminar");
            System.out.println("5.Finalizar");

            opcion = Lectura_Datos.leerInt("\nSELECCIONE UNA OPCIÓN [1-5]:");

            switch (opcion) {
                case 1:
                    listaPropietarios.add(propietario.crearPropietario(propietario));
                    Propietario.almacenarPropietario(listaPropietarios);
                    break;
                case 2:
                    propietario.listarPropietario(listaPropietarios);
                    Propietario.almacenarPropietario(listaPropietarios);
                    break;
                case 3:
                   propietario.modificarPropietario(listaPropietarios);
                   Propietario.almacenarPropietario(listaPropietarios);
                    break;
                case 4:
                   propietario.eliminarPropietario(listaPropietarios);
                   Propietario.almacenarPropietario(listaPropietarios);
                    break;
                case 5:
                    Consola.notificarÉxito("Hasta Pronto");
                    break;
                default:
                    Consola.notificarError("Opcion Incorrecta");
            }
        } while (respuesta);
    }

     public static void moduloGarage() {
        int opcion = 0;
        boolean respuesta = true;

        Garage garage = new Garage();

        do {
            System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
            Consola.notificarÉxito("♣♣♣♣♣♣♣ MODULO GARAGE ♣♣♣♣♣♣♣");
            System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
            System.out.println("1.Crear");
            System.out.println("2.Listar");
            System.out.println("3.Modificar");
            System.out.println("4.Eliminar");
            System.out.println("5.Finalizar");

            opcion = Lectura_Datos.leerInt("\nSELECCIONE UNA OPCIÓN [1-5]:");

            switch (opcion) {
                case 1:
                    listaGarage.add(garage.crearGarage(garage));
                    Garage.almacenarGarage(listaGarage);
                    break;
                case 2:
                    garage.listarGarage(listaGarage);
                    Garage.almacenarGarage(listaGarage);
                    break;
                case 3:
                   garage.modificarGarage(listaGarage);
                   Garage.almacenarGarage(listaGarage);
                    break;
                case 4:
                   garage.eliminarGarage(listaGarage);
                   Garage.almacenarGarage(listaGarage);
                    break;
                case 5:
                    Consola.notificarÉxito("Hasta Pronto");
                    break;
                default:
                    Consola.notificarError("Opcion Incorrecta");
            }
        } while (respuesta);
    }
     
     
     
     
      public static void moduloAsignacion() {
        int opcion = 0;
        boolean respuesta = true;

        Garage garage = new Garage();

        do {
            Consola.notificarÉxito("♣♣♣♣♣♣♣ MODULO ASIGNACION ♣♣♣♣♣♣♣");

            System.out.println("1.Asignar");
            System.out.println("2.Retirar");
            System.out.println("3.Finalizar");
            opcion = Lectura_Datos.leerInt("\nSELECCIONE UNA OPCIÓN VALIDA [1-3]:");

            switch (opcion) {
                case 1:
                    Propietario.asignarGarage(listaPropietarios, listaGarage);

                    break;
                case 2:
                    
                    Propietario.retirarGarage(listaPropietarios, listaGarage);

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
