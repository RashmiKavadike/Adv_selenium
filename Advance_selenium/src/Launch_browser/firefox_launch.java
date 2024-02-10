package Launch_browser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox_launch
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
String key="webdriver.gecko.driver";
String value="./Softwares/geckodriver.exe";
System.setProperty(key, value);
FirefoxDriver driver=new FirefoxDriver();
	}

}
