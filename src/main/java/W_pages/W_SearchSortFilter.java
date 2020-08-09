package W_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import W_base.W_TestBase;

public class W_SearchSortFilter extends W_TestBase {
	
	Actions action = new Actions(driver);
	
	// Page Factory
	
	//Count Example
	@FindBy(xpath = "//span[@class='css-1k7qv8r e1xmck041']")
	WebElement Grocery;
	
	@FindBy(xpath = "//div[@id='riHzES5']//div[1]//a[1]//article[1]")
	WebElement FruitsVeg;
	
	@FindBy(xpath = "//div[contains(@class,'imgtile_title')]//span[contains(text(),'Apples')]")
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
	
	@FindBy(xpath = "//button[contains(text(),'Customer Rating')]")
	WebElement ratingFilter;
	
	@FindBy(xpath = "//li[@id='rmi-customerrating-id-0']//a")
	WebElement fiveRating;
	
	@FindBy(xpath = "//a[contains(text(),'Newest')]")
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
				FruitsVeg.click();
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
				ratingFilter.click();
				Thread.sleep(2000);
				fiveRating.click();
				Thread.sleep(6000);
				newestSort.click();
				Thread.sleep(5000);
			}
			
			public void verifyCategory_Filter_Sort() throws InterruptedException {
				electronics.click();
				Thread.sleep(5000);
				brandFilter.click();
				Thread.sleep(5000);
				appleBrand.click();
				Thread.sleep(9000);
				ipodSort.click();
				Thread.sleep(5000);
			}

}
