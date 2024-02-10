package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_url_without_using_get {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
Thread.sleep(2000);
driver.manage().window().maximize();
driver.navigate().to("file:///C:/Users/LENOVO/Desktop/Selenimun/handle%20partialy.html");
Thread.sleep(2000);
driver.manage().deleteAllCookies();
driver.close();
	}

}