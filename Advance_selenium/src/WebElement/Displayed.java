package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Desktop/Selenimun/sample.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("user"));
		boolean b=ele.isDisplayed();
		if(b)
		{
		System.out.println("Element is Displayed");
		
		}
		else
		{
			System.out.println("Element is notdisplayed");
		}

	}

}
