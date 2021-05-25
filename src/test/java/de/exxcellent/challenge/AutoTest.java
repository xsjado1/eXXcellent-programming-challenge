package de.exxcellent.challenge;

/**
 * This class implements tests for creating new scenarios using the interfaces. 
 * In this scenario, cars are created with their consumption inside and outside the city.
 * These are then to be sorted based on their difference in consumption.
 *
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import de.exxcellent.challenge.lists.ItemList;
import de.exxcellent.challenge.lists.CustomList;
import de.exxcellent.challenge.objects.Item3Props;

class AutoTest {


    private Item3Props car1,car2,car3;
    private CustomList carList;
 
    

    @BeforeEach
    void setUp() {
        
    	carList = new ItemList();
    	car1 = new Item3Props("BMW X6", "Diesel", 12, 7);
    	car2 = new Item3Props("BMW X5", "Benzin", 15, 9);
    	car3 = new Item3Props("AUDI Q7", "Benzin", 15, 11);

    	carList.addItem(car1);
    	carList.addItem(car2);
    	carList.addItem(car3);
    	    	
    }

  
    

    
    @Test
    void absoluteDifferenceTest() {
        
    	assertEquals( 5, car1.getAbsoluteDifference());
    	assertEquals( 6, car2.getAbsoluteDifference());
    	assertEquals( 4, car3.getAbsoluteDifference());
    }
    
    
    @Test
    void comparatorTest() {
    	
    	carList.sortAscending();
    	
    	assertEquals("AUDI Q7", carList.getItem(0).getPrimaryKey());
    	assertEquals("BMW X6", carList.getItem(1).getPrimaryKey());
    	assertEquals("BMW X5", carList.getItem(2).getPrimaryKey());
    	
    	carList.sortDescending();
    	
    	assertEquals("BMW X5", carList.getItem(0).getPrimaryKey());
    	assertEquals("BMW X6", carList.getItem(1).getPrimaryKey());
    	assertEquals("AUDI Q7", carList.getItem(2).getPrimaryKey());


    	
    }
}
