package W_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import W_base.W_TestBase;

public class W_ProductBuyFlow extends W_TestBase {

	// Page Factory

	// Product Buy Flow

	@FindBy(xpath = "//input[@placeholder='What are you looking for?']")
	WebElement searchInput;

	@FindBy(xpath = "//button[@class='css-1pgwcoa e1xoeh2i2']")
	WebElement searchButton;

	@FindBy(xpath = "//div[@id='product-results']//div[1]//div[1]//a[1]//div[1]//img[1]")
	WebElement firstTshirt;

	@FindBy(xpath = "//button[contains(text(),'XXL')]")
	WebElement sizeXXL;

	@FindBy(xpath = "//button[@class='e5qqw234 css-13kan07 edzik9p0']")
	WebElement IncreaseQuantity;

	@FindBy(xpath = "//button[@class='css-1i45fk4 edzik9p0']")
	WebElement addToCart;

	@FindBy(xpath = "//button[contains(text(),'Checkout')]")
	WebElement checkout;

	@FindBy(xpath = "//div[@class='css-my1xja exmus2i6']//div[3]//div[2]")
	WebElement subtotal;

	@FindBy(xpath = "//div[10]//div[2]")
	WebElement estTotal;

	@FindBy(xpath = "//button[@class='css-1i45fk4 edzik9p0']")
	WebElement proceedToCheckout;

//	@FindBy(id = "email")
//	WebElement guestEmail;
//	
//	@FindBy(xpath = "//button[@class='css-1i45fk4 edzik9p0']")
//	WebElement nextButton;
//	
//	@FindBy(xpath = "//input[@id='firstName']")
//	WebElement fName;
//	
//	@FindBy(xpath = "//input[@id='lastName']")
//	WebElement lName;
//	
//	@FindBy(xpath = "//div[@class='css-1xh9jet ebu1q243']//div[3]//div[1]//div[2]//div[3]//button[1]")
//	WebElement pickupLocation;
//	
//	@FindBy(xpath = "//div[@class='css-jiqiin e8ao9pv3']")
//	WebElement confirmation;

	@FindBy(xpath = "//button[@class='e5qqw233 css-1lbiyzn edzik9p0']")
	WebElement decreaseQuantity;

	@FindBy(xpath = "//button[contains(text(),'Continue Shopping')]")
	WebElement continueShopping;

	@FindBy(xpath = "//div[@class='css-nk32ej e1nkqonp3']")
	WebElement cart;

	@FindBy(xpath = "//span[contains(text(),'X Remove')]")
	WebElement remove;
	
	@FindBy(xpath = "//a[@class='ei50f4d1 css-frpsc8 elkyjhv0']")
	WebElement productOnCart;

	// Initializing Page Objects
	public W_ProductBuyFlow() {
		PageFactory.initElements(driver, this); // this keyword will initialize all the object we have created for this
												// class to the driver
	}

	// Actions

	public void checkoutAsGuest() throws InterruptedException {

		searchInput.sendKeys("tshirt");
		Thread.sleep(3000);
		searchButton.click();
		Thread.sleep(3000);
		firstTshirt.click();
		Thread.sleep(5000);
		sizeXXL.click();
		Thread.sleep(5000);
		IncreaseQuantity.click();
		Thread.sleep(5000);
		addToCart.click();
		Thread.sleep(5000);
		checkout.click();
		Thread.sleep(5000);

		String Total = subtotal.getText();
		System.out.println("Subtotal of your item is :" + Total);

		String EstTotal = estTotal.getText();
		System.out.println("Estimated total of your item is :" + EstTotal);

		proceedToCheckout.click();
		Thread.sleep(3000);

	}

	public void decreaseQuantityFromCart() throws InterruptedException {

		searchInput.sendKeys("tshirt");
		Thread.sleep(3000);
		searchButton.click();
		Thread.sleep(3000);
		firstTshirt.click();
		Thread.sleep(5000);
		IncreaseQuantity.click();
		Thread.sleep(5000);
		addToCart.click();
		Thread.sleep(3000);
		continueShopping.click();
		Thread.sleep(3000);
		cart.click();
		Thread.sleep(3000);
		decreaseQuantity.click();
		Thread.sleep(3000);

		String Total = subtotal.getText();
		System.out.println("Subtotal of your item is :" + Total);

		String EstTotal = estTotal.getText();
		System.out.println("Estimated total of your item is :" + EstTotal);

	}

	public void removeProductFromCart() throws InterruptedException {

		searchInput.sendKeys("tshirt");
		Thread.sleep(3000);
		searchButton.click();
		Thread.sleep(3000);
		firstTshirt.click();
		Thread.sleep(5000);
		IncreaseQuantity.click();
		Thread.sleep(5000);
		addToCart.click();
		Thread.sleep(3000);
		continueShopping.click();
		Thread.sleep(3000);
		cart.click();
		Thread.sleep(3000);
		remove.click();
		Thread.sleep(5000);

	}

	public void clickingProductFromCart() throws InterruptedException {

		searchInput.sendKeys("tshirt");
		Thread.sleep(3000);
		searchButton.click();
		Thread.sleep(3000);
		firstTshirt.click();
		Thread.sleep(5000);
		addToCart.click();
		Thread.sleep(3000);
		continueShopping.click();
		Thread.sleep(3000);
		cart.click();
		Thread.sleep(3000);
		productOnCart.click();
		Thread.sleep(5000);
		

	}

}
