package BookingTicket;
import BookingTicket.Seating;
import java.sql.*;
import java.util.Scanner;

public class Bookingsystem {

	int Tickets=60,ResTickets=0;
	String booking=Seating.Seating_Arrangement();
	int no,age;
	String ticket,name,sex;
	Connection con=null;
	Booking_Storing u=new Booking_Storing();
	Scanner br=new Scanner(System.in);
	
	public void book() {
		
		System.out.println("-----------Unreserved Tickets are:"+Tickets);
	    System.out.println("-----------Reserved Tickets are:"+ResTickets);
	    System.out.println(booking);
	    System.out.print("How many do you want??");
        no=br.nextInt();
        Tickets = Seating.NoofSeats(Tickets,no);
        ResTickets+=no;
        for(int i=0;i<no;i++) {
        	
        	System.out.println("Enter Ticket"+" "+(i+1)+" "+"Details");
        	System.out.print("Enter Ticket"+" "+(i+1)+" "+"number:");
    	    ticket = br.next();
    	    System.out.print("Enetr"+" "+(i+1)+" "+"Name:");
    	    name = br.next();
    	    System.out.print("Enetr"+" "+(i+1)+" "+"age:");
    	    age =br.nextInt();
    	    System.out.print("Enetr"+" "+(i+1)+" "+"sex:");
    	    sex=br.next();
    	    Tickets = Seating.NoofSeats(Tickets,1);
            ResTickets+=1;
    	    booking=Seating.bookingticket(ticket, booking);
    	    try {
    			con=ConnectionFactory.getConnection();
    		    u.ticketbook(con,ticket,name,age,sex);
    			con.close();
    		   } catch (SQLException e) {
    			  e.printStackTrace();
    		 }
    		     System.out.println("Ticket"+(i+1)+"has booked");
                     
        }   
        
	}
	
	public void showseating() {
		
		System.out.println(this.booking);
	}
	
	public void seatnumbers() {
		
		System.out.println("-----------Unreserved Tickets are:"+this.Tickets);
		System.out.println("-----------Reserved Tickets are:"+this.ResTickets);
	}
	public void searchticket(){
		
		System.out.println("Enter name:");
		name=br.next();
		try {
			con=ConnectionFactory.getConnection();
		    u.searchdetails(con, name);
		    con.close();
		   } catch (SQLException e) {
			  e.printStackTrace();
		 }
	    
	}
	public void showdetails() {
		
		try {
			con=ConnectionFactory.getConnection();
		    u.showdetails(con);
		    con.close();
		   } catch (SQLException e) {
			  e.printStackTrace();
		 }
	}
}