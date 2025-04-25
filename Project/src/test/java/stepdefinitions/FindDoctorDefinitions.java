package stepdefinitions;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.FindDoctorActions;
import utils.Base;
/*
* Class Name : FindDoctorDefinitions
* Author Name : Nikhith Sree Sai
* Description : The class calls the action methods for FindDoctor
* Return Type : NA
* Params List : NA
*/
public class FindDoctorDefinitions {
    WebDriver driver = Base.driver;
    static ExtentTest test = Hooks.report.createTest("Test Find Doctor");
    FindDoctorActions fda;
    @Given("Nikhith is on ClevelandClinic Page")
    public void i_am_on_cleveland_clinic_page() {
        fda = new FindDoctorActions(driver, test);
    }
    @When("I click on Find Doctor")
    public void i_click_on_find_doctor() {
        fda.clickFindDoctor();
    }
    @When("I click on search bar and enter {string}")
    public void i_click_on_search_bar_and_enter(String string) {
        fda.enterHeart(string);
    }
    @When("I enter location {string} and click on it")
    public void i_enter_location_and_click_on_it(String string) {
        fda.enterLocation(string);
        fda.clickLocationValue();
    }
    @When("I enter department {string} and click on it")
    public void i_enter_department_and_click_on_it(String string) {
        fda.enterDepartment(string);
        fda.clickDepartmentValue();
    }
    @When("I enter language {string} and click on it")
    public void i_enter_language_and_click_on_it(String string) {
        fda.enterLanguage(string);
    }
}




