package com.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	
	WebDriver driver;
	
	public Loginpage(WebDriver ldriver)

	{
		this.driver=ldriver;
	}

	@FindBy(name="username1") WebElement uname;
	
	@FindBy(name="password") WebElement pass;

	@FindBy(xpath="//button[contains(text(),'Sign in')]") WebElement signinButton;
	


	
	public void loginToRefined(String usernameapp,String passwordapp)
	
	{
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			
		}
		uname.sendKeys(usernameapp);
		pass.sendKeys(passwordapp);
		signinButton.click();
		
	}

	
}
