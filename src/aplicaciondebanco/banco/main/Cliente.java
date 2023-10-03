
package banco.main;

public class Cliente {
    
    private String nombres;
    private String apellidos;
    private OperacionesCuenta[] cuentas;
    private int numeroDeCuentas;
    private LineaDeServicio lineaDeServicio;

    public Cliente(String nombres, String apellidos,LineaDeServicio lineaDeServicio ) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        
        this.cuentas = new OperacionesCuenta[10];
        this.numeroDeCuentas = 0;
        this.lineaDeServicio =lineaDeServicio;
    }
    
    public void agregarCuenta(OperacionesCuenta cuenta){
        int i = numeroDeCuentas++;
        cuentas[i]=cuenta;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public OperacionesCuenta getCuenta(int indiceCuentas) {
        return cuentas[indiceCuentas];
    }

    public LineaDeServicio getLineaDeServicio() {
        return lineaDeServicio;
    }

    public void setLineaDeServicio(LineaDeServicio lineaDeServicio) {
        this.lineaDeServicio = lineaDeServicio;
    }
    
    

    public int getNumeroDeCuentas() {
        return numeroDeCuentas;
    }
   
    
}
