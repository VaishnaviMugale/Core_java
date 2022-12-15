package method;

import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		
		num=sc.nextInt();
		
		if(num%3==0)
		System.out.println(num+" is multiple of 3");
		
		else
			System.out.println(num+" is not multiple of 3");
			
		

	}

}
