
package v.ejercicio_9;

public class ContarVocales {
    // Creamos el método estático que cuenta la cantidad de vocales en una cadena usando recursividad
    public static int contarVocales(String texto){
        
        // Utilizamos un if para el caso base
        //Caso base: si el texto es nulo o está vacío, no hay vocales, retornamos 0
        if(texto==null || texto.isEmpty()){
            return 0;
        }
        
        // Obtenemos el primer carácter de la cadena y lo convertimos a minúscula
        char primero=Character.toLowerCase(texto.charAt(0));
        
        // Verificamos si el primer carácter es una vocal. Si lo es, cuenta vale 1; si no, vale 0
        int cuenta=(primero == 'a' || primero == 'e' || primero == 'i' || primero == 'o' || primero == 'u') ? 1 : 0;
        
         // Sumamos la cuenta actual con la cantidad de vocales en el resto de la cadena (llamada recursiva)
        return cuenta+contarVocales(texto.substring(1));
    }
}
