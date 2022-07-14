package Ejercicio_Herencia_Sobreescritura_01;

public class Main_Principal {

    public static void main(String[] args) {
int[] vector1 = new int[]{1,2,3,4};
int[] vector2 = new int[]{5,6,7,8};
        Calcular_Vector v1 = new Calcular_Vector();


v1.sumaVectores(vector1, vector2);
v1.productoPunto(vector1, vector2);
v1.productoPuntoEscalar(vector1, vector2);
      
 CalculadoraVectorHija v2 = new CalculadoraVectorHija();
 
 
v2.sumaVectores1(vector1, vector2);
v2.productoPunto(vector1, vector2);
v2.productoPuntoEscalar(vector1, vector2);
      
    }
}
