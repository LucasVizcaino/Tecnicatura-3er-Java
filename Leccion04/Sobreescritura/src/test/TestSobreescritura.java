
package test;

import domain.*;


public class TestSobreescritura {
    public static void main(String[] args) {
        
        Gerente gerente1 = new Gerente("Jose", 5000, "sistemas");
        imprimir(gerente1);
        Empleado empleado1 = new Empleado("Lucas", 5000);
        imprimir(empleado1);
    }
    
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = "+ empleado.obtenerDetalles());
    }
}
