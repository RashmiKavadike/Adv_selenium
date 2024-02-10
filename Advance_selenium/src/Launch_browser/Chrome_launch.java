package Launch_browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_launch 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
String key="webdriver.chrome.driver";
String value="./softwares/chromedriver.exe";
System.setProperty(key, value);
ChromeDriver driver=new ChromeDriver();
	}

}
