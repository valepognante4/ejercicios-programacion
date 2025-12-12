
package conectbd_11;

import java.sql.*;
import java.util.List;

public class CursoService {
    private CursoDAO dao=new CursoDAO();
    
    public List<Curso> obtenerTodos() throws SQLException{
        return dao.listarCurso();
    }
    
    public void agregarCurso(String nombre,String profesor,int creditos)throws SQLException{
        dao.insertarCurso(new Curso(0,nombre,profesor,creditos));
    }
    
    public List<Curso> buscarPorNombre(String nombre)throws SQLException{
        return dao.buscarCurso(nombre);
    }
    
    public boolean eliminarPorId(int id)throws SQLException{
        return dao.eliminarCurso(id);
    }
}
