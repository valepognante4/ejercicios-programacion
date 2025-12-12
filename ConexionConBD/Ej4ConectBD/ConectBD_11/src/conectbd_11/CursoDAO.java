
package conectbd_11;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class CursoDAO {
   private static final String url="jdbc:mysql://localhost:3306/gestioncursos";
   private static final String user="root";
   private static final String pass="ides";
   
   public List<Curso> listarCurso()throws SQLException{
       List<Curso> lista=new ArrayList<>();
       String query="SELECT * FROM cursos";
       
       try(
            Connection con=DriverManager.getConnection(url,user,pass);
            Statement st=con.createStatement();){
           
           ResultSet rs=st.executeQuery(query);
           
           while(rs.next()){
               Curso curso=new Curso(
               rs.getInt("id"),
               rs.getString("nombre"),
               rs.getString("profesor"),
               rs.getInt("creditos"));
               lista.add(curso);
           }
       }
       return lista;
   }
   
   public void insertarCurso(Curso c)throws SQLException{
       String query="INSERT INTO cursos(nombre,profesor,creditos) values (?,?,?)";
       
       try(
           Connection con=DriverManager.getConnection(url,user,pass);
            PreparedStatement ps=con.prepareStatement(query);){
           
           ps.setString(1,c.getNombre());
           ps.setString(2, c.getProfesor());
           ps.setInt(3, c.getCreditos());
           ps.executeUpdate();
       }
   }
   
   public List<Curso> buscarCurso(String nombre)throws SQLException{
       List<Curso> lista=new ArrayList<>();
       String query="select * from cursos where nombre like ?";
       
       try(
           Connection con=DriverManager.getConnection(url,user,pass);
            PreparedStatement ps=con.prepareStatement(query);){
           
            ps.setString(1,"%"+nombre+"%");
            ResultSet rs=ps.executeQuery();
           
           while(rs.next()){
               Curso curso=new Curso(
               rs.getInt("id"),
               rs.getString("nombre"),
               rs.getString("profesor"),
               rs.getInt("creditos"));
               lista.add(curso);
           }
       }
       return lista;
   }
   
   public boolean eliminarCurso(int id) throws SQLException{
       String query="DELETE FROM cursos WHERE id=?";
       
       try(
           Connection con=DriverManager.getConnection(url,user,pass);
           PreparedStatement ps=con.prepareStatement(query);
        ){
           
           ps.setInt(1,id);
           int filasAfectadas=ps.executeUpdate();
           return filasAfectadas>0;
           
           
       }
   }
}
