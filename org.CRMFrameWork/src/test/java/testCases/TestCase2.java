/**
 * 
 */
package testCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import dataProviderFactory.ExcelDataProvider;
import dataProviderFactory.ObjectFactory;
import pages.ContactDetails;
import pages.ContactPage;
import pages.LogOutPage;
import pages.LoginPage;
import pages.User;
import utility.Helper;

/**
 * @author Lenovo
 *
 */
public class TestCase2 extends BaseClass {


	@Test
	public void endToEndApplication() {

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);

		ContactPage contact = PageFactory.initElements(driver, ContactPage.class);

		LogOutPage logout = PageFactory.initElements(driver, LogOutPage.class);

		int rows_Sheet1 = ObjectFactory.getExcelInfo().getRowsCount("Sheet1");

		int columns_Sheet1 = ObjectFactory.getExcelInfo().getColumnsCount("Sheet1");

		int rows_Sheet2 = ObjectFactory.getExcelInfo().getRowsCount("Sheet2");

//		int columns_Sheet2 = ObjectFactory.getExcelInfo().getColumnsCount("Sheet2");

		List<User> userList = new ArrayList<User>();
		List<ContactDetails> contactDetailsList = new ArrayList<ContactDetails>();
		int userNameColoumn = 0;
		int passWordColoumn = 0;
		for (int i = 0; i < rows_Sheet1; i++) {
			User user = new User();
			if(i == 0) {
				for(int j =0; j<columns_Sheet1; j++) {
					if ("UserName".equalsIgnoreCase(ObjectFactory.getExcelInfo().getData("Sheet3", i, j))) {
						userNameColoumn = j;
					} else if ("Password".equalsIgnoreCase(ObjectFactory.getExcelInfo().getData("Sheet3", i, j))) {
						passWordColoumn = j;
					}
				}
			} else {
				user.setUserId(ObjectFactory.getExcelInfo().getData("Sheet1", i, userNameColoumn));
				user.setPassWord(ObjectFactory.getExcelInfo().getData("Sheet1", i, passWordColoumn));
				userList.add(user);
			}
			
		}

		for (int i = 0; i < rows_Sheet2; i++) {
			ContactDetails contactDetails = new ContactDetails();
			contactDetails.setFirstName(ObjectFactory.getExcelInfo().getData("Sheet2", i, 0));
			contactDetails.setLastName(ObjectFactory.getExcelInfo().getData("Sheet2", i, 1));
			contactDetails.setEmailId(ObjectFactory.getExcelInfo().getData("Sheet2", i, 2));
			contactDetailsList.add(contactDetails);
		}

		for (int i = 0; i < rows_Sheet2; i++) {
			User user = userList.get(i);
			//ContactDetails contactDetails = contactDetailsList.get(i);
			System.out.println("loop userId : " + user.getUserId() + "loop passwored : " + user.getPassWord());
			/*System.out.println("firstName" + contactDetails.getFirstName() + " lastName : "
					+ contactDetails.getLastName() + " emailId : " + contactDetails.getEmailId());*/
			login.loginApp(user.getUserId(), user.getPassWord());
			
			/*contact.getContacts(contactDetails.getFirstName(), contactDetails.getLastName(),
					contactDetails.getEmailId());*/

			logout.logoutDetails();
		}

	}

}
