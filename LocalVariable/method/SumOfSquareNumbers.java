package method;

import java.util.Scanner;

public class SumOfSquareNumbers {

	 static void sumofsquarenumbers() {

		int i,n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range : -");
		n=sc.nextInt();
		i=1;
		do 
		{
			int c=i*i;
			if(i==n)
				System.out.print(c);
			else
				System.out.print(c+" + ");
			
			sum=sum+c;
			i++;
			
		}while(i<=n);
		System.out.println("/nSum of numbers = "+sum );
	}
	public static void main(String[] args) {
		sumofsquarenumbers();
	}
}
