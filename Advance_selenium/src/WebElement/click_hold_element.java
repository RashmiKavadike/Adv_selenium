package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class click_hold_element {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/clickHold?scenario=1&sublist=0");
		Thread.sleep(2000);
		WebElement click_hold = driver.findElement(By.xpath("//div[@id='circle']"));
		Actions act = new Actions(driver);
		act.clickAndHold(click_hold).perform();
		Thread.sleep(2000);
		act.release(click_hold).perform();
	}
	

}
