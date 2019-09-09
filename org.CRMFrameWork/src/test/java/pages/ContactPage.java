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
public class ContactPage {

	WebDriver driver;

	public ContactPage(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = ".//span[text()= 'Contacts']")
	WebElement contactsButton;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'New')]")
	WebElement newButton;

	@FindBy(how = How.XPATH, using = "//input[@name='first_name']")
	WebElement firstName;

	@FindBy(how = How.XPATH, using = "//input[@name='last_name']")
	WebElement lastName;

	@FindBy(how = How.XPATH, using = "//div[@class='ui right corner labeled input']//input[@name='value']")
	WebElement email;

	@FindBy(how = How.XPATH, using = "//button[@class='ui linkedin button']")
	WebElement saveButton;

	public void getContacts(String firstname, String lastname, String emailID) {

		Helper.waitForWebElement(driver, contactsButton).click();

		Helper.waitForWebElement(driver, newButton).click();

		// firstName.clear();

		Helper.waitForWebElement(driver, firstName).sendKeys(firstname);

		// lastName.clear();

		Helper.waitForWebElement(driver, lastName).sendKeys(lastname);

		// email.clear();

		Helper.waitForWebElement(driver, email).sendKeys(emailID);

		Helper.waitForWebElement(driver, saveButton).click();

		Helper.waitForWebElement(driver, contactsButton).click();
	}

}
