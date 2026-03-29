package utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void dropDownSelectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void dropDownSelectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public void dropDownSelectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	public void right_Click(WebDriver driver,WebElement input)
	{
		Actions a = new Actions(driver); 
		a.contextClick(input).perform();
	}
	
	public void mouse_Over(WebDriver driver,WebElement input)
	{
		Actions a = new Actions(driver); 
		a.moveToElement(input).perform();
	}
	
	public void double_Click(WebDriver driver,WebElement input)
	{
		Actions a = new Actions(driver); 
		a.doubleClick(input).perform();
	}
	
	public void click(WebDriver driver,WebElement input)
	{
		Actions a = new Actions(driver); 
		a.click(input).perform();
	}
	
	public void simpleAlerts(WebDriver driver)
	{
		Alert alert = driver.switchTo().alert(); // switch to alert
		alert.accept();
	}
	
	public void confirmationAlerts(WebDriver driver)
	{
		Alert alert = driver.switchTo().alert(); // switch to alert
		alert.dismiss();
	}
	
	public void promptAlerts(WebDriver driver)
	{
		Alert alert = driver.switchTo().alert(); // switch to alert
		alert.sendKeys("Soumya");
		alert.accept();
	}
	
}
