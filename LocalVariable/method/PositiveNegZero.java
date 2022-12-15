package method;

import java.util.Scanner;

public class PositiveNegZero {

	 static void positivenegzero() {

		int num_limit=0, positive_counter=0, negative_counter=0,zero_counter=0;
		int entered_number;
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter number you want: -");
	     num_limit = a.nextInt();
	     
	     for( int i=1; i<=num_limit; i++) {
	    	 System.out.println("Enter the value");
	    	 entered_number=a.nextInt();
	    	 if(entered_number>0) {
	    		 positive_counter=positive_counter+1;
	    	 }
	    	 else if(entered_number<0) {
	    		 negative_counter=negative_counter+1; 
	    	 }
	    	 else {
	    		 zero_counter=zero_counter+1;
	    	 }
	     }
	     System.out.println("positive number is" +positive_counter);
	     System.out.println("negative number is" +negative_counter);
	     System.out.println("zero number is" +zero_counter);
	     
	}
	public static void main(String[] args) {
		positivenegzero();
	}
}
