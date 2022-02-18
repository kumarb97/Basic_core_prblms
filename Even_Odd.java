/**********************************************************************************
	 * 
	 * Purpose:  To check if number is even or odd
	 *
	 ******************************************************************************/
import java.util.Scanner;
public class Even_Odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
//		Input has been taken from user
		
		if (n%2 == 0)  // If input%2 is equal to zero that means it is an even number or else its an odd
		{
			System.out.println("It is an even number");
		}
		else
		{
			System.out.println("It is an odd number");
		}
		sc.close();

	}

}
