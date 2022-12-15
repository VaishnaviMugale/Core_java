package method;

import java.util.Scanner;

public class SumOfOddNumber {

	 static void sumofoddnumber(){

			int i,n,sum=0;
			
			Scanner a = new Scanner(System.in);
			System.out.println("Enter the range :-");
			n=a.nextInt();
	
			i=1;
			do {
				int C=i;
		    	if(i==n) 
			    	System.out.print(C);
			    	
			    	else 
			    		System.out.print(C+ " + " );
			    		
			    		sum=sum+C;
			    		i++;
			}
			while(i<=n);
			System.out.println("\nSum of Natural numbers = "+sum);

	}
	public static void main(String[] args) {
		sumofoddnumber();
	}
}
