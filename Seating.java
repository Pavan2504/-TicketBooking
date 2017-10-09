package BookingTicket;

public class Seating {
	
	static String Seating_Arrangement() {
		
		String res="";
		for(char ch='A';ch<='D';ch++) {
			
	 		    res+=show_half(ch, 1, 8);
	   			res+="\t";
	   			res+=show_half(ch, 9, 16);
	   			res+="\n";
	   			
	 	}
	    return res;	
	}
   
	private static Object show_half(char ch, int a, int b) {
		String res=""; 
		for(int i=a;i<=b;i++) 
 				res+=ch+""+i+"  ";
 	    return res;
    }   
   
   public static int NoofSeats(int total,int m) {
	
       int seat=total-m;
       return seat;
    }   
    
   public static String bookingticket(String tic,String booking)  {
	   
	   String  search=booking.replaceFirst(tic,"**");
	   return search;
   }
}