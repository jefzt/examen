public class ItemMenu {
    private String id;
    private String nombre;
    private double precio;

    public ItemMenu(String id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String obtenerDetalles() {
        return "ID: " + id + " | Nombre: " + nombre + " | Precio: " + precio;
    }
}