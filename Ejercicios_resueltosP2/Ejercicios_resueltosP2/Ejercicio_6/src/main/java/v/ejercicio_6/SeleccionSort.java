
package v.ejercicio_6;

public class SeleccionSort {
    /*Creamos un método estático que recibe un arreglo de double y devuelve un int que representa 
    la cantidad de iteraciones realizadas para ordenar.*/
    public static int ordenar(double[] arr){
        
        /*Declaramos una variable iteraciones que suma una unidad cada vez que se hace una comparación y 
        desplazamiento.*/
        int iteraciones=0;
        
        /*Creamos un bucle for que recorre cada posición del arreglo menos la última 
        (porque ya estará ordenada cuando termine), por eso se coloca el -1*/
        for(int i=0;i<arr.length-1;i++){
            
            /*Declaramos la variable min que guarda el índice del valor mínimo encontrado, que inicialmente
            es el mismo i.*/
            int min=i;
            
            /*Creamos otro for para la variable j
            El j = i + 1 se usa para comparar con los elementos que están a la derecha del elemento actual 
            (arr[i]).*/
            for(int j=i+1;j<arr.length;j++){
                //Contamos la cantidad de comparaciones con iteraciones
                iteraciones++;
                
                //Creamos un if que compare el valor en arr[j] con el actual mínimo (arr[min]).
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            // Guardamos el valor mínimo encontrado en una variable temporal
            double temp=arr[min];
            
            // Colocamos el valor en la posición actual (i), realizando el intercambio
            arr[min]=arr[i];
            
            // Ponemos el valor original de la posición actual en el lugar donde estaba el mínimo
            arr[i]=temp;
        }
        //Retornamos el número de movimientos realizados en el ordenamiento.
        return iteraciones;
    }
}
