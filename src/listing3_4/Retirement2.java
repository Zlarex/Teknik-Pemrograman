package listing3_4;

import java.util.*;

/**
 * This program demostrates a <code>do/while</code> loop.
 * @version 1 2021-03-15
 * @author Ihsan Fauzan Hanif
 */
public class Retirement2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("How much money will you contribute every year? ");
        double payment = in.nextDouble();

        System.out.println("Interest rate in %: ");
        double interestRate = in.nextDouble();

        
        double balance = 0;
        int years = 0;
        
        String input;
        
        // update account balance while user isn't ready to retire
        do
        {
            // add this year's payment and interest
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            
            years++;
            
            // print current balance
            System.out.printf("After year %d, your balance is %,.2f%n", years, balance);
            
            // ask if ready to retire and get input
            System.out.println("Ready to retire? (Y/N) ");
            input = in.next();
        }
        while (input.equals("N"));
        
        in.close();
        
    }    
}
