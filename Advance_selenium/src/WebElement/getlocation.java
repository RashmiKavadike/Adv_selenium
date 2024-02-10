package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getlocation {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
	  Point loc = driver.findElement(By.xpath("//a[text()='Facebook']")).getLocation();
		System.out.println(loc);
		 int x = loc.getX();
		 int y = loc.getY();
		 System.out.println("the x valueis:"+ x);
		 System.out.println("the y valueis:"+ y);
		 
	}

}
