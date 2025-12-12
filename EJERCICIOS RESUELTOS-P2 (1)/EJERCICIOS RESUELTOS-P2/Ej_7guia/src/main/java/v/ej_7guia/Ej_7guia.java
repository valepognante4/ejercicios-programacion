
package v.ej_7guia;

import java.util.Scanner;

/*Ejercicio 7: 
Se desea implementar un sistema interactivo de biblioteca que permita gestionar libros y 
sus préstamos. 
Requisitos del sistema: 
1. Almacenamiento de libros: 
o Los libros deben estar precargados (mínimo 3), por ejemplo: 
▪ "El Quijote" 
▪ "Cien años de soledad" 
▪ "La Odisea" 
o Los libros deben almacenarse en una estructura Map, donde: 
▪ La clave sea el título del libro en minúsculas. 
▪ El valor sea el objeto Libro. 
2. Clase Libro: 
o Debe tener atributos: titulo y prestado (booleano). 
o Debe tener métodos para: 
▪ Prestar el libro (prestar()). 
▪ Devolver el libro (devolver()). 
▪ Consultar si está prestado (isPrestado()). 
3. Clase Biblioteca: 
o Debe permitir: 
▪ Agregar libros al Map. 
▪ Mostrar todos los libros con su estado (prestado o disponible). 
▪ Prestar un libro: si está disponible, marcarlo como prestado; si no, 
mostrar un mensaje de error. 
▪ Devolver un libro: si estaba prestado, marcarlo como disponible; si 
no, mostrar un mensaje de error. 
4. Interacción con el usuario (consola): 
o El usuario podrá elegir entre: 
1. Mostrar libros. 
2. Prestar un libro.
3. Devolver un libro.
4. Salir del sistema.
 
o Cada acción debe mostrar mensajes claros indicando si se pudo realizar o 
si hubo un error. 
*/

public class Ej_7guia {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        Biblioteca biblioteca=new Biblioteca();
        
        biblioteca.agregarLibro(new Libro("El Quijote"));
        biblioteca.agregarLibro(new Libro("Cien años de soledad"));
        biblioteca.agregarLibro(new Libro("La Odisea"));
        
        int opcion;
        do{
            System.out.println("--- Biblioteca ---");
            System.out.println("1. Mostrar libros");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion=teclado.nextInt();
            teclado.nextLine();
            
            switch(opcion){
                case 1:

                    /*En este caso podemos ver el polimorfismo ya que al imprimir cada libro
                    se llama al toString() sobrecrito*/
                    biblioteca.mostrarLibros();
                    break;
                case 2:
                    System.out.print("Ingrese el título del libro a prestar: ");
                    String tituloPrestar=teclado.nextLine();
                    
                    /*En este caso se hace uso del comportamiento de Biblioteca: prestarLibro.
                    El main solo envía el mensaje, no implementa cómo prestar.*/
                    biblioteca.prestarLibro(tituloPrestar);
                    break;
                case 3:
                    System.out.print("Ingrese el título del libro a devolver: ");
                    String tituloDevolver=teclado.nextLine();
                    

                    /*En este caso se hace uso del comportamiento de Biblioteca: devolverLibro.
                    El main solo envía el mensaje, no implementa cómo devolver.*/
                    biblioteca.devolverLibro(tituloDevolver);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo");
            }
        }while(opcion!=4);
        
        teclado.close();

    }
}
