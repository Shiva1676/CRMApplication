/**
 * 
 */
package demo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import browserFactory.StartBrowser;
import dataProviderFactory.ObjectFactory;

/**
 * @author Lenovo
 *
 */
public class Test1 {

	WebDriver driver;

	@Test
	public void startBrowser() {

		driver = StartBrowser.getBrowser(ObjectFactory.getConfig().getBrowser(), ObjectFactory.getConfig().getURL());

	}

}
