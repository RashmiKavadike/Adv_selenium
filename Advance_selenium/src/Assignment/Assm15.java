package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assm15 {

	private static final String Charector = null;
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
Robot r = new Robot();

r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_T);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_T);
Thread.sleep(3000);
int amoprice=0;
int filprice=0;

Set<String> all_id = driver.getWindowHandles();
ArrayList<String> arr_id=new ArrayList<String>(all_id);
for(int i=0;i<arr_id.size();i++)
{
 if(i==0)
 {
	driver.switchTo().window(arr_id.get(i));
	driver.get("https://www.amazon.in");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("iphone 15",Keys.ENTER);
	WebElement ele = driver.findElement(By.xpath("//span[text()='Results']/../../../../../../div[5]/div[1]/div/span/div/div/div/div[2]/div/div/div[3]/div[1]/div[1]/div[1]/div[2]//span/span/span[2]"));
	String txt = ele.getText();
	System.out.println(txt);
	String s1="";
	for(int j=0;j<txt.length();j++)
	{
		char ch=txt.charAt(j);
		if(Character.isDigit(ch))
		{
			s1=s1+ch;
		}
	}
	System.out.println("number string is "+s1);
	amoprice=Integer.parseInt(s1);
	System.out.println("amozon iphone price is "+amoprice);
		
	
 }
 else
 {
	   driver.switchTo().window(arr_id.get(i));
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("iphone 15",Keys.ENTER);
	   WebElement ele1 = driver.findElement(By.xpath("//span[text()='Sort By']/../../../../../div[3]//a/div[2]/div[2]/div[1]/div/div[1]"));
	   String txt1 = ele1.getText();
	   System.out.println(txt1);
	   String s2="";
		for(int j=0;j<txt1.length();j++)
		{
			char ch=txt1.charAt(j);
			if(Character.isDigit(ch))
			{
				s2=s2+ch;
			}
		}
		System.out.println("number string is "+s2);
		filprice=Integer.parseInt(s2);
		System.out.println("filpcart iphone price is "+filprice);
		
 }
}
if(filprice>=amoprice)
{
System.out.println("filpcart price is greater than amozon price");   
}
else
{
 System.out.println("amozan price is greater then filpcart price");
}

}

}