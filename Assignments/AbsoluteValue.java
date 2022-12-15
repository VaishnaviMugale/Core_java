package Assignments;

import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {
		int a;
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter any value");
		a=sc.nextInt();
		if(a<0) 
			System.out.println(a*(-1));
		
		
		else
			System.out.println(a);
	}

}
