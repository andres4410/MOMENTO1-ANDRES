public class Producto {

    private String nombre;
    private String codigo;
    private int cantidadStock;
    private double precio;

    public Producto(String nombre, String codigo, int cantidadStock, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidadStock = cantidadStock;
        this.precio = precio;
    }

    public void anadirStock(int cantidad) {
        if (cantidad > 0) {
            cantidadStock += cantidad;
            System.out.println("Stock anadido. Stock actual de '" + nombre + "': " + cantidadStock);
        } else {
            System.out.println("La cantidad debe ser mayor a 0.");
        }
    }

    public void reducirStock(int cantidad) {
        if (cantidad > 0 && cantidad <= cantidadStock) {
            cantidadStock -= cantidad;
            System.out.println("Stock reducido. Stock actual de '" + nombre + "': " + cantidadStock);
        } else {
            System.out.println("Stock insuficiente o cantidad invalida.");
        }
    }

    public double calcularValorInventario() {
        double valor = cantidadStock * precio;
        System.out.println("Valor total del inventario de '" + nombre + "': $" + valor);
        return valor;
    }

    public static void main(String[] args) {
        Producto p1 = new Producto("Laptop", "LAP-001", 10, 1500.0);
        Producto p2 = new Producto("Mouse", "MOU-002", 50, 25.0);
        Producto p3 = new Producto("Teclado", "TEC-003", 30, 45.0);

        p1.calcularValorInventario();
        p1.reducirStock(3);
        p1.calcularValorInventario();

        p2.anadirStock(20);
        p2.calcularValorInventario();

        p3.reducirStock(100);
        p3.anadirStock(10);
        p3.calcularValorInventario();
    }
}
