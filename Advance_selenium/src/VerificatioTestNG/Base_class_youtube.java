package VerificatioTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class_youtube {
	public WebDriver driver;
	@BeforeMethod
	public void openApp()
	 {
		
	
System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
 driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://www.youtube.com/");


}
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}
}