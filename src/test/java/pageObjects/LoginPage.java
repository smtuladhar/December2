package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	
	

	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
	

	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btnlogin;
	
	
	public void sendEmail(String emailId)
	{
	txtEmail.sendKeys(emailId);
	}
	
	public void sendPassword(String pass)
	{
	txtPassword.sendKeys(pass);
	}
	
	public void clickLogin() {
		btnlogin.click();
	}
}
