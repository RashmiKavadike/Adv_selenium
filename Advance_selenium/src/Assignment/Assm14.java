package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assm14 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Desktop/Selenimun/Asssignment.html");
		WebElement dd = driver.findElement(By.id("Country"));
	Select sel = new Select(dd);
	List<WebElement> opts = sel.getOptions();
	int count = opts.size();
 sel.selectByIndex(1);
 Thread.sleep(500);
 sel.selectByValue("d");
 Thread.sleep(500);
 sel.selectByVisibleText("India");
 Thread.sleep(500);
  List<WebElement> all_sel = sel.getAllSelectedOptions();
 int count1 = all_sel.size();
 System.out.println("the selected options count is:"+count);
 for(WebElement al:all_sel)
 {
	 String txt = al.getText();
	 System.out.println(txt);
	if(txt.equals("India"))
	sel.deselectByValue("a");
	 
 }
  
 
	
 
 
 
 
 
 
		
	}

}
