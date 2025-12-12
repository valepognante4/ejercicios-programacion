

package v.ejprogramacion12;
/*Ejercicio 9: Crear dos métodos saludar: uno que salude sin parámetros y 
otro que reciba el nombre del usuario*/

public class Ejprogramacion12 {

    public static void main(String[] args) {
       //Llamamos a la clase con el método saludar() sin parámetros
        Saludo.saludar();
        
        //Llamamos a la clase con el método saludar() con parámetros
        Saludo.saludar("Valentina");
    }
}
