package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class firstselected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Desktop/Selenimun/singleselected.html");
		 WebElement dd = driver.findElement(By.id("hotel"));
		 Select sel = new Select(dd);
		 List<WebElement> opts = sel.getOptions();
		 sel.selectByIndex(1);
		 Thread.sleep(500);
		 sel.selectByValue("d");
		 Thread.sleep(500);
		 sel.selectByVisibleText("Chicken_fry");
		 Thread.sleep(500);
		 WebElement f_sel = sel.getFirstSelectedOption();
		 String txt = f_sel.getText();
		 System.out.println(txt);
	}

}
