package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegistration {

	WebDriver driver;
	
	public AccountRegistration(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtFirst; 
	
	@FindBy(xpath="//input[@id='input-lastname']")

	WebElement txtLast; 
	
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail ; 
	
	
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPass; 
	
	
	@FindBy(xpath="//input[@id='input-newsletter-no']")
	WebElement btnSubscribeNo; 
	
	@FindBy(xpath="//input[@id='input-newsletter-yes']")
	WebElement btnSubscribeYes; 
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement btnPrivacyPolicyAgree; 
	
	
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement btnContinue; 
	
	
	public void setFirstName(String fname) {
		txtFirst.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		txtLast.sendKeys(lname);
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String pass) {
		txtPass.sendKeys(pass);
	}
	
	public void SetSubscribe() {
		btnSubscribeYes.click();
	}

	public void SetUnSubscribe() {
		btnSubscribeNo.click();
	}
	
	public void SetPrivacy() {
		btnPrivacyPolicyAgree.click();
	}
	public void SetContinue(){
		btnContinue.click();
	}
}
