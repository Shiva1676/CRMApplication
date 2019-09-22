/**
 * 
 */
package dateFormatConcepts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Lenovo
 *
 */
public class Date_Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy  HH:mm:ss");
		
		Date date = new Date();
		
		String date1 = dateformat.format(date);
		
		System.out.println(date1);
		
	}

} 
