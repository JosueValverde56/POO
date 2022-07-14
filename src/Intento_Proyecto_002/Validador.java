
package Intento_Proyecto_002;

public class Validador {

    public static final int MENU = 0;
    public static final int SOLO_LETRAS = 1;
    public static final int CEDULA = 2;
    public static final int EDAD = 3;
    public static final int CALIF = 4;
    public static final int NUM_CON_COMA = 5;
    public static final int NUEVO_VALIDADOR = 6;
    public static final int SOLO_NUMEROS = 7;
    public static final int SOLO_ALFANUMERICOS = 8;
    public static final int TIPO_SEXO = 9;

    public static boolean nuevoValidador(String num) {
        String regex = "[+-]?([0-9]*[.])?[0-9]+";
        return num.matches(regex);
    }

    public static boolean esEmail(String num) {
        String regex = "[+-]?([0-9]*[.])?[0-9]+";
        return num.matches(regex);
    }

    public static boolean esNumConComa(String num) {
        String regex = "[+-]?([0-9]*[.])?[0-9]+";
        return num.matches(regex);
    }

    public static boolean esCalif(String calif) {
        if (esNumConComa(calif)) {
            double valorCalif = Double.parseDouble(calif);
            return (valorCalif == -1 || (valorCalif >= 0 && valorCalif <= 10));
        }
        return false;
    }

    public static boolean esMenu(String opcion) {
        String regex = "-?[1-9]+";
        if (opcion.matches(regex)) {
            int valorOpcion = Integer.parseInt(opcion);
            return (valorOpcion == -1 || (valorOpcion > 0 && valorOpcion < 10));
        }
        return false;
    }
    public static boolean esMenuIngreso(String opcion) {
        String regex = "-?[1-9]+";
        if (opcion.matches(regex)) {
            int valorOpcion = Integer.parseInt(opcion);
            return (valorOpcion == -1 || (valorOpcion > 0 && valorOpcion < 10));
        }
        return false;
    }

    public static boolean esMenuAtencionIncidencia(String opcion) {
        String regex = "-?[1-3]+";
        if (opcion.matches(regex)) {
            int valorOpcion = Integer.parseInt(opcion);
            return (valorOpcion == -1 || (valorOpcion > 0 && valorOpcion < 4));
        }
        return false;
    }
    public static boolean esMenuReporteVisitas(String opcion) {
        String regex = "-?[1-7]+";
        if (opcion.matches(regex)) {
            int valorOpcion = Integer.parseInt(opcion);
            return (valorOpcion == -1 || (valorOpcion > 0 && valorOpcion < 8));
        }
        return false;
    }

    public static boolean esSoloLetras(String cadena) {
        String regex = "[@ñÑáéíóúÁÉÍÓÚA-Za-z].+";
        return (cadena.matches(regex));
    }
    
    public static boolean esSoloNumeros(String cadena) {
        String regex = "[0-9]*";
        return (cadena.matches(regex));
    }

    public static boolean esCedula(String cedula) {
        boolean cedulaCorrecta;
        try {
            if (cedula.length() == 10) {
                // Coeficientes de validación cédula
                // El decimo digito se lo considera dígito verificador
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
        } catch (Exception e) {
            cedulaCorrecta = false;
        }
        return cedulaCorrecta;
    }

    public static boolean esEdad(String edad) {
        String regex = "[0-9]+";
        if (edad.matches(regex)) {
            int valorEdad = Integer.parseInt(edad);
            return true;//para todas las edades 
        }
        return false;
    }

    public static boolean esRuc(String ruc) {
        boolean val = false;
        try {
            int prov = Integer.parseInt(ruc.substring(0, 2));
            final int num_provincias = 24;

            if (!((prov > 0) && (prov <= num_provincias))) {
                return val;
            }

            int v1, v2, v3, v4, v5, v6, v7, v8, v9;
            int sumatoria;
            int modulo;
            int digito;
            int sustraendo;
            int[] d = new int[ruc.length()];

            for (int i = 0; i < d.length; i++) {
                d[i] = Integer.parseInt(ruc.charAt(i) + "");
            }

            v1 = d[0] * 3;
            v2 = d[1] * 2;
            v3 = d[2] * 7;
            v4 = d[3] * 6;
            v5 = d[4] * 5;
            v6 = d[5] * 4;
            v7 = d[6] * 3;
            v8 = d[7] * 2;
            v9 = d[8];

            sumatoria = v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8;
            modulo = sumatoria % 11;
            sustraendo = modulo * 11;
            digito = 11 - (sumatoria - sustraendo);
            //System.out.println("Digito RUC       –> " + digito);
            //System.out.println("Digito Calculado –> " + v9);

            if (digito == v9) {
                val = true;
            } else {
                val = false;
            }
        } catch (Exception e) {
            val = false;
        }
        return val;
    }

    public static boolean esDia(int dia) {
        boolean val = false;
        if (dia >= 1 && dia <= 31) {
            val = true;
        }
        return val;
    }

    public static boolean esMes(int mes) {
        boolean val = false;
        if (mes >= 1 && mes <= 12) {
            val = true;
        }
        return val;
    }

    public static boolean esAnio(int año) {
        boolean val = false;
        String añoAux = String.valueOf(año);
        if (año <= 9999 && año > 0 && añoAux.length() == 4) {
            val = true;
        }
        return val;
    }

    public static boolean esHora(int hora) {
        boolean val = false;
        String añoAux = String.valueOf(hora);
        if ((añoAux.length() == 2 || añoAux.length() == 1) && hora >= 0 && hora < 24) {
            val = true;
        }
        return val;
    }

    public static boolean esMinuto(int min) {
        boolean val = false;
        String añoAux = String.valueOf(min);
        if ((añoAux.length() == 2 || añoAux.length() == 1) && min >= 0 && min < 60) {
            val = true;
        }
        return val;
    }

    public static boolean esSoloAlfanum(String cadena) {
        /*String regex = "^(?:\\p{L}\\p{M}*|[\\-])*$";
        return (cadena.matches(regex));*/
        return true;
    }

    public static boolean esIngresoCedORuc(String cedRuc) {
        String regex = "-?[1-2]+";
        if (cedRuc.matches(regex)) {
            int valorOpcion = Integer.parseInt(cedRuc);
            return (valorOpcion == -1 || (valorOpcion > 0 && valorOpcion < 3));
        }
        return false;
    }
    
    private static boolean esSexo(String dato) {
        if (dato.toUpperCase().equals("M") || dato.toUpperCase().equals("F")) {
            return true;
        }
        return false;
    }

    public static boolean validar(String dato, int tipoValidador) {
        boolean esValido;
        switch (tipoValidador) {
            case MENU:
                esValido = esMenu(dato);
                break;
            case SOLO_LETRAS:
                esValido = esSoloLetras(dato);
                break;
            case CEDULA:
                esValido = esCedula(dato);
                break;
            case EDAD:
                esValido = esEdad(dato);
                break;
            case CALIF:
                esValido = esCalif(dato);
                break;
            case NUM_CON_COMA:
                esValido = esNumConComa(dato);
                break;
            case NUEVO_VALIDADOR:
                esValido = nuevoValidador(dato);
                break;
            case SOLO_NUMEROS:
                esValido = esSoloNumeros(dato);
                break;
            case SOLO_ALFANUMERICOS:
                esValido = esSoloAlfanum(dato);
                break;
            case TIPO_SEXO:
                esValido = esSexo(dato);
                break;
            default:
                throw new AssertionError();
        }
        return esValido;
    }
}