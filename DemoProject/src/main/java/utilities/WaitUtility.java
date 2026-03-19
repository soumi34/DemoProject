package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {

		/*
		 * Wait commands-provide delays to interact with web elements(some elements have
		 * delay) 3 types-implicit,explicit,fluent wait implicit(global or static
		 * wait)-implicit wait gives one time in framework,given in base class given
		 * after url loading,wait applicable to all elements in the page
		 * explicit(dynamic or intelligent wait)-given waits to a specific element,work
		 * on a condition base (total wait=10 sec if element load on 2 sec then it not
		 * wait,continuous checking .5 sec) fluent-similar to explicit,given waits to a
		 * specific element,wait is customizable(element loaded or not check on interval
		 * base eg: wait=10 sec interval is sec it will check after 5 sec based on
		 * interval),we can ignore exceptions mostly used-explicit wait
		 */

		public static final int IMPLICITWAIT = 5;
		public static final int EXPLICITWAIT = 10;

		public void waitForElementToBeClickable(WebDriver driver, WebElement element) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}

		public void waitFordomAttributeToBe(WebDriver driver, WebElement element) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
			wait.until(ExpectedConditions.domAttributeToBe(element, null, null));
		}

		public void waitForFrameToBeAvailableAndSwitchToIt(WebDriver driver, WebElement element) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
		}

		public void waitForAttributeToBe(WebDriver driver, WebElement element) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
			wait.until(ExpectedConditions.attributeToBe(element, null, null));
		}

		public void waitForAlertIsPresent(WebDriver driver)

		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
			wait.until(ExpectedConditions.alertIsPresent());
		}
}
