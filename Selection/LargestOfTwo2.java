package selection;

import java.util.Scanner;

public class LargestOfTwo2 {

	public static void main(String[] args) {
		int n1,n2;
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter any two numbers : -");
		n1=in.nextInt();
		n2=in.nextInt();
		
		if(n1>n2)
			System.out.println(n1+" is the largest number");
		else
			System.out.println(n2+" is the largest number");
	}

}
