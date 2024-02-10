package VerificatioTestNG;

import org.apache.batik.script.InterpreterException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class case_1 {
@Test
public void verification()throws  InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	String c_url = driver.getCurrentUrl();
	Assert.assertEquals(c_url, "https://www.instagram.com/");
	driver.findElement(By.name("email")).sendKeys("hi");
}
}
