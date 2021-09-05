package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasePage {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	protected static Logger log  = Logger.getLogger(BasePage.class);
	public static Properties prop;
	public static String currentDirectory = System.getProperty("user.dir");
		
	
	public BasePage(WebDriver driver) {
		BasePage.driver=driver;
		wait = new WebDriverWait(driver, 30, 1000);
		
	}
	
	
	public BasePage() {
				
		PropertyConfigurator.configure("src/test/java/config/log4j.properties");
		prop = new Properties();
			
		try {
			
			FileInputStream fis = new FileInputStream(currentDirectory + "//src//test//java//config//config.properties");
			prop.load(fis);
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static WebDriver initializeWebDriver() {
				
		String browserName = prop.getProperty("browser") ;
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		switch(browserName) {
		case "chrome":		
			ChromeOptions optns = new ChromeOptions();
			optns.addArguments("disable-infobars");
			driver = new ChromeDriver(optns);
			log.info("Chrome basarili bir sekilde acildi");
			break;
		case "firefox":
			 FirefoxOptions options = new FirefoxOptions()
             .setProfile(new FirefoxProfile());
			 driver = new FirefoxDriver(options);
			 log.info("Firefox basarili bir sekilde acildi");
			break;
		case "ie":
			driver = new InternetExplorerDriver();
			log.info("ie basarili bir sekilde acildi");
			break;				
		default:
			driver =new ChromeDriver();
			break;
	  }
		
/*		
		if(browserName.equals("chrome")) {
			//driver = new ChromeDriver();
			ChromeOptions optns = new ChromeOptions();
			optns.addArguments("disable-infobars");
			driver = new ChromeDriver(optns);
			log.info("Chrome basarili bir sekilde acildi");
			
		}else if (browserName.equals("firefox")) {			
			 FirefoxOptions options = new FirefoxOptions()
                     .setProfile(new FirefoxProfile());
			 driver = new FirefoxDriver(options);
			 log.info("Firefox basarili bir sekilde acildi");
		} else {
			driver = new InternetExplorerDriver();
			log.info("ie basarili bir sekilde acildi");
		}
*/		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("pageLoadTimeout")), TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(prop.getProperty("implicitWaitTimeOut")), TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("baseUrl"));
		
		return driver;
	}
	
}
