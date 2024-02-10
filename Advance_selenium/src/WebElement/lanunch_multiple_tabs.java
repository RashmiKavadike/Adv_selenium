package WebElement;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class lanunch_multiple_tabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
Robot r=new Robot();
for(int i=1;i<4;i++)
{
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_T);
	Thread.sleep(2000);
	
	
	
}
set<String> all_id=driver.getWindowHandles();
	}

}
