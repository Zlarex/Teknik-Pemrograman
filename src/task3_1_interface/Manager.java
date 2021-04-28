package task3_1_interface;

import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Imagine that we want to order the Managers in a similar way :
 * class Managers extends Employee extends Sortable
 * It will be work?
 * No, it wont, as java only supports one level inheritance (only one parent
 * per class).
 * What is your solution?
 * The employee class is already inherited the Sortable class
 * so we don't need to extends the Manager class to Sortable class.
 * 
 * But if the problem is about to make Manager class having the custom compare logic
 * then we can add the implement the class with the Sortable interface
 * (package: task3_1_interface)
 */

public class Manager extends Employee implements Sortable
{
	private String secretaryName;
	public Manager(String n, double s, int d, int m, int y)
	{
		super(n, s, d, m, y);
		secretaryName = "";
	}
	public void raiseSalary(double byPercent)
	{
		// add 1/2 % bonus for every year of service
		GregorianCalendar todaysDate = new GregorianCalendar();
		int currentYear = todaysDate.get(Calendar.YEAR);
		double bonus = 0.5 * (currentYear - hireYear());
		super.raiseSalary(byPercent + bonus);
	}
	public String getSecretaryName() { return secretaryName; }
	// implementation of abstract method from interface
	// public int compare(Sortable b)
	// {
	//    
	//    return 0;
	// }
}
