package method;

import java.util.Scanner;

public class FactorialNumber {

	static void factorialnumber() {

		int i,n,fact=1;
		Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter any value");
	    
	    n=sc.nextInt();
	    
	    i=1;
	    do
	    {
	    	fact=fact*i;
    	    i++;
	    	 System.out.println("Factorial of "+fact );
	    	 
	    }while(i<=n);
	}
	public static void main(String[] args) {
		factorialnumber();
	}
	}

