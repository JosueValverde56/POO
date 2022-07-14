package Ejercicio_Herencia_Sobreescritura_01;

public class Calcular_Vector {

    int escalar = 0,n;
    int[] vector1 = new int[4];
    int[] vector2 = new int[4];

    public Calcular_Vector() {
        System.out.println("\n*****************");
        System.out.println(" CALCULAR VECTOR");
        System.out.println("*****************\n");
    }

    public Calcular_Vector(int n) {
        this.n = n;
    }

    public final int[] sumaVectores(int[] vector1, int[] vector2) {
        int[] sumaVectores = new int[4];

        sumaVectores[0] = vector1[0] + vector1[0];
        sumaVectores[1] = vector1[1] + vector1[1];
        sumaVectores[2] = vector1[2] + vector1[2];
        sumaVectores[3] = vector1[3] + vector1[3];

        return sumaVectores;
    }

    public float productoPunto(int[] vector1, int[] vector2) {

        n = n + vector1[0] * vector1[0];
        n = n + vector1[1] * vector1[1];
        n = n + vector1[2] * vector1[2];
        n = n + vector1[3] * vector1[3];
        return n;
    }

    public int[] productoPuntoEscalar(int[] vector1, int[] vector2) {
       int[] producto = new int[4];
        producto[0] = escalar* vector1[0];
        producto[1] = escalar* vector1[1];
        producto[2] = escalar* vector1[2];
        producto[3] = escalar* vector1[3];

        return producto;
    }

    public int getEscalar() {
        return escalar;
    }

    public void setEscalar(int escalar) {
        this.escalar = escalar;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getVector1() {
        return vector1;
    }

    public void setVector1(int[] vector1) {
        this.vector1 = vector1;
    }

    public int[] getVector2() {
        return vector2;
    }

    public void setVector2(int[] vector2) {
        this.vector2 = vector2;
    }
}
