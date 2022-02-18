/**********************************************************************************
	 * 
	 * Purpose:  Flip Coin and print percentage of Heads and Tails
     *           
	 *
	 ******************************************************************************/
import java.util.Scanner;
public class Flip_Coin {
	
	/**
	 * Function to find the percent of flipped coins
	 * 
	 * @param times the value for no of times flip
	 */

	      void flipPercent(int times) {

		  int i = 1;
		  int heads = 0;
		  int tails = 0;
		  float percentage_of_heads = 0;
		  float percentage_of_tails = 0;
		
		  while (i<=times)
		   {
			float random = (float)(Math.floor((Math.random()* 10)))/10;

			   if (random<0.5)
			   {
				tails++;
				System.out.println("tails " +random);
			   }
			   else
			   {
				heads++;
				System.out.println("heads " +random);
			   }
			   i++;
		    }
		   
          System.out.println("number of heads " +heads);
          System.out.println("number of tails " +tails);
        
		  percentage_of_heads = ((float)heads/(float)times)*100;   //calculating percent of heads
		  double temp1 = Math.round(percentage_of_heads * 100)/100.0; // rounding off percent upto two decimal places
		  percentage_of_tails = ((float)tails/(float)times)*100;        
		  double temp2 = Math.round(percentage_of_tails * 100)/100.0; 
		
		  System.out.println("percentage of heads is " +temp1 +"%");
		  System.out.println("percentage of tails is " +temp2 +"%");
		  }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of times coin needs to be flipped");
		int times = sc.nextInt();
		Flip_Coin flipcoin = new Flip_Coin();
		flipcoin.flipPercent(times);
		sc.close();
		
	}
	
}

