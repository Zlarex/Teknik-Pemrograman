/**
 * @author Ihsan Fauzan Hanif
 * 
 * Factorials.java
 * Reads integers from the user and prints the factorial of each.
 */

package case3;

import java.util.Scanner;

public class Factorials
{
	public static void main(String[] args)
	{
		String keepGoing = "y";
		Scanner scan = new Scanner(System.in);
		while (keepGoing.equals("y") || keepGoing.equals("Y"))
		{
			// Modify the main method in your Factorials class to catch the exception
			// thrown by factorial and print an appropriate message, but then continue
			// with the loop
			try
			{
				System.out.println("Enter an integer: ");
				int val = scan.nextInt();
				System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
				System.out.println("Another factorial? (y/n)");
				keepGoing = scan.next();
			}
			catch(IllegalArgumentException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}