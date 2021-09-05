package pages;


import java.net.HttpURLConnection;

import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import elements.LoginPageElements;

public class LoginPage extends LoginPageElements {
	

	public LoginPage(){
		super(driver);
	}
	
	public HomePage enterUserAndPass() {		
		writeText(username,user);
		writeText(password,pass);
		clickWithFindElement(loginButton);
		return new HomePage();
	}
	
	public HomePage clickTabKadın() {
		clickWithFindElement(tabKadın);
		if (driver.getCurrentUrl().contains("butik/liste/1/kadin")) {
			log.info("1. sayfaya gecis yaptiniz");

		} else {
			log.error("1. sayfaya gidemediniz");
		}
		return new HomePage();
	}

	public HomePage controlImg() throws Exception {
		
		List<WebElement> image_list = driver.findElements(By.tagName("img"));
        log.info("The page under test has " + image_list.size() + " images");
        
        for (WebElement img : image_list) {
        	String imageSrc = img.getAttribute("src");
        	
        	try {
				URL url = new URL(imageSrc);
				URLConnection urlConnection = url.openConnection();
				HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
				httpURLConnection.setConnectTimeout(5000); 
				httpURLConnection.connect();
				
				if(httpURLConnection.getResponseCode() == 200) 
				{
				
					log.info(imageSrc + " >> " + httpURLConnection.getResponseCode() + ">>" + httpURLConnection.getResponseMessage());
				}
				else 
				{
					
					log.info(imageSrc + " >> " + httpURLConnection.getResponseCode() + ">>" + httpURLConnection.getResponseMessage());
					httpURLConnection.disconnect();
				}
			
			} catch (Exception e) {
				log.error(imageSrc);
			}
        	
        }
		return new HomePage();
	}
	
	public HomePage clickTabErkek() {
		clickWithFindElement(tabErkek);
		if (driver.getCurrentUrl().contains("butik/liste/2/erkek")) {
			log.info("2. sayfaya gecis yaptiniz");

		} else {
			log.error("2. sayfaya gidemediniz");
		}
		return new HomePage();
	}
	
	public HomePage clickTabCocuk() {
		clickWithFindElement(tabCocuk);
		if (driver.getCurrentUrl().contains("butik/liste/3/cocuk")) {
			log.info("3. sayfaya gecis yaptiniz");

		} else {
			log.error("3. sayfaya gidemediniz");
		}
		return new HomePage();
	}
	
	public HomePage clickTabEvYasam() {
		clickWithFindElement(tabEvYasam);
		if (driver.getCurrentUrl().contains("butik/liste/12/ev--yasam")) {
			log.info("4. sayfaya gecis yaptiniz");

		} else {
			log.error("4. sayfaya gidemediniz");
		}
		return new HomePage();
	}
	
	public HomePage clickTabSupermarket() {
		clickWithFindElement(tabSupermarket);
		if (driver.getCurrentUrl().contains("butik/liste/16/supermarket")) {
			log.info("5. sayfaya gecis yaptiniz");

		} else {
			log.error("5. sayfaya gidemediniz");
		}
		return new HomePage();
	}
	
	public HomePage clickTabKozmetik() {
		clickWithFindElement(tabKozmetik);
		if (driver.getCurrentUrl().contains("butik/liste/11/kozmetik")) {
			log.info("6. sayfaya gecis yaptiniz");

		} else {
			log.error("6. sayfaya gidemediniz");
		}
		return new HomePage();
	}
	
	public HomePage clickTabAyakkabıCanta() {
		clickWithFindElement(tabAyakkabıCanta);
		if (driver.getCurrentUrl().contains("butik/liste/9/ayakkabi--canta")) {
			log.info("7. sayfaya gecis yaptiniz");

		} else {
			log.error("7. sayfaya gidemediniz");
		}
		return new HomePage();
	}
	
	public HomePage clickTabSaatAksesuar() {
		clickWithFindElement(tabSaatAksesuar);
		if (driver.getCurrentUrl().contains("butik/liste/10/saat--aksesuar")) {
			log.info("4. sayfaya gecis yaptiniz");

		} else {
			log.error("4. sayfaya gidemediniz");
		}
		return new HomePage();
	}
	
	public HomePage clickTabElektronik() {
		clickWithFindElement(tabElektronik);
		if (driver.getCurrentUrl().contains("butik/liste/5/elektronik")) {
			log.info("10. sayfaya gecis yaptiniz");

		} else {
			log.error("10. sayfaya gidemediniz");
		}
		return new HomePage();
	}
	
	public HomePage clickTabSporOutdoor() {
		clickWithFindElement(tabSporOutdoor);
		if (driver.getCurrentUrl().contains("butik/liste/22/spor--outdoor")) {
			log.info("11. sayfaya gecis yaptiniz");

		} else {
			log.error("11. sayfaya gidemediniz");
		}
		return new HomePage();
	}
	
	public HomePage clickRandomButik() {
		
		List<WebElement> butik_list = driver.findElements(By.xpath("//a[@class='item']"));
		
	    Random rand = new Random();
		int randomIndex = rand.nextInt(butik_list.size());
		
	        if (butik_list.size() > 0) 
	        {
	        	butik_list.get(randomIndex).click();
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
	
	public void clickRandomProduct() {
		
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
				
	}

	public void addProductBasket() {
		
		scrollByVisibleElement(addBasket);		
			
	}
	
	
	
	
}
