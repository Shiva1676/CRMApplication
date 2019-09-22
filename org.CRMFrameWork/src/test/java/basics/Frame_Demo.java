/**
 * 
 */
package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class Frame_Demo {

	@Test
	public void test() {
        
		// Browser notification pop-ups
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");

		WebElement iconProfile = driver.findElement(By.id("i-icon-profile"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", iconProfile);

		WebElement signInButton = driver.findElement(By.id("signInLink"));
		executor.executeScript("arguments[0].click();", signInButton);

		WebElement frameData = driver.findElement(By.xpath("//iframe[contains(@src, '=Home&noReload=noReload')]"));
		driver.switchTo().frame(frameData);

		driver.findElement(By.xpath("//span[text()= 'Sign in with Google']")).click();

	}
}
