package stepdefinitions;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.ScheduleNowActions;
import utils.Base;
/*
* Class Name : ScheduleNowDefinitions
* Author Name : Nikhith Sree Sai
* Description : The class calls the action methods from ScheduleNowActions
* Return Type : NA
* Params List : NA
*/
public class ScheduleNowDefinitions {
    WebDriver driver = Base.driver;
    static ExtentTest test = Hooks.report.createTest("Test Schedule Now");
    ScheduleNowActions sna;
    @Given("I am on Cleveland Clinic Page")
    public void i_am_on_cleveland_clinic_page() {
        sna = new ScheduleNowActions(driver, test);
    }
    @When("I click on schedule now and verify {string}")
    public void i_click_on_schedule_now_and_verify(String string) {
        sna.clickScheduleNow();
        sna.verifyScheduleNowTitle(string);
    }
    @When("I click on request appointment and verify {string}")
    public void i_click_on_request_appointment_and_verify(String string) {
        sna.clickRequestAnAppointment();
        sna.verifyRequestAppointmentTitle(string);
    }
    @When("I click on Get Started and verify text {string}")
    public void i_click_on_get_started_and_verify_text(String string) {
        sna.clickGetStarted();
        sna.verifyGetStartedTitle(string);
    }
    @When("I click on Me and verify text {string}")
    public void i_click_on_me_and_verify_text(String string) {
        sna.clickMe(string);
    }
    @When("I click on Not Sure and verify {string}")
    public void i_click_on_not_sure_and_verify(String string) {
        sna.clickNotSure(string);
    }
    @When("I enter first name {string}")
    public void i_enter_first_name(String string) {
        sna.enterFirstName(string);
    }
    @When("I enter lastname {string}")
    public void i_enter_lastname(String string) {
        sna.enterLastName(string);
    }
    @When("I select gender {string}")
    public void i_select_gender(String string) {
        sna.selectGender(string);
    }
    @When("I select marital status {string}")
    public void i_select_marital_status(String string) {
        sna.selectMaritalStatus(string);
    }
    @When("I enter date {string}")
    public void i_enter_date(String string) {
        sna.enterDateOfBirth(string);
    }
    @When("I click on next")
    public void i_click_on_next() {
        sna.clickNext();
    }
    @When("I verify {string} and enter address {string}")
    public void i_verify_and_enter_address(String string, String string2) {
        sna.enterAddress(string, string2);
    }
    @When("I enter city {string}")
    public void i_enter_city(String string) {
        sna.enterCity(string);
    }
    @When("I select state {string}")
    public void i_select_state(String string) {
        sna.selectState(string);
    }
    @When("I enter zipcode {string}")
    public void i_enter_zipcode(String string) {
        sna.enterZipCode(string);
    }
    @When("I enter email {string}")
    public void i_enter_email(String string) {
        sna.enterEmail(string);
    }
    @When("I enter phone number {string}")
    public void i_enter_phone_number(String string) {
        sna.enterPhoneNumber(string);
    }
    @When("I verfiy text {string} and enter reason {string}")
    public void i_verfiy_text_and_enter_reason(String string, String string2) {
        sna.enterReason(string, string2);
    }
    @When("I verify text {string} and I capture screenshot {string}")
    public void i_verify_text_and_i_capture_screenshot(String string, String string2) {
        sna.captureScreen(string, string2);
    }
}
