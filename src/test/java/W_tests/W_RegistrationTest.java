package W_tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import W_base.W_TestBase;
import W_pages.W_Registration;


public class W_RegistrationTest extends W_TestBase {
	
	W_Registration w_registration;
	
	public W_RegistrationTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization(); // called this method from TestBase class
		w_registration = new W_Registration(); 
	}
	
//	@Test(priority = 5)
//	public void verifyRegistrationValidTest() throws InterruptedException {
//		w_registration.registrationValid();
//	}
	
//	@Test(priority = 1)
//	public void verifyRegistrationInvalidEmailTest() throws InterruptedException {
//		w_registration.registrationInvalidEmail();
//	}
	
//	@Test(priority = 2)
//	public void verifyRegistrationInvalidFNTest() throws InterruptedException {
//		w_registration.registrationInvalidFirstName();
//	}
	
//	@Test(priority = 3)
//	public void verifyRegistrationInvalidLNTest() throws InterruptedException {
//		w_registration.registrationInvalidLastName();
//	}
	
	@Test(priority = 4)
	public void verifyRegistrationInvalidPassTest() throws InterruptedException {
		w_registration.registrationInvalidPassword();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
