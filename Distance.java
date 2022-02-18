/******************************************************************************
 * Purpose: takes two integer command-line arguments x and y and prints the
 * Euclidean distance from the point (x, y) to the origin (0, 0)
 *
 *
 ******************************************************************************/
package functional_prblms;
public class Distance {

	/**
	 * taking two integer from command line arguments
	 * 
	 * @param x value of x axis
	 * @param y value of y axis
	 */

    public static void main(String[] args) {
		try {
			int x = Integer.parseInt(args[0]);    // converting string to integer
			int y = Integer.parseInt(args[1]);
			// printing output
			System.out.println("distance is " + Math.pow((x * x + y * y), 0.5));
		    }
		catch (Exception e) {
			System.out.println("enter integer only");
		}
	}

}
