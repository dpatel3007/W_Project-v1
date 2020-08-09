package W_tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import W_base.W_TestBase;
import W_pages.W_MyAccountSettings;

public class W_MyAccountSettingsTest extends W_TestBase {
	
	W_MyAccountSettings w_myaccountsettings;
	
	public W_MyAccountSettingsTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization(); // called this method from TestBase class
		w_myaccountsettings = new W_MyAccountSettings(); 
	}
	
//	@Test
//	public void accountSignInTest() throws InterruptedException {
//		w_myaccountsettings.accountSignIn();
//	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
