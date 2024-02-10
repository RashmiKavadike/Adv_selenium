package VerificatioTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Username_width {
@Test
public void assertion() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.name("email"));
	Dimension size = ele.getSize();
	int wi = size.getWidth();
	SoftAssert ast=new SoftAssert();
	ast.assertEquals(wi, "100");
	ele.sendKeys("hello");
	ast.assertAll();

}
}
