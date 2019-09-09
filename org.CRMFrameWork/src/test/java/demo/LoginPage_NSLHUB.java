package demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage_NSLHUB {

	WebDriver driver;

	public LoginPage_NSLHUB(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "username")
	WebElement userName;

	@FindBy(how = How.ID, using = "password")
	WebElement passWord;

	// @FindBy(how = How.XPATH, using = ".//div[text()='Login']")
	@FindBy(how = How.ID, using = "login")
	WebElement loginButton;

	@FindBy(how = How.XPATH, using = "//*[@id='nsl-side-bar']//li[5]/a/span[1]")
	WebElement solutionArchitectButton;

	@FindBy(how = How.NAME, using = "lookinggsiName")
	WebElement textButton;

	@FindBy(how = How.XPATH, using = ".//button[text()= 'Next']")
	WebElement nextButton;

	@FindBy(how = How.XPATH, using = ".//span[text()= 'Solution Architect']")
	WebElement solutionText;

	public void nslHubLoginMethod(String uname, String pass) throws InterruptedException {

		userName.clear();

		ReusebilityClass.synElement(driver, userName).sendKeys(uname);

		passWord.clear();

		ReusebilityClass.synElement(driver, passWord).sendKeys(pass);

		passWord.sendKeys(Keys.ENTER);

		Actions action = new Actions(driver);

		action.moveToElement(solutionArchitectButton).perform();

		boolean status = ReusebilityClass.synElement(driver, solutionText).isDisplayed();

		if (status == true) {

			ReusebilityClass.synElement(driver, solutionText).click();

		} else {

			System.out.println("Element not found");
		}

		ReusebilityClass.synElement(driver, textButton).sendKeys("TestData");
		
//		ReusebilityClass.synElement(driver, nextButton);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click()", nextButton);

		/*boolean status1 = false;

		while (!status1) {

			try {
				ReusebilityClass.synElement(driver, nextButton).click();

				break;

			} catch (Exception e) {

				System.out.println("Element not found");
			}

		}
*/
	}
}
