public class CuentaBancaria {
    // Atributos de la clase
    private int numeroCuenta;
    private double saldo;
    private String titular;

    // Método constructor de la clase
    public CuentaBancaria(int numeroCuenta, double saldo, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    // Métodos de la clase
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public void consultarSaldo() {
        System.out.println("La cuenta N° " + numeroCuenta + " tiene un saldo de: " + saldo);
    }
}
