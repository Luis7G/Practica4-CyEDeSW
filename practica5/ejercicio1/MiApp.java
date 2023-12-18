package practica5.ejercicio1;

public class MiApp{

    public static void main(String[] args) {
        /*
         * El método restar se implementa mediante una clase anónima
         */
        Calculadora restar = new Calculadora() {

            @Override
            public Double ejecutar(Double a, Double b) {
                // TODO Auto-generated method stub
                return a-b;
            }    
        };

        System.out.println(restar.ejecutar(15.5, 8.6));

        /*
         * El método multiplicar se implementa mediante una expresión lambda
         */
        Calculadora multiplicar = (a,b) -> a*b;
        System.out.println(multiplicar.ejecutar(5.0, 2.5));

        /*
         * El método dividir se implementa mediante una expresión lambda
         */

         Calculadora dividir = (a,b) -> {
            System.out.println("Dividiendo "+a+" entre "+ b);
            return a/b;
         };

         System.out.println(dividir.ejecutar(5.0, 2.5));

    }
}