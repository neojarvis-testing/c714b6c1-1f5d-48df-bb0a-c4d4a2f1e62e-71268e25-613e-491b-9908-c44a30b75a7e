package stepdefinitions;
 
import com.aventstack.extentreports.ExtentTest;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HealthActions;
 
public class Health {
 ExtentTest test= Hooks.report.createTest("Healthy Library");
 HealthActions healthObj = new HealthActions(test);
 /**
 * - Author - Hrushikesh
 * - MethodName - im_on_cleveland_clinic_website
 * - Description - Initializes the test scenario by navigating to the Cleveland Clinic website.
 */
    @Given("Im on Cleveland Clinic Website.")
public void im_on_cleveland_clinic_website() {
   
}
/**
 * - Author - Hrushikesh
 * - MethodName - i_click_on_health_library
 * - Description - Clicks on the "Health Library" option to explore health-related resources.
 */
@When("I click on Health Library")
public void i_click_on_health_library() {
    healthObj.clickOnHealthLibrary();
}
/**
 * - Author - Hrushikesh
 * - MethodName - i_click_on_body_systems_and_organs
 * - Description - Clicks on the "Body Systems and Organs" option to access related content.
 */
@When("I click on Body Systems and organs")
public void i_click_on_body_systems_and_organs() {
    healthObj.clickOnBody();
}
/**
 * - Author - Hrushikesh
 * - MethodName - i_enter
 * - Description - Enters the specified text (e.g., "Eyes") into the input field.
 * - param string - The text to be entered.
 */
@When("I Enter {string}")
public void i_enter(String string) {
    healthObj.enterEyes(string);
}
/**
 * - Author - Hrushikesh
 * - MethodName - i_click_on_eyes
 * - Description - Clicks on the "Eyes" section to view detailed information.
 */
@When("I click on Eyes")
public void i_click_on_eyes() {
    healthObj.clickOnEye();
}
/**
 * - Author - Hrushikesh
 * - MethodName - i_click_on_red_eyes
 * - Description - Clicks on the "Red Eyes" option to access related information.
 */
@Then("I click on Red Eyes")
public void i_click_on_red_eyes() {
    healthObj.clickOnRedEye();
}
}
