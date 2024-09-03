
public class Clase2092024 {
    public static void main(String[] args) {
        // Crear una instancia de CuentaBancaria
        CuentaBancaria objCuentaBancaria1 = new CuentaBancaria(12346789, 1235.0, "Daniel");
        
        // Consultar saldo inicial
        objCuentaBancaria1.consultarSaldo();
        
        // Depositar una cantidad
        objCuentaBancaria1.depositar(500.0);
        System.out.println("Después de depositar 500.0:");
        objCuentaBancaria1.consultarSaldo();
        
        // Retirar una cantidad
        objCuentaBancaria1.retirar(200.0);
        System.out.println("Después de retirar 200.0:");
        objCuentaBancaria1.consultarSaldo();
        
        // Intentar retirar más de lo que hay en la cuenta
        objCuentaBancaria1.retirar(2000.0);
        System.out.println("Después de intentar retirar 2000.0:");
        objCuentaBancaria1.consultarSaldo();
    }
}
