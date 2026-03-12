package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileUploadUtilities {

	public void fileUploadUsingSendKeys(WebElement element ,String path)
	{
	element.sendKeys(path);
		
	}
	public void fileUploadUsingRobotClass(WebElement element ,String path) throws AWTException
	{
		
		StringSelection select = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);//copy the clipboard
		Robot rb=new Robot();
		rb.delay(3000);
		rb.keyPress(KeyEvent.VK_CONTROL);//robot class method keyPress,KeyEvent is class,vk_control is a constant.
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
}
