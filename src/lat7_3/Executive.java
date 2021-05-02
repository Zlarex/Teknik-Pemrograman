package lat7_3;
/**
 * Represents an executive staff member, who can earn a bonus.
 */
public class Executive extends Employee
{
	private double bonus;
	/**
	 * Sets up an executive with specified information.
	 */
	public Executive(String name, String address, String phone, String socialSecurityNumber, double payRate)
	{
		super(name, address, phone, socialSecurityNumber, payRate);
		this.bonus = 0;
	}
	/**
	 * Award the specified bonus to this executive.
	 */
	public void awardBonus(double execBonus)
	{
		bonus = execBonus;
	}
	/**
	 * Computes and returns the pay for an executive, which is the
	 * regular employee payment plus a one-time bonus.
	 */
	public double pay()
	{
		double payment = super.pay() + bonus;
		bonus = 0;
		return payment;
	}
}
