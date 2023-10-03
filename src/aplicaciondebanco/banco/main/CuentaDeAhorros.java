
package banco.main;

public class CuentaDeAhorros extends Cuenta implements OperacionesCuenta{
    
    private final double limiteDeRetiros;

    public CuentaDeAhorros(double saldo){
        this(100000.00,saldo);
    }
           
    public CuentaDeAhorros(double limiteDeRetiros, double saldo) {
        super(saldo);
        this.limiteDeRetiros = limiteDeRetiros;
    }
    
    
    @Override
    public boolean retiros(double monto) {
        if(monto <= saldo && monto<=limiteDeRetiros ){
            saldo -=monto;
            return true;
        }else return false;
    }

    @Override
    public String getDescripcion() {
        return "Cuenta de Ahorros ";
    }

    @Override
    public double getSaldo() {
       return saldo;
    }

    @Override
    public void deposito(double monto) {
        saldo += monto;
    }

    @Override
    public String toString() {
        return this.getDescripcion()+"el saldo es de: "+this.getSaldo();
    }
    
}
