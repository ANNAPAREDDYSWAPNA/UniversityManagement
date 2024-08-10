
package Univerist.management.system;



import java.sql.*;
public class Conn{
    Connection con;
    Statement stm;
    
    Conn()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem","root","Sudheer@18");
            stm=con.createStatement();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        new Conn();
    }
    
}

