/**
 * 
 */
package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class Select_DropDown_Comaparsion {

	@Test
	public void testApp() {

		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\Lenovo\\workspace1\\Cucumber_29_Aug_2019\\TestAutomation_QA1\\Drivers\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/");

		WebElement dropdDownElements = driver.findElement(By.id("tools"));

		Select sel = new Select(dropdDownElements);

		List<WebElement> values = sel.getOptions();

		List<String> actual = new ArrayList<String>();

		for (WebElement ele : values) {

			String textValues = ele.getText();
			actual.add(textValues);
		}

		List<String> expectedValue = new ArrayList<String>();

		expectedValue.add("AutoIT");
		expectedValue.add("Cucumber");
		expectedValue.add("Docker");
		expectedValue.add("Selenium");

		if (actual.equals(expectedValue)) {

			System.out.println("Test case pass");
		} else {

			System.out.println("Test case Fail");
		}

	}
}
