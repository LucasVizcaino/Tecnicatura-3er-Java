
package domain;


public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    //Bloque de iniciacion statico
    static{
        System.out.println("Ejecucion del bloque estatico");
        ++Persona.contadorPersona;
    }
    {//Bloque de actualizacion No ESTATICO
        System.out.println("Ejecicion del bloque NO estatico");
        this.idPersona = Persona.contadorPersona++;//Incrementamos el atributo
    }
    
    //Los bloques de actualizacion se ejecutan antes que el constructor
    public Persona( ) {
        System.out.println("Ejecucion del constructor");
    }
    
    public int idPersona(){
        return this.idPersona;
    }
}
