package Iteration;

import java.util.Scanner;

public class SumOfNaturalNumbers3 {

	public static void main(String[] args) {
		int i,n,sum=0,C;
	
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the range :-");
		n=a.nextInt();
	    for(i=1; i<=n; i++)
	    {	
	    	C=i;
	    	if(i==n) 
	    	System.out.print(C);
	    	
	    	else 
	    		System.out.print(C+ " + " );
	    		
	    		sum=sum+C;
	    	}	 
	    	System.out.println("\nSum of Natural numbers = "+sum);
	    }
	}
	
	



