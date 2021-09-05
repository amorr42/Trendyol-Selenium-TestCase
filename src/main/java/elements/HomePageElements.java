package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.TestUtility;

public class HomePageElements extends TestUtility {
	
	public HomePageElements(WebDriver driver) {
		super(driver);
	}
	
	public By closePopup = By.xpath("//*[@class=\"modal-close\"]");
	
	
	
	
	
	
}
