

package v.ejercicio_1;

/*Implementá una clase genérica Caja<T> que permita almacenar un objeto, obtenerlo (getContenido) y 
reemplazarlo (setContenido). Probala con String, Integer y una clase propia Libro. 
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        
        //Creamos un objeto de tipo String, que guarde el contenido inicial "Hola mundo"
        Caja<String> cajaString=new Caja<>("Hola mundo");
        
        //Mostramos el contenido inicial utilizando el getContenido()
        System.out.println("Contendio String: "+cajaString.getContenido());
        
        //Reemplaamos el contenido por "Nuevo Contenido" utilizando setContenido()
        cajaString.setContenido("Nuevo Contenido");
        
        //Mostramos el contenido actualizado utilizando nuevamente el getContenido()
        System.out.println("Contenido String actualizado: "+cajaString.getContenido());
        
        System.out.println(" ");
        
        //Creamos un objeto de tipo Integer, que guarde el contenido inicial 42
        Caja<Integer> cajaInteger=new Caja<>(42);
        
        //Mostramos el contenido inicial utilizando el getContenido()
        System.out.println("Contenido Integer: "+cajaInteger.getContenido());
        
        //Reemplaamos el contenido por 100 utilizando setContenido()
        cajaInteger.setContenido(100);
        
        //Mostramos el contenido actualizado utilizando nuevamente el getContenido()
        System.out.println("Contenido integer actualizado: "+cajaInteger.getContenido());
        
        System.out.println(" ");
        
        //Creamos un objeto Libro con un título y un autor
        Libro libro=new Libro("1984", "George Orwell");
        
        //Creeamos una caja Caja<Libro> que guarda ese libro.
        Caja<Libro> cajaLibro=new Caja<>(libro);
        
        /*Se imprime el contenido de la caja, que gracias al método toString() del Libro,
        se muestra con título y autor.*/
        System.out.println("Contenido Libro: "+cajaLibro.getContenido());
        
        //Reemplazamos el contenido con un nuevo libro
        cajaLibro.setContenido(new Libro("Fahrenheit 451", "Ray Bradbury"));
        
        //Mostramos el contenido actualizado
        System.out.println("Contenido del libro actualizado: "+cajaLibro.getContenido());
        
        
    }
}
