package de.exxcellent.challenge.lists;


import de.exxcellent.challenge.comparators.ItemAscendingComparator;
import de.exxcellent.challenge.comparators.ItemDescendingComparator;
import de.exxcellent.challenge.objects.Item;

public class ItemList extends CustomList {
	
	
	public void sortAscending() {
		list.sort(new ItemAscendingComparator());		
	}
	
	
	public void sortDescending() {
		list.sort(new ItemDescendingComparator());	
	}


	@Override
	public Item getItemSmallestAbsDifference() {
		sortAscending();
		return list.get(0);
	}

}
