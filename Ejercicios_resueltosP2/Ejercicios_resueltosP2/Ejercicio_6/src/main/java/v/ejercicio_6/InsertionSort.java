
package v.ejercicio_6;

public class InsertionSort {
    /*Creamos un método estático que recibe un arreglo de double y devuelve un int que representa 
    la cantidad de iteraciones realizadas para ordenar.*/
    public static int ordenar(double[] arr){
        
        /*Declaramos una variable iteraciones que suma una unidad cada vez que se hace una comparación y 
        desplazamiento.*/
        int iteraciones=0;
        
        /*Creamos un bucle for que comienza desde el segundo elemento(índice 1) y 
        recorra el arreglo. La idea es insertar cada elemento en la parte izquierda ya ordenada.*/
        for(int i=1;i<arr.length;i++){
            
            //Guardamos el valor actual en temp
            double temp=arr[i];
            
            //Comenzamos a comparar con los valores a la izquierda (posición j).
            //Ese -1 es útilizado para comparar la izquierda
            int j=i-1;
            
            //Creamos un while que compara si el elemento anterior (arr[j]) es mayor que temp.
            while(j>=0 && arr[j]>temp){
                //Contamos las iteraciones cada vez que se entra al while.
                iteraciones++;
                //Si se cumple la condición del while desplazamos una posición a la derecha para hacer espacio.
                arr[j+1]=arr[j];
                
                //Es utilizado para que el algoritmo siga comparando con los elementos de la izquierda por eso el menos.
                j--;
            }
            //Colocamos temp en la posición correcta dentro de la parte ya ordenada.
            arr[j+1]=temp;
        }
        //Retornamos el número de movimientos realizados en el ordenamiento.
        return iteraciones;
    }
}
