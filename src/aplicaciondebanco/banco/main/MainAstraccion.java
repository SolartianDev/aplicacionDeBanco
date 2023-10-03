package banco.main;


public class MainAstraccion {

    
    
    public static void main(String[] args) {
        OperacionesBanco banco = new Banco();
        inicializarClientes(banco);
        
        
        banco.generarReporte();
        
        
    }
    
    private static void inicializarClientes(OperacionesBanco banco) {
   
        Cliente cliente;
        Cliente cliente1;
        Cliente cliente2;
        Cliente cliente3;
        Cliente cliente4;
        Cliente cliente5;
        
        banco.agregarCliente("William", "Perez",LineaDeServicio.VISA);
        cliente = banco.getClientes(0);
        GuardarCuenta cuenta2 = new GuardarCuenta(500.00);
        cliente.agregarCuenta(cuenta2);
        
        
        banco.agregarCliente("Juan", "Rodriguez",LineaDeServicio.MASTERCARD);
        cliente1 = banco.getClientes(1);
        GuardarCuenta cuenta = new GuardarCuenta(300.00);
        
        cliente1.agregarCuenta(cuenta);
       
        cuenta.deposito(100.00);
         System.out.println("la cuenta del man "+cliente1.getCuenta(0));
        
        banco.agregarCliente("Juliana", "Rosa",LineaDeServicio.VISA);
        cliente2 = banco.getClientes(2);
        cliente2.agregarCuenta(new GuardarCuenta(400.00));
        
        banco.agregarCliente("Alberto", "Cortes",LineaDeServicio.AMERICANEXPREES);
        cliente3 = banco.getClientes(3);
        cliente3.agregarCuenta(new GuardarCuenta(10000.00));
        
        banco.agregarCliente("Jose", "Garzon",LineaDeServicio.MASTERCARD);
        cliente4 = banco.getClientes(4);
        cliente4.agregarCuenta(new GuardarCuenta(2000.00));
        
        banco.agregarCliente("Sofia", "Hernandez",LineaDeServicio.VISA);
        cliente5 = banco.getClientes(5);
        GuardarCuenta cuenta1 = new GuardarCuenta(100.00);
        
        cliente5.agregarCuenta(cuenta1);
        
        cuenta1.retiros(50.00);
        cliente5.agregarCuenta(cuenta1);
        System.out.println("Retiro exitoso "+ cuenta1.getSaldo());
    }
}
