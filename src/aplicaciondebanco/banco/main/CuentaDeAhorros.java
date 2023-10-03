
package aplicaciondebanco.banco.main;

public class CuentaDeAhorros extends Cuenta implements OperacionesCuenta {
    // Declaración de la clase "CuentaDeAhorros" que extiende de la clase "Cuenta" e implementa la interfaz "OperacionesCuenta".
    
    private final double limiteDeRetiros;  // Declaración de una variable final de tipo double llamada "limiteDeRetiros".

    public CuentaDeAhorros(double saldo) {
        // Declaración del constructor de la clase "CuentaDeAhorros" que toma un saldo inicial como parámetro.
        this(100000.00, saldo);  // Llama al otro constructor de la clase con un límite de retiros predeterminado.
    }
           
    public CuentaDeAhorros(double limiteDeRetiros, double saldo) {
        // Declaración de otro constructor de la clase "CuentaDeAhorros" que toma un límite de retiros y un saldo inicial como parámetros.
        super(saldo);  // Llama al constructor de la clase base (superclase) "Cuenta" para inicializar el saldo.
        this.limiteDeRetiros = limiteDeRetiros;  // Inicializa la variable "limiteDeRetiros" con el valor proporcionado.
    }
    
    @Override
    public boolean retiros(double monto) {
        // Implementación del método "retiros" de la interfaz "OperacionesCuenta".
        if (monto <= saldo && monto <= limiteDeRetiros) {
            saldo -= monto;  // Realiza un retiro del saldo.
            return true;  // Retorna true si el retiro fue exitoso.
        } else {
            return false;  // Retorna false si el retiro no fue posible.
        }
    }

    @Override
    public String getDescripcion() {
        // Implementación del método "getDescripcion" de la interfaz "OperacionesCuenta".
        return "Cuenta de Ahorros ";  // Retorna una descripción de la cuenta.
    }

    @Override
    public double getSaldo() {
        // Implementación del método "getSaldo" de la interfaz "OperacionesCuenta".
        return saldo;  // Retorna el saldo de la cuenta.
    }

    @Override
    public void deposito(double monto) {
        // Implementación del método "deposito" de la interfaz "OperacionesCuenta".
        saldo += monto;  // Realiza un depósito en la cuenta sumando el monto al saldo.
    }

    @Override
    public String toString() {
        // Sobrecarga del método "toString" para proporcionar una representación de cadena de la cuenta.
        return this.getDescripcion() + "el saldo es de: " + this.getSaldo();  // Retorna una cadena que muestra la descripción y el saldo de la cuenta.
    }
}
