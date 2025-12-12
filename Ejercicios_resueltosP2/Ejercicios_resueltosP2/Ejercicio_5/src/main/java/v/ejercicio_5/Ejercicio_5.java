
package v.ejercicio_5;

/*Escribí un programa que lea una lista de nombres desde un arreglo y verifique que tengan más de 3 
letras. Si alguno no cumple, arrojá una excepción y registrala en un archivo de log (log.txt).
 */
public class Ejercicio_5 {

    public static void main(String[] args) {
        
        //Declaramos un arreglo String que contiene una lista de nombres
        String[] nombres={"Valentina", "Luis", "Jo", "Carlos", "Eva", "Lu"};
        
        // Llamamos al método estático validarNombres() de la clase ValidarNombres para verificar cada nombre del arreglo.
        /* Si algún nombre tiene 3 letras o menos, se lanza una excepción personalizada y se registra en 
        un archivo de log.*/
        ValidarNombres.validarNombres(nombres);
    }
}
