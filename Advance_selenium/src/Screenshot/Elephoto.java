package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Elephoto {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");
 WebElement ele = driver.findElement(By.name("username"));
 ele=sendKeys("ABCD");
 File src = ele.getScreenshotAs(OutputType.FILE);
 File det=new File("./Photo/eledefect.prg");
 FileHandler.copy(src, det);


	}

	
	

	
}
