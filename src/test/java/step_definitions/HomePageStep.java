package step_definitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;

public class HomePageStep {
	
	HomePage homePage;
	LandingPage landingPage;
	LoginPage loginPage;
	
	@Given("^Kullanıcı, Trendyol anasayfasını açar$")
	public void kullanıcı_Trendyol_anasayfasını_açar() {
		homePage = new HomePage();	  		
	}

	@Then("^Çıkan reklam kapatılır$")
	public void çıkan_reklam_kapatılır() {
		homePage.closeAdvert();		
	}
	
	@Then("^Kullanıcı, Trendyol Başlık ve GirişYap bilgisini görür$")
	public void kullanıcı_Trendyol_Başlık_ve_GirişYap_bilgisini_görür() throws Throwable {
	    homePage.getTitle();
	}

	
	@Then("^Giriş yap butonuna basar$")
	public void giriş_yap_butonuna_basar() {
		landingPage=new LandingPage();
		loginPage = landingPage.clickHomeLogin();	    
	}
	
	@When("^Kullanıcı ve Şifre ile sisteme giriş yapar$")
	public void kullanıcı_ve_Şifre_ile_sisteme_giriş_yapar() throws Throwable {
		homePage = loginPage.enterUserAndPass();
		Thread.sleep(3000);
		
	}

}
