package Generic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import VerificatioTestNG.Base_class_youtube;

public class you_tube_runner extends Base_class_youtube
{
@Test
public void Play_script() throws InterruptedException
{
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kaatera songs");
	driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	driver.findElement(By.xpath("//img[@src='https://i.ytimg.com/vi/ZqN-2PLOeJ0/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDqvw5e7rtsHIKVkkYUrfzcgFQF7g']")).click();
	Thread.sleep(2000);

}
}
