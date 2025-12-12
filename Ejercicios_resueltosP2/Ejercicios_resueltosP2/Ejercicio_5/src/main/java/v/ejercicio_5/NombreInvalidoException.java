
package v.ejercicio_5;
//Creamos la clase NombreInvalidoException que es una excepción personalizada y que extiende de Exception
public class NombreInvalidoException extends Exception{

    //Creamos el constructor de la clase 
    //Permite crear una nueva excepción pasando un mensaje personalizado como texto
    public NombreInvalidoException(String nombre) {
        
        /*Llamamos al constructor de la clase padre(Exception) a través del super y le pasa
        el mensaje. De esta manera, ese mensaje se puede recuperar más adelante con e.getMessage() 
        si se atrapa la excepción.*/
        super("Nombre inválido "+nombre+" (menos de 4 letras)");
    }
    
}
