package de.exxcellent.challenge.objects;

/**
 * This class implements the item interface with three properties.
 * @author Sebastian Jestaedt
 *
 */

public class Item3Props implements Item {
	
	private String primaryKey;
	private String prop1;
	private int prop2;
	private int prop3;
	
	
	public Item3Props(String primaryKey, String prop1, int prop2, int prop3) {
		this.primaryKey = primaryKey;
		this.prop1 = prop1;
		this.prop2 = prop2;
		this.prop3 = prop3;
	}

	@Override
	public String getPrimaryKey() {
		return this.primaryKey;
	}

	@Override
	public int getAbsoluteDifference() {
		int spread = Math.abs(prop2 - prop3);
		return spread;
	}
	
	


}
