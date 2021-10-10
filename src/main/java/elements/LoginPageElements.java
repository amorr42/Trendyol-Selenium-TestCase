package elements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.TestUtility;


public class LoginPageElements extends TestUtility {

	public LoginPageElements(WebDriver driver) {
		super(driver);
	}
	
	public By username = By.id("login-email"); 
	public By password = By.id("login-password-input");
	protected String user = "";
	protected String pass = "";
	public By loginButton = By.xpath("//button[@type='submit']"); 
	public By tabKadın = By.xpath("//a[@class='category-header'][contains(text(),'Kadın')]"); 
	public By tabErkek = By.xpath("//a[@class='category-header'][normalize-space()='Erkek']"); 
	public By tabCocuk = By.xpath("//a[normalize-space()='Çocuk']"); 
	public By tabEvYasam = By.xpath("//a[contains(text(),'Ev & Yaşam')]"); 
	public By tabSupermarket = By.xpath("//a[normalize-space()='Süpermarket']"); 
	public By tabKozmetik = By.xpath("//a[@class='category-header'][normalize-space()='Kozmetik']"); 
	public By tabAyakkabıCanta = By.xpath("//a[contains(text(),'Ayakkabı & Çanta')]"); 
	public By tabSaatAksesuar = By.xpath("//a[@class='category-header'][normalize-space()='Saat & Aksesuar']"); 
	public By tabElektronik = By.xpath("//a[@class='category-header'][normalize-space()='Elektronik']");
	public By tabSporOutdoor = By.xpath("//a[normalize-space()='Spor&Outdoor']"); 
	public By addBasket = By.xpath("//div[@class='add-to-basket-button-text']");
	
	
	
}
