package practica5.ejercicio1;

public interface Calculadora {
    
    Double ejecutar (Double a, Double b);
    default Double sumar (Double a, Double b){
        return a+b;
        
    }
}
