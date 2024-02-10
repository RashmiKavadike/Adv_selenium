package Listeners_actiond;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Generic.Getphoto;


public class Base_class {
public	WebDriver driver;
@BeforeMethod
public void openApp()
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
 driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
@AfterMethod
public void closeApp(ITestResult result)
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		Getphoto.capturescreenshot(driver);
	}
	driver.close();
}
}
