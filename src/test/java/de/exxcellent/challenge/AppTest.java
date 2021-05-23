package de.exxcellent.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.exxcellent.challenge.fileReader.CsvReader;
import de.exxcellent.challenge.lists.ItemList;
import de.exxcellent.challenge.objects.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Example JUnit 5 test case.
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
class AppTest {

    private String successLabel = "not successful";
    
    private Item item1, item2, item3, item4;
    private ItemList itemList;
    private ItemList temperatures;
    

    @BeforeEach
    void setUp() {
        successLabel = "successful";
        
        itemList = new ItemList();
        item1 = new Item(1, 1, 10);
        item2 = new Item(2, 12, 8);
        item3 = new Item(3, -2, 15);
        item4 = new Item(4, 4, -8);
        itemList.addItem(item1);
    	itemList.addItem(item2);
    	itemList.addItem(item3);
    	itemList.addItem(item4);
    	
    	
    	String path = "/de/exxcellent/challenge/weather.csv";
    	CsvReader csvReader = new CsvReader(path);
    	temperatures = csvReader.read();
    	
    }

    @Test
    void aPointlessTest() {
        assertEquals("successful", successLabel, "My expectations were not met");
    }

    @Test
    void runFootball() {
        App.main("--football", "football.csv");
    }
    
    

    
    @Test
    void temperatureSpreadTest() {
        
    	assertEquals( 9, item1.getTemperatureSpread());
    	assertEquals( 4, item2.getTemperatureSpread());
    	assertEquals( 17, item3.getTemperatureSpread());
    	assertEquals( 12, item4.getTemperatureSpread());
    }
    
    @Test
    void csvReaderTest() {
    	assertEquals(30, temperatures.getSize());
    }
    
    @Test
    void comparatorTest() {
    	
    	itemList.sortAscending();
    	
    	assertEquals(2, itemList.getItem(0).getDay());
    	assertEquals(1, itemList.getItem(1).getDay());
    	assertEquals(4, itemList.getItem(2).getDay());
    	assertEquals(3, itemList.getItem(3).getDay());
    	
    	itemList.sortDescending();
    	
    	assertEquals(3, itemList.getItem(0).getDay());
    	assertEquals(4, itemList.getItem(1).getDay());
    	assertEquals(1, itemList.getItem(2).getDay());
    	assertEquals(2, itemList.getItem(3).getDay());
    	
    }
    

}