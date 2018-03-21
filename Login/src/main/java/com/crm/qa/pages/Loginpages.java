package com.crm.qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Loginpages extends TestBase  {

	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	//@FindBy(xpath=("//*[@id='loginForm']/div/div/input"))
	//WebElement login;

	@FindBy(xpath=("//input[@class='btn btn-small']"))
	WebElement login;

	@FindBy(xpath=("//img[@class='img-responsive']"))
	WebElement logo;
	
	public Loginpages()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateloginpagetitle()
	{
		return driver.getTitle();
	}
	
	public boolean validatecrmimage()
	{
		return logo.isDisplayed();
	}

	public HomePage login(String un,String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
		
		return new HomePage();
	}
}
