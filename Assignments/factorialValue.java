package Assignments;

import java.util.Scanner;

public class factorialValue {

	public static void main(String[] args) {
    int n,fact=1;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter any value");
    
    n=sc.nextInt();
    
    for(int i=1 ; i<=n ; i++)
    {
    	fact=fact*i;
    }	
    	
    	System.out.println("Factorial of "+fact );
    
	}

}
