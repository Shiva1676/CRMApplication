/**
 * 
 */
package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class MouseHoverDemo {

	WebDriver driver;

	@BeforeSuite
	public void setUpBrowser() {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("Browser started");

		driver.get("https://demo.nslhub.com/");
	}

	@Test
	public void verifyLoginPage() throws InterruptedException {

		LoginPage_NSLHUB login = PageFactory.initElements(driver, LoginPage_NSLHUB.class);

		login.nslHubLoginMethod("test@nslhub.com", "test");
	}

}
