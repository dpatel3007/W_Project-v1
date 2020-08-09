package W_util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import W_base.W_TestBase;

public class W_TestUtil extends W_TestBase {

	
	// To define static page load and implicit wait time for entire project
	
			public static long PAGE_LOAD_TIMEOUT = 40;
			public static long IMPLICIT_WAIT = 30;
			
			public static void takeScreenshotAtEndOfTest() throws IOException {
				File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				String currentDir = System.getProperty("user.dir");
				FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
			}
}
