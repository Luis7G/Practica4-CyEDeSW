package practica5.ejercicio4;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class MiApp {
    public static void main(String[] args) {
        AtomicInteger total = new AtomicInteger(0);

        IntStream.range(1, 14).forEach(i -> total.set(total.get()+i));

        System.out.println(total.get());
    }
    
}
