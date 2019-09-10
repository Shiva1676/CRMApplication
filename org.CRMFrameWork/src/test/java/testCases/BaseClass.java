/**
 * 
 */
package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import browserFactory.StartBrowser;
import dataProviderFactory.ObjectFactory;

/**
 * @author Lenovo
 *
 */
public class BaseClass {

	WebDriver driver;
	
	@BeforeSuite
	public void setUpBrowser() {

		driver = StartBrowser.getBrowser(ObjectFactory.getConfig().getBrowser(), ObjectFactory.getConfig().getURL());
	}
	
	@AfterSuite
	public void closeBrowser(){
		
		driver.quit();
	}

}
