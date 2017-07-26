package com.hdfc.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hdfc.base.AppBase;

public class HomePage {
	 public WebDriver driver;
		public HomePage(WebDriver driver)
		{
			this.driver=driver;
		}
		@FindBy(xpath="//*[@id='element2']/div[1]/div/div[5]/div[1]/div[1]/div[2]/div[4]/img[1]")						
		public static WebElement twlicon;
		
		@FindBy(xpath="//*[@id='element2']/div[1]/div/div[5]/div[1]/div[1]/div[2]/div[4]/div[1]/div/div/a[1]")
		public static WebElement Applynow;
		
		@FindBy(id="cee_closeBtn")
		public WebElement closebtn;
		
		public GetElegibilityPage gotogetele() throws Exception{
			closebtn.click();
			twlicon.click();
			Applynow.click();
			
			return PageFactory.initElements(driver, GetElegibilityPage.class);
			
		}
		
		
}
