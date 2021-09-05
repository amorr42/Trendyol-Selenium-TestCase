package pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.TestUtility;

public class LandingPage extends TestUtility {
	
	public LandingPage() {
		super(driver);
	}
	
	public By homeLoginButton = By.xpath("//p[contains(text(),'Giriş Yap')]");
	public By addBasket = By.xpath("//div[@class='add-to-basket-button-text']");
	
	
	public LoginPage clickHomeLogin() {
		clickWithFindElement(homeLoginButton);
		return new LoginPage();	
	}
	
public HomePage clickRandomProduct() {
		
		List<WebElement> product_list = driver.findElements(By.xpath("//div[@class='p-card-wrppr']"));
		
	    Random rand = new Random();
		int rndIndex = rand.nextInt(product_list.size());
		
	        if (product_list.size() > 0) 
	        {
	        	product_list.get(rndIndex).click();
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }  
	        } 
	        else 
	        {
	            log.error("Tab listesindeki elemente tiklanamadi");
	        }
		return new HomePage();
				
	}

	public HomePage addProductBasket() {
		
		scrollByVisibleElement(addBasket);
		return new HomePage();		
			
	}
	
	
}
