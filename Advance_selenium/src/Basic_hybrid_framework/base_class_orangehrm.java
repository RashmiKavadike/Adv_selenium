package Basic_hybrid_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base_class_orangehrm implements frame_work_constant_oranehrm{

public WebDriver driver;
public WebDriverWait wait;

@BeforeMethod
public void openApp()
{
	
	System.setProperty(Chrome_key,Chrome_value);
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--start-maximized");
	driver=new ChromeDriver(opt);
	wait=new WebDriverWait(driver, 10);
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}
@AfterMethod
public void closeApp()
{
	driver.close();
}
}
// hiiiiiiiiiiii