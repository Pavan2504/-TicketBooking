package BookingTicket;
import java.util.Scanner;

public class Booking_Operatios extends Bookingsystem {

	
	public void operations() {
		
		int op;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1.Ticket Booking\t2.Searching Ticket\t3.SeatingArrangement\n4.TicketNumbers\t\t5.show details\t\t6.Exit");
		    System.out.print("Enter your option");
		    op=sc.nextInt();
		    switch(op) {
		    
		    case 1:
		    	       super.book();
		    	       break;
		    case 2:
		    	        super.searchticket();
		    	        break;
		    case 3:
		    	        super.showseating();
		    	        break;
		    case 4:
		    	
		               super.seatnumbers();
		               break;
		    case 5:
		    	       super.showdetails();
		    	       break;
			
			default:
				       System.out.println("Enter Correct Option");
				       break;
			
			
		    }
		}while(op!=6); 	  
		
	}
}
