
package v.ejercicio_6;

/*Implementá y compará los algoritmos de selección, inserción y shell sort ordenando una lista de 
temperaturas. Mostrá la cantidad de iteraciones realizadas por cada método.
 */

//Importamos la clase Arrays
import java.util.Arrays;

public class Ejercicio_6 {

    public static void main(String[] args) {
        
        //Definimos un arreglo de números decimales con temperaturas a ordenar
       double[] temperaturas={ 21.5, 18.2, 25.0, 19.8, 22.3, 17.0, 23.9};
       
       /*Hacemos tres copias del arreglo original para que cada algoritmo trabaje con los mismos datos 
       originales, sin interferir entre sí.
       La función Arrays.copyOf()crea la copia del arreglo.*/
       double[] copia1=Arrays.copyOf(temperaturas,temperaturas.length);
       double[] copia2=Arrays.copyOf(temperaturas,temperaturas.length);
       double[] copia3=Arrays.copyOf(temperaturas,temperaturas.length);
       
       /*Llamamos  a los métodos ordenar() de cada clase (SeleccionSort, InsertionSort, ShellSort) 
       pasando su copia del arreglo.
       Cada método devuelve la cantidad de iteraciones realizadas, que se guarda en variables 
       (iterSel, iterIns, iterShell).*/
       int iterSel=SeleccionSort.ordenar(copia1);
       int iterIns = InsertionSort.ordenar(copia2);
       int iterShell=ShellSort.ordenar(copia3);
       
       // Imprimimos el arreglo ordenado por el método de selección. 
       /* Arrays.toString(copia1) se usa para convertir un arreglo en una cadena de texto legible que se
       puede mostrar por consola.*/
        System.out.println("Ordenamiento por Selección: "+Arrays.toString(copia1));
        
        //Imprimimos la cantidad de interaciones por el método de selección.
        System.out.println("Interaciones: "+iterSel);
        
        System.out.println(" ");
        
        // Imprimimos el arreglo ordenado por el método de inserción.
        /* Arrays.toString(copia1) se usa para convertir un arreglo en una cadena de texto legible que se
       puede mostrar por consola.*/
        System.out.println("Ordenamiento por Inserción: "+Arrays.toString(copia2));
        
        //Imprimimos la cantidad de interaciones por el método de inserción.
        System.out.println("Interaciones: "+iterIns);
        
        System.out.println(" ");
        
        // Imprimimos el arreglo ordenado por el método shell.
        /* Arrays.toString(copia1) se usa para convertir un arreglo en una cadena de texto legible que se
       puede mostrar por consola.*/
        System.out.println("Ordenamiento por Shell: "+Arrays.toString(copia3));
        
        //Imprimimos la cantidad de interaciones por el método shell.
        System.out.println("Interaciones: "+iterShell);
        
        
       
       
    }
}
