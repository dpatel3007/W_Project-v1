package W_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import W_base.W_TestBase;

public class W_Registration extends W_TestBase {
	
	//Page Factory
	
	//Registration
	
	@FindBy(xpath = "//span[contains(text(),'Sign in')]")
	WebElement signIn;
	
	@FindBy(xpath = "//input[@placeholder='you@email.com']")
	WebElement enterEmail;
	
	@FindBy(xpath = "//span[@class='error']")
	WebElement emailError;
	
	@FindBy(xpath = "//button[contains(@class,'create-account-create-btn wgrid-4of4 wgrid-3of8 wgrid-3of12 button-submit marg-l-0 clear-b')]")
	WebElement createAccount;
	
	@FindBy(id = "firstName")
	WebElement firstName;
	
	@FindBy(xpath = "//span[contains(text(),'Please enter a valid first name.')]")
	WebElement FNameError;
	
	@FindBy(id = "lastName")
	WebElement lastName;
	
	@FindBy(xpath = "//span[contains(text(),'Please enter a valid last name.')]")
	WebElement LNameError;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(xpath = "//span[contains(text(),'Your password must be at least 6 characters long.')]")
	WebElement PasswordError;
	
	@FindBy(id = "confirmPassword")
	WebElement confirmPassword;
	
	@FindBy(xpath = "//span[contains(text(),'Password and Password Confirmation must be the sam')]")
	WebElement ConfirmPasswordError;
	
	@FindBy(id = "tnc")
	WebElement privacyCheck;
	
	@FindBy(id = "create-account-btn")
	WebElement createAccountButton;
	
	
	// Initializing Page Objects
				public W_Registration() {
					PageFactory.initElements(driver, this); // this keyword will initialize all the object we have created for this
															// class to the driver
				}
				
	//Actions
				
	public void registrationValid() throws InterruptedException {
		signIn.click();
		Thread.sleep(3000);
		enterEmail.sendKeys("abc123@gmail.com");
		createAccount.click();
		Thread.sleep(5000);
		firstName.sendKeys("hello");
		Thread.sleep(3000);
		lastName.sendKeys("world");
		Thread.sleep(3000);
		password.sendKeys("123456789");
		Thread.sleep(3000);
		confirmPassword.sendKeys("123456789");
		Thread.sleep(3000);
		privacyCheck.click();
		Thread.sleep(3000);
		createAccountButton.click();
		Thread.sleep(3000);


	}
	
	public void registrationInvalidEmail() throws InterruptedException {
		signIn.click();
		Thread.sleep(3000);
		enterEmail.sendKeys("abc123");
		createAccount.click();
		Thread.sleep(3000);
		String error = emailError.getText();
		System.out.println("Error occured: "+error);	
		Thread.sleep(3000);
		
		enterEmail.clear();
		Thread.sleep(3000);
		
		enterEmail.sendKeys("abc@123");
		Thread.sleep(3000);
		createAccount.click();
		String error1 = emailError.getText();
		System.out.println("Error occured: "+error1);	
		Thread.sleep(3000);
		
		enterEmail.clear();
		Thread.sleep(3000);
		
		enterEmail.sendKeys("abc123@.com");
		Thread.sleep(3000);
		createAccount.click();
		String error2 = emailError.getText();
		System.out.println("Error occured: "+error2);	
		Thread.sleep(3000);
	

	}
	
	public void registrationInvalidFirstName() throws InterruptedException {
		signIn.click();
		Thread.sleep(3000);
		enterEmail.sendKeys("abc123@gmail.com");
		createAccount.click();
		Thread.sleep(5000);
		firstName.sendKeys("$$$$");
		Thread.sleep(3000);
		lastName.sendKeys("world");
		Thread.sleep(3000);
		password.sendKeys("123456789");
		Thread.sleep(3000);
		confirmPassword.sendKeys("123456789");
		Thread.sleep(3000);
		privacyCheck.click();
		Thread.sleep(3000);
		createAccountButton.click();
		Thread.sleep(3000);
		
		String error1 = FNameError.getText();
		System.out.println("Error occured: "+error1);	
		Thread.sleep(3000);
		
		firstName.clear();
		Thread.sleep(3000);
		firstName.sendKeys("123");
		Thread.sleep(3000);
		createAccountButton.click();
		Thread.sleep(3000);
		String error2 = FNameError.getText();
		System.out.println("Error occured: "+error2);	
		Thread.sleep(3000);
		
		firstName.clear();
		Thread.sleep(3000);
		firstName.sendKeys("123abc");
		Thread.sleep(3000);
		createAccountButton.click();
		Thread.sleep(3000);
		String error3 = FNameError.getText();
		System.out.println("Error occured: "+error3);	
		Thread.sleep(3000);


	}
	
	public void registrationInvalidLastName() throws InterruptedException {
		signIn.click();
		Thread.sleep(3000);
		enterEmail.sendKeys("abc123@gmail.com");
		createAccount.click();
		Thread.sleep(5000);
		firstName.sendKeys("hello");
		Thread.sleep(3000);
		lastName.sendKeys("$$$");
		Thread.sleep(3000);
		password.sendKeys("123456789");
		Thread.sleep(3000);
		confirmPassword.sendKeys("123456789");
		Thread.sleep(3000);
		privacyCheck.click();
		Thread.sleep(3000);
		createAccountButton.click();
		Thread.sleep(3000);
		
		String error1 = LNameError.getText();
		System.out.println("Error occured: "+error1);	
		Thread.sleep(3000);
		
		lastName.clear();
		Thread.sleep(3000);
		lastName.sendKeys("123");
		Thread.sleep(3000);
		createAccountButton.click();
		Thread.sleep(3000);
		String error2 = LNameError.getText();
		System.out.println("Error occured: "+error2);	
		Thread.sleep(3000);
		
		lastName.clear();
		Thread.sleep(3000);
		lastName.sendKeys("123abc");
		Thread.sleep(3000);
		createAccountButton.click();
		Thread.sleep(3000);
		String error3 = LNameError.getText();
		System.out.println("Error occured: "+error3);	
		Thread.sleep(3000);



	}
	
	public void registrationInvalidPassword() throws InterruptedException {
		signIn.click();
		Thread.sleep(3000);
		enterEmail.sendKeys("abc123@gmail.com");
		createAccount.click();
		Thread.sleep(5000);
		firstName.sendKeys("hello");
		Thread.sleep(3000);
		lastName.sendKeys("world");
		Thread.sleep(3000);
		password.sendKeys("12345");
		Thread.sleep(3000);
		confirmPassword.sendKeys("123456789");
		Thread.sleep(3000);
		privacyCheck.click();
		Thread.sleep(3000);
		createAccountButton.click();
		Thread.sleep(3000);
		
		String error1 = PasswordError.getText();
		System.out.println("Error occured: "+error1);	
		Thread.sleep(3000);
		
		password.clear();
		Thread.sleep(3000);
		password.sendKeys("123456");
		Thread.sleep(3000);
		createAccountButton.click();
		Thread.sleep(3000);
		String error2 = ConfirmPasswordError.getText();
		System.out.println("Error occured: "+error2);	
		Thread.sleep(3000);


	}

}
