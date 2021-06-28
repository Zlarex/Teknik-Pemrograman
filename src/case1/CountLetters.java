/**
 * @author Ihsan Fauzan Hanif
 * 
 * CountLetters.java
 * Reads a words from the standard input and prints the number of
 * occurrences of each letter in that word.
 */

package case1;

import java.util.Scanner;

public class CountLetters
{
	public static void main(String[] args)
	{
		int[] counts = new int[26];
		Scanner scan = new Scanner(System.in);
		
		// get word from user
		System.out.println("Enter a single word (letters only, please): ");
		String word = scan.nextLine();
		
		// convert to all uppercase
		word = word.toUpperCase();
		
		// count frequency of each letter in string
		for (int i = 0; i < word.length(); i++)
		{
			// put the body of the first loop in a try
			try
			{
				counts[word.charAt(i) - 'A']++;				
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				// print an useful message followed by the exception
				//
				// in your print statement, replace the exception with the character that 
				// created the out of bounds index
				System.out.println(
					"character '"+
					word.charAt(i) +
					"' is not a letter"
				);
			}
		}
		
		// print frequencies
		System.out.println();
		for (int i = 0; i < counts.length; i++)
		{
			if (counts[i] != 0)
			{
				System.out.println((char)(i + 'A') + ": " + counts[i]);
			}
		}
	}
}
