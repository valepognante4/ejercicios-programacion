
package v.ejprogramacion9;

/*Ejercicio 10: Dada la cadena "Hola Mundo", obtener la subcadena "Mundo" y reemplazar 
"Hola" por "Adiós"*/
public class Ejprogramacion9 {

    public static void main(String[] args) {
        //Declaramos la cadena "Hola Mundo"
        String cadena="Hola Mundo";
        
        /*La subcadena se obtiene utilizando substring en la que se indica el índice inicial
        y el índice final de la parte de la cadena que queremos obtener*/
        String subcadena=cadena.substring(5,10);
        
        /*Para reemplazar "Hola" por "Adiós" se utiliza replace que este método es utilizado para reemplazar
        una parte de la cadena por otra en la que la primer parte tenemos que indicar lo que queremos
        reemplazar y en la segunda parte el valor por lo cual lo vamos a reemplazar*/
        String cadreemplazada=cadena.replace("Hola","Adiós");
        
        //Mostramos los valores obtenidos 
        System.out.println("La subcadena es: "+subcadena);
        System.out.println("La cadena al reemplazarla quedaría como: "+cadreemplazada);
        
    }
}
