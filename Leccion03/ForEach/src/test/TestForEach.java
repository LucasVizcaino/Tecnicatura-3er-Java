
package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {1, 5, 6, 10}; //Sintaxis resumida
        for(int edad: edades){
            System.out.println("edades = " + edad); //Sintaxis del ForEach
        }
        Persona personas[] = {new Persona("Juan"), new Persona("Pepe")};
        
        //ForEach
        for(Persona persona : personas){
            System.out.println("persona = " + persona);
        }
    }
}
