
package aplicaciondebanco.banco.main;

public enum LineaDeServicio {
    // Declaración de un enumerado llamado "LineaDeServicio" con tres valores posibles: VISA, MASTERCARD y AMERICANEXPRESS.

    VISA("Clasica"),  // Valor del enumerado VISA con un atributo "lineaDeServicio" de valor "Clasica".
    MASTERCARD("Gold"),  // Valor del enumerado MASTERCARD con un atributo "lineaDeServicio" de valor "Gold".
    AMERICANEXPRESS("Platino");  // Valor del enumerado AMERICANEXPRESS con un atributo "lineaDeServicio" de valor "Platino".

    public String getLineaDeServicio() {
        // Método público para obtener el valor de "lineaDeServicio" de un valor enumerado.
        return lineaDeServicio;  // Retorna el valor de "lineaDeServicio" del valor enumerado.
    }
    
    private String lineaDeServicio;  // Declaración de una variable privada de tipo String llamada "lineaDeServicio".

    private LineaDeServicio(String lineaDeServicio) {
        // Constructor privado para asignar el valor de "lineaDeServicio" al crear un valor enumerado.
        this.lineaDeServicio = lineaDeServicio;  // Inicializa la variable "lineaDeServicio" con el valor proporcionado.
    }
}

