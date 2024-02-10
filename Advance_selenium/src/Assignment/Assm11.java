package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assm11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Desktop/Selenimun/exchange.html");
		Thread.sleep(2000);
		 WebElement ele = driver.findElement(By.id("user1"));
	       ele.sendKeys(Keys.CONTROL+"a");
	       ele.sendKeys(Keys.CONTROL+"c");
	       Thread.sleep(2000);
	       WebElement ele1 = driver.findElement(By.id("user3"));
	       ele1.sendKeys(Keys.CONTROL+"v");
	       Thread.sleep(2000);
	       WebElement ele2 = driver.findElement(By.id("user2"));
	       ele2.sendKeys(Keys.CONTROL+"a");
	       ele2.sendKeys(Keys.CONTROL+"c");
	       Thread.sleep(2000);
            driver.findElement(By.id("user1"));
           ele.sendKeys(Keys.CONTROL+"a");
           ele.sendKeys(Keys.CONTROL+"v");
           Thread.sleep(2000);
             driver.findElement(By.id("user3"));
           ele1.sendKeys(Keys.CONTROL+"a");
           ele1.sendKeys(Keys.CONTROL+"c");
           Thread.sleep(2000);
           driver.findElement(By.id("user2"));
           ele2.sendKeys(Keys.CONTROL+"a");
           ele2.sendKeys(Keys.CONTROL+"v");
           driver.findElement(By.id("user3"));
           ele1.sendKeys(Keys.CONTROL+"a");
           ele1.sendKeys(Keys.BACK_SPACE);
           
	      
	       
	}

}
