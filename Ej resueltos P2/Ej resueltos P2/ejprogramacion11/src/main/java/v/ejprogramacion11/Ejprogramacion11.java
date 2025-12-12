

package v.ejprogramacion11;

/*Ejercicio 12: Crear un método llamado esPar que reciba un número entero y devuelva true si 
es par, o false si no lo es. Luego, probarlo en main.
 */
public class Ejprogramacion11 {

    public static void main(String[] args) {
       //Declaramos un número entero
       int num=10;
       
       /*Al colocar Numeropar.esPar(num) estoy llamando al método esPar y utilizamos este if porque si el método
       me retorna true me va a decir que es par y si me retorna false me va a decir que es impar*/
       if(Numeropar.esPar(num)){
           System.out.println("El número es par");
       }else{
           System.out.println("El número es impar");
       }
    }
}
