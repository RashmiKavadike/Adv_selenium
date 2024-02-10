package Generic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import VerificatioTestNG.Base_class_facebook;

public class Runner_class extends Base_class_facebook
{
@Test
public void login_script() throws InterruptedException
{
	driver.findElement(By.name("email")).sendKeys("hello");
	driver.findElement(By.name("pass")).sendKeys("hi1234");
	driver.findElement(By.name("login")).submit();
	Thread.sleep(2000);
}
}
