package javaapplication34;
import java.sql.*;
public class JavaApplication34 
{
    public static void main(String[] args) throws SQLException, ClassNotFoundException 
    {
        double dbRadius=0.0;
        
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","");
        Statement stmt= con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT radius FROM circle WHERE id ="+20);
        while(rs.next())
        {
        dbRadius=rs.getDouble(1);
        System.out.println(rs.getDouble(1));
        }
        
        
        //con.close();
        Circle myCircle= new Circle();
        System.out.println(myCircle.getArea());
        
    }
    
}
