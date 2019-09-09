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
public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "email")
	WebElement userName;

	@FindBy(how = How.NAME, using = "password")
	WebElement password;

	@FindBy(how = How.XPATH, using = "//div[@class='ui fluid large blue submit button']")
	WebElement submitButton;

	@FindBy(how = How.XPATH, using = ".//span[text()= 'Mohan Kumar']")
	WebElement profile;

	public boolean loginApp(String uname, String pass) {

//		userName.clear();

		Helper.waitForWebElement(driver, userName).sendKeys(uname);

//		password.clear();

		Helper.waitForWebElement(driver, password).sendKeys(pass);

		Helper.waitForWebElement(driver, submitButton).click();

		boolean status = false;

		try {
			
			status = Helper.waitForWebElement(driver, profile).isDisplayed();
			
		} catch (Exception e) {

			System.out.println("Element not found and not able to login");
		}
		
		return status;
	}
}
