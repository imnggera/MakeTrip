package util;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.sun.org.apache.xpath.internal.compiler.Keywords;

import POM.LoginFactory;
import POM.SignUpFactory;

public class Base {
public  WebDriver driver;
public static ExtentReports extent;
public static ExtentTest Test;
public static KeyWords Key;
public LoginFactory LF;
public SignUpFactory SF;
 @BeforeTest(alwaysRun=true)
 @Parameters("browser")
 public void beforeTest(String browser)
 {
	  extent = new ExtentReports();

     extent.attachReporter(new ExtentHtmlReporter("Sample.html"));

	  Key=new KeyWords();
	 
	 if(browser.equalsIgnoreCase("firefox"))
		 driver=Key.browserStart("firefox");
	 else if(browser.equalsIgnoreCase("chrome"))
		 driver=Key.browserStart("chrome");
	 
	  driver.get("https://www.makemytrip.com/");

	 LF=new LoginFactory(driver);
	  SF=new SignUpFactory(driver);
 }

 @AfterTest
 public void afterTest()
 {
	  driver.quit();
 }

}
