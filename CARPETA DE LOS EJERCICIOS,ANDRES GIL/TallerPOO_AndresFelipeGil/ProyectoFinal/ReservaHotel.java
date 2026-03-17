public class ReservaHotel {

    private String nombreCliente;
    private String fechaEntrada;
    private String fechaSalida;
    private int numeroHabitacion;
    private boolean activa;

    public ReservaHotel(String nombreCliente, String fechaEntrada, String fechaSalida, int numeroHabitacion) {
        this.nombreCliente = nombreCliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.numeroHabitacion = numeroHabitacion;
        this.activa = false;
    }

    public void nuevaReserva() {
        if (!activa) {
            activa = true;
            System.out.println("Reserva creada para " + nombreCliente +
                " | Habitacion: " + numeroHabitacion +
                " | Entrada: " + fechaEntrada +
                " | Salida: " + fechaSalida);
        } else {
            System.out.println("Ya existe una reserva activa para " + nombreCliente);
        }
    }

    public void cancelarReserva() {
        if (activa) {
            activa = false;
            System.out.println("Reserva cancelada para " + nombreCliente +
                " | Habitacion: " + numeroHabitacion);
        } else {
            System.out.println("No hay reserva activa para cancelar.");
        }
    }

    public void consultarReserva() {
        System.out.println("--- Informacion de Reserva ---");
        System.out.println("Cliente      : " + nombreCliente);
        System.out.println("Habitacion   : " + numeroHabitacion);
        System.out.println("Fecha entrada: " + fechaEntrada);
        System.out.println("Fecha salida : " + fechaSalida);
        System.out.println("Estado       : " + (activa ? "Activa" : "Cancelada"));
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        ReservaHotel r1 = new ReservaHotel("Andres Felipe Gil", "2026-04-01", "2026-04-05", 101);
        ReservaHotel r2 = new ReservaHotel("Maria Rodriguez", "2026-04-10", "2026-04-12", 205);
        ReservaHotel r3 = new ReservaHotel("Carlos Perez", "2026-04-15", "2026-04-20", 310);

        r1.nuevaReserva();
        r1.consultarReserva();
        r1.nuevaReserva();

        r2.nuevaReserva();
        r2.cancelarReserva();
        r2.consultarReserva();
        r2.cancelarReserva();

        r3.nuevaReserva();
        r3.consultarReserva();
        r3.cancelarReserva();
        r3.consultarReserva();
    }
}
