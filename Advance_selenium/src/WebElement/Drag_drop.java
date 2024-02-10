package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demoapps.qspiders.com/dragDrop/dragToCorrect?sublist=1");
Thread.sleep(2000);
WebElement dst = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
WebElement trt = driver.findElement(By.xpath("//div[text()='Mobile Accessories']/.."));
Actions act = new Actions(driver);
act.dragAndDrop(dst, trt).perform();
	}

}
