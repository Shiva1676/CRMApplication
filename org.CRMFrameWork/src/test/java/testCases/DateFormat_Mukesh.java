/**
 * 
 */
package testCases;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Lenovo
 *
 */
public class DateFormat_Mukesh {

	public static void main(String[] args) {

		// Create object of SimpleDateFormat class and decide the format
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");

		// get current date time with Date()
		Date date = new Date();

		// Now format the date
		String date1 = dateFormat.format(date);

		// Print the Date
		System.out.println(date1);

	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * // Create object of SimpleDateFormat class and decide the format
	 * DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	 * 
	 * //get current date time with Date() Date date = new Date();
	 * 
	 * // Now format the date String date1= dateFormat.format(date);
	 * 
	 * // Print the Date System.out.println("Current date and time is " +date1);
	 * 
	 * }
	 */

}
