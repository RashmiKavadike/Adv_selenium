package Assignment;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assm13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Desktop/Selenimun/singleselected.html");
		 WebElement dd = driver.findElement(By.id("hotel"));
		 Select sel = new Select(dd);
		  List<WebElement> opts = sel.getOptions();
		 TreeSet<String> tr_li = new TreeSet<String>();
	int count = opts.size();
	System.out.println("the count of option is :"+count);
	for(WebElement opt:opts)
	{
		String txt = opt.getText();
		tr_li.add(txt);
	}
	//Collections.sort(tr_li);
	for(String tr:tr_li)
	{
	
	System.out.println(tr);	
		
	}

	}

}
