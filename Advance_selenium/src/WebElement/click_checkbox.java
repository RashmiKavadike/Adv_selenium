package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class click_checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("file:///C:/Users/LENOVO/Desktop/Selenimun/indexing.html");
		Thread.sleep(2000);
		List<WebElement> chboxs = driver.findElements(By.xpath("//input"));
		int count = chboxs.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement cbox = chboxs.get(i);
			cbox.click();
			
		}
		Thread.sleep(2000);
		for(int i=count-1;i>=0;i--)
		{
			WebElement cbox = chboxs.get(i);
			cbox.click();
		}
	}

}
