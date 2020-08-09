package W_tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import W_base.W_TestBase;
import W_pages.W_HomePage;

public class W_HomePageTest extends W_TestBase {
	
	W_HomePage w_homepage;
	
	public W_HomePageTest() {
		super(); // to use properties of parent class constructor
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization(); // called this method from TestBase class
		w_homepage = new W_HomePage(); 
		}
	
	@Test
	public void verifyLogoTest() throws InterruptedException {
		w_homepage.verifyLogo();
	}
	
//	@Test
//	public void HeaderDealsTest() throws InterruptedException {
//		w_homepage.verifyHeaderDeals();
//	}
//	
//	@Test
//	public void HeaderB2STest() throws InterruptedException {
//		w_homepage.verifyHeaderBack2School();
//	}
//	
//	@Test
//	public void HeaderOutdoorLivingTest() throws InterruptedException {
//		w_homepage.verifyHeaderOutdoorLiving();
//	}
//	
//	@Test
//	public void HeaderToysTest() throws InterruptedException {
//		w_homepage.verifyHeaderToys();
//	}
//	
//	@Test
//	public void HeaderElectronicsTest() throws InterruptedException {
//		w_homepage.verifyHeaderElectronics();
//	}
//	
//	@Test
//	public void HeaderClothingTest() throws InterruptedException {
//		w_homepage.verifyHeaderClothing();
//	}
	
//	@Test
//	public void BannerShippingTest() throws InterruptedException {
//		w_homepage.verifyBannerShipping();
//	}
//	
//	@Test
//	public void BannerCovid19Test() throws InterruptedException {
//		w_homepage.verifyBannerCovid19();
//	}
//	
//	@Test
//	public void BannerMarketplaceTest() throws InterruptedException {
//		w_homepage.verifyBannerMarketplace();
//	}
//	
//	@Test
//	public void BannerCreditcardTest() throws InterruptedException {
//		w_homepage.verifyBannerCreditcard();
//	}
//	
//	@Test
//	public void BannerPhotoCenterTest() throws InterruptedException {
//		w_homepage.verifyBannerPhotoCenter();
//	}
//	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
