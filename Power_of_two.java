/**********************************************************************************
	 * 
	 * Purpose:  To print power of 2 till 2^n
	 *
	 ******************************************************************************/

import java.util.Scanner;
public class Power_of_two {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int ans = 1;
//		input has been taken from user
		
		for(int i=1;i<=n;i++) // for loop will continue till 2^n
		{
			ans = ans * 2;
			System.out.println("2^" +i +" = " +ans);
		}
        sc.close();
	}

}
