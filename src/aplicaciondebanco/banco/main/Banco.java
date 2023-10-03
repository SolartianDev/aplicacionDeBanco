
package banco.main;

public class Banco implements OperacionesBanco{
    private Cliente[] clientes;
    private int numeroDeCuentas;

    public Banco() {
        this.clientes = new Cliente[10];
        this.numeroDeCuentas = 0;
    }
    
    @Override
    public void agregarCliente(String nombres, String apellidos,LineaDeServicio lineaDeServicio){
        int i = numeroDeCuentas++;
        clientes[i] = new Cliente(nombres,apellidos,lineaDeServicio);
    }

   

    @Override
    public Cliente getClientes(int indiceDeCliente) {
       return clientes[indiceDeCliente];
    }

    @Override
    public int getNumeroDeCuentas() {
        return numeroDeCuentas;
    }

   

    
    
    
}
