package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBases.BaseClass;

public class TC_002_Login extends BaseClass {

	
	@Test(groups={"sanity","master"})
	public void loginNormal() {
		
		driver.get(rb.getString("appURL"));
		HomePage hp= new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		LoginPage lg= new LoginPage(driver);
		lg.sendEmail("Pavan@gmail.com");
		lg.sendPassword("F@L#MM123");
		
		lg.clickLogin();
		
		
		
		
		
	}

}
