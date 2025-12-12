
package conectbd_3;

import java.util.List;
import java.sql.*;

public class ConectBD_3 {

    public static void main(String[] args) {
        DbConnection dbc=new DbConnection();
        Connection conexion=dbc.conectar();
        
        LibroDAO operacion=new LibroDAO(conexion);
        //operacion.insertarLibro("La casa de los espíritus", "Isabel Allende", true);
        //operacion.insertarLibro("Pedro Páramo", "Juan Rulfo", false);
        
 
        //operacion.actualizarLibros(4, "Floricienta");
        //operacion.eliminarLibro(6);
        
        List<Libro> libros=operacion.leerLibros();
        
        System.out.println("------ LISTA DE LIBROS ------");
        for(Libro libro: libros){
            System.out.println(libro);
        }
  
      
        
        
    }
    
}
