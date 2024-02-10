package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_handle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/LENOVO/Desktop/Selenimun/frame.html");
driver.findElement(By.id("i1")).sendKeys("rashmi");
WebElement frame = driver.findElement(By.xpath("//iframe[@src='frame.html']"));
driver.switchTo().frame(frame);
driver.findElement(By.id("i1")).sendKeys("RS");
Thread.sleep(2000);
driver.switchTo().defaultContent();
driver.findElement(By.id("i1")).sendKeys("Sohan");
	}

}
