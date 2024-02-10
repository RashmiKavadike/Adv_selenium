package WebElement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_browser_only_close {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		driver.findElement(By.id("tabButton")).click();
		String p_id = driver.getWindowHandle();
		Set<String> all_id = driver.getWindowHandles();
		int count = all_id.size();
		System.out.println("the count is:"+count);
		all_id.remove(p_id);
		int count1 = all_id.size();
		System.out.println("count after removing:"+count1);
		for(String id:all_id)
		{
		driver.switchTo().window(id);
		Thread.sleep(2000);
		driver.close();
	}
	}
}
