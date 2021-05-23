package de.exxcellent.challenge;

import de.exxcellent.challenge.fileReader.CsvReader;
import de.exxcellent.challenge.lists.ItemList;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        CsvReader csvReader = new CsvReader("/de/exxcellent/challenge/weather.csv");
        ItemList temperatures = csvReader.read();
        temperatures.sortDescending();


        String dayWithSmallestTempSpread = String.valueOf(temperatures.getItem(0).getDay());     // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        String teamWithSmallestGoalSpread = "A good team"; // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
