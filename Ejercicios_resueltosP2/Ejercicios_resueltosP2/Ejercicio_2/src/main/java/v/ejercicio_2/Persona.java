
package v.ejercicio_2;

public class Persona {
    /*Declaramos el atributo privado nombre y edad. Al declararlo como private solo  
    se pueden acceder directamente desde dentro de la clase.*/
    private String nombre;
    private int edad;

    /*Creamos el constructor de la clase Persona, que se utilizará para instanciar un nuevo objeto 
     con valores iniciales para nombre y edad.*/
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /*Declaramos el método toString() que se usa para definir como se mostrará el objeto Persona 
    en forma de texto.*/
    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', edad=" + edad + "}";
    }
}


