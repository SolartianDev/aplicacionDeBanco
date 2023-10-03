
package banco.main;


public class GuardarCuenta extends Cuenta implements OperacionesCuenta{
    
    double interes = 0.06;

    public GuardarCuenta(double saldo) {
        super(saldo);
    }
    
    
    @Override
    public boolean retiros(double monto) {
        if(monto <= saldo){
            saldo -= monto;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String getDescripcion() {
        return "Cuenta de Ahorros ";
    }
    
    @Override
    public void deposito(double monto){
       saldo += monto;
       saldo -=  (saldo*interes);
    
   }

    @Override
    public double getSaldo() {
      return saldo;
    }

    @Override
    public String toString() {
        return this.getDescripcion() + " El saldo es de : " + this.getSaldo();
    }
    
}
