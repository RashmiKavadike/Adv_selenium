package Launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_browser 
{
public static void main(String[] args)throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.gmail.com");
	Thread.sleep(3000);
	String title=driver.getTitle();
	System.out.println("the title is : "+title);
	String url=driver.getCurrentUrl();
	System.out.println("the url is : "+url);
	String psrc=driver.getPageSource();
	System.out.println("the src code is : "+psrc);
	driver.quit();
}
}
