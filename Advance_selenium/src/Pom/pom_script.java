package Pom;

public class pom_script {
@FindBy(id="email");
private WebElement un_txt;
public pom_script(WebDriver driver)
{
	
	pageFactory.initElement(driver,this);
	
}
public void getun()
{
	un_txt.sendkeys("hi");
}
}
