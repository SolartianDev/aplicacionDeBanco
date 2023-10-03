
package banco.main;


public interface OperacionesBanco {
    public void agregarCliente(String nombres, String apellidos,LineaDeServicio lineaDeServicio );
    public Cliente getClientes(int indiceDeCliente);
     public int getNumeroDeCuentas();
    
     public default void generarReporte(){
        System.out.println("\t\t\tREPORTE DE CLIENTE");
        System.out.println("\t\t\t==================");
        
        for (int i = 0; i < this.getNumeroDeCuentas(); i++) {
            Cliente cliente = this.getClientes(i);
            
            System.out.println();
            System.out.println("Cliente: "+
                    cliente.getNombres()+ ", "+
                    cliente.getApellidos()+ ", Tipo de tarjeta "+
                    cliente.getLineaDeServicio().getLineaDeServicio()
            );
            
            for (int j = 0; j < cliente.getNumeroDeCuentas(); j++) {
                OperacionesCuenta cuenta = cliente.getCuenta(j);
                System.out.println("    "+ cuenta);
            }
        }
    }
}
