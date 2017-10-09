package BookingTicket;
import java.sql.*;

public class Booking_Storing {
	
	public void ticketbook(Connection c,String ticket,String name,int age,String sex) {
		
		try {
			PreparedStatement ps=c.prepareStatement("insert into Ticketstore values(?,?,?,?)");
			ps.setString(1,ticket);
			ps.setString(2,name);
			ps.setInt(3,age);
			ps.setString(4, sex);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	public void showdetails(Connection c) {
		
		System.out.println("------------------Booking Details-----------");
		try {
		      PreparedStatement st1= c.prepareStatement("select * from Ticketstore");
	          ResultSet rs=st1.executeQuery();
		      System.out.println("ticket\tname\tage\tsex");
		      System.out.println("------------------------------------------------------");
		      while(rs.next()) {
		    	  System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(2));
		      }
		      System.out.println("------------------------------------------------------");
			}catch (Exception  e) {
				  e.printStackTrace();
			 }
	}
	public void  searchdetails(Connection c,String name) {
		try {
			PreparedStatement st1= c.prepareStatement("select * from Ticketstore where Name=?");
			st1.setString(1, name);
			ResultSet rs=st1.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
  }
}