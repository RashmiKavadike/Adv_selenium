package Listeners_actiond;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class get_photo {
public static void CaptureScreenshot(WebElement ele)
{
	Date d=new Date();
	String da=d.toString().replaceAll("i", "_");
	File src=ele.getScreenshotAs(OutputType.FILE);
	File dst=new File("./Photo/"+da+".jpg");
	try
	{
		FileHandler.copy(src, dst);
	}
	catch(IOException e)
	{
		System.out.println("Element not vissible");
	}
}
}
