package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Third_locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/LENOVO/Desktop/Selenimun/fb.html");
Thread.sleep(2000);
driver.findElement(By.name("google")).click();
Thread.sleep(2000);
driver.close();
	}

}
