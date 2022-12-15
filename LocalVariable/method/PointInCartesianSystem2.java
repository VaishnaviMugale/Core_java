package method;

import java.util.Scanner;

public class PointInCartesianSystem2 {

	 static void pointincartesiansystem() {
		int x,y;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the co-ordinates of the point");
		x=sc.nextInt();
		y=sc.nextInt();
		
		if(x>0 && y>0)
			System.out.println("Point lies in the 1st quadrant");
		
		if(x<0 && y>0)
			System.out.println("Point lies in the 2nd quadrant");
		
		if(x<0 && y<0)
			System.out.println("Point lies in the 3rd quadrant");
		
		if(x>0 && y>0)
			System.out.println("Point lies in the 4th quadrant");
		
		if(x!=0 && y==0)
			System.out.println("Point lies on the X-axis");
		
		if(x==0 && y!=0)
			System.out.println("Point lies on the Y-axis");
		
		if(x==0 && y==0)	
            System.out.println("Point is the Origin");
	}
	public static void main(String[] args) {
		pointincartesiansystem();
	}
}
