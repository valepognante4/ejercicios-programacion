
package v.ejercicio_3;
/*Creá una clase genérica Contador<T> que cuente cuántas veces aparece un valor específico dentro 
de un arreglo. Si el arreglo es null, lanzá una excepción personalizada ArregloNuloException. 
 */

public class Ejercicio_3 {

    public static void main(String[] args) {
        //Creamos un objeto Contador que va a trabajar con elementos de tipo String.
       Contador<String> contadorString=new Contador<>();
       
       //Definimos un arreglo cadena con cuatro elementos
       String[] palabras={"hola", "mundo", "hola", "java"};
       
       //Se llama al método contar pasando el arreglo palabras y el valor "hola" como parámetro.
       //El método contar devuelve la cantidad de veces que aparece "hola".
       int ocurrencias=contadorString.contar(palabras,"hola");
        System.out.println("Utilizando un contador para String: ");
        
        //Mostramos por pantalla la cantidad de veces que aparece "hola"
       System.out.println("Cantidad de veces que aparece hola: "+ocurrencias);
       
        //Creamos un objeto Contador que va a trabajar con elementos de tipo Integer.
       Contador<Integer> contadorInteger=new Contador<>();
       
       //Definimos un arreglo números con varios valores
       Integer[] numeros={3,5,6,5,8,5};
       
        System.out.println(" ");
        
        System.out.println("Utilizando un contador para Integer: ");
        
       //Se llama al método contar pasando el arreglo numeros y el valor 5 como parámetro.
       //El método contar devuelve la cantidad de veces que aparece el 5 y lo imprimimos por pantalla.
        System.out.println("Cantidad de veces que aparece 5: "+contadorInteger.contar(numeros, 5));
        
        System.out.println(" ");
        
        System.out.println("Utilizando un contador null: ");
        //Se prueba el comportamiento cuando el arreglo es null
        try{
            //Llamamos al método contar pasando un arreglo nulo
            contadorInteger.contar(null,5);
            
            /*Como esta programada para lanzar una excepción personalizada en ese caso (ArregloNuloException), 
            se captura con un bloque try-catch.*/
        }catch(ArregloNuloException e){
            //Imprimimos el mensaje de error personalizado utilizando el getMessage().
            System.out.println("Error. "+e.getMessage());
        }
        
        
        
        
    }
}
