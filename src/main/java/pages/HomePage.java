package pages;



import org.openqa.selenium.WebElement;

import elements.HomePageElements;
import junit.framework.Assert;


public class HomePage extends HomePageElements {
	
	public HomePage() {
		super(driver);		
	}
	
	public void closeAdvert() {
		clickWithFindElement(closePopup);	
		
	}
	
	public void getTitle() {
		String title = "En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da";
		String homePageTitle = driver.getTitle();
		try {
			Assert.assertEquals(homePageTitle,title);
			log.info(homePageTitle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	
	
}
