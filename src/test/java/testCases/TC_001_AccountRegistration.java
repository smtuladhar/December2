package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistration;
import pageObjects.HomePage;
import testBases.BaseClass;

public class TC_001_AccountRegistration extends BaseClass {



	@Test(groups= {"master","regression"})
	public void test_account_registration() throws InterruptedException, IOException {
		try {
		logger.info("Starting TC_001_AccountRegistration");
		driver.get(rb.getString("appURL"));
		logger.info(" Home Page Displayed");
		driver.manage().window().fullscreen();
		 Thread.sleep(2000);
		HomePage hp= new HomePage(driver);
		hp.clickMyAccount();
		driver.manage().window().fullscreen();
		logger.info("Clicked on My account");
		hp.clickRegister();
		
		logger.info("Clicked on Register ");
		AccountRegistration ac = new AccountRegistration(driver);
		
		ac.setFirstName("John");
		logger.info("Provided First Name ");
		ac.setLastName("Myers");
		logger.info("Provided Last Name");
		ac.setEmail("Kmskd@gmail.com");
		logger.info("Provided email");
		ac.setPassword("acts.txt@");
		logger.info("Provided Password ");
		ac.SetSubscribe();
		logger.info(" Clicked on Subscribe");
		ac.SetPrivacy();
		logger.info("Clicked on Privacy ");
		ac.SetContinue();
		logger.info("Clicked on Continue");
		}
		catch (Exception e) {
			captureScreen(driver,"test_account_registration");
			logger.info("Test failed");
			Assert.fail();
		}
		logger.info("Finished TC_001_AccountRegistration");
	}
	
	
}
