package selection;

import java.util.Scanner;

public class InputChar {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     //Character input
     char c = sc.next().charAt(0);
     
     //Print the read value
     System.out.println("c ="+c);
	}

}
