
package v.ejercicio_8;
/*Escribí un método recursivo que reciba un número entero y devuelva la suma de sus dígitos. Ej: 
sumaDigitos(1234) → 10.
 */

//Importamos la clase Scanner, que permite leer datos desde el teclado.
import java.util.Scanner;

public class Ejercicio_8 {

    public static void main(String[] args) {
        //Creamos un objeto Scanner para leer datos ingresados por el usuario  
       Scanner teclado=new Scanner(System.in);
       
       // Pedimos al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero: ");
        int numero=teclado.nextInt();
        
        // Llamamos al método recursivo para calcular la suma de los dígitos del número ingresado
        //Llamamos a la clase SumaDigitos junto con su método sumaDigitos
        int resultado=SumaDigitos.sumaDigitos(numero);
        
        // Mostramos el resultado por pantalla
        System.out.println("La suma de los digitos de "+numero+" es: "+resultado);
        
       //Cerramos el Scanner una vez que lo terminamos de usar a través del método close().
        teclado.close();
    }
}
