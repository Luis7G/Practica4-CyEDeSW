package practica5.ejercicio3;

import java.util.List;

public class MiApp {
    public static void main(String[] args) {
        List<String> paises = List.of("Ecuador","Colombia","Venezuela","Argentina");


        /*
         * Recorrer la lista de paises para imprimir c/u en pantalla
         */



         paises.forEach(c -> System.out.println(c.toUpperCase()));


    }
    
}
