
package v.ejercicio_3;

//Creamos la clase ArregloNuloException que es una excepción personalizada y que extiende de RuntimeException
class ArregloNuloException extends RuntimeException{

    //Creamos el constructor de la clase 
    //Permite crear una nueva excepción pasando un mensaje personalizado como texto
    public ArregloNuloException(String message) {
        
        /*Llamamos al constructor de la clase padre(RuntimeException) a través del super y le pasa
        el mensaje. De esta manera, ese mensaje se puede recuperar más adelante con e.getMessage() 
        si se atrapa la excepción.*/
        super(message);
    }
    
}
