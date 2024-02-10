package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronisation {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoapps.qspiders.com/frames/nestedWithMultiple?sublist=3");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.xpath("//a[text()='Nested with Multiple iframe']")).click();
WebDriver mf = driver.switchTo().frame(0);
WebElement email = driver.findElement(By.xpath("//p[text()='Admin@gmail.com']"));
String em1 = email.getText();
System.out.println(em1);
WebElement pass = driver.findElement(By.xpath("//section[@class='main_form_container']/div/p[4]"));
String pas = pass.getText();
System.out.println(pas);
WebElement cnfpass = driver.findElement(By.xpath("//section[@class='main_form_container']/div/p[6]"));
String cnfpas = cnfpass.getText();
System.out.println(cnfpas);
WebDriver mf1 = driver.switchTo().frame(0);
WebDriver mf2 = driver.switchTo().frame(0);
driver.findElement(By.xpath("//input[@name='email']")).sendKeys(em1);
driver.switchTo().parentFrame();
WebDriver mf3 = driver.switchTo().frame(1);
driver.findElement(By.id("password")).sendKeys("pas");
driver.switchTo().parentFrame();
WebDriver mf4 = driver.switchTo().frame(2);
driver.findElement(By.id("confirmpassword")).sendKeys("cnfpas");
driver.switchTo().parentFrame();
driver.findElement(By.xpath("//button[text()='Submit']")).click();
driver.quit();

	}

}
