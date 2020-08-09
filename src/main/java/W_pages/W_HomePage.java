package W_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import W_base.W_TestBase;

public class W_HomePage extends W_TestBase {
	
	Actions action = new Actions(driver);
	
	// Page Factory
	
	@FindBy(id = "sparklogo_Layer_1")
	WebElement logo;
	
	@FindBy(linkText = "Deals")
	WebElement HeaderDeals;
	
	@FindBy(xpath = "//a[contains(text(),'Back to School')]")
	WebElement HeaderBack2School;
	
	@FindBy(xpath = "//a[contains(text(),'Outdoor Living')]")
	WebElement HeaderOutdoorLiving;
	
	@FindBy(xpath = "//a[contains(text(),'Toys')]")
	WebElement HeaderToys;
	
	@FindBy(xpath = "//a[contains(text(),'Electronics')]")
	WebElement HeaderElectronics;
	
	@FindBy(xpath = "//a[contains(text(),'Clothing')]")
	WebElement HeaderClothing;
	
	@FindBy(xpath = "//div[@class='css-134ov3u eovdw9l0']//div[@class='css-1f9gjts']")
	WebElement BannerShipping;
	
	@FindBy(xpath = "//div[@class='css-1xnp7l4 eovdw9l0']//div[@class='css-1f9gjts']")
	WebElement BannerCovid19;
	
	@FindBy(xpath = "//div[@class='css-rfh23n eovdw9l0']//div[@class='css-1f9gjts']")
	WebElement BannerMarketplace;
	
	@FindBy(xpath = "//div[@class='css-z1ki15 eyx6dlf1']//div[1]//div[1]//a[1]//div[1]//div[1]")
	WebElement BannerCreditcard;
	
	@FindBy(xpath = "//div[@class='css-bjgw8l eyx6dlf0']//div[4]//div[1]//a[1]//div[1]//div[1]")
	WebElement BannerPhotoCenter;
	
	
	// Initializing Page Objects
		public W_HomePage() {
			PageFactory.initElements(driver, this); // this keyword will initialize all the object we have created for this
													// class to the driver
		}
		
	// Actions
		
		public W_HomePage verifyLogo() throws InterruptedException {
			logo.click();
			Thread.sleep(4000);
			return new W_HomePage();
		}

		//Header
		public void verifyHeaderDeals() throws InterruptedException {
			HeaderDeals.click();
			Thread.sleep(4000);
			String dealPageTitle = driver.getTitle();
			System.out.println("---> Navigating to "+dealPageTitle);
		}
		
		public void verifyHeaderBack2School() throws InterruptedException {
			HeaderBack2School.click();
			Thread.sleep(4000);
			String B2SPageTitle = driver.getTitle();
			System.out.println("---> Navigating to "+B2SPageTitle);
		}
		
		public void verifyHeaderOutdoorLiving() throws InterruptedException {
			HeaderOutdoorLiving.click();
			Thread.sleep(4000);
			String OutdoorLivingPageTitle = driver.getTitle();
			System.out.println("---> Navigating to "+OutdoorLivingPageTitle);
		}
		
		public void verifyHeaderToys() throws InterruptedException {
			HeaderToys.click();
			Thread.sleep(4000);
			String ToysPageTitle = driver.getTitle();
			System.out.println("---> Navigating to "+ToysPageTitle);
		}
		
		public void verifyHeaderElectronics() throws InterruptedException {
			HeaderElectronics.click();
			Thread.sleep(4000);
			String ElectronicsPageTitle = driver.getTitle();
			System.out.println("---> Navigating to "+ElectronicsPageTitle);
		}
		
		public void verifyHeaderClothing() throws InterruptedException {
			HeaderClothing.click();
			Thread.sleep(4000);
			String ClothingPageTitle = driver.getTitle();
			System.out.println("---> Navigating to "+ClothingPageTitle);
		}
		
		//Banners
		
		public void verifyBannerShipping() throws InterruptedException {
			BannerShipping.click();
			Thread.sleep(4000);
		}
		
		public void verifyBannerCovid19() throws InterruptedException {
			BannerCovid19.click();
			Thread.sleep(4000);
		}
		
		public void verifyBannerMarketplace() throws InterruptedException {
			BannerMarketplace.click();
			Thread.sleep(4000);
		}
		
		public void verifyBannerCreditcard() throws InterruptedException {
			BannerCreditcard.click();
			Thread.sleep(4000);
		}
		
		public void verifyBannerPhotoCenter() throws InterruptedException {
			BannerPhotoCenter.click();
			Thread.sleep(4000);
		}
	
	
	
	

}
