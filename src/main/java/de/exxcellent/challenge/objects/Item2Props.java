package de.exxcellent.challenge.objects;

/**
 * This class implements the class Item with two properties
 * @author Sebastian Jestädt
 *
 */

public class Item2Props implements Item {
	
	private String primaryKey;
	private int prop1;
	private int prop2;
	
	
	public Item2Props(String primaryKey,int prop1, int prop2) {
		this.primaryKey = primaryKey;
		this.prop1 = prop1;
		this.prop2 = prop2;
	}


	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}


	public int getProp2() {
		return prop2;
	}


	public void setProp2(int prop2) {
		this.prop2 = prop2;
	}


	public int getProp1() {
		return prop1;
	}


	public void setProp1(int prop1) {
		this.prop1 = prop1;
	}
	
	@Override
	public String getPrimaryKey() {
		return primaryKey;
	}
	
	@Override
	public int getAbsoluteDifference() {
		int spread = Math.abs(prop1 - prop2);
		return spread;
	}
	
	

}
