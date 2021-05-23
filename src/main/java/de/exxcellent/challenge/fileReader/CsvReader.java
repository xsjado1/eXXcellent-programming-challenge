package de.exxcellent.challenge.fileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import de.exxcellent.challenge.lists.ItemList;
import de.exxcellent.challenge.objects.Item;

public class CsvReader {
	
	private String path;
	
	
	public CsvReader(String path) {
		this.path = path;
	}
	
	
	public ItemList read() {
		
		ItemList itemList = new ItemList();
		
		try {
			FileReader fr = new FileReader(getClass().getResource(path).getFile());
			BufferedReader br = new BufferedReader(fr);
			String line;
			//skip the first line 
			br.readLine();
			while((line = br.readLine()) != null) {
					String[] values = line.split(",");
					Item item = new Item(Integer.valueOf(values[0]),Integer.valueOf(values[1]),Integer.valueOf(values[2]));
					itemList.addItem(item);
			}
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return itemList;
	}
	
	
	
	

}
