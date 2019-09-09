/**
 * 
 */
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utility.Helper;

/**
 * @author Lenovo
 *
 */
public class LogOutPage {

	WebDriver driver;

	public LogOutPage(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = ".//div[@role= 'listbox' and @class = 'ui basic button floating item dropdown']")
	WebElement logoutSymbolButton;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Log Out')]")
	WebElement logoutButton;

	public void logoutDetails() {

		Helper.waitForWebElement(driver, logoutSymbolButton).click();

		Helper.waitForWebElement(driver, logoutButton).click();
	}

}
