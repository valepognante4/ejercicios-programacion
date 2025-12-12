
package v.ejercicio_7;

public class BusquedaSecuencial {
    // Creamos el método estático que realiza una búsqueda secuencial en un arreglo de enteros
    public static int busquedaSecuencial(int[] arr,int valor){
        
        // Creamos un for y recorremos el arreglo desde el primer elemento hasta el último
        for(int i=0;i<arr.length;i++){
            
            // Si encontramos el valor buscado, devolvemos su posición (índice)
            if(arr[i]==valor){
                return i;
            }
        }
        // Si terminamos de recorrer el arreglo y no encontramos el valor, devolvemos -1
        return -1;
    }
}
