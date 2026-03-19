package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {
	// TakesScreenshot-is an interface used to capture failed testcases screenshot
	// or used to
	public void getScreenshot(WebDriver driver, String failedTestcase) throws IOException {
		// convert WebDriver to TakesScreenshot
		TakesScreenshot scrShot = (TakesScreenshot) driver;// type casting
		// getScreenshotAs-to capture the Screenshot
		File screenShot = scrShot.getScreenshotAs(OutputType.FILE);
		// Date-date class used to get current date
		// Create date and time
		String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());
		// Create a folder
		File f1 = new File(System.getProperty("user.dir") + "//OutputScreenShot");
		if (!f1.exists()) {
			f1.mkdirs();// make directory
		}
		String destination = System.getProperty("user.dir") + "//OutputScreenShot//" + failedTestcase + timeStamp
				+ ".png";
		File finalDestination = new File(destination);
		FileHandler.copy(screenShot, finalDestination);
	}
}
