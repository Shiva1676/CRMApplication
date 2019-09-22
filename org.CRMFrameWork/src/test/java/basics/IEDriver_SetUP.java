/**
 * 
 */
package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class IEDriver_SetUP {

	WebDriver driver;

	private String const_ieDriver = "C:\\Users\\Lenovo\\workspace1\\Cucumber_29_Aug_2019\\TestAutomation_QA1\\Drivers";

	private String const_iePath = "\\IEDriverServer.exe";

	@Test
	public void test() {

		// System.setProperty("webdriver.ie.driver",
		// "C:\\Users\\Lenovo\\workspace1\\Cucumber_29_Aug_2019\\TestAutomation_QA1\\Drivers\\IEDriverServer.exe");

		System.setProperty("webdriver.ie.driver", const_ieDriver + const_iePath);
		driver = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		WebElement submitButton = driver.findElement(By.xpath(".//*[@id= 'divUsername']//following::input[3]"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", submitButton);

		WebElement welcomeButton = driver.findElement(By.partialLinkText("Welcome"));
		executor.executeScript("arguments[0].click();", welcomeButton);
//		welcomeButton.click();

		WebElement aboutButton = driver.findElement(By.xpath("//a[@id='aboutDisplayLink']"));
		executor.executeScript("arguments[0].click();", aboutButton);

		List<WebElement> allLists = driver.findElements(By.xpath("//div[@class='modal-body']//ul//li"));

		for (WebElement ele : allLists) {

			String text = ele.getAttribute("innerHTML");

			System.out.println(text);
		}

		System.out.println("The title of the application is:" + driver.getTitle());

	}

}
