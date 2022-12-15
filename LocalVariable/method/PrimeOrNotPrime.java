package method;

import java.util.Scanner;

public class PrimeOrNotPrime {

	 static void primeornotprime() {

		int i,num;
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter any number : -");
	     num = a.nextInt();
	     
	    	 for( i=2;i<num ; i++) 
	    		 if(num%i==0) {
	    			 System.out.println(num+ " Is a not prime number " );
	    			 break;
	    		 }
	    	 
	    	 if(i==num) 
	    		 System.out.println(num+ " is Prime number ");
	    	 }
	public static void main(String[] args) {
		primeornotprime();
	}
	    	 }
	




