package W_base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import W_util.W_TestUtil;
import W_util.W_WebEventListener;

public class W_TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static W_WebEventListener eventListener;
	
	


	public W_TestBase() {

		try {
			prop = new Properties(); // to get properties from config.properties file
			FileInputStream ip = new FileInputStream(
					"/Users/BlacK_BearD/eclipse-workspace/WalmartProject/src/main/java/W_config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void initialization(){
		
		
        String browserName = prop.getProperty("browser");
        
        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "/Users/BlacK_BearD/eclipse-workspace/WalmartProject/chromedriver");    
            driver = new ChromeDriver();
        }
        else if(browserName.equals("Firefox")){
            System.setProperty("webdriver.gecko.driver", "/Users/BlacK_BearD/eclipse-workspace/Auto1/geckodriver");    
            driver = new FirefoxDriver();
        }
        
        e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new W_WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
        
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(W_TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(W_TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        
        driver.get(prop.getProperty("url"));
	}

}
