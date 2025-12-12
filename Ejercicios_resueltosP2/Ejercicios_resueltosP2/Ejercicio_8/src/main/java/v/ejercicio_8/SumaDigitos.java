
package v.ejercicio_8;

public class SumaDigitos {
    // Creamos el método estático que recibe un número entero y devuelve la suma de sus dígitos usando recursividad
    public static int sumaDigitos(int n){
        
        //Utilizamos un if que si el número es negativo, lo convertimos a positivo
        if(n<0){
            n=-n;
        }
        // Caso base: si el número es 0, la suma es 0
        if(n==0){
            return 0;
        }
        
        // Paso recursivo:
        // - Tomamos el último dígito con n % 10
        // - Llamamos recursivamente al método con el resto del número (n / 10)
        return(n%10)+sumaDigitos(n/10);
    }
}
