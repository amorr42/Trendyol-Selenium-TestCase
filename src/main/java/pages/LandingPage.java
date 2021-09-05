package pages;

import org.openqa.selenium.By;

import util.TestUtility;

public class LandingPage extends TestUtility {
	
	public LandingPage() {
		super(driver);
	}
	
	public By homeLoginButton = By.xpath("//p[contains(text(),'Giriş Yap')]");
	
	public LoginPage clickHomeLogin() {
		clickWithFindElement(homeLoginButton);
		return new LoginPage();	
	}
	
}
