public class Perfume {

    private String nombre;
    private String marca;
    private double capacidad;
    private double precio;
    private double cantidadRestante;

    public Perfume(String nombre, String marca, double capacidad, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.capacidad = capacidad;
        this.precio = precio;
        this.cantidadRestante = capacidad;
    }

    public void aplicarPerfume(double cantidad) {
        if (cantidad > 0 && cantidad <= cantidadRestante) {
            cantidadRestante -= cantidad;
            System.out.println("Perfume aplicado. Restante: " + cantidadRestante + " ml");
        } else {
            System.out.println("Cantidad invalida o insuficiente.");
        }
    }

    public void consultarCantidadRestante() {
        System.out.println("'" + nombre + "' de " + marca + ": " + cantidadRestante + " ml restantes.");
    }

    public void ajustarPrecio(double nuevoPrecio) {
        if (nuevoPrecio > 0) {
            this.precio = nuevoPrecio;
            System.out.println("Precio actualizado de '" + nombre + "': $" + precio);
        } else {
            System.out.println("El precio debe ser mayor a 0.");
        }
    }

    public static void main(String[] args) {
        Perfume p1 = new Perfume("Bleu de Chanel", "Chanel", 100.0, 150.0);
        Perfume p2 = new Perfume("Acqua di Gio", "Giorgio Armani", 50.0, 90.0);

        p1.consultarCantidadRestante();
        p1.aplicarPerfume(5.0);
        p1.aplicarPerfume(3.0);
        p1.consultarCantidadRestante();
        p1.ajustarPrecio(130.0);

        p2.consultarCantidadRestante();
        p2.aplicarPerfume(60.0);
        p2.aplicarPerfume(10.0);
        p2.consultarCantidadRestante();
        p2.ajustarPrecio(80.0);
    }
}
