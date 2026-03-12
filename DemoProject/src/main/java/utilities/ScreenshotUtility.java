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
	
	//TakeScreenshot-is an 
	
	public void getScreenshot(WebDriver driver,String failedTestcase) throws IOException
	{
		//convert webdriver to screenshot mode
		TakesScreenshot scrShot = (TakesScreenshot) driver; //type casting // intrw
		//getscreenshotAs -to capture the screenshot
	    File screenShot=scrShot.getScreenshotAs(OutputType.FILE);//getScreenshotAs is a method inside the takescreenshot interface//intrw
	    //date -date class used to get the current date 
	    //Create data and time
	    String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss"). format(new Date());
	    //Create a folder
	    File f1 = new File(System.getProperty("user.dir") + "//OutputScreenShot");
	    if(!f1.exists()) {
	    	f1.mkdirs();//make directory
	    }
	    String destination = System.getProperty("user.dir") + "//OutputScreenShot//" + failedTestcase + timeStamp + ".png";//intrw
	    File finalDestination = new File(destination);//intrw
	    FileHandler.copy(screenShot, finalDestination);//intrw

	}

}
