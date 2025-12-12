

package v.ejprogramacion5;
/*Ejercicio 7: Pedir una cadena y reemplazar todas las 'a' por '@'
replace()*/

//Colocamos la librería Scanner para poder pedir datos por teclado
import java.util.Scanner;

public class Ejprogramacion5 {

    public static void main(String[] args) {
        //Llamamos al Scanner para poder pedir datos por teclado
        Scanner teclado=new Scanner(System.in);
        
        //Le pedimos al usuario que ingrese una cadena
        System.out.println("Ingrese la cadena: ");
        //Utilizamos nextLine() en este caso ya que vamos hablar de una cadena que puede que tenga espacios
        String cadena=teclado.nextLine();
        
        //Colocamos comillas simples ya que vamos a reemplazar un solo carácter de la cadena por otro
        /*Utilizamos el método replace ya que este se utiliza para reemplaar una parte de la cadena por otra.
        En el parentesís esa 'a' hace referencia a la letra a reemplazar y el '@' es al caracter en el que se va a convertir esa 'a'
        */
        String cadresultante=cadena.replace('a','@');
        System.out.println("La nueva cadena es "+ cadresultante);
        
        
        
        
    }
}
