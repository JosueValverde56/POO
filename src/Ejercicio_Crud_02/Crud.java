package Ejercicio_Crud_02;

import java.util.ArrayList;
import java.util.List;

public class Crud {

    private Crud() {
    }

    public static String listar(List universo) {
        StringBuilder resultado = new StringBuilder("[\n");
        for (int i = 0; i < universo.size(); i++) {
            resultado.append("  ").append(universo.get(i).toString()).append("\n");
        }
        resultado.append("]");
        return resultado.toString();
    }

    public static String listar(Propietario objeto) {
        return "[\n  " + objeto.toString() + "\n]";
    }

    public static void añadirInmueble(List<Inmueble> universo, Inmueble nuevo) {
        universo.add(nuevo);
    }

    public static void añadirGarage(List<Garage> universo, Garage nuevo) {
        universo.add(nuevo);
    }

    public static void añadirPiscina(List<Piscina> universo, Piscina nuevo) {
        universo.add(nuevo);
    }

    public static void añadirPropietario(List<Propietario> universo, Propietario nuevo) {
        universo.add(nuevo);
    }

    public static void añadirFecha(List<Fecha> universo, Fecha nuevo) {
        universo.add(nuevo);
    }

    public static void eliminarInmueble(List<Inmueble> universo, double superficie) {
        Inmueble i = buscarInmueble(universo, superficie).get(0);
        universo.remove(universo.indexOf(i));
    }

    public static void eliminarGarage(List<Garage> universo, double superficie) {
        Garage g = buscarGarage(universo, superficie).get(0);
        universo.remove(universo.indexOf(g));
    }

    public static void eliminarPiscina(List<Piscina> universo, double volumen) {
        Piscina p = buscarPiscina(universo, volumen).get(0);
        universo.remove(universo.indexOf(p));
    }

    public static void eliminarPropietario(List<Propietario> universo, String cedula) {
        Propietario p = buscarPropietario(universo, cedula);
        universo.remove(universo.indexOf(p));
    }

    public static void eliminarFecha(List<Fecha> universo, int año) {
        Fecha f = buscarFecha(universo, año).get(0);
        universo.remove(f);
    }

    public static List<Garage> buscarGarage(List<Garage> universo, double superficie) {
        ArrayList<Garage> resultados = new ArrayList<>();
        for (Garage garage : universo) {
            if (garage.getSuperficie() == superficie) {
                resultados.add(garage);
            }
        }
        return resultados;
    }

    public static Propietario buscarPropietario(List<Propietario> universo, String cedula) {
        Propietario resultado = null;
        for (Propietario propietario : universo) {
            if (propietario.getCedula()
                    .equals(cedula)) {
                resultado = propietario;
                break;
            }
        }
        return resultado;
    }

    public static List<Piscina> buscarPiscina(List<Piscina> universo, double volumen) {
        ArrayList<Piscina> resultados = new ArrayList<>();
        for (Piscina piscina : universo) {
            if (piscina.getVolumen() == volumen) {
                resultados.add(piscina);
            }
        }
        return resultados;
    }

    public static List<Inmueble> buscarInmueble(List<Inmueble> universo, double superficie) {
        ArrayList<Inmueble> resultados = new ArrayList<>();
        for (Inmueble inmueble : universo) {
            if (inmueble.getSuperficie() == superficie) {
                resultados.add(inmueble);
            }
        }
        return resultados;
    }

    public static List<Fecha> buscarFecha(List<Fecha> universo, int año) {
        ArrayList<Fecha> resultados = new ArrayList<>();
        for (Fecha fecha : universo) {
            if (fecha.getAño() == año) {
                resultados.add(fecha);
            }
        }
        return resultados;
    }

    public static void modificarInmueble(Inmueble antiguo, Inmueble modelo) {
        if (modelo.getFechaConstruccion() != null) {
            antiguo.setFechaConstruccion(antiguo.getFechaConstruccion());
        }
        if (modelo.getGarage() != null) {
            antiguo.setGarage(modelo.getGarage());
        }
        if (modelo.getNumeroHabitaciones() != 0) {
            antiguo.setNumeroHabitaciones(modelo.getNumeroHabitaciones());
        }
        if (modelo.getPiscina() != null) {
            antiguo.setPiscina(modelo.getPiscina());
        }
        if (modelo.getPropietario() != null) {
            antiguo.setPropietario(modelo.getPropietario());
        }
        if (modelo.getSuperficie() != 0) {
            antiguo.setSuperficie(modelo.getSuperficie());
        }
    }

    public static void modificarFecha(Fecha antiguo, Fecha modelo) {
        if (modelo.getAño() != antiguo.getAño() || modelo.getAño() != 0) {
            antiguo.setAño(modelo.getAño());
        }
        if (modelo.getMes() != antiguo.getMes() || modelo.getMes() != 0) {
            antiguo.setMes(modelo.getMes());
        }
        if (modelo.getDia() != antiguo.getDia() || modelo.getDia() != 0) {
            antiguo.setDia(modelo.getDia());
        }
    }

    public static void modificarPropietario(Propietario antiguo, Propietario modelo) {
        if (modelo.getCedula() != null) {
            antiguo.setCedula(modelo.getCedula());
        }
        if (modelo.getNombre() != null) {
            antiguo.setNombre(modelo.getNombre());
        }
        if (modelo.getTelefono() != null) {
            antiguo.setTelefono(modelo.getTelefono());
        }
        if (modelo.getFechaNacimiento() != null) {
            antiguo.setFechaNacimiento(modelo.getFechaNacimiento());
        }
    }

    public static void modificarPiscina(Piscina antiguo, Piscina modelo) {
        // controlar la entrada de cubierta en el método que llame a este método
        if (modelo.getVolumen() != antiguo.getVolumen() || modelo.getVolumen() != 0) {
            antiguo.setVolumen(modelo.getVolumen());
        }
        if (modelo.tieneCubierta() != antiguo.tieneCubierta()) {
            antiguo.setCubierta(modelo.tieneCubierta());
        }
    }

    public static void modificarGarage(Garage antiguo, Garage modelo) {
        if (modelo.getSuperficie() != antiguo.getSuperficie() || modelo.getSuperficie() != 0) {
            antiguo.setSuperficie(modelo.getSuperficie());
        }
        if (modelo.getNumeroPlazas() != antiguo.getNumeroPlazas()
                || modelo.getNumeroPlazas() != 0) {
            antiguo.setNumeroPlazas(modelo.getNumeroPlazas());
        }
    }
}
