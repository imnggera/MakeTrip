package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginFactory extends Factory {
	public LoginFactory(WebDriver iDriver)
	{
		super(iDriver);
	}

	public void Login(String username,String Password)
	{
		driver.findElement(property.getElement("E_LOGIN")).click();
		driver.findElement(property.getElement("E_EM")).sendKeys(username);;
		driver.findElement(property.getElement("E_PWD")).sendKeys(username);;
		driver.findElement(property.getElement("E_LG")).click();
	}
}
