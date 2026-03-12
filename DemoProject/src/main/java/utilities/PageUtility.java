package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility//It is a helper class used to help page class 
{
	
	public void dropDownVisibleText(WebElement element ,String text)
	{
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public void dropDownSelectByValue(WebElement element ,String text)
	{
		Select select = new Select(element);
		select.selectByValue(text);
	}
	public void dropDownSelectByIndex(WebElement element ,int index)
	{
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	

}
