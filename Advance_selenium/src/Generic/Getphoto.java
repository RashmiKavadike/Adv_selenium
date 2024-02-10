package Generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Getphoto {
public static void capturescreenshot(WebDriver driver)
{
	Date d=new Date();
	String da=d.toString();
	String dt=da.replaceAll(":", "-");
	TakesScreenshot tss = (TakesScreenshot)driver;
	File tmp = tss.getScreenshotAs(OutputType.FILE);
	File pmt = new File("./Photo/"+dt+".jpg");
	try {
		FileHandler.copy(tmp, pmt);
	} catch (IOException e) {
		System.out.println("photo is not capture");
	}
}
}
