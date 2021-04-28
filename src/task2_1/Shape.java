package task2_1;

public class Shape
{
	/**
	 * Write a superclass called Shape (as shown in the class diagram), which contains:
	 * • Two instance variables color (String) and filled (boolean).
	 * • Two constructors: a no-arg (no-argument) constructor that initializes the color to "green" 
	 * and filled to true, and a constructor that initializes the color and filled to the given values.
	 * • Getter and setter for all the instance variables. By convention, the getter for 
	 * a boolean variable xxx is called isXXX() (instead of getXxx() for all the other types).
	 * • A toString() method that returns "A Shape with color of xxx and filled/Not filled"
	 */
	private String color;
	private boolean filled;
	
	public Shape() // --> no args constructor
	{
		color = "green";
		filled = true;
	}
	public Shape(String color, boolean filled) // --> args constructor 
	{
		this.color = color;
		this.filled = filled;
	}
	// --> getter & setter (accessor & mutator)
	public String getColor() { return color; }
	public boolean isFilled() { return filled; }
	public void setColor(String color) { this.color = color; }
	public void setFilled(boolean filled) { this.filled = filled; }
	// --> to string
	public String toString()
	{
		return "A Shape with color of " + color + " and " + ((filled)? "filled" : "not filled");
	}
}
