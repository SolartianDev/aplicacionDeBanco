
package aplicaciondebanco.banco.main;

public interface OperacionesCuenta {
    // Declaración de la interfaz "OperacionesCuenta".

    public double getSaldo();
    // Declaración de un método para obtener el saldo de la cuenta.

    public void deposito(double monto);
    // Declaración de un método para realizar un depósito en la cuenta.

    public boolean retiros(double monto);
    // Declaración de un método para realizar retiros de la cuenta.

    public String getDescripcion();
    // Declaración de un método para obtener una descripción de la cuenta.
}
