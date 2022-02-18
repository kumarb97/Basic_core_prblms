/**********************************************************************************
	 * 
	 * Purpose:  To calculate quotient and remainder
	 *
	 ******************************************************************************/

import java.util.Scanner;

public class Quotient_Remainder {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Dividend");
		int Dividend = sc.nextInt();
		System.out.println("Enter Divisor");
		int Divisor = sc.nextInt();
		// Taken dividend and divisor input from user
		
		double Quotient = (float)Dividend / Divisor; // calculated quotient
		int Remainder = Dividend % Divisor;          // calculated remainder
		
		System.out.println("Quotient = " +Quotient);
		System.out.println("Remainder = " +Remainder);
		sc.close();

	}

}
