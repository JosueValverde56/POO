
package Ejercico_Interfaces_01;

public abstract class Persona {
    private String tipoSangre;
    
    public abstract void bailar();
    
    public void setTipoSangre(String tipoSangre){
        this.tipoSangre = tipoSangre;
    }
    public String getTipoSangre(){
        return tipoSangre;
    }
    }
