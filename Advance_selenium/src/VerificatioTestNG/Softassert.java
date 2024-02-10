package VerificatioTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
@Test
public void assertion() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	String f_size = driver.findElement(By.xpath("//span[text()=' Meta © 2024']")).getCssValue("font-size ");
	SoftAssert s=new SoftAssert();
s.assertEquals(f_size, "ABC");
driver.findElement(By.name("email")).sendKeys("hello");
s.assertAll()

}
}
