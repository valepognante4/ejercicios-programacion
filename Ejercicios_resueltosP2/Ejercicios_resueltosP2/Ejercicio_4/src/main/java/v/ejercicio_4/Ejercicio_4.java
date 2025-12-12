
package v.ejercicio_4;
/*Pedile al usuario que ingrese dos números y mostrá el resultado de la división. Si se intenta dividir por 
cero, capturá la excepción y mostrá un mensaje personalizado. */

//Importamos la clase Scanner, que permite leer datos desde el teclado.
import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        //Creamos un objeto Scanner para leer datos ingresados por el usuario 
       Scanner teclado = new Scanner(System.in);

       
       /*Se le pide al usuario que ingrese dos números, uno para el numerador y otro para el denominador
       Se usa un método llamado leerNumero para asegurarse de que el usuario realmente escriba un número válido */
        int numerador = leerNumero(teclado, "Ingresá el numerador: ");
        int denominador = leerNumero(teclado, "Ingresá el denominador: ");

        //Creamos un objeto de la clase llamado Division
        Division division = new Division(numerador, denominador);

        try {
            //try intenta realizar la división
            int resultado = division.calcular();
            
            //Si el denominador es distinto de 0 muestra el resultado.
            System.out.println("El resultado es: " + resultado);
            
            /*Si el denominador es cero ocurre una excepción aritmética (ArithmeticException), 
            que es capturada en el catch.*/
        } catch (ArithmeticException e) {
            
            //Mostramos el mensaje de error personalizado a través del getMessage()
            System.out.println("Error: " + e.getMessage());
        }

        //Cerramos el Scanner una vez que lo terminamos de usar a través del método close().
        teclado.close();
    }
    //Creamos el método static leerNumero
    public static int leerNumero(Scanner sc, String mensaje) {
        
        //Mostramos el mensaje para que el usuario sepa qué debe ingresar.
        System.out.print(mensaje);
        //Colocamos un while que verifica si lo que ingresó el usuario NO es un entero.
        while (!sc.hasNextInt()) {
            
            //Si escribe letras o símbolos, lo rechaza con este mensaje.
            System.out.print("Entrada inválida. " + mensaje);
            sc.next(); // descarta lo que no es número.
        }
        //Devuelve el número ingresado.
        return sc.nextInt();
    }
   
}        

    
    
   

