package stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.ForProvidersPageActions;

public class ForProviders {
    ExtentTest test = Hooks.report.createTest("testcase01");
    ForProvidersPageActions pa;
/*
 * Method Name: i_am_on_cleveland_clinic_home_page
 * Description: Navigates to the Cleveland Clinic home page and initializes the ForProvidersPageActions instance.
 * Author Name: Arun Kumar
 * Return Type: void
 * Parameter List: None
 */

@Given("I am on clevelandClinic Home page.")
public void i_am_on_cleveland_clinic_home_page() {
   try{
        pa=new ForProvidersPageActions(test);
   }catch(Exception e){
    e.printStackTrace();
   }
}
/*
 * Method Name: i_scroll_down_to_forproviders
 * Description: Scrolls down to the "For Providers" section on the Cleveland Clinic home page.
 * Author Name: Arun Kumar
 * Return Type: void
 * Parameter List: None
 */

@When("I scroll down to forproviders.")
public void i_scroll_down_to_forproviders() {
    try{
      pa.forProviders();
   }catch(Exception e){
    e.printStackTrace();
   }
}
/*
 * Method Name: i_click_on_join_nursery
 * Description: Clicks the "Join Nursery" button to navigate to the related section or page.
 * Author Name: Arun Kumar
 * Return Type: void
 * Parameter List: None
 */

@When("I click on joinNursery.")
public void i_click_on_join_nursery() {
    try{
        pa.join();

   }catch(Exception e){
    e.printStackTrace();
   }
}
/*
 * Method Name: i_click_on_career
 * Description: Clicks the "Career" button to navigate to the careers section.
 * Author Name: Arun Kumar
 * Return Type: void
 * Parameter List: None
 */

@When("I click on career.")
public void i_click_on_career() {
    try{
        pa.career();

   }catch(Exception e){
    e.printStackTrace();
   }
}
/*
 * Method Name: i_click_on_career
 * Description: Clicks the "Career" button to navigate to the careers section.
 * Author Name: Arun Kumar
 * Return Type: void
 * Parameter List: None
 */

@When("I click on patient.")
public void i_click_on_patient() {
    try{
        pa.patient();

   }catch(Exception e){
    e.printStackTrace();
   }
}
}
