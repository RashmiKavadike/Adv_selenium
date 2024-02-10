package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class the_text_of_option {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Desktop/Selenimun/singleselected.html");
		 WebElement dd = driver.findElement(By.id("hotel"));
		 Select sel = new Select(dd);
		 List<WebElement> opts = sel.getOptions();
	int count = opts.size();
	System.out.println("the count of option is :"+count);
	for(WebElement opt:opts)
	{
		String txt = opt.getText();
		System.out.println(txt);
	}
	}

}
