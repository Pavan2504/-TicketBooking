package BookingTicket;

import java.io.IOException;
import java.util.Scanner;

public class Screen {

	public void  mall()  throws IOException {
	char mall_op;
	ShowTimings a=new ShowTimings();
	ShowTimings b=new ShowTimings();
	ShowTimings c=new ShowTimings();
	ShowTimings d=new ShowTimings();
	Scanner sc=new Scanner(System.in);
	System.out.println("------------------>WELCOME TO DEVELOPER MALL\n");
	do {
	      System.out.println("A----->Screen A\tB------->Screen B\tC------->Screen C\tD------->Screen D\tE------>EXIT\n");
	      System.out.println("Enter Correct Option");
	      mall_op=sc.next().charAt(0);
	      switch(mall_op) {
	      
	      case 'A':  
	    	         System.out.println("-----Welcome to Screen A");
	    	          a.show();
	    	          break;
	      case 'B':
	    	           System.out.println("-----Welcome to Screen B");      
	    	          b.show();
	    	          break;
	      case 'C':
	    	               System.out.println("-----Welcome to Screen C");      
	    	  c.show();
	    	          break;
	      case 'D':
	    	          System.out.println("-----Welcome to Screen D");
	    	         d.show();
	    	          break;

	      }
	      }while(mall_op!='E');
	}

}