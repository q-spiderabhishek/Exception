package com.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Welcomepage {
	
WebDriver driver;
	
	public Welcomepage(WebDriver ldriver)
	
	{
		this.driver=ldriver;
	}
	
	@FindBy(xpath="//h2[contains(text(),'Property List')]") WebElement plist;
	
	@FindBy(xpath="//body[@class='ng-scope']/div[@id='mainBody']/div[@class='container']/div[@class='row']/div[@class='col-md-12']/div[@class='ng-scope']/div[@class='row ng-scope']/div[@class='ng-scope']/div[@class='ng-scope']/div[@class='ng-scope']/div[@class='col-md-12']/div[@class='ng-scope']/div[@class='row ng-scope']/div[@class='col-md-12']/div[@class='pull-right']/div[@class='left-inner-addon']/input[1]") WebElement flr;

	@FindBy(xpath="fe") WebElement Eicon;
	
	@FindBy(xpath="//button[@class='icon-menu i-large pointer hamburger-menu']") WebElement Sidemenu;

	@FindBy(xpath="//li[@class='ng-scope']//span[contains(text(),'Environmental Reports')]") WebElement Submenu;

	@FindBy(xpath="//span[@class='pointer-underline ng-binding']") WebElement txt;
	
   public void WelcomeToRefined(String fltr) ////li[@id='propertyListEnvironmental-0']//i[@class='icon-leaf i-green-med']
	
	{
		
		try {
			Thread.sleep(40000);
		} catch (InterruptedException e) {
			
		}
		
		plist.isDisplayed();
		
		
		
		Assert.assertTrue(plist.isDisplayed());
		flr.sendKeys(fltr);
       
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
		}
		Eicon.click();
        
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			
		}
		
		     String  TX = txt.getText();
			
	     	String actualtext = "Risk Test Prop 01 - 123";
			Assert.assertEquals(TX, actualtext);
	        
		
     	Assert.assertTrue(true, txt.getText());
        

		Sidemenu.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
		}
		
		Submenu.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
	
		}
	
		}	


}
