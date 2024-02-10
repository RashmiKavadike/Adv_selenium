package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_partialy_dyanmic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Desktop/Selenimun/handle%20partialy.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'google 2023')]")).click();
		Thread.sleep(2000);
		//driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.close();
		
	}

}
