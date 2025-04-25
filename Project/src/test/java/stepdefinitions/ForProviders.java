package stepdefinitions;
 
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.ForProvidersPageActions;
 
/**
 * Class Name: ForProviders
 * Description: Step definitions for interacting with the "For Providers" section on Cleveland Clinic's webpage.
 * Author Name: Arun Kumar
 */
public class ForProviders {
    ExtentTest test = Hooks.report.createTest("testcase02");
    ForProvidersPageActions pa;
 
    /**
     * Method Name: i_am_on_cleveland_clin_home_page
     * Description: Initializes test reporting and sets up the ForProvidersPageActions instance.
     * Author Name: Arun Kumar
     * Return Type: void
     */
    @Given("I am on cleveland Homepage.")
    public void i_am_on_cleveland_homepage() {
        try {
            pa = new ForProvidersPageActions(test);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    /**
     * Method Name: i_scroll_down_to_forproviders
     * Description: Scrolls down to the "For Providers" section on the webpage.
     * Author Name: Arun Kumar
     * Return Type: void
     */
    @When("I scroll down to forproviders.")
    public void i_scroll_down_to_forproviders() {
        try {
            pa.forProviders();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    /**
     * Method Name: i_click_on_join_nursery
     * Description: Clicks the "Join Nursery" link in the "For Providers" section.
     * Author Name: Arun Kumar
     * Return Type: void
     */
    @When("I click on joinNursery.")
    public void i_click_on_join_nursery() {
        try {
            pa.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    /**
     * Method Name: i_click_on_career
     * Description: Clicks the "Career" link in the "For Providers" section.
     * Author Name: Arun Kumar
     * Return Type: void
     */
    @When("I click on career.")
    public void i_click_on_career() {
        try {
            pa.career();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    /**
     * Method Name: i_click_on_patient
     * Description: Clicks the "Patient" link in the "For Providers" section.
     * Author Name: Arun Kumar
     * Return Type: void
     */
    @When("I click on patient.")
    public void i_click_on_patient() {
        try {
            pa.patient();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}