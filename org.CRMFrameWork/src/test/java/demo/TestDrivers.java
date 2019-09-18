package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDrivers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* String path =
		 "C:\\Users\\Lenovo\\git\\CRMApplication\\org.CRMFrameWork\\DriversInfo\\chromedriver.exe";
         System.setProperty("webdriver.chrome.driver", path);*/
		
		/*File file = new File("C:/Selenium/iexploredriver.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		WebDriver driver = new InternetExplorerDriver();
		

		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe"); */

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		System.out.println("Welcome to browser testing");

	}

}
