package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utility.Helper;

public class CompaniesPage {

	WebDriver driver;

	public CompaniesPage(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = ".//span[text()= 'Companies")
	WebElement companiesButton;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'New')]")
	WebElement newButton;

	@FindBy(how = How.NAME, using = "name")
	WebElement companyName;

	@FindBy(how = How.XPATH, using = "//input[@name='url']")
	WebElement webSite;
	
	@FindBy(how = How.XPATH, using = "//div[@name='hint']//input[@class='search']")
	WebElement dropDown;

	@FindBy(how = How.NAME, using = "value")
	WebElement phoneNumber;
	
	@FindBy(how = How.XPATH, using = "//button[@class='ui linkedin button']")
	WebElement saveButton;

	public void getCompaniesPage(String CompanyName, String WebSite){
		
		Helper.waitForWebElement(driver, companiesButton).click();
		
		Helper.waitForWebElement(driver, newButton).click();
		
		companyName.clear();
		
		Helper.waitForWebElement(driver, companyName).sendKeys(CompanyName);
		
		webSite.clear();
		
		Helper.waitForWebElement(driver, webSite).sendKeys(WebSite);
	}
	
	
}
