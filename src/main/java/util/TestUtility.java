package util;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.BasePage;

public class TestUtility extends BasePage{
	
	public TestUtility(WebDriver driver) {
		super(driver);
	}
	
	protected void waitVisibility(By element) {
		wait = new WebDriverWait(driver, 10, 1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
 
	protected void waitClickable(By element) {    	
		wait = new WebDriverWait(driver, 10, 1000);
	 	wait.until(ExpectedConditions.elementToBeClickable(element));
 	}
	    
	protected void clickWithFindElement(By element) {	 
        waitVisibility(element);
        waitClickable(element);
        driver.findElement(element).click(); 
    }
	
	protected void writeText(By elementBy, String text) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }
			
	protected void scrollByVisibleElement(By element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(element);
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
}	