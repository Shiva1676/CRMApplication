/**
 * 
 */
package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class AlertDemo {

	@Test
	public void test() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

		driver.findElement(By.xpath("//button[text()= 'Click me!']")).click();
		
		String text = driver.switchTo().alert().getText();
		
		System.out.println(text);

		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(2000);

		alt.accept();

	}
}
