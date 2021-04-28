package listing3_8;

/**
 * This program shows how to store tabular data in a 2D array
 * @version 1
 * @author Ihsan Fauzan Hanif
 */
public class CompoundInterest
{
	public static void main(String[] args)
	{
		final double STARTRATE = 10;
		final int NRATES = 5;
		final int NYEARS = 10;
		
		// set interest rates to 10 ... 15%
		double[] interestRate = new double[NRATES];
		for (int j = 0; j < interestRate.length; j++)
			interestRate[j] = (STARTRATE + j) / 100.00;
		
		double[][] balances = new double[NYEARS][NRATES];
		
		// set initial balances to 10000
		for (int j = 0; j < balances[0].length; j++)
			balances[0][j] = 10000;
		
		// compute interest for future years
		for (int i = 1; i < balances.length; i++)
		{
			for (int j = 0; j < balances[i].length; j++)
			{
				// get last year's balance from previous row
				double oldBalance = balances[i - 1][j];
				
				// compute interest
				double interest = oldBalance * interestRate[j];
				
				// compute this year's balances
				balances[i][j] = oldBalance + interest;
			}
		}
		
		// print one row of interest rates
		for (int j = 0; j < interestRate.length; j++)
			System.out.printf("%9.0f%%", 100 * interestRate[j]);
		
		System.out.println();
		
		// print all balance table
		for (double[] row : balances)
		{
			for (double b : row)
				System.out.printf("%10.2f", b);
			
			System.out.println();
		}
	}
}
