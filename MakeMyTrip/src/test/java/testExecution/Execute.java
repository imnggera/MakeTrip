package testExecution;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.searchFactory;
import util.Base;

public class Execute extends Base
{
		@Test(priority=1)
	  public void SignupTest() throws Exception
	  {
		  SF.SIGNUP("a@b.com,1234,abc");
		 boolean A= Key.verifyOnInVisibilty(7,By.id("ch_signup_btn") , "SIGNUP");
		 System.out.println(A);
		 
	  }
		/*@Test(priority=2,dataProvider="LoginData")
		public void LoginTest(String UN,String PWD) 
		{
			LF.Login(UN,PWD);
		 
		}
		
		@DataProvider
		public Object[][] LoginData() throws Exception
		{
			Object data[][]=Excel.MyDataProvider("Sheet1", 2);
			return data;
		}
		@Test(priority=3)
		public void searchTest() 
		{
			searchFactory sf=new searchFactory(driver);
			sf.search("ABC");
			
		}*/
}
