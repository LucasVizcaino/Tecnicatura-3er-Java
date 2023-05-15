
package enumeraciones;


public enum Continentes {
    AFRICA(52, "1.2 billones"),
    EUROPA(46, "1.5 billones"),
    ASIA(44, "2 billones"),
    AMERICA(34, "1 billon"),
    OCEANIA(14, "95 millones");
    
    private final int paises;
    private String habitantes;
    
    Continentes(int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }
    
    //Metodo get
    public int getPaises(){
        return this.paises;
    }
    
    //Metodo get
    public String getHabitantes(){
        return this.habitantes;
    }
    
}
