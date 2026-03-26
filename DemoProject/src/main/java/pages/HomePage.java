package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;
	@FindBy(xpath = "//div[@class='small-box bg-info']//following::p[text()='Manage News']//following::a[text()='More info '][1]")
	WebElement managenewsmoreinfo;
	@FindBy(xpath = "//img[@class='img-circle']")
	WebElement imageicon;
	@FindBy(xpath = "//a[@class='dropdown-item'][2]")
	WebElement logoutbutton;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// used to intialize Webelement,driver-local class driver,this-current
												// class driver
	}

	public ManageNewsPage clickOnManageNewsMoreInfoButton() {
		managenewsmoreinfo.click();
		return new ManageNewsPage(driver);
	}

	public void clickOnTheImageIcon() {
		imageicon.click();
	}

	public void clickOnTheLogoutButton() {
		logoutbutton.click();
	}

}
