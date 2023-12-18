package practica5.ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class MiApp {
    public static void main(String[] args) {
        /*
         * Referencia método estático
         */
        //Supplier<UUID> getToken = ()->UUID.randomUUID();
        Supplier<UUID> getToken = UUID::randomUUID;
        System.out.println(getToken.get());


        /*
         * Referencia por objeto
         */
        List<Integer> numeros = new ArrayList<>();
        IntStream contador = IntStream.range(1, 6);
        //contador.forEach(i-> numeros.add(i));
        contador.forEach(numeros::add);
        System.out.println(numeros);

        /*
         * Referencia por constructor
         */
        //Supplier<Producto> producto = ()-> new Producto();
        Supplier<Producto> producto = Producto::new;
        System.out.println(producto.get());

        /*
         * Referencia por metodo arbitrario
         */
        //BiPredicate<String, String> equals = (s1, s2)-> s1.equals(s2);
        BiPredicate<String, String> equals = String::equals;
        boolean esIgual = equals.test("Hola", "HolA");
        System.out.println(esIgual);
    }
    
}
