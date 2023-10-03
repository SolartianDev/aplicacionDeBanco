
package aplicaciondebanco.banco.main;

public class Banco implements OperacionesBanco {  // Declaración de la clase "Banco" que implementa la interfaz "OperacionesBanco".
    private Cliente[] clientes;  // Declaración de un arreglo de objetos de la clase "Cliente" llamado "clientes".
    private int numeroDeCuentas;  // Declaración de una variable entera llamada "numeroDeCuentas".

    public Banco() {  // Declaración del constructor de la clase "Banco".
        this.clientes = new Cliente[10];  // Inicialización del arreglo "clientes" con capacidad para 10 elementos.
        this.numeroDeCuentas = 0;  // Inicialización de la variable "numeroDeCuentas" a 0.
    }

    @Override
    public void agregarCliente(String nombres, String apellidos, LineaDeServicio lineaDeServicio) {
        // Implementación del método "agregarCliente" que toma nombres, apellidos y una línea de servicio como parámetros.
        int i = numeroDeCuentas++;  // Incrementa "numeroDeCuentas" y almacena el valor anterior en "i".
        clientes[i] = new Cliente(nombres, apellidos, lineaDeServicio);  // Crea un objeto "Cliente" y lo almacena en el arreglo "clientes".
    }

    @Override
    public Cliente getClientes(int indiceDeCliente) {
        // Implementación del método "getClientes" que recibe un índice de cliente y devuelve el cliente correspondiente.
        return clientes[indiceDeCliente];  // Retorna el cliente en el índice especificado del arreglo "clientes".
    }

    @Override
    public int getNumeroDeCuentas() {
        // Implementación del método "getNumeroDeCuentas" que devuelve el número de cuentas en el banco.
        return numeroDeCuentas;  // Retorna el valor de la variable "numeroDeCuentas".
    }
}

   

    
