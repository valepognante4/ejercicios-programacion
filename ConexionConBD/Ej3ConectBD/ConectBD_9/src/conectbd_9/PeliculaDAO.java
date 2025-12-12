
package conectbd_9;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PeliculaDAO {
    private static final String url="jdbc:mysql://localhost:3306/videoclub";
    private static final String user="root";
    private static final String pass="ides";
    
    public List<Pelicula> listarPeliculas()throws SQLException{
        List<Pelicula> lista=new ArrayList<>();
        String query="SELECT * FROM peliculas";
        
        try(
            Connection con=DriverManager.getConnection(url,user,pass);
            Statement st=con.createStatement();){
            
            ResultSet rs=st.executeQuery(query);
            
            while(rs.next()){
                Pelicula pelicula=new Pelicula(
                    rs.getInt("id"),
                    rs.getString("titulo"),
                    rs.getString("genero"),
                    rs.getInt("anio")
                );
                lista.add(pelicula);
            }
        }
        return lista;
    }
    
    public void insertarPeliculas(Pelicula p)throws SQLException{
        String query="INSERT INTO peliculas(titulo,genero,anio) VALUES(?,?,?)";
        
        try(
            Connection con=DriverManager.getConnection(url,user,pass);
            PreparedStatement ps=con.prepareStatement(query);){
            
            ps.setString(1, p.getTitulo());
            ps.setString(2,p.getGenero() );
            ps.setInt(3, p.getAnio());
            ps.executeUpdate();
        }
     
        
    }
    
   public List<Pelicula> buscarPelicula(String titulo)throws SQLException {
    List<Pelicula> lista = new ArrayList<>();
    String query = "SELECT * FROM peliculas WHERE titulo LIKE ?";
    
    try (
        Connection con = DriverManager.getConnection(url, user, pass);
        PreparedStatement ps = con.prepareStatement(query);
    ) {
        ps.setString(1, "%" + titulo + "%"); // 🔹 Coincidencias parciales
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Pelicula pelicula = new Pelicula(
                rs.getInt("id"),
                rs.getString("titulo"),
                rs.getString("genero"),
                rs.getInt("anio")
            );
            lista.add(pelicula);
        }
    }
    return lista;
}

}
