package WhileLoop;

import java.util.Scanner;

public class SumOfEvenNumbers {

	public static void main(String[] args) {

		int i,n,sum=0;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the range :-");
		n=a.nextInt();
		i=1;
	    while( i<=n) {
	    	int C;
	    	C=2*i;
	    	if(i==n) 
	    	
	    	System.out.print(C);
	    	
	    	else 
	    		System.out.print(C+ " + " );
	    	
	          sum=sum+C;
	          i++;
	    }
	    System.out.println("\nSum of Even numbers = "+sum);
	}

}
