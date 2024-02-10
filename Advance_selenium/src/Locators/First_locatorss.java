package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_locatorss 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/LENOVO/Desktop/Selenimun/R.html");
	Thread.sleep(5000);
	driver.findElement(By.tagName("a")).click();
	Thread.sleep(5000);
	driver.close();	
}
}
