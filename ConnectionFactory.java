package BookingTicket;
import java.sql.*;
public class ConnectionFactory {
public static Connection getConnection(){
Connection con=null; 
try {
	
	Class.forName("com.mysql.jdbc.Driver"); 
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MovieBooking","root","root"); 
	
}catch (Exception e)  { 
	
	System.out.println(e.getMessage()); 
}

return con;
}
}