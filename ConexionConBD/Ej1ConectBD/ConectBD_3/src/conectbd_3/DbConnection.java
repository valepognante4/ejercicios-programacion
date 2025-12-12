
package conectbd_3;

import java.sql.*;

public class DbConnection {
    static String url="jdbc:mysql://localhost:3306/biblioteca";
    static String user="root";
    static String pass="ides";
    
    public static Connection conectar(){
        Connection con=null;
        
        try{
            con=DriverManager.getConnection(url,user,pass);
            System.out.println("Conexión exitosa");
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return con;
    }
}
