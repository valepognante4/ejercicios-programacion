
package conectbd_7;

import java.util.List;
import java.sql.*;

public class EstudianteService {
    private EstudianteDAO dao=new EstudianteDAO();
    
    public List<Estudiante> obtenerTodos()throws SQLException{
        return dao.listarEstudiante();
    }
    
    public void agregarEstudiante(String nombre,String apellido, int edad) throws SQLException{
        dao.isertarEstudiante(new Estudiante(0,nombre,apellido,edad));
    }
    
    
}
