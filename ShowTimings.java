package BookingTicket;

import java.io.IOException;
import java.util.Scanner;
public class ShowTimings {

	 public void show() throws IOException {
		int st;
		Scanner sc=new Scanner(System.in);
		Booking_Operatios mos=new Booking_Operatios();
		Booking_Operatios mas=new Booking_Operatios();
		Booking_Operatios fis=new Booking_Operatios();
		Booking_Operatios ses=new Booking_Operatios();
	    do {
		    System.out.println("****************Enter option for SHOW TIMINGS\n 1----02:00PM\t2------10:00AM\t\t3----06:30\t4-----10:00\t0-----Exit");
		    st=sc.nextInt();
		    switch(st)  {
		    
		    case 2:
                    System.out.println("--------------Welcome Matnie Show--------------");
                    mas.operations();
                    break;
            case 1:
                    System.out.println("--------------Welcome Morning Show--------------");
                    mos.operations();
                    break;
            case 3:
             	    System.out.println("-------------Welcome First Show-----------------");
                    fis.operations();
                    break;
            case 4:
                    System.out.println("--------------Welcome Matnie Show----------------");
                    ses.operations();
                    break;
            default:
                    System.out.println("Enter correct Timings");
                     break;
		    }
	    }while(st!=0);   
	}
}
