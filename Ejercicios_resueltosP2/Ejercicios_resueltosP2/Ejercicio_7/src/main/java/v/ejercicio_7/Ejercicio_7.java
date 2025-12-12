
package v.ejercicio_7;

/*Implementá los algoritmos de búsqueda secuencial y binaria para buscar un número ingresado por 
el usuario en un arreglo de enteros. Indicá si fue encontrado o no y en qué posición.
 */
//Importamos la clase Scanner, que permite leer datos desde el teclado.
import java.util.Scanner;


public class Ejercicio_7 {

    public static void main(String[] args) {
        //Creamos un objeto Scanner para leer datos ingresados por el usuario  
       Scanner teclado=new Scanner(System.in);
       
       //Declaramos e inicializamos un arreglo ordenado de enteros
       int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
       
       //Pedimos al usuario que ingrese el número que desea buscar
        System.out.print("Ingrese el número a buscar: ");
        int valor=teclado.nextInt();
        
        //Realizamos la búsqueda secuencial del valor en el arreglo
        int posSec=BusquedaSecuencial.busquedaSecuencial(arr,valor);
        
        //Creamos un if y evaluamos si la búsqueda secuencial encontró el valor
        if(posSec!=-1){
            //Si lo encontró, mostramos la posición
            System.out.println("Búsqueda Secuencial: Número encontrado en posición " + posSec);
        }else{
            //Si no lo encontró, mostramos el mensaje que no fue encontrado
            System.out.println("Busqueda secuencial: Número no encontrado");
        }
        
        //Realizamos la búsqueda binaria del valor en el arreglo
        int posBin=BusquedaBinaria.busquedaBinaria(arr, valor);
        
        //Creamos un if y evaluamos si la búsqueda binaria encontró el valor
        if(posBin!=-1){
            // Si lo encontró, mostramos la posición
            System.out.println("Búsqueda Binaria: Número encontrado en posición "+ posBin);
        }else{
            // Si no lo encontró, mostramos mensaje que no fue encontrado
            System.out.println("Búsqueda Binaria: Número no encontrado.");
        }
        
         //Cerramos el Scanner una vez que lo terminamos de usar a través del método close().
        teclado.close();
    }
}
