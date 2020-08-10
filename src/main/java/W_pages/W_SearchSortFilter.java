package W_pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import W_base.W_TestBase;

public class W_SearchSortFilter extends W_TestBase {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	Actions action = new Actions(driver);
	
	// Page Factory
	
	//Count Example
	@FindBy(xpath = "//span[@class='css-1k7qv8r e1xmck041']")
	WebElement Grocery;
	
	@FindBy(xpath = "//div[@id='riHzES5']//div[1]//a[1]//article[1]")
	WebElement FruitsVeg;
	
	@FindBy(xpath = "//div[@class='imgtile_title']//span[contains(text(),'Apples')]")
	WebElement Apple;
	
	@FindBy(id = "shelf-sort-count")
	WebElement ShelfCount;
	
	//Search_Filter_Sort Example 
	@FindBy(xpath = "//input[@placeholder='What are you looking for?']")
	WebElement search;
	
	@FindBy(xpath = "//button[@class='css-1pgwcoa e1xoeh2i2']")
	WebElement searchbutton;
	
	@FindBy(xpath = "//button[contains(text(),'Price')]")
	WebElement priceFilter;
	
	@FindBy(xpath = "//span[contains(text(),'Under $1')]")
	WebElement under1filter;
	
	@FindBy(xpath = "//label[contains(text(),'Colour')]")
	WebElement colorFilter;
	
	@FindBy(xpath = "//span[contains(text(),'Black')]")
	WebElement blackColor;
	
	@FindBy(xpath = "//div[@class='css-iz0wk1 eyeokp24'][contains(text(),'Best Match')]")
	WebElement sort;
	
	@FindBy(xpath = "//span[contains(text(),'Newest')]")
	WebElement newestSort;
	
	//Category_Filter_Sort Example
	@FindBy(xpath = "//a[contains(text(),'Electronics')]")
	WebElement electronics;
	
	@FindBy(xpath = "//button[contains(text(),'Brand')]")
	WebElement brandFilter;
	
	@FindBy(xpath = "//span[contains(text(),'Apple')]")
	WebElement appleBrand;
	
	@FindBy(xpath = "//span[contains(text(),'iPod')]")
	WebElement ipodSort;
	
	
	
	
	
	// Initializing Page Objects
			public W_SearchSortFilter() {
				PageFactory.initElements(driver, this); // this keyword will initialize all the object we have created for this
														// class to the driver
			}
			
	// Actions
	
			public void verifyCounts() throws InterruptedException {
				Grocery.click();
				Thread.sleep(5000);
				js.executeScript("window.scrollBy(0,350)", "");
				Thread.sleep(5000);
				FruitsVeg.click();
				Thread.sleep(5000);
				js.executeScript("window.scrollBy(0,650)", "");
				Thread.sleep(5000);
				Apple.click();
				Thread.sleep(5000);
				String totalcount = ShelfCount.getText();
				System.out.println("Total count of Apple products: "+totalcount);
			}
			
			public void verifySearch_Filter_Sort() throws InterruptedException {
				search.sendKeys("iphone");
				Thread.sleep(2000);
				searchbutton.click();
				Thread.sleep(5000);
				js.executeScript("window.scrollBy(0,750)", "");
				Thread.sleep(5000);
				colorFilter.click();
				Thread.sleep(2000);
				blackColor.click();
				Thread.sleep(8000);
				sort.click();
				Thread.sleep(4000);
				newestSort.click();
				Thread.sleep(5000);
			}
			
			public void verifyCategory_Filter_Sort() throws InterruptedException {
				electronics.click();
				Thread.sleep(7000);
				js.executeScript("window.scrollBy(0,1450)", "");
				Thread.sleep(5000);
				brandFilter.click();
				Thread.sleep(5000);
				appleBrand.click();
				Thread.sleep(9000);
				js.executeScript("window.scrollBy(0,550)", "");
				Thread.sleep(5000);
				ipodSort.click();
				Thread.sleep(5000);
			}

}
