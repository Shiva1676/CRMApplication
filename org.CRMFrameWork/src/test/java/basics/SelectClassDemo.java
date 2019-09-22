/**
 * 
 */
package basics;

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
public class SelectClassDemo {

	@Test
	public void test() {

		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\Lenovo\\workspace1\\Cucumber_29_Aug_2019\\TestAutomation_QA1\\Drivers\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/");

		// Located DropDown
		WebElement dropDownElement = driver.findElement(By.id("tools"));

		Select sel = new Select(dropDownElement);
		
		//Get First selected option
		WebElement defaultCountryOption = sel.getFirstSelectedOption();
        System.out.println(defaultCountryOption.getText());
        
        //Selecting the dropdown by value
        sel.selectByValue("Cucumber");
        System.out.println(sel.getFirstSelectedOption().getText());

        //Selecting the dropdown by index
        sel.selectByIndex(0);
        
        //Selecting the dropdown by exact visible text
        sel.selectByVisibleText("Selenium");
	}

}
