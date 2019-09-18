/**
 * 
 */
package testCases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.apache.poi.poifs.crypt.dsig.services.TimeStampServiceValidator;
import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class DateFormat_Demo {

	@Test
	public void test() {

		/*Calendar calendar = Calendar.getInstance(TimeZone.getDefault());

		// Get Current Day as a number
		int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("Today Int: " + todayInt + "\n");
		
		Date timeVariable = calendar.getTime();
		
		System.out.println(timeVariable);
		
		

		// Integer to String Conversion
		String todayStr = Integer.toString(todayInt);
		System.out.println("Today Str: " + todayStr + "\n");
*/
		
		DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;

		String formattedDate = formatter.format(LocalDate.now());
		System.out.println(formattedDate + " ");
		
		
	}

}
