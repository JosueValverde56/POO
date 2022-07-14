
package Ejercicio_Herencia_Abstract_03;

public class Usuario extends Seguridad_Virtual {
    
    private String id;

    public Usuario() {
    System.out.println("USUARIO");
    }

    public Usuario(String id) {
        this.id = id;
    }
     public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Override
    public void generarContraseña() {
    }

    @Override
    public void generarUsuario() {
        System.out.println("Usuario: "+getId()+"\n");
    }
}
