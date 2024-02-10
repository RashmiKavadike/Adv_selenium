package WebElement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_4different_webapplication {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Robot r = new Robot();
		for(int i=1;i<4;i++)
		{
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_T);
			Thread.sleep(200);
			
			
		}
		Thread.sleep(200);
		Set<String> all_id = driver.getWindowHandles();
		ArrayList<String> arr_id = new ArrayList<String>(all_id);
		Thread.sleep(200);
		int count = arr_id.size();
		System.out.println(count);
		String first_tab = arr_id.get(0);
		String second_tab = arr_id.get(1);
		String third_tab = arr_id.get(2);
		String fourth_tab = arr_id.get(3);
		driver.switchTo().window(first_tab);
		driver.get("https://www.amazon.in");
		Thread.sleep(200);
		driver.switchTo().window(second_tab);
		driver.get("https://www.flipkart.com");
		Thread.sleep(200);
		driver.switchTo().window(third_tab);
		driver.get("https://www.zomato.in");
		Thread.sleep(200);
		driver.switchTo().window(fourth_tab);
		driver.get("https://www.youtube.com");


	}

}
