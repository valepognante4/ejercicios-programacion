
package v.ejercicio_2;
/*Escribí un método genérico public static <T> void imprimirArray(T[] arr) que imprima los elementos del 
arreglo. Probalo con un arreglo de enteros, uno de cadenas y otro de objetos Persona */

public class Ejercicio_2 {

    /*Creamos un método genérico gracias al uso de <T>, lo que significa que puede trabajar con cualquier 
    tipo de dato.
    Recibe un parámetro arr, que es un arreglo de tipo T[] (puede ser de enteros, cadenas, objetos, etc.).*/
    public static <T> void imprimirArray(T[] arr) {
        
        //Creamos un bucle for each para recorrer el arreglo
        for (T elemento : arr) {
            //Imprimimos cada elemento del arreglo
            System.out.println(elemento);
        }
    }

    //Dentro del main probamos el método genérico imprimirArray con tres tipos de arreglos
    public static void main(String[] args) {
        
        //Creamos un arreglo de objetos Integer
        Integer[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Arreglo de enteros: ");
        
        //Llamamos al método imprimirArray para mostrar cada número.
        imprimirArray(numeros);

        //Creamos un arreglo de objetos String
        String[] cadenas = {"Hola", "Mundo", "Java"};
        System.out.println("Arreglo de cadenas: ");
        
        //Llamamos al método imprimirArray para mostrar cada cadena.
        imprimirArray(cadenas);

        //Se crean tres objetos persona con nombre y edad, y se agrupan en un arreglo
        Persona[] personas = {
           
            new Persona("Ana", 30),
            new Persona("Luis", 25),
            new Persona("Carlos", 40)
        };
        System.out.println("\nArreglo de personas:");
        
        //Llamamos al método imprimirArray para mostrar cada persona.
        imprimirArray(personas);
    }

}
