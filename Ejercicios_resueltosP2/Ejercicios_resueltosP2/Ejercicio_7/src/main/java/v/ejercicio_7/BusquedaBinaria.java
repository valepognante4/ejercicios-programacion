
package v.ejercicio_7;

public class BusquedaBinaria {
    // Creamos el método estático que implementa la búsqueda binaria en un arreglo de enteros
    public static int busquedaBinaria(int arr[],int valor){
        // Inicializamos los extremos del arreglo: izquierda y derecha
        int izquierda=0;
        int derecha=arr.length-1;
        
        // Creamos un while que se ejecuta mientras el intervalo de búsqueda no sea vacío
        while(izquierda<=derecha){
            
            // Calculamos la posición del medio para evitar desbordamiento
            int medio=izquierda+(derecha-izquierda)/2;
            
            // Creamos un if y si el valor está en el medio, lo encontramos
            if(arr[medio]==valor){
                return medio;
            }
            
            // Si el valor buscado es mayor que el del medio, buscamos a la derecha
            if(arr[medio]<valor){
                izquierda=medio+1;
                
                // Si el valor buscado es menor, buscamos a la izquierda
            }else{
                derecha=medio-1;
            }
        }
        // Si salimos del bucle sin encontrar el valor, devolvemos -1
        return -1;
    }
}
