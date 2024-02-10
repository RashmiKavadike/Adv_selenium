package Basic_hybrid_framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public  class runner_class extends base_class_orangehrm
{
@Test
public  void login() throws InterruptedException
{
	pom_orangehrm p=new pom_orangehrm(driver);
	WebElement un=p.getun();
	wait.until(ExpectedConditions.visibilityOf(un)).sendKeys("admin");
	Thread.sleep(2000);
	p.get_login().click();
	Thread.sleep(2000);
	
}
}
