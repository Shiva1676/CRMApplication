/**
 * 
 */
package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class SelectClassUsingLoop {

	@Test
	public void test() {

		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\Lenovo\\workspace1\\Cucumber_29_Aug_2019\\TestAutomation_QA1\\Drivers\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/");

		WebElement dropdDownElements = driver.findElement(By.id("tools"));

		dropdDownElements.click();

		List<WebElement> listValues = driver.findElements(By.xpath("//select[@id= 'tools']//option"));

		//Using advance loop
	/*	for (WebElement ele : listValues) {

			String textValue = ele.getText();

			System.out.println(textValue);
		}*/

		//Using normal loop
		for(int i=0; i<listValues.size(); i++){
			
			WebElement ele = listValues.get(i);
			System.out.println(ele.getText());
			
		}
		
	}

}
