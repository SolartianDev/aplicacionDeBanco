
package banco.main;

public abstract class Cuenta {
    protected double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return ": el saldo de la cuenta es: "+ this.saldo;
    }

}
