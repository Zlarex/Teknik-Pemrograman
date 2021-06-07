/**
 * @author Ihsan Fauzan Hanif
 * 
 * ServicePackage.java
 * Struktur dari ServicePackage
 */
package javacollection;

public class ServicePackage
{
	/**
	 * Member dari ServicePackage
	 */
	private String service;
	private int value;
	
	/**
	 * Accessor dan Mutator
	 */
	public String getService() { return service; }
	public int getValue() { return value; }
	public void setService(String service) { this.service = service; }
	public void setValue(int value) { this.value = value; }
}
