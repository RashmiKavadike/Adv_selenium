package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidden_division {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoqa.com/automation-practice-form");
Thread.sleep(2000);
driver.findElement(By.id("dateOfBirthInput")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[text()='30']")).click();

	}

}
