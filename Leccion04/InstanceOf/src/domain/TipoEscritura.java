
package domain;


public enum TipoEscritura {
    CLASICO("Escritura a mano"),
    MODERNO("Escrito a maquina");
    
    private final String descripcion;
    
    private TipoEscritura(String descripcion){
        this.descripcion = descripcion;
    }
    
    //Metodo get
    public String getDescripcion(){
        return this.descripcion;
    }
}
