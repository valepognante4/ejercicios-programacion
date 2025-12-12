
package v.ejprogramacion12;

public class Saludo {
    //Creamos el método saludar sin parámetros
    //Al declararlo como static estoy diciendo que no hace falta crear un objeto desde el main 
    public static void saludar() {
        System.out.println("Hola ");
                
    }

    //Creamos el método saludar con parámetros
    //Al declararlo como static estoy diciendo que no hace falta crear un objeto desde el main
    public static void saludar(String nombre){
        System.out.println("Hola "+nombre);
    }
}
