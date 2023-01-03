package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBases.BaseClass;
import utilities.XLUtility;
public class TC_003_LoginDDT extends BaseClass {

	
	@Test(dataProvider="LoginData")
	public void loginDDT(String email,String pwd,String exp) {
		
		driver.get(rb.getString("appURL"));
		HomePage hp= new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		LoginPage lg= new LoginPage(driver);
		lg.sendEmail("Pavan@gmail.com");
		lg.sendPassword("F@L#MM123");
		
		lg.clickLogin();
		
	}
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException
	{
		String path=".\\testData\\Opencart_LoginData.xlsx";
		
		XLUtility xlutil=new XLUtility(path);
		
		int totalrows=xlutil.getRowCount("Sheet1");	
		int totalcols=xlutil.getCellCount("Sheet1",1);
				
		String logindata[][]=new String[totalrows][totalcols];
		
		for(int i=1;i<=totalrows;i++)  //1
		{		
			for(int j=0;j<totalcols;j++)  //0
			{
				logindata[i-1][j]= xlutil.getCellData("Sheet1",i, j);  //1,0
			}
		}
	return logindata;
				
	}
}
