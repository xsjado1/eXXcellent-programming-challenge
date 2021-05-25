package de.exxcellent.challenge.fileReader;

/**
 * This is a interface to implement a file reader.
 * In the class the path must be defined in the constructor.
 * And its function must be implemented, that reads the
 * primary key and the and the selected columns to it. 
 * @author Sebastian Jestaedt
 *
 */

import de.exxcellent.challenge.lists.CustomList;

public interface Reader {
	
	/***
	 * This function reads the file of the path, that was defined in the object. 
	 * For this purpose, the headings of the columns to be read, must be entered.
	 * These are then returned as a list.
	 * @param primaryKey the header name of the primary key column
	 * @param col1	the header name of the column that should be read
	 * @param col2	the header name of the column that should be read
	 * @return list of items containing the imported data
	 */
	public CustomList readColumns(String primaryKey, String col1, String col2) ;

}
