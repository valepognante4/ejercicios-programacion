
package v.ejprogramacion4;
/*Ejercicio 5: Comparar dos cadenas ingresadas por el usuario con equals() y equalsIgnoreCase()*/

//Colocamos la librería Scanner para poder pedir datos por teclado
import java.util.Scanner;
public class Ejprogramacion4 {

    public static void main(String[] args) {
        //Llamamos al Scanner para poder pedir datos por teclado
        Scanner teclado=new Scanner(System.in);
        
        //Le pedimos al usuario que ingrese la primer cadena
        System.out.println("Ingrese la primer cadena: ");
        String cadena1=teclado.nextLine();
        
        //Le pedimos al usuario que ingrese la segunda cadena
        System.out.println("Ingrese la segunda cadena: ");
        String cadena2=teclado.nextLine();
        
        /*Creamos el if para el método equals().Este método lo que hace es comparar dos cadenas
         teniendo en cuenta las letras mayúsculas y minusculas*/
        System.out.println("Utilizando el equals(): ");
        if(cadena1.equals(cadena2)){
            System.out.println("Las cadenas son iguales");
        }else{
            System.out.println("Las cadenas son distintas");
        }
        
        //Colocamos un salto de línea para separar los resultados del equals y el equalsIgnoreCase
        System.out.println(" ");
        
        /*Creamos el if para el método equalsIgnoreCase().Este método lo que hace es comparar dos cadenas
        sin tener en cuenta las letras mayúsculas y minusculas*/
        System.out.println("Utilizando el equalsIgnoreCase():");
        if (cadena1.equalsIgnoreCase(cadena2)) {
            System.out.println("Las cadenas son iguales");
        } else {
            System.out.println("Las cadenas son distintas");
        }
    }
}
