/**
 * 
 */
package basics;

import java.util.Set;
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
public class HandlingMultipleWindows1 {

	@Test
	public void test() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://naukri.com");

		String parentID = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();

		System.out.println("The parent id is:" + parentID);
		System.out.println("The total number of windows are:" + (allWindows.size() - 1));

		for (String windows : allWindows) {

			if (!parentID.equalsIgnoreCase(windows)) {

				driver.switchTo().window(windows);

				String text = driver.getTitle();

				System.out.println(text);

				driver.close();

			}
		}

		driver.switchTo().window(parentID);

		try {
			driver.findElement(By.xpath("//span[text()= 'Later']")).click();
		} catch (Exception e) {
			System.out.println("Element not found");
			System.out.println(e.getMessage());
		}

		driver.findElement(By.xpath("//a[contains(@href, '/browse-jobs')]")).click();

		Set<String> childWindowNew = driver.getWindowHandles();

		for (String ele1 : childWindowNew) {

			if (!parentID.equalsIgnoreCase(ele1)) {

				driver.switchTo().window(ele1);

				System.out.println("The title is:" + driver.getTitle());
				System.out.println("The url is:" + driver.getCurrentUrl());

				driver.findElement(By.name("qp")).sendKeys("Selenium");
				WebElement dropDown = driver.findElement(By.xpath("//*[@type= 'text']//following::input[2]"));

				dropDown.click();

			}
		}

	}

}
