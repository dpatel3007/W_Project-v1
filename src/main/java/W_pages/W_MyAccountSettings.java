package W_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import W_base.W_TestBase;

public class W_MyAccountSettings extends W_TestBase {
	
	//Page Factory
	
	@FindBy(xpath = "//span[contains(text(),'Sign in')]")
	WebElement signIn;
	
	@FindBy(xpath = "//input[@id='login-form-email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@id='account-signin-btn']")
	WebElement signInButton;
	
	
	// Initializing Page Objects
	public W_MyAccountSettings() {
		PageFactory.initElements(driver, this); // this keyword will initialize all the object we have created for this
												// class to the driver
	}
	
	//Actions
	
	public void accountSignIn() throws InterruptedException {
		
		signIn.click();
		Thread.sleep(3000);
		email.sendKeys("dhruvpatel@gmail.com");
		Thread.sleep(3000);
		password.sendKeys("Dj7405177602");
		Thread.sleep(3000);
		signInButton.click();
		Thread.sleep(5000);	
		
		
	}
	
	
	
	
	
	
	

}
