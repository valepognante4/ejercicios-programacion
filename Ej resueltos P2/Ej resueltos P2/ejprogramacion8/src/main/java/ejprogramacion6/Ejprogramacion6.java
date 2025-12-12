
package ejprogramacion6;

//Ejercicio 6: Pedir una cadena y contar cuántas vocales contiene.

//Colocamos la librería Scanner para poder pedir datos por teclado
import java.util.Scanner;

public class Ejprogramacion6 {

    public static void main(String[] args) {
       
       //Llamamos al Scanner para poder pedir datos por teclado
       Scanner teclado=new Scanner(System.in);
       System.out.println("Ingrese una cadena: ");
       
       /*Utilizamos nextLine() en este caso ya que vamos hablar de una cadena que puede que tenga espacios
       y colocamos el toUpperCase para convertir la cadena en minuscula ya que cuando contemos las vocales 
       esten todas las letras en el mismo formato*/
       String cadena=teclado.nextLine().toLowerCase();
       
       //Declaramos un contador para despues contar las vocales
       int contador=0;
       
       /*Utilizamos un for para que recorrar cada uno de los caracteres de la cadena para poder 
       encontrar las vocales. A la cantidad de caracteres lo obtenemos a través del length()*/
       for(int i=0;i<cadena.length();i++){
           
           //Al charAt lo utilizamos para poder analizar caracter por caracter al recorrer la cadena
           char c1=cadena.charAt(i);
           
           //Colocamos un if para ver las vocales que puede tener la cadena luego de haber analizado caracter por caracter
           if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u'){
               //Una vez detectadas las vocales las vamos contando
               contador++;
           }
       }
        System.out.println("La cantidad de vocales de la cadena son: "+contador);
       
    }
}
