package com.hdfc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuperBikePage {
	public WebDriver driver;
	public SuperBikePage(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(xpath="//*[@id='lcform_name']")
	WebElement name;
	@FindBy(xpath="//*[@id='lcform_mobile']")
	WebElement mobile;
	@FindBy(xpath="//*[@id='lcform_email']")
	WebElement email;
	@FindBy(xpath="//*[@id='lcform_0']")
	WebElement submit;
	public thankspage entername(String myname)
	{
		name.sendKeys(myname);
		
		return PageFactory.initElements(driver, thankspage.class);
		
	}
	public thankspage entermobile(String mymobile)
	{
		mobile.sendKeys(mymobile);
		
		return PageFactory.initElements(driver, thankspage.class);
		
	}
	public thankspage enteremail(String myemail)
	{
		email.sendKeys(myemail);
		
		return PageFactory.initElements(driver, thankspage.class);
		
		
	}
	public thankspage clicksubmit()
	{
		submit.click();
		
		return PageFactory.initElements(driver, thankspage.class);
		
		
	}
}
