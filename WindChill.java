/******************************************************************************
 * Purpose : takes two double command-line arguments temperature in fahrenheit
 *  and wind speed in miles per hour and prints the wind chill.
 *
 ******************************************************************************/
package functional_prblms;
public class WindChill {
	
	/**
	 * taking two command line argumennts
	 * 
	 * @param f  the double value of temperature in fahrenheit
	 * @param ws the double value of windspeed in mile per hour
	 */
	public static void main(String[] args) {
		try {
			double f = Double.parseDouble(args[0]);
			double ws = Double.parseDouble(args[1]);

			if (Math.abs(f) > 50 || ws > 120 || ws < 3) {
				System.out.println("enter correct input");
			} else {
				double w = 35.74 + 0.62158 * f + (0.4275 * f - 35.75) * Math.pow(ws, 0.16);
				System.out.println(w);
			}
		} catch (Exception e) {
			System.out.println("enter proper input");
		}
	}

}
