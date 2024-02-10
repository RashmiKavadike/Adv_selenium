package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.WebDriverHandler;

public class Assm16 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		ArrayList<WebElement> al_el=new ArrayList<WebElement>();
		al_el.add(driver.findElement(By.xpath("//span[text()='Downloads']")));
		al_el.add(driver.findElement(By.xpath("//span[text()='Documentation']")));
		al_el.add(driver.findElement(By.xpath("//span[text()='Projects']")));
		al_el.add(driver.findElement(By.xpath("//span[text()='Support']")));
		al_el.add(driver.findElement(By.xpath("//span[text()='Blog']")));
		Actions act=new Actions(driver);
		Robot r=new Robot();
		for(int i=0;i<al_el.size();i++)
		{
			act.contextClick(al_el.get(i)).perform();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			
			
		}
		Set<String> all_id = driver.getWindowHandles();
		ArrayList<String> arr_id=new ArrayList<String>(all_id);
		for(int i=0;i<arr_id.size();i++)
		{
			String id = arr_id.get(i);
			driver.switchTo().window(id);
			Thread.sleep(3000);
		}
		for(int i=arr_id.size()-1;i>=0;i--)
		{
			String id = arr_id.get(i);
			driver.switchTo().window(id);
			Thread.sleep(3000);
		}
//		
//		
				
	}

}