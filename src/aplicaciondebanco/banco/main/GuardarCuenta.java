
package aplicaciondebanco.banco.main;


public class GuardarCuenta extends Cuenta implements OperacionesCuenta {
    // Declaración de la clase "GuardarCuenta" que extiende de la clase "Cuenta" e implementa la interfaz "OperacionesCuenta".
    
    double interes = 0.06;  // Declaración de una variable de tipo double llamada "interes" y asignación de valor 0.06.

    public GuardarCuenta(double saldo) {
        // Declaración del constructor de la clase "GuardarCuenta" que toma un saldo inicial como parámetro.
        super(saldo);  // Llama al constructor de la clase base (superclase) "Cuenta" para inicializar el saldo.
    }
    
    @Override
    public boolean retiros(double monto) {
        // Implementación del método "retiros" de la interfaz "OperacionesCuenta".
        if (monto <= saldo) {
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
    public void deposito(double monto) {
        // Implementación del método "deposito" de la interfaz "OperacionesCuenta".
        saldo += monto;  // Realiza un depósito en la cuenta sumando el monto al saldo.
        saldo -= (saldo * interes);  // Aplica un descuento de intereses al saldo.
    }

    @Override
    public double getSaldo() {
        // Implementación del método "getSaldo" de la interfaz "OperacionesCuenta".
        return saldo;  // Retorna el saldo de la cuenta.
    }

    @Override
    public String toString() {
        // Sobrecarga del método "toString" para proporcionar una representación de cadena de la cuenta.
        return this.getDescripcion() + " El saldo es de : " + this.getSaldo();  // Retorna una cadena que muestra la descripción y el saldo de la cuenta.
    }
}
