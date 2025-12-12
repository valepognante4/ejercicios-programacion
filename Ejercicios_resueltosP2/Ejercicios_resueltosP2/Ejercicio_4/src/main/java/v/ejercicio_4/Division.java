
package v.ejercicio_4;

public class Division {
    /*Declaramos el atributo privado numerador y denominador. Al declararlo como private solo  
    se pueden acceder directamente desde dentro de la clase.*/
    private int numerador;
    private int denominador;

    /*Creamos el constructor de la clase Division, que se utilizará para instanciar un nuevo objeto 
    con valores iniciales para numerador y denominador.*/
    public Division(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    //Creamos el método calcular que devuelve un número entero
    public int calcular(){
        
        /*Verificamos si el denominador es cero. Si lo es, lanza una excepción aritmética (ArithmeticException) 
        con un mensaje personalizado. Esto evita que el programa se detenga bruscamente por error de división por cero.
        Usamos throw para lanzar una excepción de forma manual cuando ocurre una situación inesperada o no 
        válida en el programa.*/
        if(denominador==0)throw new ArithmeticException("No se puede dividir por cero ");
        
        //Si el denomiandor es distinto de cero se devuelve el resultado de la división
        return numerador/denominador;
    }
}
