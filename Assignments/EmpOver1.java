/*Write a program to calculate overtime pay of 10 employees. 
 * Overtime is paid at the rate of Rs. 12.00 per hour for every hour worked above 40 hours.
 *  Assume that employees do not work for fractional part of an hour. 
*/




package Assignments;

import java.util.Scanner;

public class EmpOver1 {

	public static void main(String args[])
	{
	int count,working_hour = 0,over_time;
	double over_time_pay=0;
	int employ=10;
	for (count=employ; count<=10;)
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The working hours of employee: ");
		working_hour=sc.nextInt();
		
		if (working_hour>40)
		{
			over_time=working_hour - 40;
			over_time_pay =over_time * 12.00;
			System.out.println("Employ No "+count+" overtime pay is "+over_time_pay);
		}
		else {
			System.out.println("You have to work for more than 40 hours to get over time pay");
	}
	
	}
	}}


