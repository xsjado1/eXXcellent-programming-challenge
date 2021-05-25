package de.exxcellent.challenge.fileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import de.exxcellent.challenge.lists.CustomList;
import de.exxcellent.challenge.lists.ItemList;
import de.exxcellent.challenge.objects.Item2Props;

public class CsvReader implements Reader {
	
	private String path;
	
	
	public CsvReader(String path) {
		this.path = path;
	}
	
	@Override
	public CustomList readColumns(String primaryKey, String col1, String col2) {
		
		CustomList itemList = new ItemList();
		
		try {
			FileReader fr = new FileReader(getClass().getResource(path).getFile());
			BufferedReader br = new BufferedReader(fr);
			String line;
			String[] header = br.readLine().split(",");
			
			int i1 = getIndexOfStringInArray(primaryKey, header);
			int i2 = getIndexOfStringInArray(col1, header);
			int i3 = getIndexOfStringInArray(col2, header);
			
			while((line = br.readLine()) != null) {
					String[] values = line.split(",");
					Item2Props item = new Item2Props(values[i1], Integer.valueOf(values[i2]),Integer.valueOf(values[i3]));
					itemList.addItem(item);
			}
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return itemList;
	}
	
	
	/**
	 * This functions returns the index of a string in an array.
	 * If the array does not contain the string it returns -1
	 * @param string string to find in the array
	 * @param array array of string 
	 * @return the index of the string in the array or -1
	 */
	private int getIndexOfStringInArray(String string, String[] array) {
		for(int i = 0; i < array.length; i++) {
			if(string.equals(array[i]))
				return i;
		}
		return -1;
	}

}
