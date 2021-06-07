/**
 * @author Ihsan Fauzan Hanif
 * 
 * Status.java
 * Struktur dari Status
 */
package javacollection;

public class Status
{
	/**
	 * Member dari Status
	 */
	private int code;
	private String description;
	
	/**
	 * Accessor dan Mutator
	 */
	public int getCode() { return code;	}
	public String getDescription() { return description; }
	public void setCode(int code) { this.code = code; }
	public void setDescription(String description) { this.description = description; }
}
