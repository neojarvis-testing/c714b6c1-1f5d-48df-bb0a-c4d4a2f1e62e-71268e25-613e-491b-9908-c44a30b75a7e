package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.OhioPageActions;

/*
 * a. ClassName : Ohio
 * b. Author : Dharen
 * c. Description : Defines step definitions for scenarios related to Cleveland Clinic's Ohio location and associated actions.
 */
public class Ohio {
    /*
     * a. Variable : test
     * b. Author : Dharen
     * c. Description : Holds the instance of ExtentTest for logging test steps and results.
     */
    ExtentTest test;

    /*
     * a. Variable : ohio
     * b. Author : Dharen
     * c. Description : Instance of OhioPageActions to perform actions on the Cleveland Clinic Ohio page.
     */
    OhioPageActions ohio;
    /*
     * a. Method name : i_am_on_cleveland_clinic_homepage
     * b. Author : Dharen
     * c. Description : Initializes the test report for the scenario and sets up the OhioPageActions instance.
     * d. Return type : void
     * e. Parameter list : None
     */
    @Given("I am on Cleveland Clinic Homepage.")
    public void i_am_on_cleveland_clinic_homepage() {
        test = Hooks.report.createTest("TestCase_02");
        ohio = new OhioPageActions(test);
    }

    /*
     * a. Method name : i_click_on_get_directions
     * b. Author : Dharen
     * c. Description : Triggers the action to click the "Get Directions" button on the page.
     * d. Return type : void
     * e. Parameter list : None
     */
    @When("I click on Get Directions.")
    public void i_click_on_get_directions() {
        ohio.clickOnGetDirection();
    }

    /*
     * a. Method name : i_enter_ohio
     * b. Author : Dharen
     * c. Description : Enters the text "Ohio" in the relevant input field on the page.
     * d. Return type : void
     * e. Parameter list : None
     */
    @When("I search {string}.")
    public void i_enter_ohio(String string) {
        ohio.enterOhio(string);
    }

    /*
     * a. Method name : i_click_on_location_type
     * b. Author : Dharen
     * c. Description : Clicks the dropdown or button to select a location type.
     * d. Return type : void
     * e. Parameter list : None
     */
    @When("I click on Location Type.")
    public void i_click_on_location_type() {
        ohio.locationtype();
    }

    /*
     * a. Method name : i_select_on_health_centers
     * b. Author : Dharen
     * c. Description : Selects "Health Centers" as the location type from the available options.
     * d. Return type : void
     * e. Parameter list : None
     */
    @When("I select on Health centers.")
    public void i_select_on_health_centers() {
        ohio.selecthealthcenters();
    }

    /*
     * a. Method name : i_select_on_imaging_radiology
     * b. Author : Dharen
     * c. Description : Selects "Imaging Radiology" as the specific type of health center.
     * d. Return type : void
     * e. Parameter list : None
     */
    @When("I select on Imaging Radiology.")
    public void i_select_on_imaging_radiology() {
        ohio.selectimagingradiology();
    }
}
