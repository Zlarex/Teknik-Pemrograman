/**
 * @author Ihsan Fauzan Hanif
 * 
 * MathUtils.java
 * Provides static mathematical utility functions.
 */

package case3;

public class MathUtils
{
	// Modify the header of the factorial method to indicate that factorial can
	// throw an IllegalArgumentException.
	/**
	 * Returns the factorial of the argument given
	 * @param n value
	 * @return the result of the factorial
	 */
	public static int factorial(int n) throws IllegalArgumentException
	{
		// Modify the body of factorial to check the value of the argument and,
		// if it is negative, throw an IllegalArgumentException. Note that what you
		// pass to throw is actually an instance of the IllegalArgumentException class,
		// and that the constructor takes a String parameter. Use this parameter to be
		// specific about what the problem is.
		if (n < 0) throw new IllegalArgumentException("The value must not be a negative integer");
		// Returning a negative number for values over 16 also is not correct. The problem is arithmetic 
		// overflow—the factorial is bigger than can be represented by an int. This can also be thought of 
		// as an IllegalArgumentException—this factorial method is only defined for arguments up to 16. 
		// Modify your code in factorial to check for an argument over 16 as well as for a negative 
		// argument
		if (n > 16) throw new IllegalArgumentException("The value must be lower than 17");
		int fac = 1;
		for (int i = n; i > 0; i--) fac *= i;
		
		return fac;
	}
}
