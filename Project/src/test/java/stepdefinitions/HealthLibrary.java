package stepdefinitions;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HealthLibraryPageActions;

public class HealthLibrary {
     ExtentTest test;
    HealthLibraryPageActions ha;

/**
 * Method Name: i_am_on_cleveland_clinic
 * Description: Initializes test reporting and sets up the HealthLibraryPageActions instance.
 * Author Name: Arun Kumar
 * Return Type: void
 */

    @Given("I am on clevelandClinic.")
public void i_am_on_cleveland_clinic() {
    try{
        test=Hooks.report.createTest("test01");
        ha=new HealthLibraryPageActions(test);
   }catch(Exception e){
    e.printStackTrace();
   }
}

/**
 * Method Name: i_scroll_to_health
 * Description: Scrolls to the Health Library section on the webpage.
 * Author Name: Arun Kumar
 * Return Type: void
 */

@When("I scroll to health.")
public void i_scroll_to_health() {
    try{
       ha.health();
   }catch(Exception e){
    e.printStackTrace();
   }
}

/**
 * Method Name: i_click_on_diseases_and_conditions
 * Description: Clicks on the Diseases and Conditions section.
 * Author Name: Arun Kumar
 * Return Type: void
 */


@When("I click on diseases and conditions.")
public void i_click_on_diseases_and_conditions() {
    try{
        ha.diseases();

   }catch(Exception e){
    e.printStackTrace();
   }
}

/**
 * Method Name: i_click_on_diagnostics
 * Description: Clicks on the Diagnostics section.
 * Author Name: Arun Kumar
 * Return Type: void
 */

@When("I click on Diagnostics.")
public void i_click_on_diagnostics() {
    try{
        ha.diagnostics();

   }catch(Exception e){
    e.printStackTrace();
   }
}
/**
 * Method Name: i_click_on_treatments
 * Description: Clicks on the Treatments section.
 * Author Name: Arun Kumar
 * Return Type: void
 */

@When("I click on treatments.")
public void i_click_on_treatments() {
    try{
        ha.treatments();

   }catch(Exception e){
    e.printStackTrace();
   }
}
/**
 * Method Name: i_click_on_organs
 * Description: Clicks on the Organs and Body Systems section.
 * Author Name: Arun Kumar
 * Return Type: void
 */

@When("I click on  organs.")
public void i_click_on_organs() {
    try{
        ha.organs();

   }catch(Exception e){
    e.printStackTrace();
   }
}

/**
 * Method Name: i_click_on_drugs
 * Description: Clicks on the Drugs and Devices section.
 * Author Name: Arun Kumar
 * Return Type: void
 */

@When("I click on  drugs.")
public void i_click_on_drugs() {
    try{
        ha.drugs();

   }catch(Exception e){
    e.printStackTrace();
   }
}
}