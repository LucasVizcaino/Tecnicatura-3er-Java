
package test;

import domain.*;


public class TestConversionObjetos {
        public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Pepe",15755, TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
