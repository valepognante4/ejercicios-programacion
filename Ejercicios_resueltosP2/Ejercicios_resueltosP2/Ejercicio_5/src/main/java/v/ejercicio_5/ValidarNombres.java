
package v.ejercicio_5;

//Importamos la clase FileWriter que permite escribir texto en un archivo 
import java.io.FileWriter;

//Importamos la clase IOException que maneja errores de entrada/salida.
import java.io.IOException;

public class ValidarNombres {
    
    //Creamos el método static validarNombres que recibe como parámetros un arreglo de nombres.
    public static void validarNombres(String[] nombres){
        
        //Utilizamos un bucle for each para recorrer los elementos del arreglo.
        for(String nombre: nombres){
            
            //Creamos un bloque try
            try{
                //Dentro del bloque try verificamos si el nombre tiene 3 letras o menos.
                if(nombre.length() <=3){
                    
                    /*Si el nombre tiene tres letras o menos se lanza una excepción personalizada 
                    con ese nombre.
                    Usamos throw para lanzar una excepción de forma manual cuando ocurre una situación 
                    inesperada o no válida en el programa.*/
                    throw new NombreInvalidoException(nombre);
                }else{
                    
                    //Si el nombre tiene más de 3 letras, lo considera válido y lo muestra por consola.
                    System.out.println("Nombre válido "+nombre);
                }
                
                //Si se lanza la excepción se ejecuta el bloque catch
            }catch(NombreInvalidoException e){
                
                //Se muestra el mensaje personalizado de error a través del getMessage()
                System.out.println(e.getMessage());
                
                //Llamamos al método registrarErrorEnLog() para guardar el error en el archivo log.txt.
                registrarErrorEnLog(e.getMessage());
            }
        }
    }
    //Creamos el método static registrarErrorEnLog que reciba un mensaje como parámetro
    //Este método registra mensajes de error en un archivo de texto
    public static void registrarErrorEnLog(String mensaje){
        
        //Creamos un bloque try que usa FileWriter en modo append (true), para no sobrescribir el archivo.
        try(FileWriter fw= new FileWriter("log.txt",true)){
            
            //Escribe el mensaje recibido y agrega un salto de línea (\n).
            fw.write(mensaje+"\n");
            
            /* Colocamos bloque catch que captura cualquier error de entrada/salida que ocurra cuando el 
            programa intenta escribir en el archivo*/
        }catch(IOException e){
            //Si ocurre un error al escribir en el archivo lo informa por consola.
            System.out.println("Error al escribir en el archivo log: "+e.getMessage());
        }
        
    }
}
