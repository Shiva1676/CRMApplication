/**
 * 
 */
package basics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class HandlingMultipleWindows {

	@Test
	public void test() {

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

				if (!text.equalsIgnoreCase("Adtran")) {

					driver.close();

				}

			}
		}

		driver.switchTo().window(parentID);

	}

}
