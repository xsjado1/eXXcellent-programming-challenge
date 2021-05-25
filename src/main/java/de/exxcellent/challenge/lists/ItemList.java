package de.exxcellent.challenge.lists;


import de.exxcellent.challenge.comparators.ItemAscendingComparator;
import de.exxcellent.challenge.comparators.ItemDescendingComparator;

public class ItemList extends CustomList {
	
	
	public void sortAscending() {
		list.sort(new ItemAscendingComparator());		
	}
	
	
	public void sortDescending() {
		list.sort(new ItemDescendingComparator());	
	}

}
