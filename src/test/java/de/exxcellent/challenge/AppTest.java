package de.exxcellent.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.exxcellent.challenge.fileReader.CsvReader;
import de.exxcellent.challenge.lists.CustomList;
import de.exxcellent.challenge.lists.ItemList;
import de.exxcellent.challenge.objects.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Example JUnit 5 test case.
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
class AppTest {

    private String successLabel = "not successful";
    
    private Item2Props item1, item2, item3, item4;
    private CustomList itemList;
    private CustomList temperatures;
    

    @BeforeEach
    void setUp() {
        successLabel = "successful";
        
        itemList = new ItemList();
        item1 = new Item2Props("1", 1, 10);
        item2 = new Item2Props("2", 12, 8);
        item3 = new Item2Props("3", -2, 15);
        item4 = new Item2Props("4", 4, -8);
        itemList.addItem(item1);
    	itemList.addItem(item2);
    	itemList.addItem(item3);
    	itemList.addItem(item4);
    	
    	
    	String path = "/de/exxcellent/challenge/weather.csv";
    	CsvReader csvReader = new CsvReader(path);
    	temperatures = csvReader.readColumns("Day","MxT","MnT");
    	
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
    void absoluteDifferenceTest() {
        
    	assertEquals( 9, item1.getAbsoluteDifference());
    	assertEquals( 4, item2.getAbsoluteDifference());
    	assertEquals( 17, item3.getAbsoluteDifference());
    	assertEquals( 12, item4.getAbsoluteDifference());
    }
    
    @Test
    void csvReaderTest() {
    	assertEquals(30, temperatures.getSize());
    }
    
    @Test
    void comparatorTest() {
    	
    	itemList.sortAscending();
    	
    	assertEquals("2", itemList.getItem(0).getPrimaryKey());
    	assertEquals("1", itemList.getItem(1).getPrimaryKey());
    	assertEquals("4", itemList.getItem(2).getPrimaryKey());
    	assertEquals("3", itemList.getItem(3).getPrimaryKey());
    	
    	itemList.sortDescending();
    	
    	assertEquals("3", itemList.getItem(0).getPrimaryKey());
    	assertEquals("4", itemList.getItem(1).getPrimaryKey());
    	assertEquals("1", itemList.getItem(2).getPrimaryKey());
    	assertEquals("2", itemList.getItem(3).getPrimaryKey());
    	
    }
    

}