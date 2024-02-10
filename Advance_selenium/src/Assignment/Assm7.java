package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assm7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text' and @name='firstname']")).sendKeys("Rashmi");	
		driver.findElement(By.xpath("//input[@type='text' and @name='lastname']")).sendKeys("kavadike");
		driver.findElement(By.xpath("//input[@type='text' and @name='reg_email__']")).sendKeys("rashmi.rpea27@gamail.com");
		driver.findElement(By.xpath("//input[@type='text' and @name='reg_email_confirmation__']")).sendKeys("rashmi.rpea27@gmail.com");
		driver.findElement(By.xpath("//input[@type='password' and @name='reg_passwd__']")).sendKeys("sohan@123");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.xpath("//button[@type='submit' and @name='websubmit']")).click();
		driver.close();
	}
	

}
