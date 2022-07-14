package Ejercicio_Crud_03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Propietario {

    private String cedula;
    private String nombre;
    private String telefono;
    private String fechaNacimiento;
    private Garage tieneGarage;

    public Propietario() {
    }

    public Propietario(String cedula, String nombre, String telefono, String fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public Garage getTieneGarage() {
        return tieneGarage;
    }
    public void setTieneGarage(Garage tieneGarage) {
        this.tieneGarage = tieneGarage;
    }
    
    public static boolean esSoloNumeros(String cadena) {
        String regex = "[0-9]*";
        return (cadena.matches(regex));
    }

    public static boolean esCedula(String cedula) {
        boolean cedulaCorrecta;
        try {
            if (cedula.length() == 10) {
                int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                int verificador = Integer.parseInt(cedula.substring(9, 10));
                int suma = 0;
                int digito;
                for (int i = 0; i < (cedula.length() - 1); i++) {
                    digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                    suma += ((digito % 10) + (digito / 10));
                }
                cedulaCorrecta = ((suma % 10 == 0 && verificador == 0) || (10 - suma % 10 == verificador));
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException e) {
            cedulaCorrecta = false;
        }
        return cedulaCorrecta;
    }

    public static String fechaNacimiento(String fechaNacimiento) {
        System.out.println("Fecha con Formato dd/mm/yyyy");
        Scanner sc = new Scanner(System.in);
        String fecha = sc.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date testDate = null;
        String date = fecha;
        try {
            testDate = df.parse(date);
            System.out.println("Fecha Ingresada: " + testDate);
        } catch (ParseException e) {
            System.out.println("Formano Incorrecto");
        }

        if (!df.format(testDate).equals(date)) {
            Consola.notificarError("Información Incorrecta!!");

        }
        Consola.notificarÉxito("Se ha registrado correctamente");
        return (date);

    }

    public static void almacenarPropietario(ArrayList<Propietario> listaPropietarios) {
        File archivo = new File("C:\\Users\\USER\\Documents\\NetBeansProjects\\Proyecto_POO\\src/listaPropietarios.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            for (Propietario propietarios : listaPropietarios) {
                escribir.print(
                        propietarios.getCedula() + ";"
                        + propietarios.getNombre() + ";"
                        + propietarios.getTelefono() + ";"
                        + propietarios.getFechaNacimiento() + ";");
            }
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Propietario.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Archivo no encontrado");
        }
    }

    public Propietario crearPropietario(Propietario p) {
        System.out.println("***** CREAR EMPLEADO *****\n");
        Propietario pro = new Propietario();
        do {
            pro.setCedula(Lectura_Datos.leerCadena("Cedula: "));

            if (!esCedula(pro.cedula)) {
                Consola.notificarError("La Cédula Ingresada es Incorrecta");

            }
        } while (!esCedula(pro.cedula));
        pro.setNombre(Lectura_Datos.leerCadena("Nombre: "));

        do {
            pro.setTelefono(Lectura_Datos.leerCadena("Telefono: "));
            if (!esSoloNumeros(pro.telefono)) {
                Consola.notificarError("Digite Solo Numeros");
                

            }

        } while (!esSoloNumeros(pro.telefono));

        pro.setFechaNacimiento(Lectura_Datos.leerCadena(Propietario.fechaNacimiento(fechaNacimiento)));
        //pro.setFechaNacimiento(Lectura_Datos.leerCadena("Fecha Nacimiento: " + Propietario.fechaNacimiento(fechaNacimiento)));
        Consola.notificarÉxito("***** PROPIETARIO CREADO *****\n");

        return pro;
    }

    public void listarPropietario(ArrayList<Propietario> listaPropietarios) {
        Consola.notificarÉxito("***** LISTAR EMPLEADO *****");
        for (Propietario propietario : listaPropietarios) {
            System.out.println("Cédula: " + propietario.getCedula());
            System.out.println("Nombre: " + propietario.getNombre());
            System.out.println("Telefono: " + propietario.getTelefono());
            System.out.println("Fecha Indicada: " + propietario.getFechaNacimiento());
            System.out.println("");
        }
        Consola.notificarÉxito("***** EMPLEADO LISTADOS *****\n");
    }

    public void listarPropietarioCedula(ArrayList<Propietario> listaPropietarios) {
        boolean auxiliar = true;
        Consola.notificarÉxito("***** LISTAR PROPIETARIO *****");
        String cedula = Lectura_Datos.leerCadena("Ingrese la cédula del propietario: ");
        for (Propietario propietario : listaPropietarios) {
            if (cedula.equals(propietario.getCedula())) {
                System.out.println("Cédula: " + propietario.getCedula());
                System.out.println("Nombre: " + propietario.getNombre());
                System.out.println("Telefono: " + propietario.getTelefono());
                System.out.println("Fecha de Nacimiento: " + "Fecha Indicada: ");
                Consola.notificarÉxito("***** PROPIETARIO ENCONTRADO *****\n");
                auxiliar = false;
                break;
            }
        }
        if (auxiliar) {
            Consola.notificarError("***** NO HAY COINCIDENCIAS *****\n");
        }
    }

    public void modificarPropietario(ArrayList<Propietario> listaPropietarios) {
        boolean auxiliar = true;
        Consola.notificarÉxito("***** MODIFICAR EMPLEADO *****");
        String cedula = Lectura_Datos.leerCadena("Ingrese la cédula del propietario a modificar ");
        for (Propietario propietario : listaPropietarios) {
            if (cedula.equals(propietario.getCedula())) {
                System.out.println("Empleado con cédula: " + propietario.getCedula());
                System.out.println("Nombre anterior: " + propietario.getNombre());
                propietario.setNombre(Lectura_Datos.leerCadena("Nuevo nombre:"));
                System.out.println("Telefono anterior: " + propietario.getTelefono());
                propietario.setTelefono(Lectura_Datos.leerCadena("Nuevo telefono:"));
                System.out.println("Fecha Nacimiento anterior: " + propietario.getFechaNacimiento());
                propietario.setFechaNacimiento(Lectura_Datos.leerCadena("Nueva Fecha de Nacimiento:"));

                Consola.notificarÉxito("***** EMPLEADO MODIFICADO *****\n");
                auxiliar = false;
                break;
            }
        }
        if (auxiliar) {
            Consola.notificarError("***** NO HAY MODIFICACIONES *****\n");
        }
    }

    public void eliminarPropietario(ArrayList<Propietario> listaPropietarios) {
        int opcion;
        Consola.notificarÉxito("***** ELIMINAR EMPLEADO *****");
        for (int i = 0; i < listaPropietarios.size(); i++) {
            System.out.println("Cédula: " + listaPropietarios.get(i).getCedula());
            System.out.println("Nombre: " + listaPropietarios.get(i).getNombre());
            System.out.println("Telefono: " + listaPropietarios.get(i).getTelefono());
            System.out.println("Fecha Indicada: " + listaPropietarios.get(i).getFechaNacimiento());
        }
        try {
            opcion = Lectura_Datos.leerInt("Seleccione el número "
                    + "de empleado a eliminar [0-" + (listaPropietarios.size() - 1) + "]");
            listaPropietarios.remove(opcion);
            Consola.notificarÉxito("***** EMPLEADO ELIMINADO*****");
        } catch (Exception e) {
            Consola.notificarError("Error, no fue posible eliminar el empleado");
            Consola.notificarError("Código de error: " + e.getMessage());
        }
    }

    public static void asignarGarage(ArrayList<Propietario> listaGarages,ArrayList<Garage> listaGarage) {

        int opcionPropietario = 0;
        int opcionGarage = 0;

        do {
        } while (opcionPropietario <= 0 || opcionPropietario >= listaGarages.size());
        do {
            Garage.almacenarGarage(listaGarage);
        } while (opcionGarage <= 0 || opcionGarage >= listaGarage.size());

        Garage computador = listaGarage.get(opcionPropietario);
        listaGarages.get(opcionPropietario).setTieneGarage(computador);
    }
  public static void retirarGarage(ArrayList<Propietario> listaGarages,ArrayList<Garage> listaGarage) {

        int opcionPropietario = 0;
        int opcionGarage = 0;

        do {
        } while (opcionPropietario <= 0 || opcionPropietario >= listaGarages.size());
        do {
            Garage.almacenarGarage(listaGarage);
        } while (opcionGarage <= 0 || opcionGarage >= listaGarage.size());
        
        Garage garage = listaGarage.get(opcionPropietario);
        listaGarages.get(opcionPropietario).setTieneGarage(garage);
         listaGarage.remove(opcionGarage);
    }
}
