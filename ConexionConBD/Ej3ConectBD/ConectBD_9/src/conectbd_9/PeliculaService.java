
package conectbd_9;

import java.util.List;
import java.sql.*;

public class PeliculaService {
   private PeliculaDAO dao=new PeliculaDAO();
   
   public List<Pelicula> obtenerTodos()throws SQLException{
      return dao.listarPeliculas();
   }
   
   public void agregarPelicula(String titulo,String genero,int anio)throws SQLException{
       dao.insertarPeliculas(new Pelicula(0,titulo,genero,anio));
   }
   
   public List<Pelicula> buscarPorPelicula(String titulo)throws SQLException{
       return dao.buscarPelicula(titulo);
   }
}
