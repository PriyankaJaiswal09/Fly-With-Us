package AirlineBookingSystem;
import java.sql.*;

public class connect {
    static final String DB_URL ="jdbc:mysql:///Air";
    static final String USER = "root";
    static final String PASS = "";
    public static Connection connectDB(){
        Connection conn = null; 
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            conn = DriverManager.getConnection(DB_URL,USER,PASS);    
            return conn;
        }
        catch(Exception e){ 
            System.out.println(e);
            return null;
        }  
    }   
}
