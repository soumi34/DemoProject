package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	//Wait commands-provide delay to interact with webElements(some webelement have delay
	//3 types of wait-Implicit,explicit,fluent
	//implicit wait(global/static wait) gives one time in a framework It will give in Base class given after url loading Framewrk ethra element undo athin elathinum applicable
	//Explicit wait to specific element -dynamic wait explicit wait i will provided as 10 sec element has loaded within 2 sec  i doesn't wait for 10 mins proceed with other things
	//Fluent wait-similar to explicit wait ,wait is customizable ,ingnore the exception
	
	public static final int IMPLICITWAIT=5;
	public static final int EXPLICITWAIT=10;
	
	public void waitForElementToBeClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
}
