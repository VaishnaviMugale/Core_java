package method;

import java.util.Scanner;

public class RectangleLenBre8 {

	 static void rectanglelenbre() {
		double length, breadth;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a Length,Breadth");
		
		length=sc.nextInt();
		breadth=sc.nextInt();
		
		double area=length*breadth;
		double pre=2*(length+breadth);
		
		if(area>pre)
			System.out.println("Area of Rectangle is greater than its Perimeter");
		else
			System.out.println("Perimeter of rectangle is greater than its Area");
		
		
	}
	public static void main(String[] args) {
		rectanglelenbre();
	}
}
