/**
 * 
 */
package dateFormatConcepts;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class Convert_UTC_time_zone {

	@Test
	public void test(){

		
		// create Date object
				Date date = new Date();

				// print default date
				System.out.println("Default Date :" + date.toString());

				// print Syatem Date in specific format
				System.out.println("System Date : " + dateToString(date, "dd MMM yyyy hh:mm:ss a", null));

				// print System Date in IST
				System.out.println("System Date in IST : " + dateToString(date, "dd MMM yyyy hh:mm:ss a", "IST"));

				// print System Date in PST
				System.out.println("System Date in PST : " + dateToString(date, "dd MMM yyyy hh:mm:ss a", "PST"));

				// print System Date in GMT
				System.out.println("System Date in GMT : " + dateToString(date, "dd MMM yyyy hh:mm:ss a", "GMT"));
		
		
	}
	
	public static String dateToString(Date date, String format, String timeZone) {

		// create SimpleDateFormat object
		SimpleDateFormat sdf = new SimpleDateFormat(format);

		// default system timezone if passed null or empty
		if (timeZone == null || "".equalsIgnoreCase(timeZone.trim())) {

			timeZone = Calendar.getInstance().getTimeZone().getID();

		}

		// set timezone to SimpleDateFormat
		sdf.setTimeZone(TimeZone.getTimeZone(timeZone));

		// return Date in required format with timezone as String
		return sdf.format(date);

	}



}
