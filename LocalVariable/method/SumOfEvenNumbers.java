package method;

import java.util.Scanner;

public class SumOfEvenNumbers {

	 static void SumOfEvenNumbers() {

		int i,n,sum=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the range :-");
		
		n=sc.nextInt();
		i=1;
		do
		{
			int C;
	    	C=2*i;
	    	if(i==n) 
	    	
	    	System.out.print(C);
	    	
	    	else 
	    		System.out.print(C+ " + " );
	    	
	          sum=sum+C;
	          i++;

		}while(i<=n);
		System.out.println("\nSum of Even numbers = "+sum);
			}
	public static void main(String[] args) {
		SumOfEvenNumbers();
	}
}
