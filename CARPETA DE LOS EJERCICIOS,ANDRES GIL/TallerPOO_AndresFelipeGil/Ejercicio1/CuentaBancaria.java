public class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;
    private String titular;

    public CuentaBancaria(String numeroCuenta, double saldoInicial, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.titular = titular;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Deposito exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor a 0.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Fondos insuficientes o cantidad invalida.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Titular: " + titular + " | Saldo: $" + saldo);
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("001-2025", 1000.0, "Andres Felipe Gil");
        cuenta1.consultarSaldo();
        cuenta1.depositar(500.0);
        cuenta1.retirar(200.0);
        cuenta1.consultarSaldo();

        CuentaBancaria cuenta2 = new CuentaBancaria("002-2025", 500.0, "Maria Lopez");
        cuenta2.consultarSaldo();
        cuenta2.retirar(600.0);
        cuenta2.depositar(300.0);
        cuenta2.consultarSaldo();
    }
}
