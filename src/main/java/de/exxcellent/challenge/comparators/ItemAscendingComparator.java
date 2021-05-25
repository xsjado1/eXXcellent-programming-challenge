package de.exxcellent.challenge.comparators;

/**
 * This is a comparator to compare the absolute difference 
 * of two items. 
 * @author Sebastian Jestaedt
 */

import java.util.Comparator;
import de.exxcellent.challenge.objects.Item;

public class ItemAscendingComparator implements Comparator<Item>{

	@Override
	public int compare(Item item1, Item item2) {
		return Integer.compare(item1.getAbsoluteDifference(), item2.getAbsoluteDifference());
	}


}
