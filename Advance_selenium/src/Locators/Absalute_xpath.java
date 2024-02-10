package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absalute_xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Desktop/Selenimun/Relative%20xpath.html");
	     Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/input")).sendKeys("hi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/a")).click();
		

	}
}
