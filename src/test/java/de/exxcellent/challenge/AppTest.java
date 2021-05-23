package de.exxcellent.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.exxcellent.challenge.objects.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Example JUnit 5 test case.
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
class AppTest {

    private String successLabel = "not successful";

    @BeforeEach
    void setUp() {
        successLabel = "successful";
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
        //create test objects
        Item item1 = new Item(1, 1, 10);
        Item item2 = new Item(2, 12, 8);
        Item item3 = new Item(3, -2, 15);
        Item item4 = new Item(4, 4, -8);
        
    	assertEquals( 9, item1.getTemperatureSpread());
    	assertEquals( 4, item2.getTemperatureSpread());
    	assertEquals( 17, item3.getTemperatureSpread());
    	assertEquals( 12, item4.getTemperatureSpread());
    }
    

}