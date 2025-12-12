
package v.ejprogramacion10;

/*Ejercicio 11: Concatenar una cadena con un número entero, usando + y valueOf.*/
public class Ejprogramacion10 {

    public static void main(String[] args) {
        //Declaramos una cadena
        String cadena="El número";
        
        //Declaramos un número entero
        int num=30;
        
        //Realizamos la primer concatenación con el operador + que consiste en sumar la cadena con el num
        String concatenacion1=cadena+num;
        
        /*Realizamos la segunda concatenación con valueOf que consiste en convertir el num 30 en un valor 
        de tipo String al utilizar el valueOf y realizamos la sumatoria entre cadena y este valor obtenido*/
        String concatenacion2=cadena+String.valueOf(30);
        
        //Mostramos los resultados de la concatenación
        System.out.println("El resultado de la concatenación con el operador + es: "+concatenacion1);
        System.out.println("El resultado de la concatenación con valueOf es: "+concatenacion2);
    }
}
