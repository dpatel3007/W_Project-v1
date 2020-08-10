package W_tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import W_base.W_TestBase;
import W_pages.W_ProductBuyFlow;


public class W_ProductBuyFlowTest extends W_TestBase {
	
	W_ProductBuyFlow w_productbuyflow;
	
	public W_ProductBuyFlowTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization(); // called this method from TestBase class
		w_productbuyflow = new W_ProductBuyFlow(); // created LoginPage class object
	}
	
	@Test
	public void checkoutAsGuestTest() throws InterruptedException {
		w_productbuyflow.checkoutAsGuest();
	}
	
	@Test
	public void decreaseQuantityFromCartTest() throws InterruptedException {
		w_productbuyflow.decreaseQuantityFromCart();
	}
	
	@Test
	public void emoveProductFromCartTest() throws InterruptedException {
		w_productbuyflow.removeProductFromCart();
	}
	
	@Test
	public void clickingProductFromCartTest() throws InterruptedException {
		w_productbuyflow.clickingProductFromCart();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
