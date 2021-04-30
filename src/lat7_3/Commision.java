package lat7_3;

// Write a class named Commission. It extends the Hourly class
public class Commision extends Hourly
{
	// It has two instance variables (in addition to those inherited):
	// --> One is the total sales the employee has made (type double)
	private double totalSales;
	// --> second is the commission rate for the employee (the commission rate will be type double and will represent the 
	//     percent (in decimal form) commission the employee earns on sales (so .2 would mean the employee earns 20% 
	//     commission on sales))
	private double commisionRate;
	// The constructor takes 6 parameters: the first 5 are the same as for Hourly (name, address, phone number, 
	// social security number, hourly pay rate) the 6th is the commission rate for the employee
	public Commision(String name, String address, String phone, String socialSecurityNumber, double payRate, double commisionRate)
	{
		// The constructor should call the constructor of the parent class with the first 5 parameters
		super(name, address, phone, socialSecurityNumber, payRate);
		// then use the 6th to set the commission rate
		this.commisionRate = commisionRate;
		this.totalSales = 0;
	}
	// One additional method is needed. that adds the parameter to the instance variable representing total sales
	public void addSales(double totalSales)
	{
		this.totalSales += totalSales;
	}
	// The pay method
	@Override
	public double pay()
	{
		// Must call the pay method of the parent class to compute the pay for hours worked 
		double payment = super.pay();
		// then add to that the pay from commission on sales
		payment += (totalSales * commisionRate);
		// The total sales should be set back to 0
		totalSales = 0;
		//(note: you don't need to set the hoursWorked back to 0—why not?).
		// --> Because the parent method (that called by super.pay()) sets the hoursWorked to zero. If we set it again
		//     then that means twice the work.
		return payment;
	}
	// The toString method
	@Override
	public String toString()
	{
		// It needs to call the toString method of the parent class
		String result = super.toString() + "\n"
				+ "total sales: " + totalSales;
		// then add the total sales to that.
		return result;
	}
}
