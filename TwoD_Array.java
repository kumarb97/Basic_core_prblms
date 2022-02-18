  /**
	* Purpose: 2D arrays of integers and doubles from standard input and printing them out to standard output.
	**/
package functional_prblms;
import java.util.Scanner;
import java.io.PrintWriter;

public class TwoD_Array {
	
	static Scanner sc = new Scanner(System.in);

	public static int[][] arrayInt(int m, int n) {
		int a[][] = new int[m][n];
		System.out.println();
		System.out.println("Array");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		return a;
	}
	
	public static void display(int[][] a,int m, int n) {
		PrintWriter pw = new PrintWriter(System.out,true);

		// display integers
		System.out.println();
		pw.println("2D ARRAY");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				pw.print("\t" + a[i][j] + " ");
			}
			pw.println("\t");
		}
	}
	
	<t> void displayArray(t[][] arr) {
		PrintWriter pw = new PrintWriter(System.out);

		// display integers
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				pw.print("\t" + arr[i][j] + " ");
			}
			pw.println("\t");
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Enter number of rows: ");
		int m = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int n = sc.nextInt();

		// calling methods
		int[][] a = arrayInt(m, n);

		// calling display method
		display(a,m,n);

	}

}
