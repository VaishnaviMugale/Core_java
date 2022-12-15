package WhileLoop;

import java.util.Scanner;

public class WhileEx4 {

	public static void main(String[] args) {

		int i, n;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the range :");
		n=a.nextInt();
	
		i=1;
		while(i<=n) {
			System.out.print(2*i+ "  " );
			i++;
		}
			
	}

}
