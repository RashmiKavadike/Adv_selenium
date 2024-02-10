package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_multiple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text'and @placeholder='Enter your name']")).sendKeys("Rashmi");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='email'and@placeholder='Enter your email']")).sendKeys("rashmi.rpea27@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='password' and @placeholder='Enter your password']")).sendKeys("sohan@123");
       Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        driver.close();


	}


}
