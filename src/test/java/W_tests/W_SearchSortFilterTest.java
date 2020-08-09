package W_tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import W_base.W_TestBase;
import W_pages.W_SearchSortFilter;

public class W_SearchSortFilterTest extends W_TestBase {
	
	W_SearchSortFilter w_searchsortfilter;
	
	public W_SearchSortFilterTest(){
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization(); // called this method from TestBase class
		w_searchsortfilter = new W_SearchSortFilter(); // created LoginPage class object
	}
	
//	@Test
//	public void verifyCountsTest() throws InterruptedException {
//		w_searchsortfilter.verifyCounts();
//	}
//	
//	@Test
//	public void verifySearch_Filter_Sort_Test() throws InterruptedException {
//		w_searchsortfilter.verifySearch_Filter_Sort();
//	}
	
	@Test
	public void verifyCategory_Filter_Sort_Test() throws InterruptedException {
		w_searchsortfilter.verifyCategory_Filter_Sort();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
