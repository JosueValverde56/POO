package Intento_Proyecto_002;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Usuario {

    private String cedula;
    private String nombre;
    private String telefono;

    public Usuario() {
    }

    public Usuario(String cedula, String nombre, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
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

    public Usuario crearUsuario(Usuario u) {
        System.out.println("***** CREAR USUARIO *****\n");
        Usuario usuario = new Usuario();
        do {
            usuario.setCedula(Lectura_Datos.leerCadena("Cedula: "));
            if (!Validador.esCedula(usuario.cedula)) {
                Consola.notificarError("La Cédula Ingresada es Incorrecta");
            }
        } while (!Validador.esCedula(usuario.cedula));
        usuario.setNombre(Lectura_Datos.leerCadena("Nombre: "));

        do {
            usuario.setTelefono(Lectura_Datos.leerCadena("Telefono: "));
            if (!Validador.esSoloNumeros(usuario.telefono)) {
                Consola.notificarError("Digite Solo Numeros");
            }
        } while (!Validador.esSoloNumeros(usuario.telefono));
        Consola.notificarÉxito("***** USUARIO CREADO *****\n");
        return usuario;
    }

    public void listarUsuario(ArrayList<Usuario> listaUsuario) {
        Consola.notificarÉxito("***** LISTAR USUARIO *****");
        for (Usuario propietario : listaUsuario) {
            System.out.println("Cédula: " + propietario.getCedula());
            System.out.println("Nombre: " + propietario.getNombre());
            System.out.println("Telefono: " + propietario.getTelefono());
            System.out.println("");
        }
        Consola.notificarÉxito("***** USUARIO LISTADOS *****\n");
    }

    public void listarUsuarioCedula(ArrayList<Usuario> listaUsuario) {
        boolean auxiliar = true;
        Consola.notificarÉxito("***** LISTAR USUARIO POR CEDULA *****");
        String cedula = Lectura_Datos.leerCadena("Ingrese la cédula del propietario: ");
        for (Usuario usuario : listaUsuario) {
            if (cedula.equals(usuario.getCedula())) {

                System.out.println("Cédula: " + usuario.getCedula());
                System.out.println("Nombre: " + usuario.getNombre());
                System.out.println("Telefono: " + usuario.getTelefono());
                System.out.println("Fecha de Nacimiento: " + "Fecha Indicada: ");

                Consola.notificarÉxito("***** USUARIO ENCONTRADO *****\n");
                auxiliar = false;
                break;
            }
        }
        if (auxiliar) {
            Consola.notificarError("***** NO HAY COINCIDENCIAS *****\n");
        }
    }

    public void modificarUsuario(ArrayList<Usuario> listaUsuario) {
        boolean auxiliar = true;
        Consola.notificarÉxito("***** MODIFICAR EMPLEADO *****");
        String cedula = Lectura_Datos.leerCadena("Ingrese la cédula del propietario a modificar ");
        for (Usuario propietario : listaUsuario) {
            if (cedula.equals(propietario.getCedula())) {
                System.out.println("Empleado con cédula: " + propietario.getCedula());
                System.out.println("Nombre anterior: " + propietario.getNombre());
                propietario.setNombre(Lectura_Datos.leerCadena("Nuevo nombre:"));
                System.out.println("Telefono anterior: " + propietario.getTelefono());
                propietario.setTelefono(Lectura_Datos.leerCadena("Nuevo telefono:"));

                Consola.notificarÉxito("***** USUARIO MODIFICADO *****\n");
                auxiliar = false;
                break;
            }
        }
        if (auxiliar) {
            Consola.notificarError("***** NO HAY MODIFICACIONES *****\n");
        }
    }

    public void eliminarUsuario(ArrayList<Usuario> listaUsuario) {
        int opcion;
        Consola.notificarÉxito("***** ELIMINAR USUARIO *****");

        for (int i = 0; i < listaUsuario.size(); i++) {
            System.out.println("Cédula: " + listaUsuario.get(i).getCedula());
            System.out.println("Nombre: " + listaUsuario.get(i).getNombre());
            System.out.println("Telefono: " + listaUsuario.get(i).getTelefono());
        }
        try {
            opcion = Lectura_Datos.leerInt("Seleccione el número "
                    + "de empleado a eliminar [0-" + (listaUsuario.size() - 1) + "]");
            listaUsuario.remove(opcion);
            Consola.notificarError("***** USUARIO ELIMINADO*****");
        } catch (Exception e) {
            Consola.notificarError("Error, no fue posible eliminar el empleado");
            Consola.notificarError("Código de error: " + e.getMessage());
        }
    }

    public void guardarInfornacion(ArrayList<Usuario> listaUsuario) {
        File archivo = new File("C:\\Users\\USER\\Documents\\NetBeansProjects\\Proyecto_POO\\src/Usuario.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            listaUsuario.forEach((usuario) -> {
                escribir.print(usuario.getCedula()
                        + ";" + usuario.getNombre()
                        + ";" + usuario.getTelefono() + ";");
            });
            escribir.close();
        } catch (FileNotFoundException e) {
        }
    }

    public static void almacenarUsuario(ArrayList<Usuario> listaUsuario) {
        File archivo = new File("C:\\Users\\USER\\Documents\\NetBeansProjects\\Proyecto_POO\\src/Camion.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            for (Usuario usuario : listaUsuario) {
                escribir.print(
                        usuario.getCedula() + ";"
                        + usuario.getNombre() + ";"
                        + usuario.getTelefono() + ";");
            }
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Archivo no encontrado");
        }
    }

    public static ArrayList<Usuario> cargarUsuario() {

        ArrayList<Usuario> listaUsuario = new ArrayList<>();
        File archivo = new File("C:\\Users\\USER\\Documents\\NetBeansProjects\\Proyecto_POO\\src/Lista_Usuario.txt");
        try {
            Scanner leer = new Scanner(archivo);
            while (leer.hasNextLine()) {
                String linea = leer.nextLine();
                String[] vectorAuto = linea.split(";");
                Usuario usuario = new Usuario();

                usuario.setCedula(vectorAuto[0]);
                usuario.setNombre(vectorAuto[1]);
                usuario.setTelefono(vectorAuto[2]);

                listaUsuario.add(usuario);
//                listaAuto.addAll(listaAuto);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Usuario.class
                    .getName()).log(Level.SEVERE, null, ex);
            System.out.println("Archivo no encontrado");
        }
        return null;
    }
}
