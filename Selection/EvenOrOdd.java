package selection;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : -");
		num=sc.nextInt();
		if(num%2==0)
		System.out.println(num+"is Even");
		else
		System.out.println(num+"is Odd");
	}

}
