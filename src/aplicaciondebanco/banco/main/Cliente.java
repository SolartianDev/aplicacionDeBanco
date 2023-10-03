package aplicaciondebanco.banco.main;  

public class Cliente {  // Declaración de la clase "Cliente".
    
    private String nombres;  // Declaración de una variable de tipo String llamada "nombres".
    private String apellidos;  // Declaración de una variable de tipo String llamada "apellidos".
    private OperacionesCuenta[] cuentas;  // Declaración de un arreglo de objetos de la clase "OperacionesCuenta" llamado "cuentas".
    private int numeroDeCuentas;  // Declaración de una variable entera llamada "numeroDeCuentas".
    private LineaDeServicio lineaDeServicio;  // Declaración de una variable de tipo "LineaDeServicio" llamada "lineaDeServicio".

    public Cliente(String nombres, String apellidos, LineaDeServicio lineaDeServicio) {
        // Declaración del constructor de la clase "Cliente" que toma nombres, apellidos y una línea de servicio como parámetros.
        this.nombres = nombres;  // Inicialización de la variable "nombres" con el valor proporcionado.
        this.apellidos = apellidos;  // Inicialización de la variable "apellidos" con el valor proporcionado.
        
        this.cuentas = new OperacionesCuenta[10];  // Inicialización del arreglo "cuentas" con capacidad para 10 elementos.
        this.numeroDeCuentas = 0;  // Inicialización de la variable "numeroDeCuentas" a 0.
        this.lineaDeServicio = lineaDeServicio;  // Inicialización de la variable "lineaDeServicio" con el valor proporcionado.
    }
    
    public void agregarCuenta(OperacionesCuenta cuenta) {
        // Método que agrega una cuenta a la lista de cuentas del cliente.
        int i = numeroDeCuentas++;  // Incrementa "numeroDeCuentas" y almacena el valor anterior en "i".
        cuentas[i] = cuenta;  // Almacena la cuenta en el arreglo "cuentas".
    }

    public String getNombres() {
        // Método que devuelve el valor de la variable "nombres".
        return nombres;
    }

    public String getApellidos() {
        // Método que devuelve el valor de la variable "apellidos".
        return apellidos;
    }

    public OperacionesCuenta getCuenta(int indiceCuentas) {
        // Método que devuelve la cuenta en el índice especificado del arreglo "cuentas".
        return cuentas[indiceCuentas];
    }

    public LineaDeServicio getLineaDeServicio() {
        // Método que devuelve el valor de la variable "lineaDeServicio".
        return lineaDeServicio;
    }

    public void setLineaDeServicio(LineaDeServicio lineaDeServicio) {
        // Método que establece el valor de la variable "lineaDeServicio".
        this.lineaDeServicio = lineaDeServicio;
    }

    public int getNumeroDeCuentas() {
        // Método que devuelve el valor de la variable "numeroDeCuentas".
        return numeroDeCuentas;
    }
}
