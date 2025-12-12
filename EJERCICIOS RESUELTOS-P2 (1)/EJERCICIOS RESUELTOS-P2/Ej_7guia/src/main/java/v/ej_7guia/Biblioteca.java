
package v.ej_7guia;

import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    private Map<String, Libro> libros;
    
    public Biblioteca(){
        libros=new HashMap<>();
    }
    
    //Implementamos la lógica para agregar un libro al Map usando el título en minúscula como clave
    public void agregarLibro(Libro libro){
        libros.put(libro.getTitulo().toLowerCase(),libro);
    }
    
    //Implementamos la lógica para mostrar los libros de la biblioteca 
    public void mostrarLibros(){
        if (libros.isEmpty()){
            System.out.println("No hay libros en la biblioteca");
        }else{
            for(Libro libro: libros.values()){

                /*En este caso podemos ver el polimorfismo ya que al imprimir
                el objeto Libro, se ejecuta automáticamente su método toString() sobrescrito.*/
                System.out.println(libro);
            }
        }
    }
    
    //Implementamos la lógica para prestar un libro
    public void prestarLibro(String titulo){
        Libro libro=libros.get(titulo.toLowerCase());
        if(libro==null){
            System.out.println("No se encontró el libro: "+titulo);
            
            /*Se utiliza la implementación de isPrestado() definida en Libro para consultar el estado
            del libro*/
        }else if(libro.isPrestado()){
            System.out.println("No disponible: "+libro.getTitulo());
        }else{
            
            /*En este caso se utiliza la implementación de prestar() definida en Libro para
            cambiar el estado a prestado*/
            libro.prestar();
            System.out.println("Prestado: "+libro.getTitulo());
        }
    }
    
    //Implementamos la lógica para devolver un libro
    public void devolverLibro(String titulo){
        Libro libro=libros.get(titulo.toLowerCase());
        if(libro==null){
            System.out.println("No se encontró el libro: "+titulo);
            
            /*Se utiliza la implementación de isPrestado() definida en Libro para consultar el estado
            del libro*/
        }else if(!libro.isPrestado()){
            System.out.println("El libro ya estaba disponible: "+libro.getTitulo()); 
        }else{
            
            /*En este caso se utiliza la implementación de devolver() definida en Libro para
            cambiar el estado a disponible*/
            libro.devolver();
            System.out.println("Devuelto: "+libro.getTitulo());
        }
    }

}
