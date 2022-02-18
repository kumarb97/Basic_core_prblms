/**********************************************************************************
	 * 
	 * Purpose:  To swap two numbers given from user
	 *
	 ******************************************************************************/
import java.util.Scanner;
public class Swap_Two_Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int first = sc.nextInt();
		System.out.println("Enter Second number");
		int second = sc.nextInt();
		int temp = 0;
		// input has been taken from user
		
		System.out.println("Before Swapping numbers first is " +first +" and second number is " +second);
		
		temp = first;     // storing first value in temporary variable
		first = second;
		second = temp;
		
		System.out.println("After Swapping numbers first is " +first +" and second number is " +second);
		sc.close();
		

	}

}
