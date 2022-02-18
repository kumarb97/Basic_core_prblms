/**
	 * 
	 * Purpose : Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
	 */

import java.util.Scanner;
public class Harmonic_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		double ans = 0;
   //	Input has been taken from user
		
		for(int i=1;i<=n;i++)  // loop will continue till 1/n
		{   
			ans = ans + (float)1/i;
			if (i<n)
			System.out.print("1/" +i +" + ");
			else
			System.out.print("1/" +i +" = ");
			
		}
		
		double a = Math.round(ans*100)/100.0; // to round off ans upto two decimal place
		System.out.println(a);
		sc.close();
		
	}

}
