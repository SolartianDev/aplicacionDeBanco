
package aplicaciondebanco.banco.main;

public abstract class Cuenta {
    protected double saldo;  // Declaración de una variable protegida de tipo double llamada "saldo".

    public Cuenta(double saldo) {
        this.saldo = saldo;  // Inicialización de la variable "saldo" con el valor proporcionado en el constructor.
    }

    @Override
    public String toString() {
        // Sobrecarga del método "toString" para proporcionar una representación de cadena de la cuenta.
        return ": el saldo de la cuenta es: " + this.saldo;  // Retorna una cadena que muestra el saldo de la cuenta.
    }
}
