package lat7_3;

abstract public class StaffMember
{
	protected String name;
	protected String address;
	protected String phone;
	
	public StaffMember(String name, String address, String phone)
	{
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public String toString()
	{
		String result = "Name: " + name + "\n";
		result += "Address: " + address + "\n";
		result += "Phone: " + phone + "\n";
		return result;
	}
	public abstract double pay();
}
