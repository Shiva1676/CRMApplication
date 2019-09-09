/**
 * 
 */
package browserFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author Lenovo
 *
 */
public class StartBrowser {

	static WebDriver driver;

	public static WebDriver getBrowser(String browser, String url) {

		if (browser.equalsIgnoreCase("Chrome")) {

			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("Firefox")) {

			driver = new FirefoxDriver();
			
		} else if (browser.equalsIgnoreCase("IE")) {

			driver = new InternetExplorerDriver();
		}

		System.out.println("The following browser is running on:"+ browser);
		
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get(url);

		return driver;
	}

}
