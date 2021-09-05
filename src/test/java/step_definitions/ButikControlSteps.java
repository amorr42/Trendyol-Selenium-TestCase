package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.HomePage;
import pages.LoginPage;

public class ButikControlSteps {
	
	HomePage homePage;
	LoginPage loginPage = new LoginPage();
	
	
	@Then("^KADIN tabına basar$")
	public void kadın_tabına_basar() throws Throwable {		
		homePage = loginPage.clickTabKadın();		
	}

	@And("^Butik imajları kontrol eder$")
	public void butik_imajları_kontrol_eder() throws Throwable {
	   homePage = loginPage.controlImg();	   
	}

	@Then("^ERKEK tabına basar$")
	public void erkek_tabına_basar() throws Throwable {
		homePage = loginPage.clickTabErkek();			
	}
	
	@Then("^ÇOCUK tabına basar$")
	public void çocuk_tabına_basar() throws Throwable {
		homePage = loginPage.clickTabCocuk();
	}

	@Then("^EV & YAŞAM tabına basar$")
	public void ev_YAŞAM_tabına_basar() throws Throwable {
		homePage = loginPage.clickTabEvYasam();
	}

	@Then("^SÜPERMARKET tabına basar$")
	public void süpermarket_tabına_basar() throws Throwable {
		homePage = loginPage.clickTabSupermarket();
	}

	@Then("^KOZMETİK tabına basar$")
	public void kozmetik_tabına_basar() throws Throwable {
		homePage = loginPage.clickTabKozmetik();
	}

	@Then("^AYAKKABI & ÇANTA tabına basar$")
	public void ayakkabı_ÇANTA_tabına_basar() throws Throwable {
		homePage = loginPage.clickTabAyakkabıCanta();
	}

	@Then("^SAAT & AKSESUAR tabına basar$")
	public void saat_AKSESUAR_tabına_basar() throws Throwable {
		homePage = loginPage.clickTabSaatAksesuar();
	}

	@Then("^ELEKTRONİK tabına basar$")
	public void elektronik_tabına_basar() throws Throwable {
		homePage = loginPage.clickTabElektronik();
	}

	@Then("^SPOR&OUTDOOR tabına basar$")
	public void spor_OUTDOOR_tabına_basar() throws Throwable {
		homePage = loginPage.clickTabSporOutdoor();
	}
	
	@Then("^Rastgele bir butik seçer$")
	public void rastgele_bir_butik_seçer() throws Throwable {
		homePage = loginPage.clickRandomButik();
		Thread.sleep(5000);
		
	}
	
	@Then("^Ürün görsellerini kontrol eder$")
	public void ürün_görsellerini_kontrol_eder() throws Throwable {
		homePage = loginPage.controlImg();
	}
	
	@Then("^Herhangi bir ürünün detayına gider$")
	public void herhangi_bir_ürünün_detayına_gider() throws Throwable {
		loginPage.clickRandomProduct();
	}
	
	@Then("^Ürünü sepete ekler$")
	public void ürünü_sepete_ekler() throws Throwable {
	    loginPage.addProductBasket();
	}
	
}
