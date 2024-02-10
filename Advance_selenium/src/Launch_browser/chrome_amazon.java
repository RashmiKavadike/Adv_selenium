package Launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_amazon 
{

	public static void main(String[] args) throws InterruptedException
	{

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
       Thread.sleep(5000);
		driver.close();
		driver.quit();
	}

}
