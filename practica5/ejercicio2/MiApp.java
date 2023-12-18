package practica5.ejercicio2;

public class MiApp {
    public static void main(String[] args) {
        Impresora<String> imprimirStr = string -> System.out.println(string);
        Impresora<Producto> imprimirProducto = producto -> System.out.println(producto);

        Producto producto1 = new Producto();
        producto1.setId(1L);
        producto1.setNombre("Cuaderno 100 hojas");
        producto1.setPrecio(2.25);

        imprimirStr.imprimir("Hola");
        imprimirProducto.imprimir(producto1);

    }
}
