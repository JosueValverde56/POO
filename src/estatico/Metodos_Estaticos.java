
package estatico;

public class Metodos_Estaticos {

    public int valorNoEstatico = 0;
    public static int valorEstatico = 8;

    public static void metodoEstatico() {
        int otroValor = 5;
        System.out.println("Llamada al metodo estatico");
        System.out.println(valorEstatico + otroValor);
    }

    public void metodoNoEstatico() {
        System.out.println("Llamada al metodo no estatico");
        System.out.println(valorNoEstatico);
    }

    public static void main(String[] args) {
        Metodos_Estaticos.metodoEstatico();
        Metodos_Estaticos.valorEstatico=4;
        System.out.println("");
        Metodos_Estaticos instancia = new Metodos_Estaticos();
        instancia.valorNoEstatico = 123;
        instancia.metodoNoEstatico();
        Metodos_Estaticos otraInstancia = new Metodos_Estaticos();
        otraInstancia.valorNoEstatico = 666;
        otraInstancia.metodoNoEstatico();
        Metodos_Estaticos.valorEstatico = 777;
        System.out.println("");
    }

}
