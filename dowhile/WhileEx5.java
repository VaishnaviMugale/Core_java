package WhileLoop;

import java.util.Scanner;

public class WhileEx5 {

	public static void main(String[] args) {

		int i,n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range :");
		n=sc.nextInt();
		
		i=1;
		while(i<=n) {
			System.out.println(i*i+" ");
			i++;
		}
	}

}
