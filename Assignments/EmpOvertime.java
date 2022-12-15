package Assignments;

import java.util.Scanner;

     public class EmpOvertime {

	public static void main(String[] args) {
    int total_employ,total_hrs,work_hrs,total_pay;
    
    
    Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter employ numbers= ");
	total_employ=sc.nextInt();
	System.out.println("Enter the total Hours of work time= ");
	work_hrs=sc.nextInt();
	
    
	    if (work_hrs<=40) {
	    	total_hrs =40 - work_hrs;
	    	total_pay = total_hrs * 12;
	    	System.out.println("Employ over time ="+total_hrs);
	    	System.out.println("Employ over time payment ="+total_pay);
	    }
	    
	    else
	    	System.out.println("employees do not work for fractional part of an hour. ");
		}
	
}
