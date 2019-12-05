package utils;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionUtil {
        Connection conn = null;
    public static Connection conDB() 
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost/project/","root","");
        return con;
        }
        catch(Exception ex)
        {
        return null;
        }
    }

}
