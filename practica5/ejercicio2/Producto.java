package practica5.ejercicio2;


public class Producto {
    private Long id;
    private String nombre;
    private Double precio;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double price) {
        this.precio = price;
    }

    public String toString (){
        return "Id "+id+ " nombre "+ nombre + " precio " + precio;
    }

}
