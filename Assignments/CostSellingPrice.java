package Assignments;

import java.util.Scanner;

public class CostSellingPrice {

	public static void main(String[] args) {
		int x,y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the value of cost price");
		x=sc.nextInt();
		
		System.out.println("enter the value of selling price");
		y=sc.nextInt();
		
		if(x<y)
		      System.out.println("profit="+(y-x));
		else if(x>y)
		      System.out.println("loss="+(x-y));
		 else
		      System.out.println("Break even point ie No profit no loss");
			  
}

}
