package WhileLoop;

import java.util.Scanner;

public class WhileEx3 {

	public static void main(String[] args) {

		int i,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the range : ");
		n=sc.nextInt();
		
		i=1;
		while(i<=n) {
			System.out.print(i+ "  " );
			i++;
		}
	}

}
