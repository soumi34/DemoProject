package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {

	@Test(priority=1,description="User is able to submit Manage News")

	public void verifiedUserIsAbleToSubmitManageNews() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignInButton();
		ManageNewsPage managenewspage = new ManageNewsPage(driver);
		managenewspage.clickOnMoreInfoButton();
		managenewspage.clickOnNewButton();
		String news = "Flash Sale Offers";
		managenewspage.enterTheNews(news);
		managenewspage.clickOnSaveButton();
		boolean successpage = managenewspage.isSuccessMessageDisplayed();
		Assert.assertTrue(successpage);

	}

}
