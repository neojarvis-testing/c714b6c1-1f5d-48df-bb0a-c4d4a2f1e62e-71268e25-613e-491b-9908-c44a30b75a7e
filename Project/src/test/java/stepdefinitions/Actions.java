package stepdefinitions;
 
import com.aventstack.extentreports.ExtentTest;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ActionsActions;
 
public class Actions {
ExtentTest test= Hooks.report.createTest("Red Eye");
ActionsActions actionsObj= new ActionsActions(test);
/**
 * - Author - Hrushikesh
 * - MethodName - im_on_cleveland_clinic_webpage
 * - Description - Initializes the test scenario by navigating to the Cleveland Clinic webpage.
 */
@Given("Im on Cleveland Clinic Webpage.")
public void im_on_cleveland_clinic_webpage() {
   
}
/**
 * - Author - Hrushikesh
 * - MethodName - i_click_on_appointments_and_access
 * - Description - Verifies the actions section and clicks on the "Appointments and Access" option.
 */
@When("I click on Appointments and Access")
public void i_click_on_appointments_and_access() {
    actionsObj.verifyActionsSec();
    actionsObj.clickOnAppointments();
}
/**
 * - Author - Hrushikesh
 * - MethodName - i_click_on_accepted_insurance
 * - Description - Clicks on the "Accepted Insurance" option from the menu.
 */
@When("I click on Accepted Insurance")
public void i_click_on_accepted_insurance() {
  actionsObj.clickOnInsurance();
}
/**
 * - Author - Hrushikesh
 * - MethodName - i_click_on_events_calendar
 * - Description - Clicks on the "Events Calendar" option to view upcoming events.
 */
@When("I click on Events Calendar")
public void i_click_on_events_calendar() {
   actionsObj.clickOnEvent();
}
/**
 * - Author - Hrushikesh
 * - MethodName - i_click_on_financial_assisstance
 * - Description - Clicks on the "Financial Assistance" option to explore available services.
 */
@When("I click on Financial Assisstance")
public void i_click_on_financial_assisstance() {
  actionsObj.clickOnFinance();
}
/**
 * - Author - Hrushikesh
 * - MethodName - i_click_on_give_to_cleveland_clinic
 * - Description - Clicks on the "Give to Cleveland Clinic" option to view donation opportunities.
 */
@When("I click on Give to Cleveland clinic")
public void i_click_on_give_to_cleveland_clinic() {
    actionsObj.clickOnCleveLand();
}
/**
 * - Author - Hrushikesh
 * - MethodName - i_click_on_pay_your_bill_online
 * - Description - Clicks on the "Pay your Bill Online" option to access the payment section.
 */
@When("I click on Pay your Bill online")
public void i_click_on_pay_your_bill_online() {
    actionsObj.clickOnPayBill();
}
/**
 * - Author - Hrushikesh
 * - MethodName - i_click_on_price_transparency
 * - Description - Clicks on the "Price Transparency" option to view pricing details.
 */
@When("I click on Price Transparency")
public void i_click_on_price_transparency() {
   actionsObj.clickOnPrice();
}
/**
 * - Author - Hrushikesh
 * - MethodName - i_click_on_refer_a_patient
 * - Description - Clicks on the "Refer a Patient" option to navigate to the referral page.
 */
@When("I click on Refer a patient")
public void i_click_on_refer_a_patient() {
    actionsObj.clickOnRefer();
}
/**
 * - Author - Hrushikesh
 * - MethodName - i_click_on_phone_directory
 * - Description - Clicks on the "Phone Directory" option to access the directory page.
 */
@When("I click on Phone Directory")
public void i_click_on_phone_directory() {
    actionsObj.clickOnPhone();
}
/**
 * - Author - Hrushikesh
 * - MethodName - i_click_on_virtual_second_opinions
 * - Description - Clicks on the "Virtual Second Opinions" option to access virtual consultations.
 */
@When("I click on Virtual Second Opinions")
public void i_click_on_virtual_second_opinions() {
 actionsObj.clickOnSecondOpi();
}
/**
 * - Author - Hrushikesh
 * - MethodName - i_click_on_virtual_visits
 * - Description - Clicks on the "Virtual Visits" option to explore virtual appointment services.
 */
@When("I click on Virtual Visits")
public void i_click_on_virtual_visits() {
    actionsObj.clickOnVirtual();
}
/**
 * - Author - Hrushikesh
 * - MethodName - i_click_on_cleveland_logo
 * - Description - Clicks on the "Cleveland Clinic Logo" to navigate back to the homepage.
 */
@Then("I click on Cleveland Logo")
public void i_click_on_cleveland_logo() {
  actionsObj.clickonCleveImg();
}
}