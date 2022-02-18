/******************************************************************************
	 * Purpose:  A program with cubic running time. Read in N integers and 
	  counts the   number of triples that sum to exactly 0.
     *
	 *
	 ******************************************************************************/
package functional_prblms;
import java.util.Scanner;

public class SumofNumbersAddto0 {
	/*
	 * static scanner to take input from different methods
	 */
	static Scanner sc = new Scanner(System.in);
	/**
	 * function to check sum of triplets is 0
	 * 
	 * @param n the no of elements to check for for creation of array
	 */
	
	static void sumcount0(int n) {
		int[] array = new int[n];
		int count = 0;
		System.out.println("Enter values");
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		
		// checking for triplets by loop
		for(int i =0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++) {
				for(int k=j+1;k<array.length;k++) {
					if(array[i] + array[j] + array[k] == 0) {
						count++;
					}
				}
			}
		}
		// output
		System.out.println("count is " +count);
	}

	public static void main(String[] args) {
		
		System.out.println("Enter number of input");
		int n = sc.nextInt();
		sumcount0(n);
	
	

	}

}
