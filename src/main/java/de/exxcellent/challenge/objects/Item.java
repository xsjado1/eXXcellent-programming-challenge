package de.exxcellent.challenge.objects;

/**
 * This is an interface to implement an item of the table.
 * An item consists of a primary key and a certain number of properties.
 * It provides two methods to return the primary key and 
 * to calculate the absolute difference of two properties. 
 * @author Sebastian Jestaedt
 *
 */

public interface Item {
	
	/***
	 * This method returns the primary key of the list object. 
	 * @return the primary as String.
	 */
	public String getPrimaryKey();
	
	/**
	 * This method calculates the absolute difference of two properties.
	 * @return the absolute difference of two properties as int.
	 */
	public int getAbsoluteDifference();

}
