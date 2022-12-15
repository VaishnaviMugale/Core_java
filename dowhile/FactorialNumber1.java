package WhileLoop;

import java.util.Scanner;

public class FactorialNumber1 {

	public static void main(String[] args) {

		int i,n,fact=1;
		Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter any value");
	    
	    n=sc.nextInt();
	    
	    i=1;
	    while(i<=n) {
	    	fact=fact*i;
	    	i++;
	    }
	    System.out.println("Factorial of "+fact );
	    
	}

}
