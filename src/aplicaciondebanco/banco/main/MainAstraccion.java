package aplicaciondebanco.banco.main;


public class MainAstraccion {
    
    public static void main(String[] args) {
        // Método principal de la clase "MainAstraccion".

        OperacionesBanco banco = new Banco();  // Creación de un objeto de tipo "OperacionesBanco" (Banco).
        inicializarClientes(banco);  // Llamada al método "inicializarClientes" para crear y agregar clientes al banco.
        
        banco.generarReporte();  // Genera un informe (reporte) del banco.
    }
    
    private static void inicializarClientes(OperacionesBanco banco) {
        // Método privado para inicializar clientes y cuentas en el banco.

        Cliente cliente;  // Declaración de variables para clientes.
        Cliente cliente1;
        Cliente cliente2;
        Cliente cliente3;
        Cliente cliente4;
        Cliente cliente5;
        
        banco.agregarCliente("William", "Perez", LineaDeServicio.VISA);  // Agrega un cliente al banco con información y línea de servicio.
        cliente = banco.getClientes(0);  // Obtiene el cliente recién agregado.
        GuardarCuenta cuenta2 = new GuardarCuenta(500.00);  // Crea una cuenta de ahorros para el cliente.
        cliente.agregarCuenta(cuenta2);  // Agrega la cuenta al cliente.

        banco.agregarCliente("Juan", "Rodriguez", LineaDeServicio.MASTERCARD);  // Agrega otro cliente al banco.
        cliente1 = banco.getClientes(1);  // Obtiene el cliente recién agregado.
        GuardarCuenta cuenta = new GuardarCuenta(300.00);  // Crea una cuenta de ahorros para el cliente.
        cliente1.agregarCuenta(cuenta);  // Agrega la cuenta al cliente.
       
        cuenta.deposito(100.00);  // Realiza un depósito en la cuenta del cliente.
        System.out.println("la cuenta del man " + cliente1.getCuenta(0));  // Imprime información sobre la cuenta.

        banco.agregarCliente("Juliana", "Rosa", LineaDeServicio.VISA);  // Agrega otro cliente al banco.
        cliente2 = banco.getClientes(2);  // Obtiene el cliente recién agregado.
        cliente2.agregarCuenta(new GuardarCuenta(400.00));  // Agrega una cuenta al cliente.

        banco.agregarCliente("Alberto", "Cortes",LineaDeServicio.AMERICANEXPRESS);
        cliente3 = banco.getClientes(3);  // Obtiene el cliente recién agregado.
        cliente3.agregarCuenta(new GuardarCuenta(10000.00));  // Agrega una cuenta al cliente.

        banco.agregarCliente("Jose", "Garzon", LineaDeServicio.MASTERCARD);  // Agrega otro cliente al banco.
        cliente4 = banco.getClientes(4);  // Obtiene el cliente recién agregado.
        cliente4.agregarCuenta(new GuardarCuenta(2000.00));  // Agrega una cuenta al cliente.

        banco.agregarCliente("Sofia", "Hernandez", LineaDeServicio.VISA);  // Agrega otro cliente al banco.
        cliente5 = banco.getClientes(5);  // Obtiene el cliente recién agregado.
        GuardarCuenta cuenta1 = new GuardarCuenta(100.00);  // Crea una cuenta de ahorros para el cliente.
        cliente5.agregarCuenta(cuenta1);  // Agrega la cuenta al cliente.

        cuenta1.retiros(50.00);  // Realiza un retiro desde la cuenta del cliente.
        cliente5.agregarCuenta(cuenta1);  // Agrega la cuenta actualizada al cliente.
        System.out.println("Retiro exitoso " + cuenta1.getSaldo());  // Imprime el saldo actual de la cuenta.
    }
}
