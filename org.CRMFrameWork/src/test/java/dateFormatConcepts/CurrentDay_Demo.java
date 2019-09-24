/**
 * 
 */
package dateFormatConcepts;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class CurrentDay_Demo {

	@Test
	public void currentDateTest() {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		
		// Calling the method
		String todaysDate = getCurrentDay();
		System.out.println("Todays Date is:" + todaysDate + "\n");
		
		//click and open the datePicker
		driver.findElement(By.id("datepicker")).click();
		List<WebElement> allDates = driver.findElements(By.xpath("//table//tbody/tr/td/a"));
		for(WebElement ele: allDates){
			
			String currentdate = ele.getText();
			
			if(currentdate.equals(todaysDate)){
				
				ele.click();
				break;
			}
		}
		
	}

	public String getCurrentDay() {
		// Create a Calendar Object
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());

		// Get Current Day as a number
		int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("Today Int: " + todayInt + "\n");

		// Integer to String Conversion
		String todayStr = Integer.toString(todayInt);
		System.out.println("Today Str: " + todayStr + "\n");

		return todayStr;
	}
	/*
	 * @Test public void dateTesting(){
	 * 
	 * System.out.println("Date testing");
	 * 
	 * Calendar now = Calendar.getInstance(); //
	 * System.out.println("Current Year is : " + now.get(Calendar.YEAR)); //
	 * month start from 0 to 11 System.out.println("Current Month is : " +
	 * (now.get(Calendar.MONTH) + 1)); System.out.println("Current Date is : " +
	 * now.get(Calendar.DATE)); }
	 */

}
