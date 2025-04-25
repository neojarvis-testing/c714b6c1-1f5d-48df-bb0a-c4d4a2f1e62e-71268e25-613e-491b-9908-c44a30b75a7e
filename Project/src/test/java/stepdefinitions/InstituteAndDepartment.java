package stepdefinitions;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InstituteAndDepartmentActions;
public class InstituteAndDepartment {
    public static ExtentTest test = Hooks.report.createTest("PCC_10 - Institute and Department");
    public static InstituteAndDepartmentActions ida = new InstituteAndDepartmentActions(test);
    @Given("I click InstituteAndDepartment")
    public void i_click_institute_and_department() {
        ida.clickOnInstituteAndDepartment();
    }
    @When("I click On Blood Management")
    public void i_click_on_blood_management() {
        ida.clickOnBloodManagement();
    }
    @When("I click On Frequently Asked Question")
    public void i_click_on_frequently_asked_question() {
        ida.clickOnFrequentlyAskedQuestion();
    }
    @When("I click On Preparing For Surgery")
    public void i_click_on_preparing_for_surgery() {
        ida.clickOnPreparingForSurgery();
    }
    @When("I click On Anemia")
    public void i_click_on_anemia() {
        ida.clickOnAnemia();
    }
    @When("I click On Refusing A Blood Transfusion")
    public void i_click_on_refusing_a_blood_transfusion() {
        ida.clickOnRefusingABloodTransfusion();
    }
    @When("I click On Locations")
    public void i_click_on_locations() {
        ida.clickOnLocations();
    }
    @When("I click On Contacts BloodManagement")
    public void i_click_on_contacts_blood_management() {
        ida.clickOnContactsBloodManagement();
    }
    @When("I click On Pharmacy")
    public void i_click_on_pharmacy() {
        ida.clickOnPharmacy();
    }
    @When("I switch Tab To Take The Survey")
    public void i_switch_tab_to_take_the_survey() {
        ida.switchTabToTakeTheSurvey();
    }
    @When("I click On Contact Us")
    public void i_click_on_contact_us() {
        ida.clickOnContactUs();
    }
    @When("I click On Contact Cleveland Clinic")
    public void i_click_on_contact_cleveland_clinic() {
        ida.clickOnContactClevelandClinic();
    }
    @When("I click On Need Help")
    public void i_click_on_need_help() {
        ida.clickOnNeedHelp();
    }
    @When("I click On Parking")
    public void i_click_on_parking() {
        ida.clickOnParking();
    }
    @When("I click On Travel Assistance")
    public void i_click_on_travel_assistance() {
        ida.clickOnTravelAssistance();
    }
    @When("I click On Global Patient Services")
    public void i_click_on_global_patient_services() {
        ida.clickOnGlobalPatientServices();
    }
    @When("I click On Speak With Our Team")
    public void i_click_on_speak_with_our_team() {
        ida.clickOnSpeakWithOurTeam();
    }
    @When("I click On Virtual SecondOpinion")
    public void i_click_on_virtual_second_opinion() {
        ida.clickOnVirtualSecondOpinion();
    }
    @Then("I click On Get Started")
    public void i_click_on_get_started() {
        ida.clickOnGetStarted();
    }
}