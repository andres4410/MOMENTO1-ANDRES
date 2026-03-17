public class Libro {

    private String titulo;
    private String autor;
    private String ISBN;
    private int numeroPaginas;
    private boolean disponible;

    public Libro(String titulo, String autor, String ISBN, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
        this.disponible = true;
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' no esta disponible.");
        }
    }

    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro '" + titulo + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + titulo + "' ya estaba disponible.");
        }
    }

    public boolean estaDisponible() {
        System.out.println("Disponible: " + (disponible ? "Si" : "No"));
        return disponible;
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("Clean Code", "Robert C. Martin", "978-0132350884", 431);
        Libro libro2 = new Libro("El Quijote", "Miguel de Cervantes", "978-8420412146", 863);

        libro1.estaDisponible();
        libro1.prestar();
        libro1.estaDisponible();
        libro1.prestar();
        libro1.devolver();
        libro1.estaDisponible();

        libro2.prestar();
        libro2.devolver();
        libro2.devolver();
    }
}
