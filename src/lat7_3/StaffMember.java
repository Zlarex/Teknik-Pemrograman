package lat7_3;
/**
 * Represents a generic staff member.
 */
abstract public class StaffMember
{
	protected String name;
	protected String address;
	protected String phone;
	/**
	 * Sets up staff member using the specified information.
	 */
	public StaffMember(String name, String address, String phone)
	{
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	/**
	 * Returns string include the basic employee information
	 */
	public String toString()
	{
		String result = "Name: " + name + "\n";
		result += "Address: " + address + "\n";
		result += "Phone: " + phone + "\n";
		return result;
	}
	/**
	 * Derived classes must define the pay method for each type of employee.
	 */
	public abstract double pay();
}
