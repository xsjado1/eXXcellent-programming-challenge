package de.exxcellent.challenge.lists;

import java.util.ArrayList;
import de.exxcellent.challenge.objects.*;

public class ItemList {
	
	private ArrayList<Item> list;
	
	public ItemList() {
		this.list = new ArrayList<Item>();
	}
	
	
	public Item getItem(int i) {
		if(i < list.size() && i >= 0) {
			return list.get(i);
		}
		else {
			return null;
		}
	}
	
	public void addItem(Item item) {
		list.add(item);
	}
	
	public int getSize() {
		return list.size();
	}

}
