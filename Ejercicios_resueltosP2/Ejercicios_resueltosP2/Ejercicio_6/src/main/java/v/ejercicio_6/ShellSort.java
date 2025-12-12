
package v.ejercicio_6;

public class ShellSort {
    /*Creamos un método estático que recibe un arreglo de double y devuelve un int que representa 
    la cantidad de iteraciones realizadas para ordenar.*/
    public static int ordenar(double[] arr){
        
        /*Declaramos una variable iteraciones que suma una unidad cada vez que se hace una comparación y 
        desplazamiento.*/
        int iteraciones=0;
        
        // Obtenemos la longitud del arreglo
        int n=arr.length;
        
        /* Creamos un bucle for y comenzamos con una brecha (gap) inicial que es la mitad del arreglo.
        gap es la distancia entre elementos que se van a comparar y ordenar en cada pasada.
        int gap = n / 2 nos dice que comenzamos con una brecha inicial igual a la mitad del tamaño del 
        arreglo (n)
        gap > 0 nos dice que el bucle continúa mientras el gap sea mayor que 0.Cuando llega a 0, el arreglo ya debería 
        estar ordenado
        gap /= 2 nos dice que en cada iteración del bucle externo, la brecha se divide por 2 y así se va
        reduciendo.*/
        for (int gap = n / 2; gap > 0; gap /= 2) {
            
            // Creamos otro for para recorrer el arreglo desde la posición "gap" hasta el final
            for (int i = gap; i < n; i++) {
                // Guardamos el valor actual en una variable temporal
                double temp=arr[i];
                
                // Usamos j para comparar hacia atrás con elementos separados por la brecha (gap)
                int j=i;
                
                // Creamos un while que mientras no salgamos del arreglo y el elemento a "gap" posiciones atrás sea mayor
                while(j>=gap && arr[j-gap]>temp){
                    // Contamos esta comparación como una iteración
                    iteraciones++;
                    
                    // Desplazamos el elemento hacia adelante
                    arr[j]=arr[j-gap];
                    
                    // Retrocedemos "gap" posiciones para seguir comparando
                    j-=gap;
                }
                // Colocamos el valor temporal en su posición correcta dentro de la sublista ordenada
                arr[j]=temp;

            }
        }
        //Retornamos el número de movimientos realizados en el ordenamiento.
        return iteraciones;
    }
}
