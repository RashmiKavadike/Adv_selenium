package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/mouseHover?sublist=0");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//img[@src='/static/media/message-hint.b2a6e0d93a0cc13121a0.png']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
	}

}
