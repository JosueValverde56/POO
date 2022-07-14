
package Ejercicio_Crud_02;

public class Fecha {
     private int dia;
    private int mes;
    private int año;

    public int getDia() {
        return dia;
    }
    public void setDia(int valor) {
        dia = valor;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int valor) {
        mes = valor;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int valor) {
        año = valor;
    }
    @Override
    public String toString() {
        return año + "/" + mes + "/" + dia;
    }
}
