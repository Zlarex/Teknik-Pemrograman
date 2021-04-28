package listing4_7;

// The classes in this file are part of this package
import java.time.*;
public class Employee
{
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String name, double salary, int year, int month, int day)
	{
		this.name = name;
		this.salary = salary;
		this.hireDay = LocalDate.of(year, month, month);
	}
	
	public String getName() { return name; }
	public double getSalary() { return salary; }
	public LocalDate getHireDay() { return hireDay; }
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}
