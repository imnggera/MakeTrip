package POM;

import org.openqa.selenium.WebDriver;

import util.LoadProperty;


public class Factory {
	WebDriver driver;
	LoadProperty property;
	public Factory(WebDriver iDriver)
	{
		this.driver=iDriver;
		property=new LoadProperty(".\\OR.property",driver);
	}
}
