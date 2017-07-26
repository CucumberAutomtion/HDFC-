package com.hdfc.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetElegibilityPage {
	public WebDriver driver;
	public GetElegibilityPage(WebDriver driver){
	  this.driver=driver;
	}
	
	@FindBy(xpath="//*[@id='eForm_form_applicantPlaceHolder_residenceCity_value']")
	public WebElement location;
	
	@FindBy(xpath="//*[@id='eForm_form_details_applicant_residenceType']")
	public WebElement residency;
	
	@FindBy(xpath="//*[@id='wwctrl_eForm_form_applicantPlaceHolder_dob']/div[1]/label")
	public WebElement dobday;
	@FindBy(xpath="//*[@id='wwctrl_eForm_form_applicantPlaceHolder_dob']/div[3]/label")
	public WebElement dobmonth;
	@FindBy(xpath=".//*[@id='wwctrl_eForm_form_applicantPlaceHolder_dob']/div[5]/label")
	public WebElement dobyear;
	@FindBy(xpath="//*[@id='twoWheelerName5161']")
	public WebElement makemodel;
	@FindBy(xpath="//*[@id='eForm_form_details_bookedVehicletrue']")
	public WebElement bookedradio;
	@FindBy(xpath="//*[@id='eForm_form_details_applicant_employment_type']")
	public WebElement emptype;
	@FindBy(xpath="//*[@id='eForm_form_applicantPlaceHolder_companyName']")
	public WebElement company;
	@FindBy(xpath="//*[@id='eForm_form_details_applicant_income_grossMonthlyIncome']")
	public WebElement income;
	
	
	@FindBy(xpath="//*[@id='eForm_form_details_applicant_existingBankAccounts_0__bank_id2']")
	public WebElement hdfcac;
	@FindBy(xpath="//*[@id='eForm_0']")
	public WebElement calcelegibility;
	
	public SuperBikePage gotoDesideToApplyPage(String loc, String resi, String dobd, String dobm, String doby, String empt, String comp,String incom) throws Exception{
		location.sendKeys(loc);
		residency.sendKeys(resi);
		dobday.sendKeys(dobd);
		dobmonth.sendKeys(dobm);
		dobyear.sendKeys(doby);
		makemodel.click();
		Thread.sleep(2000);		
		bookedradio.click();
		Thread.sleep(2000);
		emptype.sendKeys(empt,Keys.TAB);
		company.sendKeys(comp);
		income.sendKeys(incom);
		hdfcac.click();
		calcelegibility.click();
		Thread.sleep(3000);
		return PageFactory.initElements(driver, SuperBikePage.class);
		
	}
	
	
}
