package lat7_3;

public class Executive extends Employee
{
	private double bonus;
	public Executive(String name, String address, String phone, String socialSecurityNumber, double payRate)
	{
		super(name, address, phone, socialSecurityNumber, payRate);
		this.bonus = 0;
	}
	public void awardBonus(double execBonus)
	{
		bonus = execBonus;
	}
	public double pay()
	{
		double payment = super.pay() + bonus;
		bonus = 0;
		return payment;
	}
}
