package WhileLoop;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {

		int i,n,sum=0,C;
		
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the range :-");
		n=a.nextInt();
		i=1;
	    while( i<=n)
	    {	
	    	C=i;
	    	if(i==n) 
	    	System.out.print(C);
	    	
	    	else 
	    		System.out.print(C+ " + " );
	    		
	    		sum=sum+C;
	    		i++;
	    	}	 
	    	System.out.println("\nSum of Natural numbers = "+sum);
	  
	}

}
