package VerificatioTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class case2 {
@Test
	public void assertion {
		// TODO Auto-generated method stub
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
