package com.hdfc.testcases;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;

import com.hdfc.base.AppBase;
import com.hdfc.pages.GetElegibilityPage;
import com.hdfc.pages.HomePage;
import com.hdfc.pages.SuperBikePage;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Stepdefinitions extends AppBase{
	AppBase cucumber=new AppBase();
public SuperBikePage sp=PageFactory.initElements(driver, SuperBikePage.class);
@Given("^I open \"([^\"]*)\" browser$")
public void I_open_browser(String browser) throws Throwable {
   System.out.println("I open browser "+browser);
   cucumber.OpenBrowser(browser);
}

@When("^I naviagte to \"([^\"]*)\" url$")
public void I_naviagte_to_url(String url) throws Throwable {
  System.out.println("I navigate to url"+ url);
  cucumber.navigate(url);
}

@When("^I click ccicon and go to ccform page$")
public GetElegibilityPage I_click_ccicon_and_go_to_ccform_page() throws Throwable {
    System.out.println("I click ccicon and go to ccform page");
    HomePage hp=PageFactory.initElements(driver, HomePage.class);
    return hp.gotogetele();
}


@When("^select getelegibility page window$")
public void select_getelegibility_page_window() throws Throwable {
    System.out.println("select getelegibility page window");
   cucumber.selectwindow();
}


@Given("^I filled all the fields in the form and clicked on calc elegibility button$")
public void I_filled_all_the_fields_in_the_form_and_clicked_on_calc_elegibility_button(DataTable table) throws Throwable {
   System.out.println("I filled all the fields in the form and clicked on calc elegibility button");
   GetElegibilityPage gp=PageFactory.initElements(driver, GetElegibilityPage.class);
   List<Map<String, String>>  data=table.asMaps();
   System.out.println(data.get(0).get("location"));
   gp.gotoDesideToApplyPage(data.get(0).get("location"), data.get(0).get("residency"), data.get(0).get("dobda"), data.get(0).get("dobmo"), data.get(0).get("dobye"), 
   data.get(0).get("empty"), data.get(0).get("companyname"), data.get(0).get("incomedetails"));
}
@Given("^I enter \"([^\"]*)\" in the name field$")
public void I_enter_in_the_name_field(String username) throws Throwable {
    System.out.println("I enter username");
    SuperBikePage sp=PageFactory.initElements(driver, SuperBikePage.class);
    sp.entername(username);
	
}

@When("^I enter \"([^\"]*)\" in the mobile field$")
public void I_enter_in_the_mobile_field(String mobile) throws Throwable {
	 System.out.println("I enter in the mobile fields");
	// SuperBikePage sp=PageFactory.initElements(driver, SuperBikePage.class);
	    sp.entermobile(mobile);
	 
}

@When("^I enter \"([^\"]*)\" in the email field$")
public void I_enter_in_the_email_field(String email) throws Throwable {
	 System.out.println("I enter in the email fields");
	// SuperBikePage sp=PageFactory.initElements(driver, SuperBikePage.class);
	    sp.enteremail(email);
}
@And("^I click on submit$")
public void  I_click_on_submit()
{
	System.out.println(" I click on submit");
	// SuperBikePage sp=PageFactory.initElements(driver, SuperBikePage.class);
	    sp.clicksubmit();
}
  

}
