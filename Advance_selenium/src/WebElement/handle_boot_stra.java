package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_boot_stra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.shaadi.com/");
driver.findElement(By.xpath("//div[@class='Dropdown-root']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[text()='Man']")).click();

	}

}
