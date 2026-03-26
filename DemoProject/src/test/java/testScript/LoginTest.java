package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	public HomePage homepage;

	// Assertion is used to validate the actual result and expected behaviour is
	// verifying ,if it match -pass ,not match -fail
	// Hard assertion -if assertion fail testcase execution immediatly stop ,assert
	// class will used here,there are few methods are there we are using that
	// methods to help the validation
	// soft assertion -if assertion fail testcase execution will continue,soft
	// assert class will be used here,there are few methods are there Once object
	// created then only we can call the methods ,assert all method will call in the
	// soft assertion at the end then only we know how many cases are fail and pass

	@Test(priority = 1, groups = { "Regression" }, retryAnalyzer = retry.Retry.class)

	public void verifiedUserIsAbleToLoginWithValidCredential() throws IOException {
		// String username="admin";
		// String password="admin";
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);//chaining method calling
		//loginpage.enterThePassword(password);
		homepage=loginpage.clickOnSignInButton();
		boolean homepage = loginpage.isDashboardDisplayed();
		Assert.assertTrue(homepage);
	}

	@Test(priority = 2)

	public void verifiedUserIsNotAbleToLoginWithInvalidUsername() throws IOException {
		// String username="admin12";
		// String password="admin";
		String username = ExcelUtility.getStringData(2, 0, "loginpage");
		String password = ExcelUtility.getStringData(2, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignInButton();
		boolean hmpage = loginpage.isErrorMessageDisplayed();
		Assert.assertTrue(hmpage);
	}

	@Test(priority = 3)

	public void verifiedUserIsNotAbleToLoginWithInvalidPassword() throws IOException {
		// String username="admin";
		// String password="admin12";
		String username = ExcelUtility.getStringData(3, 0, "loginpage");
		String password = ExcelUtility.getStringData(3, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignInButton();
		boolean hmpage = loginpage.isErrorMessageDisplayed();
		Assert.assertTrue(hmpage);
	}

	@Test(priority = 4)

	public void verifiedUserIsNotAbleToLoginWithInvalidUsername_Password() throws IOException {
		// String username="admin12";
		// String password="admin12";
		String username = ExcelUtility.getStringData(4, 0, "loginpage");
		String password = ExcelUtility.getStringData(4, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignInButton();
		boolean hmpage = loginpage.isErrorMessageDisplayed();
		Assert.assertTrue(hmpage);
	}

}
