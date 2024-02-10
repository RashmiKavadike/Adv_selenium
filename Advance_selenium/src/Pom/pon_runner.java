package Pom;

import org.testng.annotations.Test;

public class pon_runner {
@Test
public void run()throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new chromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	pom_script p=new pom_script(driver);
	p.getun();
	driver.navigate().refresh();
	p.getun();
}
	

}
