
package v.ejercicio_1;
//Crear la clase genérica Caja<T>, donde T es un tipo genérico y al ser genérica
//puede trabajar con cualquier tipo de dato.
public class Caja<T> {
    
    //Declarar un atributo privado para almacenar un objeto de tipo T. Al declararlo como private solo  
    //se pueden acceder directamente desde dentro de la clase. 
    private T contenido;

    //Creamos el constructor que inicializa el contenido con el valor recibido
    public Caja(T contenido) {
        this.contenido=contenido;
    }

    //Declaramos el getContenido para obtener el contenido almacenado
    public T getContenido() {
        return contenido;
    }

    //Declaramos el setContenido para reemplazar el cotenido almacenado
    public void setContenido(T contenido) {
        this.contenido = contenido;
    }
    
    
}
