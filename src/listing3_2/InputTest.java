package listing3_2;

import java.util.*;
/**
 * This program demonstrates console input
 * @version 1 2021-03-15
 * @author Ihsan Fauzan Hanif
 */
public class InputTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // get first input
        System.out.println("What is your name?");
        String name = in.nextLine();
        // get second input
        System.out.println("How old are you?");
        int age = in.nextInt();

        in.close();
        
        //display output
        System.out.println("Hello " + name + ". Next year you will be " + (age + 1));
    }
}
