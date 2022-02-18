/**********************************************************************************
	 * 
	 * Purpose:  Program to check largest number among three numbers
	 *
	 ******************************************************************************/

import java.util.Scanner;
public class Largest_among_Three {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println("Enter third number");
		int c = sc.nextInt();
//		three numbers input has been taken from user
		
		if (a>b && a>c) // to check if a is greater among all
		{
			System.out.println("Largest number is " +a);
		}
		else if (b>a && b>c)  // to check b is greater among all
		{
			System.out.println("Largest number is " +b);
		}
		else
		{
			System.out.println("Largest number is " +c); 
		}
		sc.close();

	}

}
