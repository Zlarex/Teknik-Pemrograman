package listing4_6;

import listing4_7.*;
import static java.lang.System.*;
/**
 * This program demonstrate the use of packages.
 * @version 1 2021-04-12
 * @author Ihsan Fauzan Hanif
 */
public class PackageTest
{
	public static void main(String[] args)
	{
		// because of the import statement, we don't have to use
		// com.horstman.corejava.Employee here
		Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		harry.raiseSalary(5);
		
		// because of the static import statement, we don't have to use System.out here
		out.println("name=" + harry.getName() + ", salary=" + harry.getSalary());
	}
}
