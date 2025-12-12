
package v.ejprogramacion11;

public class Numeropar {
    //Creamos el método esPar que lo declaramos como boolean por retornar valores como true o false
    //Al declararlo como static estoy diciendo que no hace falta crear un objeto desde el main 
    public static boolean esPar(int num){
        
        /*Si me retorna que al dividir el número en dos tiene resto cero decimos que es par
        por el contrario es impar*/
        return num%2==0;
        
    }
}
