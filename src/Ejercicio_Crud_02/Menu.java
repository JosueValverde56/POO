package Ejercicio_Crud_02;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    public static final ArrayList<Garage> GARAGES = new ArrayList<>();
    public static final ArrayList<Inmueble> INMUEBLES = new ArrayList<>();
    public static final ArrayList<Piscina> PISCINAS = new ArrayList<>();
    public static final ArrayList<Propietario> PROPIETARIOS = new ArrayList<>();

    public static void MenuPrincipal(Menu menu) {
        int opcion = 0;
        boolean salir = false;
        System.out.println("MENU PRINCIPAL");
        System.out.println("1.INGRESAR DATOS INMUEBLE \n"
                + "2.INGRESAR DATOS GARAGE\n"
                + "3.INGRESAR DATOS PISCINA\n"
                + "4.INGRESAR DATOS FECHA\n"
                + "5.INGRESAR DATOS PROPIETARIO\n"
                + "6.AÑADIR DATOS\n"
                + "7.BUSCAR DATOS\n"
                + "8.MODIFICAR DATOS\n"
                + "9.ELIMINAR DATOS\n"
                + "10.LISTAR DATOS\n");
        do {
            salir = false;
            System.out.print("Opción: ");
            opcion = Gestor_Datos.leerInt();
            switch (opcion) {
                case 1:
                    Menu.ingresoDatosInmueble();
                    break;
                case 2:
                    Menu.ingresoDatosGarage();
                    break;
                case 3:
                    Menu.ingresoDatosPiscina();
                    break;
                case 4:
                    Menu.ingresoDatosFecha();
                    break;
                case 5:
                    Menu.ingresoDatosPropietario();
                    break;
                case 6:
                    Menu.añadir();
                    break;
                case 7:
                    Menu.buscar();

                    break;
                case 8:
                    Menu.modificar();

                    break;
                case 9:
                    Menu.eliminar();

                    break;
                case 10:
                    Menu.submenu(GARAGES);
                    Menu.submenu(INMUEBLES);
                    Menu.submenu(PISCINAS);
                    Menu.submenu(PROPIETARIOS);
                    break;
                default: {
                    System.out.println("Opción elegida fuera de rango");
                }

            }
        } while (salir);
    }

    public static void buscar() {
        int opcion = 0;
        boolean salir = false;
        System.out.println("BUSCAR");
        System.out.println("1. Inmuebles\n2. Piscinas\n3. Garages\n4. Propietarios\n5. Salir");
        do {
            salir = false;
            System.out.print("Opción: ");
            opcion = Gestor_Datos.leerInt();
            switch (opcion) {
                case 1: {
                    System.out.print("Superficie del Inmueble: ");
                    double sup = Gestor_Datos.leerDouble();
                    System.out.println(Crud.listar(Crud.buscarInmueble(INMUEBLES, sup)));
                    break;
                }
                case 2: {
                    System.out.print("Volumen de la Piscina: ");
                    double vol = Gestor_Datos.leerDouble();
                    System.out.println(Crud.listar(Crud.buscarPiscina(PISCINAS, vol)));
                    break;
                }
                case 3: {
                    System.out.print("Superficie del Garage: ");
                    double sup = Gestor_Datos.leerDouble();
                    System.out.println(Crud.listar(Crud.buscarGarage(GARAGES, sup)));
                    break;
                }
                case 4: {
                    System.out.print("Cedula del Propietario; ");
                    String ced = Gestor_Datos.leerCadena();
                    System.out.println(Crud.listar(Crud.buscarPropietario(PROPIETARIOS, ced)));
                    break;
                }
                case 5: {
                    salir = true;
                    break;
                }
                default: {
                    System.out.println("Opción elegida fuera de rango");
                }

            }
        } while (salir);
    }

    public static void añadir() {
        System.out.println("AÑADIR");
        System.out.println("1. Inmuebles\n2. Piscinas\n3. Garages\n4. Propietarios\n5. Salir");
        int opcion = 0;
        boolean salir = false;
        do {
            salir = false;
            System.out.print("Opción: ");
            opcion = Gestor_Datos.leerInt();
            switch (opcion) {
                case 1: {
                    Inmueble i = ingresoDatosInmueble();
                    Crud.añadirInmueble(INMUEBLES, i);
                    break;
                }
                case 2: {
                    Piscina p = ingresoDatosPiscina();
                    Crud.añadirPiscina(PISCINAS, p);
                    break;
                }
                case 3: {
                    Garage g = ingresoDatosGarage();
                    Crud.añadirGarage(GARAGES, g);
                    break;
                }
                case 4: {
                    Propietario p = ingresoDatosPropietario();
                    Crud.añadirPropietario(PROPIETARIOS, p);
                    break;
                }
                case 5: {
                    salir = true;
                    break;
                }
                default: {
                    System.out.println("Opción elegida fuera de rango");
                }

            }
        } while (salir);

    }

    public static void eliminar() {
        int opcion = 0;
        boolean salir = false;
        System.out.println("ELIMINAR");
        System.out.println("1. Inmuebles\n2. Piscinas\n3. Garages\n4. Propietarios\n5. Salir");
        do {
            salir = false;
            System.out.print("Opción:  ");
            opcion = Gestor_Datos.leerInt();
            switch (opcion) {
                case 1: {
                    System.out.print("Superficie del Inmueble: ");
                    double sup = Gestor_Datos.leerDouble();
                    Crud.eliminarInmueble(INMUEBLES, sup);
                    break;
                }
                case 2: {
                    System.out.print("Volumen de la Piscina: ");
                    double vol = Gestor_Datos.leerDouble();
                    Crud.eliminarPiscina(PISCINAS, vol);
                    break;
                }
                case 3: {
                    System.out.print("Superficie del Garage: ");
                    double sup = Gestor_Datos.leerDouble();
                    Crud.eliminarGarage(GARAGES, sup);
                    break;
                }
                case 4: {
                    System.out.print("Cedula del Propietario: ");
                    String ced = Gestor_Datos.leerCadena();
                    Crud.eliminarPropietario(PROPIETARIOS, ced);
                    break;
                }
                case 5: {
                    salir = true;
                    break;
                }
                default: {
                    System.out.println("Opción elegida fuera de rango");
                }

            }
        } while (salir);
    }

    public static void modificar() {
        int opcion = 0;
        boolean salir = false;
        System.out.println("MODIFICAR");
        System.out.println("1. Inmuebles\n2. Piscinas\n3. Garages\n4. Propietarios\n5. Salir");
        do {
            salir = false;
            System.out.print("Opción:  ");
            opcion = Gestor_Datos.leerInt();
            switch (opcion) {
                case 1: {
                    System.out.print("Superficie del Inmueble: ");
                    double sup = Gestor_Datos.leerDouble();
                    List<Inmueble> resultados = Crud.buscarInmueble(INMUEBLES, sup);
                    if (resultados.isEmpty()) {
                        System.out.println("Inmueble no encontrado");
                    }
                    int indice = submenu(resultados);
                    System.out.println(resultados.get(indice)
                            .toString());
                    Crud.modificarInmueble(resultados.get(indice), ingresoDatosInmueble());
                    break;
                }
                case 2: {
                    System.out.print("Volumen de la Piscina: ");
                    double vol = Gestor_Datos.leerDouble();
                    List<Piscina> resultados = Crud.buscarPiscina(PISCINAS, vol);
                    if (resultados.isEmpty()) {
                        System.out.println("Piscina no encontrada");
                    }
                    int indice = submenu(resultados);
                    System.out.println(resultados.get(indice)
                            .toString());
                    Crud.modificarPiscina(resultados.get(indice), ingresoDatosPiscina());
                    break;
                }
                case 3: {
                    System.out.print("Superficie del Garaje: ");
                    double sup = Gestor_Datos.leerDouble();
                    List<Garage> resultados = Crud.buscarGarage(GARAGES, sup);
                    if (resultados.isEmpty()) {
                        System.out.println("Garaje no encontrado");
                    }
                    int indice = submenu(resultados);
                    System.out.println(resultados.get(indice)
                            .toString());
                    Crud.modificarGarage(resultados.get(indice), ingresoDatosGarage());

                    break;
                }
                case 4: {
                    System.out.print("Cedula del Propietario: ");
                    String ced = Gestor_Datos.leerCadena();
                    Propietario p = Crud.buscarPropietario(PROPIETARIOS, ced);
                    if (p == null) {
                        System.out.println("Propietario no encontrado");
                    } else {
                        System.out.println(p.toString());
                        Crud.modificarPropietario(p, ingresoDatosPropietario());
                    }
                    break;
                }
                case 5: {
                    salir = true;
                    break;
                }
                default: {
                    System.out.println("Opción elegida fuera de rango");
                }

            }
        } while (salir);
    }

    private static int submenu(List resultados) {
        System.out.println("Resultados encontrados");
        System.out.println(Crud.listar(resultados));
        System.out.print("Eleccion:");
        int eleccion;
        do {
            eleccion = Gestor_Datos.leerInt();
            if (eleccion > 0 && eleccion < resultados.size()) {
                break;
            } else {
                System.out.println("Opcion inválida");
            }
        } while (true);
        return eleccion;
    }

    private static Propietario ingresoDatosPropietario() {
        String cedula = "";
        do {
            System.out.print("Cédula de Propietario: ");
            cedula = Gestor_Datos.leerCadena();
            if (Crud.buscarPropietario(PROPIETARIOS, cedula) == null) {
                break;
            } else {
                System.out.println("Cedula inválida, ya existe esta cedula");
            }
        } while (true);
        Propietario p = new Propietario();
        p.setCedula(cedula);
        System.out.print("Nombre: ");
        p.setNombre(Gestor_Datos.leerCadena());
        System.out.print("Telefono: ");
        p.setTelefono(Gestor_Datos.leerCadena());
        p.setFechaNacimiento(ingresoDatosFecha());

        return p;

    }

    private static Fecha ingresoDatosFecha() {
        Fecha f = new Fecha();
        System.out.println("Fecha de nacimiento:");
        System.out.print("  Dia: ");
        f.setDia(Gestor_Datos.leerInt());
        System.out.print("  Mes: ");
        f.setMes(Gestor_Datos.leerInt());
        System.out.print("  Año: ");
        f.setAño(Gestor_Datos.leerInt());
        return f;
    }

    private static Piscina ingresoDatosPiscina() {
        double volumen;
        do {
            System.out.print("Volumen(c.c): ");
            volumen = Gestor_Datos.leerDouble();
            if (volumen >= 2000 && volumen <= 3000) {
                break;
            } else {
                System.out.println("Solo permitidos valores entre 2000 y 3000");
            }
        } while (true);
        Piscina p = new Piscina();
        p.setVolumen(volumen);
        boolean salir = false;
        do {
            System.out.print("Cubierta: (1) Si, (2) No");
            int eleccion = Gestor_Datos.leerInt();
            switch (eleccion) {
                case 1:
                    p.setCubierta(true);
                    salir = true;
                    break;
                case 2:
                    p.setCubierta(false);
                    salir = true;
                    break;
                default:
                    salir = false;
                    break;
            }
        } while (!salir);
        return p;
    }

    private static Garage ingresoDatosGarage() {
        int plazas;
        do {
            System.out.print("Numero de plazas: ");
            plazas = Gestor_Datos.leerInt();
            if (plazas <= 3 && plazas > 0) {
                break;
            } else {
                System.out.println(
                        "Numero de plazas incorrecto (debe ser un positivo entre el 1 y el 3)");
            }
        } while (true);
        Garage g = new Garage();
        g.setNumeroPlazas(plazas);
        System.out.print("Superficie: ");
        g.setSuperficie(Gestor_Datos.leerDouble());
        return g;
    }

    private static Inmueble ingresoDatosInmueble() {
        double precio;
        do {
            System.out.print("Precio: ");
            precio = Gestor_Datos.leerDouble();
            if (precio >= 50000) {
                break;
            } else {
                System.out.println("El precio mínimo es 50000");
            }
        } while (true);
        Inmueble i = new Inmueble();
        i.setPrecio(precio);
        System.out.print("Superficie: ");
        i.setSuperficie(Gestor_Datos.leerDouble());
        System.out.println("Numero de habitaciones: ");
        i.setNumeroHabitaciones(Gestor_Datos.leerInt());
        System.out.println("Fecha de construccion: ");
        i.setFechaConstruccion(ingresoDatosFecha());
        System.out.println("Propietario (cedula): ");
        Propietario p = Crud.buscarPropietario(PROPIETARIOS, Gestor_Datos.leerCadena());
        if (p == null) {
            System.out.println("No se encontró dicho propietario Registre uno.");
            p = ingresoDatosPropietario();
            Crud.añadirPropietario(PROPIETARIOS, p);
            i.setPropietario(p);
        } else {
            i.setPropietario(p);
        }
        boolean salir;
        do {
            System.out.print("Piscina: (1) Si, (2) No");
            int eleccion = Gestor_Datos.leerInt();
            switch (eleccion) {
                case 1:
                    i.setPiscina(ingresoDatosPiscina());
                    salir = true;
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                    salir = false;
                    break;
            }
        } while (!salir);
        do {
            System.out.print("Garaje: (1) Si, (2) No");
            int eleccion = Gestor_Datos.leerInt();
            switch (eleccion) {
                case 1:
                    i.setGarage(ingresoDatosGarage());
                    salir = true;
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                    salir = false;
                    break;
            }
        } while (!salir);
        return i;
    }
}
