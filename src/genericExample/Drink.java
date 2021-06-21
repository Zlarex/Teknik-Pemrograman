/**
 * @author Ihsan Fauzan Hanif
 */

package genericExample;

public class Drink extends Consumable
{
	private boolean isHotDrink;
	public Drink(String name, int price, boolean isHotDrink)
	{
		super.setName(name);
		super.setPrice(price);
		this.isHotDrink = isHotDrink;
	}
	@Override
	public String toString()
	{
		return super.getName() + " adalah minuman " + (isHotDrink? "hangat" : "dingin") + " seharga Rp. " + super.getPrice();
	}
}
