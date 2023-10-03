
package aplicaciondebanco.banco.main;

public interface OperacionesBanco {
    // Declaración de la interfaz "OperacionesBanco".

    public void agregarCliente(String nombres, String apellidos, LineaDeServicio lineaDeServicio);
    // Declaración de un método para agregar un cliente al banco con nombres, apellidos y línea de servicio.

    public Cliente getClientes(int indiceDeCliente);
    // Declaración de un método para obtener un cliente del banco por su índice.

    public int getNumeroDeCuentas();
    // Declaración de un método para obtener el número total de cuentas en el banco.

    public default void generarReporte() {
        // Implementación de un método por defecto para generar un reporte de clientes del banco.

        System.out.println("\t\t\tREPORTE DE CLIENTE");
        System.out.println("\t\t\t==================");

        for (int i = 0; i < this.getNumeroDeCuentas(); i++) {
            // Itera a través de todas las cuentas en el banco.

            Cliente cliente = this.getClientes(i);
            // Obtiene el cliente en el índice actual.

            System.out.println();
            System.out.println("Cliente: " +
                    cliente.getNombres() + ", " +
                    cliente.getApellidos() + ", Tipo de tarjeta " +
                    cliente.getLineaDeServicio().getLineaDeServicio()
            );
            // Imprime información sobre el cliente, incluyendo nombres, apellidos y tipo de tarjeta de crédito.

            for (int j = 0; j < cliente.getNumeroDeCuentas(); j++) {
                // Itera a través de todas las cuentas del cliente.

                OperacionesCuenta cuenta = cliente.getCuenta(j);
                // Obtiene la cuenta en el índice actual.

                System.out.println("    " + cuenta);
                // Imprime información sobre la cuenta.
            }
        }
    }
}


