/**********************************************************************************
	 * 
	 * Purpose:  To check alphabet is vowel or consonant
	 *
	 ******************************************************************************/


import java.util.Scanner;
public class Vowel_Consonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphabet");
		char ch = sc.next().charAt(0);
//		Input has been taken from user
		
	      if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u') // to check if alphabet is vowel
	      {
	         System.out.println("Given alphabet is a vowel");
	      }
	      
	      else
	      {
	         System.out.println("Given alphabet is a consonant");
	      }
	      sc.close();

	}

}
