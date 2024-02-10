package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class single_select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Desktop/Selenimun/singleselected.html");
	
		WebElement dd = driver.findElement(By.id("hotel"));
	 Select sel = new Select(dd);
		boolean b = sel.isMultiple();
		if(b)
		{
			System.out.println("it is multiselected dd");
		}
		else
		{
			System.out.println("it is single select dd");
		}
	}

}
