
package v.ejercicio_9;

/*Escribí un método recursivo que cuente la cantidad de vocales en una cadena. Ej: 
contarVocales("Recursividad") → 5.
 */

//Importamos la clase Scanner, que permite leer datos desde el teclado.
import java.util.Scanner;
public class Ejercicio_9 {

    public static void main(String[] args) {
        //Creamos un objeto Scanner para leer datos ingresados por el usuario 
        Scanner teclado=new Scanner(System.in);
        
        // Pedimos al usuario que ingrese una cadena de texto
        System.out.println("Ingrese una cadena: ");
        String input=teclado.nextLine();
        
        // Llamamos al método recursivo para contar las vocales en la cadena ingresada
        //Llamamos a la clase ContarVocales junto con su método contarVocales
        int totalVocales=ContarVocales.contarVocales(input);
        
        // Mostramos el resultado por pantalla
        System.out.println("La cantidad de vocales en '"+input+"' es: "+totalVocales);
        
        //Cerramos el Scanner una vez que lo terminamos de usar a través del método close().
        teclado.close();
    }
}
