package Assignments;

import java.util.Scanner;

public class NoRaisedToPoewr {

	public static void main(String[] args) {
     
		int a,b,c,x;
		
		System.out.println("Enter the value of a ");
		Scanner sc =new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter the value of b");
		b=sc.nextInt();
		c=sc.nextInt();
		x=sc.nextInt();
		c=1;
		x=b;
		if(b!=0)
		{
			c=c*a;
			b=b-1;
		}
		System.out.println(" raised to the power:" + a);
		
			
		}
			
}


