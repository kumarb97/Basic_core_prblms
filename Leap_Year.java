/**********************************************************************************
	 * 
	 * Purpose:  To find a year is leap or not
	 *
	 ******************************************************************************/

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) 
	{   
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
	    int year = sc.nextInt();
	    boolean leap = false;

	    // if the year is divided by 4
	    if (year % 4 == 0) 
	    {

	      // if the year is century
	      if (year % 100 == 0) 
	      {

	        // if year is divided by 400
	        // then it is a leap year
	        if (year % 400 == 0)
	          leap = true;
	        else
	          leap = false;
	      }

	}
	    if(leap==true)
	    	System.out.println("It is a leap year");
	    else
	    	System.out.println("It is not a leap year");

}
}