package lat7_3;

public class Employee extends StaffMember
{
	protected String socialSecurityNumber;
	protected double payRate;
	
	public Employee(String name, String address, String phone, String socialSecurityNumber, double payRate)
	{
		super(name, address, phone);
		this.socialSecurityNumber = socialSecurityNumber;
		this.payRate = payRate;
	}
	public String toString()
	{
		String result = super.toString();
		result += "\nSocial Security Number: " + socialSecurityNumber;
		return result;
	}
	public double pay()
	{
		return payRate;
	}
}
