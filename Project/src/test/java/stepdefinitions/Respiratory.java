package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.RespiratoryPageActions;
/*
 * a. ClassName : Respiratory
 * b. Author : Dharen
 * c. Description : Defines step definitions for respiratory-related scenarios and interactions with the Cleveland Clinic homepage.
 */
public class Respiratory {
    /*
     * a. Variable : test
     * b. Author : Dharen
     * c. Description : Holds the ExtentTest instance for reporting test steps and results.
     */
    ExtentTest test;
    /*
     * a. Variable : respiratory
     * b. Author : Dharen
     * c. Description : Instance of RespiratoryPageActions for performing actions on the respiratory-related page elements.
     */
    RespiratoryPageActions respiratory;
    /*
     * a. Method name : i_am_on_clevel_and_clinic_homepage
     * b. Author : Dharen
     * c. Description : Initializes the test report and sets up the RespiratoryPageActions instance for the scenario.
     * d. Return type : void
     * e. Parameter list : None
     */
    @Given("I am on ClevelAnd Clinic Homepage.")
    public void i_am_on_clevel_and_clinic_homepage() {
        test = Hooks.report.createTest("TestCase_01");
        respiratory = new RespiratoryPageActions(test);
    }
    /*
     * a. Method name : i_click_on_search_bar
     * b. Author : Dharen
     * c. Description : Performs the action to click on the search bar on the Cleveland Clinic homepage.
     * d. Return type : void
     * e. Parameter list : None
     */
    @When("I click on search bar.")
    public void i_click_on_search_bar() {
        respiratory.clickOnSearchBar();
    }
    /*
     * a. Method name : i_i_enter_respiratory
     * b. Author : Dharen
     * c. Description : Sends the text "Respiratory" into the search bar on the page.
     * d. Return type : void
     * e. Parameter list : None
     */
    @When("I enter {string}.")
    public void i_enter(String string) {
        respiratory.sendRespiratory(string);
    }
    /*
     * a. Method name : i_click_on_respiratory
     * b. Author : Dharen
     * c. Description : Performs the action to click on the "Respiratory" search result or link.
     * d. Return type : void
     * e. Parameter list : None
     */
    @When("I click on Respiratory.")
    public void i_click_on_respiratory() {
        respiratory.clickRespiratory();
    }
}
