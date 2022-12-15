package Sequence;

import java.util.Scanner;

public class CelsiusToFaherenheit {

	public static void main(String[] args) {
		
		double c,f;
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter the temprature in celsius");
		c=a.nextDouble();
		f=9/5*c+32;
		System.out.println("Celsius ="+c);
		System.out.println("Fahrenheit ="+f);
	}

}
