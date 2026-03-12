package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class LoginPage {
	public WebDriver driver;
	//PageUtility.pageutility = new PageUtility();
	
	//Declaring webelements in the page class.Page factory used for locate webelement there is a=one annotation for locating webelement that is @findBy
	@FindBy(xpath="//input[@name='username']")WebElement usernamefield;
	@FindBy(xpath="//input[@name='password']")WebElement passwordfield;
	@FindBy(xpath="//button[@type='submit']")WebElement submit;
	@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement errormessage;
	public LoginPage(WebDriver driver) 
	{
	 this.driver=driver;	
	 PageFactory.initElements(driver, this);//used to intialize Webelement,driver-local class driver,this-current class driver
	}
	public void enterTheUsername(String username)
	{
		usernamefield.sendKeys(username);
	}
	public void enterThePassword(String password)
	{
	
		passwordfield.sendKeys(password);
	}
/*	public void dropDown()
	{
		//PageUtility pageutility = new PageUtility();
		pageutility.dropDownVisibleText();
	}*/
	
	public void clickOnSignInButton()
	{
		submit.click();
	}
	
	public boolean isDashboardDisplayed()
	{
		return dashboard.isDisplayed(); // it returns true so we changed to boolean and pass the return value here
	}
	
	public boolean isErrorMessageDisplayed()
	{
		return errormessage.isDisplayed();
	}
}
