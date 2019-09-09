package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusebilityClass {

//	public static WebDriver driver;
	
	public static WebElement synElement(WebDriver driver, WebElement ele) {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));

		return element;
	}
	
}
