package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpFactory extends Factory {
	
	public SignUpFactory(WebDriver iDriver) 
	{
		super(iDriver);
	}

	public void SIGNUP(String data) throws Exception
	{
		String dataA[]=data.split(",");
		driver.findElement(property.getElement("E_SIGNUP")).click();
		WebDriverWait wt=new WebDriverWait(driver, 20);
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(property.getElement("E_EM_SIGNUP"))));
		driver.findElement(property.getElement("E_EM_SIGNUP")).sendKeys(dataA[0]);
		driver.findElement(property.getElement("E_NUM")).sendKeys(dataA[1]);
		driver.findElement(property.getElement("E_PWD_SIGNUP")).sendKeys(dataA[2]);
		driver.findElement(property.getElement("E_SIGNUPB")).click();
	}
}
