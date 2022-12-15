package selection;

import java.util.Scanner;

public class PointAndCircle {

	public static void main(String[] args) {
		
		int x,y,r,dp,dr;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the co-ordinates of the point");
		x=sc.nextInt();
		y=sc.nextInt();
		
		System.out.println("Enter the radius of the circle");
		r=sc.nextInt();
		
		dp=x*x+y*y;
		dr=r*r;
		
		if(dp>dr)
			System.out.println("Point lies outside the circle");
		
		else if(dr<dr)
			System.out.println("Point lies inside the circle");
		
		else if(dp==dr)
			System.out.println("Point lies on the circle");
		
		else if(dp==0)
			System.out.println("Point is the center of the circle");
		
	}

}
