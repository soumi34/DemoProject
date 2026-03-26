package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {

	public WebDriver driver;
	// @FindBy(xpath = "//div[@class='small-box
	// bg-info']//following::p[text()='Manage News']//following::a[text()='More info
	// '][1]")
	// WebElement managenewsmoreinfo;
	@FindBy(xpath = "//a[text()=' New']")
	WebElement newbutton;
	@FindBy(xpath = "//textarea[@placeholder='Enter the news']")
	WebElement enternews;
	@FindBy(xpath = "//button[text()='Save']")
	WebElement savebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement successmessage;

	public ManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// used to intialize Webelement,driver-local class driver,this-current
												// class driver
	}

//	public void clickOnManageNewsMoreInfoButton() {
//		managenewsmoreinfo.click();
//	}

	public ManageNewsPage clickOnNewButton() {
		newbutton.click();
		return this;
	}

	public ManageNewsPage enterTheNews(String news) {
		enternews.sendKeys(news);
		return this;
	}

	public ManageNewsPage clickOnSaveButton() {
		savebutton.click();
		return this;
	}

	public boolean isSuccessMessageDisplayed() {
		return successmessage.isDisplayed();
	}

}
