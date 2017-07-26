package com.hdfc.base;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppBase {
	public static WebDriver driver;	
	public WebDriverWait pwait;
	public void OpenBrowser(String browser){
		//applogs.debug("Browser opening");
		if(browser.equalsIgnoreCase("firefox")){			
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}else if(browser.equals("ie")){			
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
		}else if(browser.equalsIgnoreCase("chrome")){
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		
	}
	public void propwait(String prop){
		pwait=new WebDriverWait(driver, 30);
		pwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop)));
	}
	
	public void navigate(String url){		
		driver.get(url);
		
	}
	
	
	public void closeBrowser(){
		driver.quit();
	}
	String mainwindow=null;
	String popupwindow=null;
	String selectwindow=null;
	public void selectwindow(){		
		Set<String> allwindowids=driver.getWindowHandles();
		Iterator< String> iter=allwindowids.iterator();
		while(iter.hasNext()){
			mainwindow=iter.next();
			popupwindow=iter.next();
		}
		driver.switchTo().window(popupwindow);
	}
	

}
