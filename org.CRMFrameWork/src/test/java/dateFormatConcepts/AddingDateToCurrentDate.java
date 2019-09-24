/**
 * 
 */
package dateFormatConcepts;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class AddingDateToCurrentDate {

	@Test
	public void currentdateTest() {

		// Calendar c = Calendar.getInstance();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		// Getting current date
		Calendar cal = Calendar.getInstance();

		// Displaying current date in the desired format
		System.out.println(sdf.format(cal.getTime()));

		// Number of days to add
		cal.add(Calendar.DAY_OF_MONTH, 7);
		
		
	/*	// Adding year 
		cal.add(Calendar.YEAR, 1);
		String year = sdf.format(cal.getTime());
		System.out.println("After modification of the year is:"+year);*/
		
		

		// Date after adding the days to the current days
		String newDate = sdf.format(cal.getTime());

		// Displaying the new Date after addition of dayto current date
		System.out.println("Date after addition:" + newDate);

	}

}
