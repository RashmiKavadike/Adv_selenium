package WebElement;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_alretconfirmation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(5000);
		driver.findElement(By.name("cusid")).sendKeys("98789",Keys.ENTER);
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		String txt = alt.getText();
		System.out.println(txt);
		//alt.dismiss();
		alt.accept();	
		}

}
