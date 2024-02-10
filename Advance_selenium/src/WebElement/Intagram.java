package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.cssSelector("button[class=' _acan _acap _acas _aj1- _ap30']"));
		boolean b=ele.isEnabled();
		if(b)
		{
		System.out.println("Element is Enabled");
		
		}
		else
		{
			System.out.println("Element is disabled");
		}
		
	}

}
