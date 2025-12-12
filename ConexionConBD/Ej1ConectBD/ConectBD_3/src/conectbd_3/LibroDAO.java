
package conectbd_3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LibroDAO {
    private Connection conexion;

    public LibroDAO(Connection conexion) {
        this.conexion = conexion;
    }
    
    public List<Libro> leerLibros(){
        List<Libro> lista=new ArrayList<>();
        String query="select * from Libros";
        
        try{
            Connection con=DbConnection.conectar();
            PreparedStatement ps=con.prepareStatement(query);
            
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                Libro libro=new Libro(
                rs.getInt("idLibros"),
                rs.getString("titulo"),
                rs.getString("autor"),
                rs.getBoolean("disponible")
                );
                lista.add(libro);
            }
        }catch(SQLException e){
            System.out.println("Error al leer libros");
        }
        
        return lista;
    }
    
    public void insertarLibro(String titulo, String autor,boolean disponible){
        String query="insert into Libros(titulo,autor,disponible) values (?,?,?)";
        
        try{
            Connection con=DbConnection.conectar();
            PreparedStatement ps=con.prepareStatement(query);
            
            ps.setString(1,titulo);
            ps.setString(2, autor);
            ps.setBoolean(3, disponible);
            
            ps.executeUpdate();
            System.out.println("Dato insertado con éxito");
        }catch(SQLException e){
            System.out.println("Error al insertar libro");
            e.printStackTrace();
        }
    }
    
    public void actualizarLibros(int id, String titulo){
        String query="update Libros set titulo=? where idLibros=?";
        
        try{
            Connection con=DbConnection.conectar();
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(2,id);
            ps.setString(1, titulo);
            
            int fila=ps.executeUpdate();
            if(fila>0){
            System.out.println("Dato actualizado con éxito");
            }else{
                
                System.out.println("No se eoncotró el libro con el id "+id);
            }
            con.close();
        }catch(SQLException e){
            System.out.println("Error al actualizar libro");
        }
    }
    
    public void eliminarLibro(int id){
      String query="delete from Libros where idLibros=?";
      
      try{
          Connection con=DbConnection.conectar();
          PreparedStatement ps=con.prepareStatement(query);
          ps.setInt(1,id);
          
          int fila = ps.executeUpdate();
          if (fila > 0) {
              System.out.println("Dato actualizado con éxito");
          } else {

              System.out.println("No se eoncotró el libro con el id " + id);
          }
          con.close();
          
      }catch(SQLException e){
          System.out.println("Error al eliminar libro");
          e.printStackTrace();
      }
    }
}
