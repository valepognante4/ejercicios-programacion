
package conectbd_7;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class EstudianteDAO {
    private static final String url="jdbc:mysql://localhost:3306/escuela";
    private static final String user="root";
    private static final String pass="ides";
    
    public List<Estudiante> listarEstudiante()throws SQLException{
        List<Estudiante> lista=new ArrayList<>();
        
        String query="SELECT * FROM estudiantes";
        try(
            Connection con=DriverManager.getConnection(url,user,pass);
            Statement st=con.createStatement();){
            ResultSet rs=st.executeQuery(query);
            
            while(rs.next()){
                 Estudiante estudiante=new Estudiante(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("edad")
                );
                 lista.add(estudiante);
            }
        }
        return lista;
        
    }
    
    public void isertarEstudiante(Estudiante e) throws SQLException{
        String query="INSERT INTO estudiantes (nombre,apellido,edad) VALUES (?,?,?)";
   
        try (
            Connection con = DriverManager.getConnection(url, user, pass);
            PreparedStatement ps = con.prepareStatement(query);){
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setInt(3, e.getEdad());
            ps.executeUpdate();

        }
    }
}
