package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assm9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rashmi.sudhakar.56");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sohan@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@role='button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("svg[aria-label='Search'")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("prajwal_paalegar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='prajwal_paalegar']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Follow']")).click();
		Thread.sleep(2000);
		driver.close();
		
		
	
	
		
	}

}
