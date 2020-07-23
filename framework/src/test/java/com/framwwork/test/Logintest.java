package com.framwwork.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.framework.pages.Baseclass;
import com.framework.pages.Loginpage;
import com.framework.utility.ExcelDataProvider;

public class Logintest extends Baseclass

{
	
	@Test
	
	public void loginapp()
	
	{
		
	
	ExcelDataProvider excel = new ExcelDataProvider();
	

	Loginpage loginPage = PageFactory.initElements(driver, Loginpage.class);
	
	loginPage.loginToRefined(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

	
}
	
}
