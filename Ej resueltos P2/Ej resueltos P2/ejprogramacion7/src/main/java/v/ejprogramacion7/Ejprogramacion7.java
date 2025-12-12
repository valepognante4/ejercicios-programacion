
package v.ejprogramacion7;
/*Ejercicio 2: Crear un arreglo de enteros con 5 notas y calcular su promedio.*/

public class Ejprogramacion7 {

    public static void main(String[] args) {
        
        //Creamos el arreglo con 5 notas
        int[] notas={6,2,9,7,10};
        
        //Declaramos la suma como double para cuando calculemos el promedio
        double suma=0;

        /*Recorremos el arreglo con el bucle for y utilizamos el length para obtener la cantidad de 
        elementos del arreglo. Es recomendable utilizar el length en vez de poner 5 por si el tamaño 
        del arreglo cambia en algun momento*/
        for(int i=0;i<notas.length;i++){
            
            //Sumamos las notas
            suma+=notas[i];
        }
        //Calculamos el promedio haciendo suma/notas.length
        double promedio=suma/notas.length;
        
        //Mostramos el promedio obtenido
        System.out.println("El promedio de las cinco notas es: "+promedio);
    }
}
