package listing3_5;

import java.math.*;
import java.util.*;

/**
 * This program uses big numbers to compute odds of winning the grand prize in a random.
 * @version 1 2021-03-22
 * @author Ihsan Fauzan Hanif
 */
public class BigIntegerTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.print("What is the highest number you can draw? ");
        int n = in.nextInt();

        /**
         * Compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
         */

        BigInteger randomOdds = BigInteger.valueOf(1);

        for (int i = 1; i <= k; i++)
        {
            randomOdds = randomOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
        }

        System.out.println("Your odds are 1 in " + randomOdds + ". Good luck!");
    }
}
