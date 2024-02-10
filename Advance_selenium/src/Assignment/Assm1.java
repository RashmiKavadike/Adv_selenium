package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assm1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("vivo v29");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
		driver.findElement(By.cssSelector("img[src='https://m.media-amazon.com/images/I/71UCRQ9+CrL._AC_UY218_.jpg']")).click();
		
	
	}
}
