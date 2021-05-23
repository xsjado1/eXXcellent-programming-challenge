package de.exxcellent.challenge.comparators;

import java.util.Comparator;

import de.exxcellent.challenge.objects.Item;

public class ItemDescendingComparator implements Comparator<Item>{

	@Override
	public int compare(Item item1, Item item2) {
		return Integer.compare(item2.getTemperatureSpread(), item1.getTemperatureSpread());
	}


}
