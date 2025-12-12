
package v.ejercicio_1;

public class Libro {
    /*Declaramos el atributo privado titulo y autor. Al declararlo como private solo  
    se pueden acceder directamente desde dentro de la clase.*/
    private String titulo;
    private String autor;

    /*Creamos el constructor de la clase Libro, que se va utilizar para crear un nuevo objeto con un
    título y un autor*/
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    /*Declaramos el método toString() que se usa para definir como se mostrará el objeto Libro 
    en forma de texto.*/
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + '}';
    }
    
    
}
