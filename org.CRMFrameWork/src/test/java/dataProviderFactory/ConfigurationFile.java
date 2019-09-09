/**
 * 
 */
package dataProviderFactory;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

/**
 * @author Lenovo
 *
 */
public class ConfigurationFile {

	Properties pro;

	WebDriver driver;

	public ConfigurationFile() {

		String path = System.getProperty("user.dir") + "/Configuration/config.properties";

		File src = new File(path);

		try {
			FileInputStream fis = new FileInputStream(src);

			pro = new Properties();

			pro.load(fis);

		} catch (Exception e) {

			System.out.println("=======Unable to load config file===========");

			System.out.println(e.getMessage());
		}

	}

	public String getBrowser() {

		String browserName = pro.getProperty("browser");

		return browserName;
	}

	public String getURL() {

		String urlData = pro.getProperty("url");

		return urlData;
	}

}
