package method;

import java.util.Scanner;

public class MethodExample5 {
	static void SumOfNumbers() {
		int n1 , n2 , sum;  
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Any Number : -");
		n1=sc.nextInt();
		n2=sc.nextInt();
		sum = n1 + n2;  
		System.out.println("The sum of numbers is: "+sum);
     }
	
	public static void main(String[]args) {
	    
		SumOfNumbers();
		
		
	}
}
