package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enter_data {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Desktop/Selenimun/textfiled.html");
		Thread.sleep(2000);
		//driver.findElement(By.tagName("input")).sendKeys("Rashmi");
		//driver.findElement(By.id("username")).sendKeys("Sohan");
		driver.findElement(By.name("user")).sendKeys("RS");
		Thread.sleep(2000);
		driver.close();
	}

}
