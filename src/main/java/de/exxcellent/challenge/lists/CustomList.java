package de.exxcellent.challenge.lists;

/**
 * This is an abstract class to implement a list including items.
 * A few standard methods of a list are already implemented here.
 * The functions to sort the list must be implemented
 * @author Sebastian Jestaedt
 *
 */

import java.util.ArrayList;
import de.exxcellent.challenge.objects.Item;


abstract public class CustomList {
	
	protected ArrayList<Item> list;
	
	/**
	 * Constructor to create a list 
	 */
	public CustomList() {
		this.list = new ArrayList<Item>();
	}
	
	/**
	 * This method returns the item of index i.
	 * If i is smaller then 0 or higher as the list size, 
	 * it returns null
	 * @param i index of the item to return 
	 * @return returns the item or null
	 */
	public Item getItem(int i) {
		if(i < list.size() && i >= 0) {
			return list.get(i);
		}
		else {
			return null;
		}
	}
	
	/**
	 * This method adds an item to the list 
	 * @param item the item to be added
	 */
	public void addItem(Item item) {
		list.add(item);
	}
	
	/**
	 * This method returns the size of the list.
	 * @return the this of the list 
	 */
	public int getSize() {
		return list.size();
	}
		
	/**
	 * This method sorts the list in ascending order.
	 */
	public abstract void sortAscending();
	
	/**
	 * This method sorts the list in descending order.
	 */
	public abstract void sortDescending();

}
