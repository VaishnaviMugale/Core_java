package Assignments;

import java.util.Scanner;

public class TriangleIsVaildOrNot {

	public static void main(String[] args) {
		
		int a,b,c,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three values");
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		sum=a+b+c;
		
		if(sum == 180)
			System.out.println(sum+"Triangle is valid");
		else
			System.out.println(sum+"triangle is not valid");
		
	}

}
