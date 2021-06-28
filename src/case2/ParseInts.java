/**
 * @author Ihsan Fauzan Hanif
 * 
 * ParseInts.java
 * Reads a line of text and prints the integers in the line.
 */

package case2;

import java.util.Scanner;

public class ParseInts
{
	public static void main(String[] args)
	{
		int val, sum = 0;
		Scanner scan = new Scanner(System.in);
		String line;
		
		System.out.println("Enter a line of text");
		Scanner scanLine = new Scanner(scan.nextLine());
		while (scanLine.hasNext())
		{
			// This is because the entire loop is inside the try, 
			// so when an exception is thrown the loop is terminated. To make it continue,
			// move the try and catch inside the loop
			try
			{
				val = Integer.parseInt(scanLine.next());
				sum += val;
			}
			catch (NumberFormatException e)
			{
				
			}
		}
		System.out.println("The sum of the integers on this line is " + sum);
	}
}
