
package v.ejrepaso3;

public class Palindromo {
  
    //Creamos el método palindromo
    //Al declararlo como static estoy diciendo que no hace falta crear un objeto desde el main 
    public static void detpalindromo(String cadena){
        
        /*El StringBuilder es utilizado para poder manipular varias veces a una cadena, ya que con String 
        una vez creada una cadena no se puede volver a modificar. El reverse() es utilizado para invertir 
        la cadena obtenida por StringBuilder y el toString() convierte el StringBuilder obtenido de nuevo a String*/
        String invertida=new StringBuilder(cadena).reverse().toString();
        
        /*Al hacer esto estamos construyendo un palindromo simétrico a partir de cualquier palabra
        evitando que se duplique el caracter central*/
        String resultpalindromo=cadena+invertida.substring(1);
        
        //Mostramos su resultado
        System.out.println("Palindromo: "+resultpalindromo);
    }
}
