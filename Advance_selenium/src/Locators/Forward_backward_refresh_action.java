package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forward_backward_refresh_action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("file:///C:/Users/LENOVO/Desktop/Selenimun/handle%20partialy.html");
Thread.sleep(2000);
//driver.navigate().back();
//driver.navigate().forward();
driver.navigate().refresh();
//driver.close();
	}

}
